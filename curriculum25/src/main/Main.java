package main;
import java.util.Scanner;

import adventure.Status;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタ
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		Status status = new Status(name,0,0,0,0,0);
		status.showInfo();
		scanner.close();
	}
}
//こんにちは 「 名前 」 さん
//ステータス
//HP：849
//MP：862
//攻撃力：375
//素早さ：937
//防御力：24

//さあ冒険に出かけよう！
