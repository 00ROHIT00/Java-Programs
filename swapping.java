import java.util.Scanner;

public class swapping {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");		
		int a = sc.nextInt();

		System.out.print("Enter another number: ");
		int b = sc.nextInt();

		System.out.println("Before Swapping a=" +a+ ", b=" +b);
		int temp = a;
		a = b;
		b = temp;

		System.out.println("After Swapping a-" +a+ ", b-" +b);

		System.out.println("Resetting - without a third variable");
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Unswapped, a-"+a+" and b-"+b);

		sc.close();
		

}}
	
		
		
