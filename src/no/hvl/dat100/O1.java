package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;


public class O1 {
	
	static int n = 0;

	public static void main(String[] args) 
	{
		poengGrense();
	}
	
	public static void poengGrense() 
	{
		for (int i = n; i < 10; i++) 
		{
			String sPoeng = showInputDialog("Skriv inn din poengsum, kandidtat nr:" + (i+1) );
		    int poeng = parseInt(sPoeng);
		    if (poeng >= 0 && poeng <= 100) 
		    {
		    	n++;
		    	if (poeng >= 0 && poeng <= 39) 
			    {
		    		System.out.println("Du har fått karakteren: F");
			    }
		    	else if (poeng >= 40 && poeng <= 49) 
		    	{
		    		System.out.println("Du har fått karakteren: E");
		    	}
		    	else if (poeng >= 50 && poeng <= 59) 
		    	{
		    		System.out.println("Du har fått karakteren: D");
		    	}
		    	else if (poeng >= 60 && poeng <= 79) 
		    	{
		    		System.out.println("Du har fått karakteren: C");
		    	}
		    	else if (poeng >= 80 && poeng <= 89) 
		    	{
		    		System.out.println("Du har fått karakteren: B");
		    	}
		    	else if (poeng >= 90 && poeng <= 100) 
		    	{
		    		System.out.println("Du har fått karakteren: A");
		    	}
		    }
		    else 
		    {
		    	System.out.println("ugyldig poengrense, prøv på nytt");
		    	n = i;
		    	poengGrense();
		    	break;
		    }
		    
		    //System.out.println(i +  ", " + n);
		}
	}

}
