package vetores;
import java.util.Scanner;

public class elementoAeB {
	public static void main(String []args)	{
		
		Scanner in = new Scanner(System.in);
		final int TAM=10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
		System.out.println("Digite os valores do vetor A");
		a[i] = in.nextInt();
		
		b[i] = (int) Math.sqrt(a[i]);
		}
		
		System.out.print(" \nB = [");
		 for(i=0; i<TAM; i++) {
			 System.out.print(b[i] +" ");
		 }
		 System.out.print(" ]");
	}

}
