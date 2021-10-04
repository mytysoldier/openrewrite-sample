package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// // java8→java11へリファクタリング検証用
	public static void executeSampleCode() {
		// // パターン①：インスタンス化のリファクタリング
		// Boolean bool = new Boolean(true);
		// Byte b = new Byte("1");
		// Character c = new Character('c');
		// System.out.println(bool);
		// System.out.println(b);
		// System.out.println(c);

		// パターン②：「_」1文字は使用できなくなる
		// String _ = "テスト太郎";
		// System.out.println(_);

		List<String> aList = new ArrayList<String>();
		aList.add("test");
		for (String elem : aList) {
			System.out.println(elem);
		}

		// // パターン③：暗黙的な型推論
		// List<String> strList = new ArrayList<String>(){
		// 	{
		// 		add("test1");
		// 		add("test2");
		// 		add("test3");
		// 	}
		// };
		// System.out.println(strList);
		
		// // パターン④：削除されたメソッド
		// new Thread().destroy();
	}

}
