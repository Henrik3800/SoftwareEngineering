//Henrik Sopart und Florian Klören, Demo, 19.11.2021 V.6.9

package se1c3;
public class KfzV0 {
	
	
	public int sitze;
	public int tankInhalt;
	public float verbrauch;
	
	//Methode zur Berechnung der Reichweite
	public float reichweite() {
		
		float reichweite;
		reichweite = (tankInhalt / verbrauch) * 100;
		
		return reichweite;
		}

	//Methode zur Berechnung des Verbrauchs
	public float spritVerbrauch(int km) {
		
		float spritVerbrauch;
		spritVerbrauch = (verbrauch / 100) * km;
		
		return spritVerbrauch;
		}
	
	
}