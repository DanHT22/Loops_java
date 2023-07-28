import java.util.Scanner;

public class lettersName {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String  name;
        
        System.out.print("Tu nombre: ");
        name = console.next();
        
        for (int cont = 0; cont < name.length(); cont++) {
        	System.out.println(name.charAt(cont));
        }
        
	} 
}
       

	
