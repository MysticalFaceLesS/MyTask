
public class IncrementSynchronize { 
	private static int value = 0;
	
	public static void getNextValue() {
		int firstMethod = value + 1;
		int secondMethod = 0;
		for(int i = 0; i < 1; i++) {
			secondMethod = value + 1;
		}
		int threeMethod = getThreeMethod();
		int fourthMethod = getFourthMethod();

		System.out.println("ThirdTask: \n"
				+ "FirstMethod = " + firstMethod + "\n"
				+ "SecondMethod = " + secondMethod + "\n"
				+ "ThirdMethod = " + threeMethod + "\n"
				+ "FourthMethod = " + fourthMethod);
	}
	
	public static int getThreeMethod() {
		value++;
		return value;
	}
	
	public static int getFourthMethod(){
	    int[] numbers = {0};
	    for(int num : numbers) {
	        value += num;
	    } 
	    return value;
	}
}
