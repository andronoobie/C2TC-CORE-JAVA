import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		int number,remainder;
		System.out.println("Please enter an integer:");
		Scanner scan = new Scanner (System.in);
		number = scan.nextInt();
		
		remainder = number % 2;
		
		if(remainder == 0)
			System.out.println(number+"is a even number");
		else
			System.out.println(number+" is an odd number");

	}

}
