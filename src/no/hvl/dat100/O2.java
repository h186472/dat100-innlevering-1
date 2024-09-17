package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {
	
public static void main(String[] args) {
		
		int startTrinn = 208050;
		int[] trinnGrensene = {292850, 669999, 937899, 1349999};
        double[] skattesats = {0.017, 0.04, 0.136, 0.166, 0.176};
        
        String inntektString = showInputDialog("Skriv bruttoinntekten din:");
        int bruttoInntekt = parseInt(inntektString);

        int trinn = 0;
        double totalTrinnskatt = 0;

        while (trinn < trinnGrensene.length && bruttoInntekt > trinnGrensene[trinn]) {
            trinn++;
        }

        for (int i = 0; i <= trinn; i++) {
            int beløpTrinn = 0;
            if (i == 0) {
                beløpTrinn = Math.min(trinnGrensene[i], bruttoInntekt) - startTrinn;
            } else if (i == trinn) {
                beløpTrinn = bruttoInntekt - trinnGrensene[i - 1];
            } else {
                beløpTrinn = trinnGrensene[i] - trinnGrensene[i - 1];
            }
            totalTrinnskatt += beløpTrinn * skattesats[i];
        }

        showMessageDialog(null, "Du må betale kr " + totalTrinnskatt + " i trinnskatt");
    }
}