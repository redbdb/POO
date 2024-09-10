package exanima;

public class Homem extends Animal{

	public Homem() {
		this.Tamanho = "Grande";
	}
	
	@Override
	public void Som() {
		System.out.println("falando");
	}
	
	@Override
	public void Mover() {
		System.out.println("andando");
	}
}
