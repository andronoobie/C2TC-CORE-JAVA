import java.util.*;
public class SwitchUserInput {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		int button = var.nextInt();
		
		switch(button)
		{
		case 0:
			System.out.println("0");
			break;
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
			default:
				System.out.println("default statement");
		}

	}

}
