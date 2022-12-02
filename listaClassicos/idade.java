package listaClassicos;
import java.util.*;
public class idade {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int i, idade=0;
		double a=0, b=0, c=0, d=0, e=0, A, B, C, D, E;
		for (i=0; i<=15; i++) {
			System.out.println("digite a idade "+i+"");
			idade = in.nextInt();
		}
		if(idade<=15) {
			a++;
		}
		else if(idade<=30){
			b++;
		}
		else if(idade<=45) {
			c++;
		}
		else if(idade<=60) {
			d++;
		}
		else  {
			e++;
		}
		
		
		A = (a/15)*100;
		B = (b/15)*100;
		C = (c/15)*100;
		D = (d/15)*100;
		E = (e/15)*100;
		System.out.println("1a Faixa Etaria: "+a+", "+A+"% das pessoas");
		System.out.println("2a Faixa Etaria: "+b+", "+B+"% das pessoas");
		System.out.println("3a Faixa Etaria: "+c+", "+C+"% das pessoas");
		System.out.println("4a Faixa Etaria: "+d+", "+D+"% das pessoas");
		System.out.println("5a Faixa Etaria: "+e+", "+E+"% das pessoas");
		
	}
}	
