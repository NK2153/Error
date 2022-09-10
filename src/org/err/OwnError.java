package org.err;

import java.util.Scanner;

public class OwnError {
	public static void main(String[] args) throws MersalNotFoundException {

		Scanner aa = new Scanner(System.in);
		String nextLine = aa.nextLine();

		if (nextLine.equalsIgnoreCase("Mersal NK")) {
			System.out.println("Content is Correct");
		} else {
			throw new MersalNotFoundException();
		}

	}

}
