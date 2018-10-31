import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner inputDevice = new Scanner(System.in);
		
		int lower=0;
		int upper=0;
		
		System.out.println("Welcome to FizzBuzz, please type an integer: ");
		upper = inputDevice.nextInt();
		
		for(int i=lower;i<=upper;i++){
			boolean printNum=true;
			if((i%3)==0){
				System.out.print("Fizz");
				printNum=false;			
			}
			if((i%5)==0){
				System.out.print("Buzz");
				printNum=false;
			}
			if(printNum){
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}