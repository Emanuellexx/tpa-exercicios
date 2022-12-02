import java.util.*;
public class idadeUsuario{
		public static void main(String [] args) {
			Scanner in = new Scanner(System.in);
			int anoTual, anoNas, idade, i=1;
			
			do {
				System.out.println("Digite o ano atual");
				anoTual = in.nextInt();
				System.out.println("Digite seu ano de nascimento");
				anoNas = in.nextInt();
				idade = anoTual - anoNas;
				if(idade<=18) {
					System.out.println("menor de idade");
				}else {
					System.out.println("maior de idade");
					
				}
				System.out.println("Deseja continuar?");
				String decisao = in.next();
				if(decisao.equalsIgnoreCase("n")) {
			
					i = 0;
			
				}
				
				
			}while(i==1);
			in.close();
			
			
		}	
}