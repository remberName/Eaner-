package sampleTwo;


/**
 * [概要] <p>ArithmeticException演習クラス。</p>
 * [詳細] <p>0除算時にArithmeticExceptionをキャッチするプログラム。</p>
 * [補充] <p>特になし。</p>
 */
public class NumberExceptionTest {
	
	/**
	 * [概要] <p>0除算メソッド。</p>
	 * [詳細] <p>0除算時Exceptionをキャッチする。</p>
	 * [補充] <p>特になし。</p>
	 */
	public void exceptionThrow() {
		int num1 = 100;
		int num2 = 0;
		
		try {
			int num3 = num1/num2;
			System.out.println(num3);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
