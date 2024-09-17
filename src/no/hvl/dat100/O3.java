package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O3 {

	public static void main(String[] args) {

		int n = parseInt(showInputDialog("Skriv et heltall n>0"));

		if (n < 0) {
			showMessageDialog(null, "Tallet må være positivt");
		} else {
			int fakultet = 1;
			for (int i = 2; i <= n; i++) {
				fakultet *= i;
			}
			System.out.println(n + "! = " + fakultet);
		}
	}

}
