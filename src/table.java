import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
        int num;
        
        System.out.print("Enter any positive integer: ");
        num = console.nextInt();
        int cont = 1;
        	while (cont<=10) {
        		int resultado = num*cont;
        			System.out.println("Multiplication Table of " + num + " x " + cont + " = " + resultado);
        			cont ++;
        }
	}
}