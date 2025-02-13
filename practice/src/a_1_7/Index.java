package a_1_7;

import java.util.Scanner;

/**
 * [概要] <p>プログラム入口。</p>
 * [説明] <p>プログラムの入口。</p>
 * [補充] <p>特になし。</p>
 */
public class Index {

	/**
	 * [概要] <p>入口メソッド。</p>
	 * [説明] <p>入口メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// ログイン情報クラス
		UserLogin userLogin = new UserLogin();
		// 操作クラス
		OperationProcess operationProcess = new OperationProcess();

		// 初期化
		operationProcess.init();

		try (Scanner scaner = new Scanner(System.in)) {
			do {

				System.out.print("""
						任務管理システム
						ユーザー名を入力してください
						""");

				// ユーザー名を取る
				String userName = scaner.next();

				// パスワードを取る
				System.out.println("パスワードを入力してください");
				String userPassword = scaner.next();

				// ログインする
				LoginDto loginDto = userLogin.userLogin(userName, userPassword);

				// ログインできる場合
				if (loginDto != null) {

					// 管理者かどうか判断
					boolean isManagement = userLogin.isManager(loginDto);

					if (isManagement) {
						// 管理者の場合
						operationProcess.isManager(scaner, loginDto);
					} else {
						// 管理者以外の場合
						operationProcess.isUser(scaner, loginDto);
					}

				} else {
					// ログインできない場合
					System.out.println("ユーザーとパスワードを確認してください");
				}

			} while (true);

			// 異常処理
		} catch (Exception e) {
			System.out.println("システム異常終了");
		}
	}
}
