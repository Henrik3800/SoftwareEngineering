//Henrik Sopart und Florian Klören, Ü6_1, 24.11.2021 V.6.9

abstract public class ü6_1_abstrakt {
	
	protected int zahl1;
	protected int zahl2;

	
	ü6_1_abstrakt(int zahl1, int zahl2){
		
		this.zahl1 = zahl1;
		this.zahl2 = zahl2;
		
	}
	
	public abstract int methode_a();
	
	public int methode_k() {return 0;}
	
}