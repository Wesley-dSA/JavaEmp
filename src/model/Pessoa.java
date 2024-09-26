package model;

public class Pessoa {
	private int id;
	private String name;
	private String cpf;
	private int idade;
	private String sexo;
	private String estcv;
	
	public Pessoa(int id,String name, String cpf, int idade, String sexo, String estcv) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.idade = idade;
		this.sexo = sexo;
		this.estcv = estcv;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstcv() {
		return estcv;
	}
	public void setEstcv(String estcv) {
		this.estcv = estcv;
	}
	
	public String toString() {
		return "\nPessoa - \nId: " + this.id + "\nNome: " + this.name + "\nCPF: " + this.cpf
				+ "\nIdade: " + this.idade + "\nSexo: " + this.sexo + "\nEstado Cívil: "
				+ this.estcv + "\n";
	}
}
