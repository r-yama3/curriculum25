package adventure;

import java.util.Random;

class Name {
	Random random = new Random();
	int randomValue1 = random.nextInt(1000); //ランダム数値～1000までに設定 
	int randomValue2 = random.nextInt(1000);
	int randomValue3 = random.nextInt(1000);
	int randomValue4 = random.nextInt(1000);
	int randomValue5 = random.nextInt(1000);
	private String name;
	private int hp;
	private int mp;
	private int attackPower;
	private int speed;
	private int defensePower;

	//getterを使用
	public String getname() {
		return name;
	}

	public int gethp() {
		return hp;
	}

	public int getmp() {
		return mp;
	}

	public int getattackPower() {
		return attackPower;
	}

	public int getspeed() {
		return speed;
	}

	public int getdefensePower() {
		return defensePower;
	}

	//setterを使用
	public void setStatus(String name, int hp, int mp, int attackPower, int speed, int defensePower) {
		this.name = name;
		this.hp = randomValue1;
		this.mp = randomValue2;
		this.attackPower = randomValue3;
		this.speed = randomValue4;
		this.defensePower = randomValue5;
	}
}
