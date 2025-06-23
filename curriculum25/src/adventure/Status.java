package adventure;

public class Status extends Name {
	public Status(String name, int hp, int mp, int attackPower, int speed, int defensePower) {
		super(name, hp, mp, attackPower, speed, defensePower);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void showInfo() {
	System.out.println("こんにちは「"+name+"」 さん");
	System.out.println("ステータス");
	System.out.println("HP:"+hp+"");
	System.out.println("MP:"+mp+"");
	System.out.println("攻撃力:"+attackPower+"");
	System.out.println("素早さ:"+speed+"");
	System.out.println("防御力:"+defensePower+"");
	System.out.println("\nさあ冒険に出かけよう！");
}
}