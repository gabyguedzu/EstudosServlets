package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("GuedesSoft");
		lista.add(empresa);
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

}
