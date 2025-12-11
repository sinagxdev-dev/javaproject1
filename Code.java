import java.util.Scanner;
import java.util.Scanner.*;
public class SimpleCalculator {
	
	Scanner num = new Scanner(System.in);
	int a = num.nextInt();
	int b = num.nextInt();
	
	public static void main(String[] args) {
	SimpleCalculator jv = new SimpleCalculator ();
	jv.Addition();
	jv.Subtraction();
	jv.Multiplication();
	jv.Division();
	}
	public void Addition() {
		int sum = a + b;
		System.out.println(sum);
	}
	
	public void Subtraction() {
		int difference = a - b;
		System.out.println(difference);
	}
	
	public void Multiplication() {
		int product = a*b;
		System.out.println(product);
	}
	
	public void Division () {
		int quotient = a/b;
		System.out.println(quotient);
		
		num.close();
	}
	}
