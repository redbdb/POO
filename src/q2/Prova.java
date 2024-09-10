package q2;
import java.util.*;

public class Prova {

	private String Nome;
	private int Nquest;
	private char[] Respostas;
	private int[] Valorq;
	
	public Prova(String nome, int n){
		this.Nome = nome;
		this.Nquest = n;
		this.Respostas = new char[n];
		this.Valorq = new int[n];
	}
	
	public String GetNome(){
		return this.Nome;
	}
	
	public int GetNquest(){
		return this.Nquest;
	}
	
	public int GetValorq(int indice){
		return this.Valorq[indice];
	}
	
	public char GetRespostas(int indice){
		return this.Respostas[indice];
	}
	
	public void SetRespostas(char R, int indice){
		this.Respostas[indice] = R;
	}
	
	public void SetValorq(int v, int indice){
		this.Valorq[indice] = v;
	}
}
