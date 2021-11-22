//Henrik Sopart und Florian Klören, Demo, 19.11.2021 V.6.9

package se1c3;
public class Kfz {

	private int sitze;
	private int tankInhalt;
	protected float verbrauch; // protected, da durch Unterklassen drauf zugegriffen werden muss (durch vererbung)
	
	//Konstruktor für die Klasse Kfz, Aufruf mit den übergebenen Werten. (this., da beide Namen der Variablen gleich sind, also die von der Übergabe und die von der KLasse)
	Kfz(int sitze,int tankInhalt, float verbrauch)
	{
		this.tankInhalt=tankInhalt;
		this.sitze=sitze;
		this.verbrauch=verbrauch;
	}
		
	
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