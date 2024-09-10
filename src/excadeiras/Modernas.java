package excadeiras;

public class Modernas extends Cadeiras{

	private int Nrodinhas;
	private String Tronco;
	
	@Override
	public void SetTronco(String s) {
		this.Tronco = s;
	}
	
	@Override
	public String GetTronco() {
		return this.Tronco;
	}
	
	@Override
	public void SetNrodinhas(int n) {
		this.Nrodinhas = n;
	}
	
	@Override
	public int GetNrodinhas() {
		return this.Nrodinhas;
	}
}
