package main;

import model.*;

public class Main {
	public static void main(String[] args) {
		Empresa empresa = new Empresa(1, "SIOT");
		Funcionario func1 = new Funcionario(1, "José", "444.908.768-29", 29, "Masculino", "Casado", "Gerente de TI");
		Funcionario func2 = new Funcionario(2, "Alice", "378.810.225-08", 21, "Feminino", "Solteiro", "Analista de Dados");
		
		empresa.getFuncionarios().add(func1);
		empresa.getFuncionarios().add(func2);
		
		System.out.println(empresa.toString());
	}
}
