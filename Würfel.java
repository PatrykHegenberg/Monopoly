package Monopoly2;

public class Würfel {
	
	private int ergebnis1;
	private int ergebnis2;
	private boolean pasch;
	
	
	public Würfel() {
		this.role();
		
	}
	
	public int[] getResult() {
		int[] arr = new int[2];
		arr[0] = this.ergebnis1;
		arr[1] = this.ergebnis2;
		return arr;
	}
	
	public int getErgibnis1( ) {
		return this.ergebnis1;
	}
	
	public int getErgibnis2( ) {
		return this.ergebnis2;
	}
	
	public int getGesamtWurf() {
		return this.ergebnis1 + this.ergebnis2;
	}
	
	public void role () {
		this.ergebnis1 = (int) (Math.random() * 6) + 1;
		this.ergebnis2 = (int) (Math.random() * 6) + 1;
	}
	
	public boolean getIsPasch () {
		return true;
	}
}
