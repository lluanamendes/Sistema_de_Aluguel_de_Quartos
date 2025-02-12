package aplication;

import java.util.Scanner;

import entities.Dados;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		Dados[] info= new Dados[10];
		int quarto;
		
		System.out.print("Quantos alunos irão alugar os quartos? ");
		int n=sc.nextInt();
		sc.nextLine();

		for (int i=0; i<n; i++) {
			System.out.print("Digite o nome do aluno: ");
			String nome=sc.nextLine();
			System.out.print("Digite o e-mail do aluno: ");
			String email=sc.nextLine();
			do {
                System.out.print("Digite o quarto (0 a 9): ");
                quarto = sc.nextInt();
                sc.nextLine();

                if (quarto < 0 || quarto > 9) {
                    System.out.println("❌ Escolha um quarto de 0 a 9.");
                } else if (info[quarto] != null) {
                    System.out.println("⚠️ Esse quarto já está ocupado! Escolha outro.");
                    quarto = -1;
                }
            } while (quarto < 0 || quarto > 9);
			
			info[quarto]=new Dados(quarto, nome, email);
		}
		
		System.out.println("Relação de Quartos:");
		for (int i=0; i<10; i++) {
			if(info[i] != null) {
			System.out.println(info[i]);
			} else {
				System.out.println("Quarto " +i+" : vago.");
			}
		}	
		sc.close();

	}

}
