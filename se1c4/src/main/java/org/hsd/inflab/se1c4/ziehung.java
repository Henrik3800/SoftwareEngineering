//Henrik Sopart und Florian Klören, Lotto, 23.11.2021 V.6.9

package org.hsd.inflab.se1c4;
import java.util.Arrays;

public class ziehung {

	public static int []lottoziehung() {
		
		//Array mit 6 int erstellen
		int[] numbers;
    	numbers = new int [6];
    	
    	//von Anfang bis Ende durch das Array wandern
    	for(int i = 0; i <= 5;) {
		
    		//zufällige Zaahl zwischen +1 bis +49 in die Variable Zwischenspeicher schreiben
    		int zwischenspeicher = (int) (Math.floor(Math.random() * 49) + 1);

    			//vergleichen ob der Inhalt von Zwischenspeicher schon in dem Array vorhanden ist
    			if (zwischenspeicher != numbers[0] && zwischenspeicher != numbers[1] && zwischenspeicher != numbers[2] && zwischenspeicher != numbers[3] && zwischenspeicher != numbers[4] && zwischenspeicher != numbers[5]) {
    			
    				//wenn der Wert nicht vorhanden ist, Wert von Zwischenspeicher in Array speichern und eine Variable im Array weiter gehen
    				numbers[i] = zwischenspeicher;
    				++i;
				
    			}   
    		
    	}
    	
    	//Array von klein nach groß sortieren
    	Arrays.sort(numbers);
    	
    	//Array Übergabe ans GUI
    	return numbers;

    //	

	


}
}