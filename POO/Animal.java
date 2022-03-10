package Introducao;

public class Animal {
	
	private String nome;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public int getIdade() {
		return idade;
	}
	public boolean isEmitirsom() {
		return emitirsom;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setEmitirsom(boolean emitirsom) {
		this.emitirsom = emitirsom;
	}
	private int idade;
	private boolean emitirsom;
	
	
	
	public void som() {
	this.emitirsom = true;
	System.out.println("Esse animal emite som");

	}
	{
	 
		
		
	
			}
	

	
}