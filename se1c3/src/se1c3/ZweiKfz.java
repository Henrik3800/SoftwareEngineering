//Henrik Sopart und Florian Klören, Demo, 19.11.2021 V.6.9

package se1c3;
public class ZweiKfz {

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
		
		
		
		//Objekt "sportwagenObjekt" wird aus der Klasse KfzV0 erstellt
		KfzV0 sportwagenObjekt = new KfzV0();
				
		//Variablen im Objekt "sportwagenObjekt" Werte zuweisen
		sportwagenObjekt.sitze = 2;
		sportwagenObjekt.tankInhalt = 45;
		sportwagenObjekt.verbrauch = 11;	//Für 100Km
		
		//Berechnung und Ausgabe der Reichweite für Objekt "sportwagenObjekt"
		float reichweite_sportwagen;
		reichweite_sportwagen = (sportwagenObjekt.tankInhalt / sportwagenObjekt.verbrauch) * 100;
		System.out.println("Reichweite des Sportwagens:		 " + reichweite_sportwagen + " Kilometer");
		System.out.println();
		
		
		
	}

}