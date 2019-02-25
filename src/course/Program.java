package course;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte n1 = 127;
		double a = 5.0;
		float b;		
		b = (float)a;
		float c = 2 / b;
		String num = "33";
		
		int ns = Integer.parseInt(num);
		a = Double.parseDouble(num);	
		Scanner sc = new Scanner(System.in);
		String msg = "Hello World";

		double balance = 10.345673;
		int age = 32;
		char gender = 'F';
		String name = "Maria";
		
		System.out.printf("balance: %.2f for day%n", balance);
		System.out.println(a);
        Locale.setDefault(Locale.US);
		System.out.printf("balance: %.2f for day%n", balance);
        System.out.println("------------------------------------");
        System.out.printf("%s is %c and has %d years. %nHer balance: %.2f for day%n", 
        		name, gender, age, balance);
		
        
        String sentence = sc.nextLine();
		System.out.println(sentence);
		
		String q, w, e;
		q = sc.next();
		w = sc.next();
		e = sc.next();
		System.out.printf("%s, %s, e %s %n", q, w, e);

       
        sc.close();
		
		double A = 1.0, B = -3.0, C = -4.0;
		double x1 = (-B + Math.sqrt(B*B - 4.0 * A * C)) / (2.0 * A);
		System.out.println(x1);
	}

}
