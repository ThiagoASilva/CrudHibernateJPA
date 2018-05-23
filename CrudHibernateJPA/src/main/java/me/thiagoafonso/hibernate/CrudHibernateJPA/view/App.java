package me.thiagoafonso.hibernate.CrudHibernateJPA.view;

import me.thiagoafonso.hibernate.CrudHibernateJPA.Controller.ClienteJpaDAO;
import me.thiagoafonso.hibernate.CrudHibernateJPA.model.Cliente;

public class App {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCpf("123.456.789-10");
		cliente.setId(1);
		cliente.setNome("João Maria José");
		cliente.setRg("11.222.333-4");
		ClienteJpaDAO.getIntance().merge(cliente);
		System.out.println("Objeto salvo com sucesso!!!");
	}
}
