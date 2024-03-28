package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction (int numerator, int denominator) {
		
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int gcd(int p, int q) {
		
	
	if(p % q == 0) {
		
		return q;
	}else {
		
		return gcd (q, p%q);
	}
	}
	
	public Fraction multiplication (Fraction f2) {
		
		numerator = numerator * f2.numerator;
		denominator = denominator * f2.denominator;
		Fraction f3 = new Fraction (numerator, denominator);
		return f3;
		
	}
	
	public Simplify (Fraction f4) {
		
		numerator = numerator; //numerator / denominator
		denominator = denominator;
		Fraction f3 = new Fraction (numerator, denominator);
		return f3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
