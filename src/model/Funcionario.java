package model;

public class Funcionario extends Pessoa{
	private String funcao;
	
	public Funcionario(int id, String name, String cpf, int idade, String sexo, String estcv, String funcao) {
		super(id,name,cpf,idade,sexo,estcv);
		this.funcao = funcao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	public String toString() {
		return super.toString() + "Função: " + this.funcao + "\n";
	}
}
