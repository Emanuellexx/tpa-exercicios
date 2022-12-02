package listaClassicos;

public class tabuada1a10 {
	public static void main(String[]args) {
		
		int i, n, res;
		for (i=1; i<=10; i++) {
			System.out.println("Tabuado do "+i+":");
			for(n=1; n<=10; n++) {
				res=n*i;
				System.out.println (n+"x"+i+"="+res);
				
			}
			System.out.println ();
		}
	}

}
