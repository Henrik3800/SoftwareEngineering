//Henrik Sopart und Florian Kl�ren, Demo, 19.11.2021 V.6.9

package se1c3;
public class ReturnDemo {

	public static void main(String[] args) {
		
		
		//Objekt "minivanObjekt" wird aus der Klasse KfzV0 erstellt
		KfzV0 minivanObjekt = new KfzV0();
		
		//Variablen im Objekt "minivanObjekt" Werte zuweisen
		minivanObjekt.sitze = 6;
		minivanObjekt.tankInhalt = 70;
		minivanObjekt.verbrauch = 14;	//F�r 100Km
		
		//Ausgabe der Reichweite f�r Objekt "minivanObjekt" mit der Methode "reichweite()"
		System.out.println("Reichweite des Minivans:		 " + minivanObjekt.reichweite() + " Kilometer");
		System.out.println();
		
		
		
		//Objekt "sportwagenObjekt" wird aus der Klasse KfzV0 erstellt
		KfzV0 sportwagenObjekt = new KfzV0();
				
		//Variablen im Objekt "sportwagenObjekt" Werte zuweisen
		sportwagenObjekt.sitze = 2;
		sportwagenObjekt.tankInhalt = 45;
		sportwagenObjekt.verbrauch = 11;	//F�r 100Km
				
		//Ausgabe der Reichweite f�r Objekt "sportwagenObjekt" mit der Methode "reichweite()"
		System.out.println("Reichweite des Sportwagens:		 " + sportwagenObjekt.reichweite() + " Kilometer");
		System.out.println();
		
		
	}

}
