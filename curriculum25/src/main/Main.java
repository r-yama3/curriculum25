package main;

import java.util.Scanner;

import adventure.status;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタ
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		status status = new status();
		status.setStatus(name, 0, 0, 0, 0, 0);
		status.status();
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
