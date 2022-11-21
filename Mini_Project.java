package week9;

class Dice {
	int value;
	public Dice() {
		value =0;
	}
	void roll() {
		value = (int)(Math.random()*10)%6 +1;
	}
	public void setValue(int value) {this.value = value;}
	public int getValue() {return value;}
}

public class Mini_Project {
	public static void main(String[] args) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		int cnt = 0;
		while(true) {
			System.out.printf("주사위1= %d 주사위2= %d\n",d1.getValue(),d2.getValue());
			if(d1.getValue()+d2.getValue() == 2) {
				System.out.printf("(%d,%d)이 나오는데 걸린 횟수=%d",d1.getValue(),d2.getValue(),cnt);
				break;
			}else {
				d1.roll(); d2.roll();
				cnt++;
			}
		}	
	}
}


