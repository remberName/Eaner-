package sampleOne;

/**
 * [概要] <p>電気クラス。</p>
 * [詳細] <p>電気実装クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class Appliances implements AppliancesInterface {

	/**
	 * [概要] <p>テレビメソッド。</p>
	 * [詳細] <p>テレビ実装メソッド。</p>
	 * [補充] <p>特になし。</p>
	 */
	@Override
	public void tvAppliances() {
		System.out.println("この"+appliancesName+"はテレビです。");

	}

	/**
	 * [概要] <p>冷蔵庫メソッド。</p>
	 * [詳細] <p>冷蔵庫実装メソッド。</p>
	 * [補充] <p>特になし。</p>
	 */
	@Override
	public void refrigeratorAppliances() {
		System.out.println("この"+appliancesName+"は冷蔵庫です。");

	}

}
