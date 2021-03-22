package jp.example.test;

public class Example003 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 63 * 12;
		int y = 49 * 24;

		int a = (int)(x * 1.08);
		int b = (int)(y * 1.08);

		int ans =10000 - (a + b) - 130;

		System.out.println("残ったお釣りは"+ans+"円です。");

	}

}
