package br.edu.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.edu.controle.AgendaController;
import br.edu.dao.ContatoDAO;
import br.edu.modelo.Contato;
import br.edu.visao.AgendaView;

public class Principal {
	
	public static void main(String[] args) {

		// Criar a coleção de contatos
        List<Contato> contatos = new ArrayList<>();

        // Criar o DAO e carregar os contatos
        ContatoDAO dao = new ContatoDAO("contatos.txt");
        dao.carregarContatos(contatos);

        // Criar o Controller
        AgendaController controller =
                new AgendaController(contatos, dao);

        // Criar a View
        Scanner sc = new Scanner(System.in);
        AgendaView view = new AgendaView(sc, controller);

        // Iniciar a aplicação
        view.iniciar();

        // Liberar o recurso de entrada
        sc.close();
    }	
}