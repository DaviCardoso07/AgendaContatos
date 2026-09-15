package br.edu.principal;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Uteis {
	public static void mostrarCabecalho() {
    	System.out.println("==========================");  
        System.out.println("     AGENDA DE CONTATOS    ");
        System.out.println("          v1.0.0           ");
        System.out.println("==========================");
        System.out.println("Bem-vindo!");
    }
    public static void mostrarMenu() {
    	System.out.println();
        System.out.println("1 - Adicionar contato");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Procurar contato");
        System.out.println("4 - Alterar contato");
        System.out.println("5 - Excluir contato");
        System.out.println("6 - Sair");
        System.out.println("7 - Sobre");
    }
    public static int selecionarOpcao(Scanner sc) {
    	int op;
    	System.out.print("Escolha uma opção: ");
        op = sc.nextInt();
        sc.nextLine();
        return op;
        
    }
    
    public static boolean sair() {
    	System.out.println("Saindo da Agenda de Contatos...");
        return false;
        
    }
    // função pronta para o java swing(roger disse só pra gente ver, depois vamos criar uma própria)
    public static void sobre() {
    	JOptionPane.showMessageDialog(null, "Desenvolvido por Davi Cardoso Guimarães");

    }
}
