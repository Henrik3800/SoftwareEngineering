//Henrik Sopart und Florian Klören, Demo, 19.11.2021 V.6.9

package se1c3;
public class KonstruktorDemo {

	public static void main(String[] args) {


		//Objekt "minivanObjekt" wird aus der Klasse Kfz erstellt mit Übergabewerten für den Konstruktor
		Kfz minivanObjekt = new Kfz(6,70,14);
								
		//Ausgabe der Reichweite / Verbrauch für Objekt "minivanObjekt" mit der Methode "reichweite() / spritVerbrauch()"
		System.out.println("Reichweite des Minivans:		 " + minivanObjekt.reichweite() + " Kilometer");
		System.out.println("Verbrauch des Minivans für 252 KM:	 " + minivanObjekt.spritVerbrauch(252) + " Liter");
		System.out.println();
		
		
		
		//Objekt "minivanObjekt" wird aus der Klasse Kfz erstellt mit Übergabewerten für den Konstruktor
		Kfz sportwagenObjekt = new Kfz(2,45,11);
								
		//Ausgabe der Reichweite / Verbrauch für Objekt "minivanObjekt" mit der Methode "reichweite() / spritVerbrauch()"
		System.out.println("Reichweite des Minivans:		 " + sportwagenObjekt.reichweite() + " Kilometer");
		System.out.println("Verbrauch des Minivans für 252 KM:	 " + sportwagenObjekt.spritVerbrauch(252) + " Liter");
		System.out.println();
	}

}
