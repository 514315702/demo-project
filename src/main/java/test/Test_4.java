package test;


/**
 * 设计模式（列出5种以上，写出两种）
 */
public class Test_4 {

}

/**
 * 简单单例
 */
class SimpleSingle{

	private final SimpleSingle instance = new SimpleSingle();
	private SimpleSingle(){}

	private SimpleSingle getInstance(){
		return instance;
	}

}

/**
 * 双重检查
 */
class Single{

	private  Single instance ;
	private Single(){}

	private Single getInstance(){
		if(instance == null){
			synchronized (instance){
				if(instance== null){
					return  new Single();
				}
			}
		}
		return instance;
	}
}


