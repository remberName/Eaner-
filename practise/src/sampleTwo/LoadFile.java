package sampleTwo;

import java.io.File;

/**
 * [概要] <p>演習課題入口クラス。</p>
 * [詳細] <p>演習プログラムのロジック。</p>
 * [補充] <p>特になし。</p>
 */
public class LoadFile {

	public void getFile() {
		try {
			File file = new File("");
			System.out.println(file.getName());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
