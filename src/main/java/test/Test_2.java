package test;


import java.util.concurrent.atomic.AtomicInteger;

/**
 * 现有一个仓库，仓库存放着商品（始终只有一个），存在商品时候才能从仓库取出，当仓库无商品时工厂及时补给商品
 *
 */
public class Test_2 {
	private  AtomicInteger num = new AtomicInteger(0);

	public synchronized void  produce()  throws InterruptedException{
			while (true){
				synchronized (num){
					while (num.get() > 0) {
						//当大于0时候 暂停
						num.wait();
					}
					num.getAndIncrement();
					System.out.println("生产者生产，现有数量为："+ num.get());
					num.notify();
				}
			}
	}
	/**
	 * 消费者
	 */
	public void consumue() throws InterruptedException{
		while (true){
			synchronized (num){
				while (num.get() <= 0) {
					//当小于0时候 暂停
					num.wait();
				}
				num.getAndDecrement();
				System.out.println("消费者消费，现有数量为："+  num.get());
				num.notifyAll();
			}

		}
	}

	public static void main(String[] args) {
		Test_2 test_2 = new Test_2();
		new Thread(() -> {
			try{
				test_2.produce();
			}catch (InterruptedException e){
			}
		}, "threadProduce").start();
		new Thread(() -> {
			try{
				test_2.consumue();
			}catch (InterruptedException e){
			}
		}, "threadConsumuee").start();
	}
}