package a_1_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * [概要] <p>データ読み込みクラス。</p>
 * [説明] <p>ファイルを読み込み、データをリストに格納して出力するクラス。</p>
 * [補充] <p>特になし。</p>
 */
public class FileManipulation {
	
	// データリスト
	private List<String> list = new ArrayList<String>();
	
	/**
	 * [概要] <p>ロジックメソッド。</p>
	 * [説明] <p>データ読み込みプログラムロジックメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	public void logic() {
		// ァイルを読み込み、データをリストに格納メッソド
		readFile();
		// データ展示メソッド
		showData();
	}

	/**
	 * [概要] <p>ファイルを読み込み、データをリストに格納メッソド。</p>
	 * [説明] <p>ファイルを読み込み、データをリストに格納するメソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	private void readFile() {
		
		// ファイルのURL
		String URL = "C:\\Users\\share\\git\\Eaner-\\practice\\a\\dataFile";
		
		// ファイルを読み取り
		File file = new File(URL);
		try(FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader= new BufferedReader(fileReader)){
			String line;
			while((line = bufferedReader.readLine())!=null) {
				
				// リストにデータを入れる
				list.add(line);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * [概要] <p>データ展示メソッド。</p>
	 * [説明] <p>データ展示メソッド。</p>
	 * [補充] <p>特になし。</p>
	 *
	 */
	private void showData() {
		System.out.println("\nFileから読み取りデータ："+list.toString());
	}
}
