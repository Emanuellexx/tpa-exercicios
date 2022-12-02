package listaClassicos;
import java.util.Scanner;
public class fibonacci {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, n, a=1, b=0, res=1;
		System.out.println("Digite o numero");
		n = in.nextInt();
		
		for(i=1;i<=n;i++) {
			System.out.println(res);
			res = a+b;
			b = a;
			a = res;
		}
	}
}
