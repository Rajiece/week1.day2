package week1.day2;

public class LearnMethods {
	public static void main(String[] args) {

     //carname//
		System.out.println("BMW");
		LearnMethods obj = new LearnMethods();
		int carRegNumber = obj.getcarRegNumber();
		System.out.println(carRegNumber);
		String carVariant = obj.getcarVariant();
		System.out.println(carVariant);
		int mul = obj.multiplyTwoNumber(5, 5);
		System.out.println(mul);
	
	}
    private int getcarRegNumber() {
    int carRegNumber = 3221;
    return carRegNumber;
	}
	public String getcarVariant() {
		return "Diesel";
	}
	public int multiplyTwoNumber (int a, int b) {
		return a*b;
	}
	}  
	
	

	   