package q2;
import java.util.*;

public class Gabarito {
	private int Nquest;
	private char[] Respostas;
	
	public Gabarito(int n){
		this.Nquest = n;
		this.Respostas = new char[n];
	}
	
	public int GetNquest(){
		return this.Nquest;
	}
	
	public char GetRespostas(int indice) {
		return this.Respostas[indice];
	}
	
	public void SetRespostas(char R, int indice){
		this.Respostas[indice] = R;
	}
}
