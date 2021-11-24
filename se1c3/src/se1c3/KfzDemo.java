//Henrik Sopart und Florian Klören, Demo, 19.11.2021 V.6.9

package se1c3;
public class KfzDemo {

	public static void main(String[] args) {
		
			
		//Objekt "minivanObjekt" wird aus der Klasse KfzV0 erstellt
		KfzV0 minivanObjekt = new KfzV0();
				
		//Variablen im Objekt "minivanObjekt" Werte zuweisen
		minivanObjekt.sitze = 6;
		minivanObjekt.tankInhalt = 70;
		minivanObjekt.verbrauch = 14;	//Für 100Km
		
		//Berechnung und Ausgabe der Reichweite für Objekt "minivanObjekt"
		float reichweite_minivan;
		reichweite_minivan = (minivanObjekt.tankInhalt / minivanObjekt.verbrauch) * 100;
		System.out.println("Reichweite des Minivans:		 " + reichweite_minivan + " Kilometer");
		System.out.println();
		
		
	}

}