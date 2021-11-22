//Henrik Sopart und Florian Klören, FourOutOfSixCoins, 12.11.2021 V.6.9

package se1c2;
import java.util.Arrays;

public class FourOutOfSixCoins {
	
	
	public static int COIN_MAX_VALUE  = 6;			//Kann verändert werden
	public static int AMOUNT_OF_COINS  = 4;			//darf NICHT verändert werden
	
	public static int combinations = 0;

		
    public static void main(String[] args) {
    	
    	
    	int[] coin;
    	coin = new int [AMOUNT_OF_COINS];
    	
	
    	for (coin[0] = 1 ; coin[0] <= COIN_MAX_VALUE ; ++coin[0]) {
		
    		for (coin[1] = 1 ; coin[1] <= COIN_MAX_VALUE ; ++coin[1]) {

        		for (coin[2] = 1 ; coin[2] <= COIN_MAX_VALUE ; ++coin[2]) {

            		for (coin[3] = 1 ; coin[3] <= COIN_MAX_VALUE ; ++coin[3]) {
          			
             			if (coin[0] != coin[1] && coin[0] != coin[2] && coin[0] != coin[3] && coin[1] != coin[2] && coin[1] != coin[3] && coin[2] != coin[3]){
             				   				            					
             				System.out.println(Arrays.toString(coin));
             			    ++combinations;

                 			
             		}
            	}
        	}
    	}
   	}
    	
    	System.out.println();
    	System.out.print("Anzahl von möglichen Kombinationen mit Permutationen:" + combinations);
}
}