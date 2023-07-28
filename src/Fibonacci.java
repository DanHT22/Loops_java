import java.util.Scanner;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        int num0 = 0;
        int num1 = 1;
        int cont = 1;
         do {
		System.out.println(num0 + "");
		int sum = num0 + num1;
		num0 = num1;
		num1 = sum;
		cont++;
		
         }while(cont <= num);
	}
}

