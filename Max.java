import java.util.Scanner;


public class Max{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Enter a number: ");
		double number1 = sc.nextDouble();
		
		System.out.println("Enter another number: ");
		double number2 = sc.nextDouble();

		System.out.println("Enter another number: ");
		double number3 = sc.nextDouble();

		if (number1 >= number2 && number1 >= number3 ){
			System.out.println("Maximum Number: " + number1);
		}	
		else if (number2 >= number1 && number2 >= number3){
			System.out.println("Maximum Number: " + number2);
		} else if (number3 >= number1 && number3 >= number2){
			System.out.println("Maximum Number: " + number3);
}
}
}