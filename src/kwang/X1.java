package kwang;

public class X1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(2);
		System.out.println(c1);
		Number n = new Number(2.01);
		System.out.println(n);
	}

}

class Complex {
	protected double R;
	protected double I;
	public Complex(double real) {
		this.R = real;
		this.I = 0.0;
	}
	public Complex(double real,double img) {
		this.R = real;
		this.I = img;
	}
	public String toString() {
		if(I == 0) {
			return("" + new Number(R));
		}else {
			return("" + new Number(R) + "+" + new Number(I) + "i");
		}
	}
	
}

class Number {
	protected double D;
	public Number(double d) {
		this.D = d;
	}
	public String toString() {
		if (D == (int)D)
		{
			return("" + (int)D);
		}else {
			return("" + D);	
		}
	}
}
