package model;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
	private int cod;
	private String name;
	private List<Funcionario> funcionarios;
	
	public Empresa(int cod, String name) {
		this.cod = cod;
		this.name = name;
		this.funcionarios = new ArrayList<>();
	}
	
	
	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String auxEmpresa = "Empresa - \nCódigo: "+ this.cod + "\nNome: "+ this.name + "\n";
		for(int i = 0; i < this.funcionarios.size(); i++ ) {
			auxEmpresa += this.funcionarios.get(i).toString();
		}
		return auxEmpresa;
	}
}
