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
			out.println("ingen trinnskatt");
		}
		if (inntekt >= 208051 && inntekt <= 292850) 
		{
			out.println("du må betale 1.7% i trinnskatt, det vil si" + "\n" + inntekt*0.017 + "NOK");
		}
		if (inntekt >= 292851 && inntekt <= 670000) 
		{
			out.println("du må betale 4.0% i trinnskatt, det vil si" + "\n" + inntekt*0.04 + " NOK");
		}
		if (inntekt >= 670001 && inntekt <= 937900) 
		{
			out.println("du må betale 13.6% i trinnskatt, det vil si" + "\n" + inntekt*0.136 + " NOK");
		}
		if (inntekt >= 937901 && inntekt <= 1350000) 
		{
			out.println("du må betale 16.6% i trinnskatt, det vil si" + "\n" + inntekt*0.166 + " NOK");
		}
		if (inntekt >= 1350001) 
		{
			out.println("du må betale 17.6% i trinnskatt, det vil si" + "\n" + inntekt*0.176 + " NOK");
		}
	}

}
