package vetores;
import java.util.Scanner;
public class par {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int i, j ,a[], b[];
		a = new int [10];
		
		for(i=0; i<10; i++) {
			System.out.println("Digite o "+i+" valor ");
			a[i] = in.nextInt();
		
		}
		System.out.print( "\nA = [ ");
		for (i=0; i<10; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.print(" ]");
			
		
	}

	
}
