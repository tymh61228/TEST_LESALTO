package jp.example.test;

import java.util.Scanner;

public class Test003 {

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        System.out.print("整数を入力してください>>");

        int num = scan.nextInt();
        scan.close();

        for(int i = num; i > 0; i--)
        {

            for(int j = 0; j < i ; j++)
            {
                System.out.print("○");
            }

        System.out.println();

        }

	}

}
