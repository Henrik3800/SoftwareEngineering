//Henrik Sopart und Florian Kl�ren, Demo, 19.11.2021 V.6.9

package se1c3;
public class Lkw extends Kfz {	//extends Kfz -> vererbung von Klasse Kfz, Erweiterung um zwei Variablen

int ladeFlaeche;
boolean hatAnhaenger;
	
	//Konstruktor f�r die Klasse Lkw, Aufruf mit den �bergebenen Werten. (this., da beide Namen der Variablen gleich sind, also die von der �bergabe und die von der KLasse)
	Lkw(int sitze, int tankInhalt, float verbrauch, int ladeFlaeche, boolean hatAnhaenger) {
		super(sitze, tankInhalt, verbrauch);
		this.ladeFlaeche = ladeFlaeche;
		this.hatAnhaenger = hatAnhaenger;
		
				
	}

	//Methode zur Berechnung des Verbrauchs +1
	public float spritVerbrauch (int km) {
		
		float spritVerbrauch;
		spritVerbrauch = ((verbrauch / 100) * km)+1;
		return spritVerbrauch;
		
		}


}