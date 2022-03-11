public class ReturnExample {

	public static void main(String[] args) {
	int num1 = 11;
	
	
	
    int answer1;
    answer1 = multNumbers(num1);
    System.out.println("When we multiply the numbers, we get : " + answer1);

	}
	public static int multNumbers(int a) {
	 int ans = a * 4;
	 
	 
	 return ans;
	
	}
	
}