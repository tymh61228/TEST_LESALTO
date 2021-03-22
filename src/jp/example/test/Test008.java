package jp.example.test;
import java.util.Scanner;

public class Test008 {

	public static void main(String[] args)
	{
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
        System.out.print("整数を入力してください>>");

        int num = scan.nextInt();
        scan.close();

        for(int i = 0; i < num; i++){

        		for(int j = 0; j < num; j++){

        				if(i +j >= num -1) {

        					System.out.print("○");

        				}else{
        					System.out.print("　");
        				}
        		}
        		System.out.println();
        }
	}

}
