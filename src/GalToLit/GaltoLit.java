/**
 * 
 */
package GalToLit;
import java.util.Scanner;

/**
 * @author diazam
 *
 */
public class GaltoLit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    // variables 
	    double liters;  // liters
	    double gallons; // gallons 
	    char choice='y';
	    Scanner keyboard = new Scanner( System.in );
	    while(choice=='y') {
		  System.out.println("== Aplikasi Konversi Gallons to Litters ==");
	      System.out.print( "Masukkan gallon untuk diubah menjadi litter:" ); 
	      gallons = keyboard.nextDouble( );
	      //1 US gallon = 3.7854 liter
	      //1 liters = 0.2641 gallons
	      liters = 3.7854 * gallons; 
	      System.out.print( gallons + " Gallons = " );
	      System.out.println( (double)Math.round( liters * 1000d) / 1000d + " liters." );
	      System.out.print( "Apakah Anda ingin mengonversi jumlah lain?? [y/t]:= " ); 
	      choice = keyboard.next().charAt(0); 
	    
	    }
	    keyboard.close();
	  } // end main

}
