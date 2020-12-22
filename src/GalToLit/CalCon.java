package GalToLit;

import java.util.Scanner;

public class CalCon {

	public static void main(String[] args) {
		 // variables 
	    double liters;  // liters
	    double gallons; // gallons
	    Scanner keyboard = new Scanner( System.in );
	    char choice='y';

	    try {
	    	 while(choice == 'y') {
		    	System.out.println("==Aplikasi Kalkulator Gallons - Litters =="); 
	            System.out.println("1. Gallons ke Litters"); 
	            System.out.println("2. Litters ke Gallons"); 
	            System.out.print("Masukkan pilihan Anda: "); 
	            String pilihan = keyboard.nextLine();

           
            	switch (pilihan) { 
                case "1": 
                	 System.out.print( "Masukkan gallon untuk diubah menjadi litter:" ); 
           	      gallons = keyboard.nextDouble( );
           	      //1 US gallon = 3.7854 liter
           	      //1 liters = 0.2641 gallons
           	      liters = 3.7854 * gallons; 
           	      System.out.print( gallons + " Gallons = " );
           	      System.out.println( (double)Math.round( liters * 1000d) / 1000d + " liters." );
           	      System.out.print( "Apakah Anda ingin mengonversi jumlah lain?? [y/t]:= " ); 
           	      choice = keyboard.next().charAt(0); 
           	      break;
                case "2":
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
                	break;
                }
            	
            }
        	    
        	    
            
           
	    }catch(Exception e) { 
            e.printStackTrace(); 


	    }
	    finally {
		    keyboard.close();
	    }

	}
}

	