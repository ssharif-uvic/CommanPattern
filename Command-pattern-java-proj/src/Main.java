
public class Main {

	public static void main (String[] args){
		//Command pattern encapsulates a function in an object
		ICommand sum = (a,b) -> a+b;
		ICommand multiply = (a,b) -> a * b;
		int sumIs = sum.operation(8,9);
		int productIs = multiply.operation(8,9);
		System.out.println("Sum: " + sumIs);
		System.out.println("Product : " + productIs);
		
	}
}
