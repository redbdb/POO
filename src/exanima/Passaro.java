package exanima;

public class Passaro extends Animal{
	
	public Passaro() {
		this.Tamanho = "pequeno";
	}
	
	@Override
	public void Som() {
		System.out.println("piu");
	}
	
	@Override
	public void Mover() {
		System.out.println("voando");
	}
}
