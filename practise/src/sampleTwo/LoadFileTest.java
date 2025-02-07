package sampleTwo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * [概要] <p>ファイル読み込むクラス。</p>
 * [詳細] <p>ファイル読み込む。</p>
 * [補充] <p>特になし。</p>
 */
public class LoadFileTest {

	/**
	 * [概要] <p>ファイル読み込むメソッド。</p>
	 * [詳細] <p>ファイル読み込む。</p>
	 * [補充] <p>特になし。</p>
	 */
	public void getFile() {
		
		try {
			// ファイルを読み込むための準備
			FileReader file = new FileReader("aaas.aa");
			BufferedReader reader = new BufferedReader(file);
			
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
