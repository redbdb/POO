package excadeiras;

public abstract class Cadeiras {

	public int Npernas;
	public String Material;
	public String Cor;
	
	public void SetNpernas(int n){
		this.Npernas = n;
	}
	
	public void SetMaterial(String s){
		this.Material = s;
	}
	
	public void SetCor(String s){
		this.Cor = s;
	}
	
	public int GetNpernas() {
		return this.Npernas;
	}
	
	public String GetCor() {
		return this.Cor;
	}
	
	public String GetMaterial() {
		return this.Material;
	}
	
	//metodos para sobrecarga
	
	public void SetTronco(String s) {
	}
	
	public String GetTronco() {
	}
	
	public void SetNrodinhas(int n) {
	}
	
	public int GetNrodinhas() {
	}
	
	public void SetEstofado(String s) {
	}
	
	public String GetEstofado() {
	}
	
	public void SetBraço(String s) {
	}
	
	public String GetBraço() {
	}
}
