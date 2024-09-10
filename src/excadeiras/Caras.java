package excadeiras;

public class Caras extends Cadeiras{

	private String Estofado;
	
	@Override
	public void SetEstofado(String s) {
		this.Estofado = s;
	}
	
	@Override
	public String GetEstofado() {
		return this.Estofado;
	}
}
