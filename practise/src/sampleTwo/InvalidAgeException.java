package sampleTwo;

/**
 * [概要] <p>例外作成クラス。</p>
 * [詳細] <p>作成した例外クラス。</p>
 * [補充] <p>特になし。</p>
 */
public class InvalidAgeException extends Exception{

	/**
	 * UID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * [概要] <p>例外作成クラス。</p>
	 * [詳細] <p>作成した例外クラス。</p>
	 * [補充] <p>特になし。</p>
	 * 
	 * @param message 例外メッセージ
	 */
	public InvalidAgeException(String message) {
        super(message);
    }

}
