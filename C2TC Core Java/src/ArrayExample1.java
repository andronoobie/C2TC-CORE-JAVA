public class ArrayExample1 {

	public static void main(String[] args) {
		
		int[][][] x= {{{10,20,30},{40,45,65}},{{78,80},{98,100,110}}};
		System.out.println(x[0][1][2]);
		System.out.println(x[1][0][1]);
		System.out.println(x[1][1][1]);
		//System.out.println(x[1][2][0]);//Exception : out of index
		//System.out.println(x[2][1][0]);//Exception : out of index
		

	}

}