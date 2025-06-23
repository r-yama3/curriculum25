package adventure;

import java.util.Random;

public class Name {
	Random random = new Random();
	int randomValue1 = random.nextInt(1000); //ランダム数値～1000までに設定 
	int randomValue2 = random.nextInt(1000);
	int randomValue3 = random.nextInt(1000);
	int randomValue4 = random.nextInt(1000);
	int randomValue5 = random.nextInt(1000);
	public String name;
	public int hp;
	public int mp;
	public int attackPower;
	public int speed;
	public int defensePower;

	public Name(String name, int hp, int mp, int attackPower, int speed, int defensePower) {
		this.name = name;
		this.hp = randomValue1;
		this.mp = randomValue2;
		this.attackPower = randomValue3;
		this.speed = randomValue4;
		this.defensePower = randomValue5;
	}
}
