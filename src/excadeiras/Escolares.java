package excadeiras;

public class Escolares extends Cadeiras{

	private String Braço;
	
	@Override
	public void SetBraço(String s) {
		this.Braço = s;
	}
	
	@Override
	public String GetBraço() {
		return this.Braço;
	}
}
