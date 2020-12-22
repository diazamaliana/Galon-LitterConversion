package GalToLit;

import java.util.Scanner;

public class LitToGal {

	public static void main(String[] args) {
	    // variables 
	    double liters;  // liters
	    double gallons; // gallons 
	    char choice='y';
	    Scanner keyboard = new Scanner( System.in );
	    while(choice=='y') {
	     System.out.println("== Aplikasi Konversi Litters ke Gallons ==");
	      System.out.print( "Masukkan liter untuk diubah menjadi galon:" ); 
	      liters = keyboard.nextDouble( ); 
	      //1 US gallon = 3.7854 liter
	      //1 liters = 0.2641 gallons
	      gallons = 0.2641 * liters; 
	      System.out.print( liters + " Liters = " );
	      System.out.println( (double)Math.round(gallons * 1000d) / 1000d + " gallons." );
	      System.out.print( "Apakah Anda ingin mengonversi jumlah lain?? [y/t]:= " ); 
	      choice = keyboard.next().charAt(0); 
	    }
	    keyboard.close();
	  } // end main


}
