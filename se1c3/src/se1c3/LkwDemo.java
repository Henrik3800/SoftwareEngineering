//Henrik Sopart und Florian Klören, Demo, 19.11.2021 V.6.9

package se1c3;
public class LkwDemo {

	public static void main(String[] args) {


		//Objekt "sportwagenObjekt" wird aus der Klasse Kfz mit Übergabewerten für den Konstruktor erstellt
		Kfz sportwagenObjekt = new Kfz(2,45,11);
								
		//Ausgabe der Reichweite / Verbrauch für Objekt "sportwagenObjekt" mit der Methode "reichweite() / spritVerbrauch()"
		System.out.println("Reichweite des Sportwagens:		 " + sportwagenObjekt.reichweite() + " Kilometer");
		System.out.println("Verbrauch des Sportwagens für 252 KM:	 " + sportwagenObjekt.spritVerbrauch(252) + " Liter");
		System.out.println();
		
		
		//Objekt "magirusObjekt" wird aus der Klasse Lkw mit Übergabewerten für den Konstruktor erstellt
		Kfz magirusObjekt = new Lkw(2,45,11,1,true);
								
		//Ausgabe der Reichweite / Verbrauch für Objekt "magirusObjekt" mit der Methode "reichweite() / spritVerbrauch()"
		System.out.println("Reichweite des Magirus:			 " + magirusObjekt.reichweite() + " Kilometer");
		System.out.println("Verbrauch des Magirus für 252 KM:	 " + magirusObjekt.spritVerbrauch(252) + " Liter");
		System.out.println();
		

	}

}
