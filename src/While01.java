
public class While01 {
	public static void main(String[] args) {
		int number = 100;
//		while文：ループ開始
//		numberが50未満の場合、ブロックの処理を行う
		while (number < 50) {
//			ブロック：
//			numberにnumber *2 を代入して、numberを出力
		number *= 2;
			System.out.println("Wile01" + number);
		}
	}
}

//falseだと何も実行されない