package br.edu.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        List<String> celulares = new ArrayList<>();
        List<String> emails = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int opcao;

        boolean continuar = true;

        Uteis.mostrarCabecalho();

        while (continuar) {

        	Uteis.mostrarMenu();
        	
        	opcao = Uteis.selecionarOpcao(sc);
        	
            switch (opcao) {
                case 1->{
                   Agenda.adicionar(sc, nomes, celulares, emails);
            	}
                case 2->{
                    Agenda.listar(nomes, celulares, emails);
            	}
                case 3->{
                	Agenda.pesquisar(sc, nomes, celulares, emails);
            	}
                case 4-> {
                	Agenda.atualizar(sc, nomes, celulares, emails);
                }         	
                case 5-> {
                	Agenda.excluir(sc, nomes, celulares, emails);
                }          	
                case 6-> {
                	continuar = Uteis.sair();
                }
                case 7-> {
                	Uteis.sobre();
                }
  
                default ->{
                   System.out.println("Opção inválida!");
                }
            }
        }
        sc.close();//ele "desliga" a ferramenta do scanner
    }
    
}
    