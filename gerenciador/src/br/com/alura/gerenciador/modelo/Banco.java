package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("GuedesSoft");
		empresa.setId(chaveSequencial++);
		lista.add(empresa);
		
		Usuario usuario1 = new Usuario();
		usuario1.setLogin("gaby");
		usuario1.setSenha("123");
		listaUsuarios.add(usuario1);
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

	public Usuario existeUsuario(String login, String senha) {
		for(Usuario usuario : listaUsuarios) {
			if(usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}

}
