package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.System.*;

public class O2 {

	public static void main(String[] args) 
	{
		String sInntekt = showInputDialog("Skriv din bruttoinntekt: ");
		int inntekt = parseInt(sInntekt);
		
		if (inntekt <= 208050) 
		{
			out.println("Ingen trinnskatt");
		}
		if (inntekt >= 208051 && inntekt <= 292850) 
		{	
			out.println("Du må betale "  + (inntekt-208051)*0.017 + "NOK i trinnskatt");
		}
		if (inntekt >= 292851 && inntekt <= 670000) 
		{
			out.println("Du må betale " + ((292850-208051)*0.017 + (inntekt-292850)*0.04) + " NOK i trinnskatt");
		}
		if (inntekt >= 670001 && inntekt <= 937900) 
		{
			out.println("Du må betale " + ((292850-208051)*0.017 + (670000-292851)*0.04 + (inntekt-670000)*0.136) + " NOK i trinnskatt");
		}
		if (inntekt >= 937901 && inntekt <= 1350000) 
		{
			out.println("Du må betale " + ((292850-208051)*0.017 + (670000-292851)*0.04 + (937900-670001)*0.136 + (inntekt - 937900)*0.166) +" NOK i trinnskatt");
		}
		if (inntekt >= 1350001) 
		{
			out.println("Du må betale " + ((292850-208051)*0.017 + (670000-292851)*0.04 + (937900-670001)*0.136 + (1350000-937901)*0.166 + (inntekt - 1350000)*0.176) + " NOK i trinnskatt");
		}
	}

}
