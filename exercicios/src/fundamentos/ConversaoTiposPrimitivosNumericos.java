package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {

		double a = 1; // convers�o implicita
		System.out.println(a);

		float b = (float) 1.0; // convers�o explicita (CAST)
		System.out.println(b);

		int c = 4;
		byte d = (byte) c; // convers�o explicita (CAST)
		System.out.println(d);

		double e = 1.9999;
		int f = (int) e; // convers�o explicita (CAST)
		System.out.println(f);

	}
}