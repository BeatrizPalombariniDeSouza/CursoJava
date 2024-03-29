package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(condicao1 && !condicao2);
		System.out.println(!condicao1 && condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		
		System.out.println("\n Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		// dois ultimos comentados por ser redundante j� que o 1� j� � falso
		
		System.out.println("\n Tabela verdade OU (OR)");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		// dois primeiros comentados por ser redundante j� que o 1� j� � true
		
		System.out.println("\n Tabela verdade OU Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\n Tabela verdade NOT");
		System.out.println(!true);
		System.out.println(!false);
		
	}
}
