package studio7;
import java.util.Random;
import java.lang.Math;

public class Die {

	//instance variable
	private int number;
	
	//constructor
	public Die (int number) {
		
		this.number = number;
	}
	
	public int roll () {
		
		return (int) (Math.random() * (number - 1)) + 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d = new Die (8);
		System.out.println(d.roll());

	}

}
