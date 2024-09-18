package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		karakterSkala(10);
	}

	private static void karakterSkala(int antallStudenter) {

		for (int i = 0; i < antallStudenter; i++) {

			String p = showInputDialog("Poengsum" + (i + 1) + ":");

			int Poengsum = Integer.parseInt(p);

			if (0 <= Poengsum && Poengsum < 40) {
				System.out.println("F");

			} else if (Poengsum > 39 && Poengsum < 50) {
				System.out.println("E");

			} else if (Poengsum > 49 && Poengsum < 60) {
				System.out.println("D");

			} else if (Poengsum > 59 && Poengsum < 80) {
				System.out.println("C");

			} else if (Poengsum > 79 && Poengsum < 90) {
				System.out.println("B");

			} else if (Poengsum > 89 && Poengsum <= 100) {
				System.out.println("A");

			} else {
				System.out.println("Ugyldig poengsum");
				i--;
			}
			

			}
		}
	}
