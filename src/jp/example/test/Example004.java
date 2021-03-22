package jp.example.test;

public class Example004 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int koku = 80;
		int sha = 80;
		int rika = 80;
		int san = 80;

		int zen = (koku + sha + rika + san)/4;
		int bun = (koku + sha)/2;
		int ri = (rika + san)/2;

		if(koku >= 80 && sha >= 80 && rika>= 80 && san >= 80) {
			System.out.println("優秀な生徒です。");
		}else if(bun >= 80) {
			System.out.println("文系に適性があります。");
		}else if(ri >= 80) {
			System.out.println("理系に適性があります。");
		}else if(zen >= 65) {
			System.out.println("よく健闘されています。");
		} else {
			System.out.println("もう少し学習を工夫しましょう。");
		}

	}

}
