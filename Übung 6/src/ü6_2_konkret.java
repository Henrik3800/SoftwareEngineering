//Henrik Sopart und Florian Klören, Ü6_2, 24.11.2021 V.6.9

public class ü6_2_konkret extends ü6_1_abstrakt {
	
	private int zahl3;
	private int zahl4;
	

	ü6_2_konkret(int zahl1, int zahl2, int zahl3, int zahl4) {
		super(zahl1, zahl2);
		this.zahl3 = zahl3;
				
	}

	
	public int methode_a() {
		return zahl1;
	}
	
	public int methode_k() {
		return zahl2;
	}

	public int methode_xyz() {
		return zahl3;
	}
	
	public int methode_xyzx() {
		return zahl4;
	}
	

}
