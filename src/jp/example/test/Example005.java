package jp.example.test;

import java.util.Scanner;

public class Example005 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// ① コンピュータが持つ数を決める。
        int num = (int)(Math.random() * 10);

        // 人間が決める数(初期値としてコンピュータが絶対に持たない数値を設定しておく
        int human = -1;

        // キーボードからの入力を受け取る準備
        Scanner scan = new Scanner(System.in);
        // ② ゲームスタート
        for(int i=1 ; i<=3 ; i++)
        {

        	System.out.println("0から9までの数値を入力してください。>>");

        	// ③ キーボードから入力した数値を「human」変数に代入
        	human = scan.nextInt();


        	// ④ 数値の比較
        	if (human < num)
        	{

        		System.out.println("もっと大きいです。");

        	}
        	else if (human > num)
        	{

        		System.out.println("もっと小さいです。");

        	}
        	else if(human == num)
        	{
        		System.out.println("当たり！");
        		scan.close();

        	}

        }
        if(human!=num)
        {
        	System.out.println("あなたの負け");
        }
	}

}

