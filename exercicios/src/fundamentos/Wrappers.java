package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.next()); // int
		Long l = 100000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l);

		entrada.close();

		Float f = 123.0F;
		System.out.println(f);

		Double d = 1234.5678;
		System.out.println(d);

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);

		Character c = '#';
		System.out.println(c + "...");
	}
}
