package adventure;

public class status extends Name {
	public void status() {
	System.out.println("こんにちは 「 "+getname()+" 」 さん");
	System.out.println("ステータス");
	System.out.println("HP:"+gethp()+"");
	System.out.println("MP:"+getmp()+"");
	System.out.println("攻撃力:"+getattackPower()+"");
	System.out.println("素早さ:"+getspeed()+"");
	System.out.println("防御力:"+getdefensePower()+"");
	System.out.println("\nさあ冒険に出かけよう！");
}
}