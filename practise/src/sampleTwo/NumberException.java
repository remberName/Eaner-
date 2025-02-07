package sampleTwo;


/**
 * [概要] <p>演習課題入口クラス。</p>
 * [詳細] <p>演習プログラムのロジック。</p>
 * [補充] <p>特になし。</p>
 */
public class NumberException {
	
	/**
	 * [概要] <p>演習課題入口クラス。</p>
	 * [詳細] <p>演習プログラムのロジック。</p>
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
