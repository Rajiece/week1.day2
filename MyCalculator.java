package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		 Calculator object1 = new Calculator();
		 //Adding three numbers
		 int sum = object1.addNumber(25, 10, 95);
		 System.out.println(sum);
		 //Sub two numbers
		 int sub = object1.subNumber(25, 10);
		 System.out.println(sub);
		 //Mul two numbers
		 double mul = object1.mulNumber(25, 10);
		 System.out.println(mul);
		 //Div two numbers
		 float div = object1.divnumber(25,10);
		 System.out.println(div);
	}
}