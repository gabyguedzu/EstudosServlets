package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("GuedesSoft");
		empresa.setId(chaveSequencial++);
		lista.add(empresa);
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if (emp.getId() == id) {
				lista.remove(emp);
			}
		}
		
	}

	public Empresa buscaEmpresaPeloId(Integer id) {
		for(Empresa empresa : lista) {
			if(empresa.getId() == id) {
				return empresa;
			}		
		}
		
		return null;
	}

}
