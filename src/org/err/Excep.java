package org.err;

public class Excep {

	public static void main(String[] args) throws MersalNotFoundException {

		String aa = "Mersalnk";
		if (aa.equals("MeRsalNK")) {
			System.out.println("Its Correct value");

		} else {
			throw new MersalNotFoundException();

		}

	}
}
