package ex3pilares;

public class Pessoa {

	public String Nome;
	public String Nasc;
	
	public Pessoa(String nome, String data){
		this.Nasc = data;
		this.Nome = nome;
	}
	
	public Pessoa() {
	}
	
	public void SetNome(String nome){
		this.Nome = nome;
	}
	
	public void SetNasc(String data){
		this.Nasc = data;
	}
	
	public String GetNome() {
		return this.Nome;
	}
	
	public String GetNasc() {
		return this.Nasc;
	}
}
