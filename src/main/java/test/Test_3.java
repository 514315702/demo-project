package test;


/**
 * 写一个简单的递归算法
 *
 */
public class Test_3 {

	public static int decreaseNum(int num){
		if(num < 0 ){
			return 0;
		}
		System.out.println(num--);
		return decreaseNum(num);
	}
}
