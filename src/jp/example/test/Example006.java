package jp.example.test;

public class Example006 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//10部屋の配列を用意
        int[] num = new int[10];

        //配列にランダムに整数を格納
        for ( int i = 0 ; i < 10 ; i++ )
        {

            num[i] = (int) (Math.random() * 100 + 1);

        }

        //いったん格納された値を表示
        System.out.println("Sort前の配列");

        for (int i = 0; i < 10; i++)
        {

            System.out.print( num[i] + " ");

        }

        //////Sort作業/////
        //一次退避用変数
        int temp;

        for (int i = num.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {

                //大小判定
                if (num[j] < num[j + 1]) {

                    //左が大きいなら左右入れ替え
                    temp = num[j + 1];
                    num[j + 1] = num[j];
                    num[j] = temp;

                }

            }

        }

        System.out.println();

        //Sort後
        System.out.println("Sort後の配列");

        for (int i = 0; i < 10; i++) {

            System.out.print(num[i] + " ");

        }

    }

}
