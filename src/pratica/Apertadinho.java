package pratica;

public class Apertadinho {
	private int Max;
	private int Min;
	private int Num;
	
	public Apertadinho(int min, int max){
		this.Max = max;
		this.Min = min;
		this.Num = (int)(Math.random()*(max - min) + min);
	}
	
	public int GetMax(){
		return this.Max;
	}
	
	public int GetMin(){
		return this.Min;
	}
	
	public int GetNum(){
		return this.Num;
	}
	
	public void SetMax(int max){
		this.Max = max;
	}
	
	public void SetMin(int min){
		this.Min = min;
	}
	
	public boolean Verificar(int chute){
		if(chute == this.Num) {
			return true;
		} else {
			return false;
		}
	}
}
