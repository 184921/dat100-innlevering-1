package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.System.*;

public class O3 {

	public static void main(String[] args) 
	{
		String input = showInputDialog("skriv et heltall som er større enn 0 for beregne fakultet: ");
		int s = parseInt(input);
		
		if (s > 0) 
		{
			for(int i = s; i > 1; i--) 
			{
				s = s*(i-1);
			}
			out.println(input + " fakultet = " + s);
		}
		else if (s <= 0) 
		{
			out.println("feilmelding: tallet er ikke større enn null");
		}
	}

}
