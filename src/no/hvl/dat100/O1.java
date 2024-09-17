package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			int poeng = parseInt(showInputDialog("Skriv poengsum: "));
			char karakter = ' ';

			if ((poeng >= 90) && (poeng <= 100)) {
				karakter = 'A';
				showMessageDialog(null, "Karakter " + karakter);
			} else if ((poeng >= 80) && (poeng <= 89)) {
				karakter = 'B';
				showMessageDialog(null, "Karakter " + karakter);
			} else if ((poeng >= 60) && (poeng <= 79)) {
				karakter = 'C';
				showMessageDialog(null, "Karakter " + karakter);
			} else if ((poeng >= 50) && (poeng <= 59)) {
				karakter = 'D';
				showMessageDialog(null, "Karakter " + karakter);
			} else if ((poeng >= 40) && (poeng <= 49)) {
				karakter = 'E';
				showMessageDialog(null, "Karakter " + karakter);
			} else if ((poeng >= 0) && (poeng <= 39)) {
				karakter = 'F';
				showMessageDialog(null, "Karakter " + karakter);
			} else if ((poeng > 100) || (poeng < 0)) { // Nytt forsøk hvis verdien er ugyldig
				if (i > 0) {
					i--;
				}
				showMessageDialog(null, "Ugyldig poengsum. Skriv på nytt");
			}
			karakter = 0;

		}

	}

}
