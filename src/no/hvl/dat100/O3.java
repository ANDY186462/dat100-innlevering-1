package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//Brukeren må skrive inn et heltall
		String heltall = showInputDialog("Skriv inn et heltall: ");
		int n = Integer.parseInt(heltall);
				
		// n skal være større enn null
		 if(n > 0) {
			// long istedenfor int, i tileffe det kommer store fakulteter
			long fakultet = beregnFakultet(n);
			showMessageDialog(null, "Faktultet av " + n + " er " + fakultet);
		} else {
			// Feilmelding hvis n er mindre enn 0
			showMessageDialog(null, "Tallet må være større enn 0");
			
		}}
	
	public static long beregnFakultet(int n) {
			long resultat = 1;
			for(int i = 1; i <= n; i++) {
				resultat *= i;
			}	
				return resultat;
		}
					
		}


		
