package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaPoupanca;
import conta.util.Cores;
import conta.model.ContaCorrente;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		
		while (true) {
			
			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                BANCO DO BRAZIL COM Z                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e){
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}
			
			if(opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco do Brazil com Z - O seu futuro começa aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

		switch(opcao) {
		case 1:
			System.out.println(Cores.TEXT_WHITE_BOLD +"Criar Conta\n\n");
			
			keyPress();
			break;
		case 2:
			System.out.println(Cores.TEXT_WHITE_BOLD +"Listar todas as Contas\n\n");
			
			keyPress();
			break;
		case 3:
			System.out.println(Cores.TEXT_WHITE_BOLD +"Consultar dados da conta - por número\n\n");
			
			keyPress();
			break;
		case 4:
			System.out.println(Cores.TEXT_WHITE_BOLD +"Atualizar dados da Conta\n\n");
			
			keyPress();
			break;
		case 5:
			System.out.println(Cores.TEXT_WHITE_BOLD +"Apagar a Conta\n\n");
			
			keyPress();
			break;
		case 6:
			System.out.println(Cores.TEXT_WHITE_BOLD +"Saque\n\n");
			
			keyPress();
			break;
		case 7:
			System.out.println(Cores.TEXT_WHITE_BOLD +"Depósito\n\n");
			
			keyPress();
			break;
		case 8:
			System.out.println(Cores.TEXT_WHITE_BOLD +"Transferência entre Contas\n\n");
			
			keyPress();
			break;
		default:
			System.out.println(Cores.TEXT_RED_BOLD +"\nOpção Inválida!\n" + Cores.TEXT_RESET);
			keyPress();
			break;
		}
	}
}		
	public static void sobre() {
		System.out.println(Cores.TEXT_PURPLE_BOLD + "\n❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Gabriella Martins Alvares - contato.gabriellama@gmail.com");
		System.out.println("github.com/gabriellama");
		System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️" + Cores.TEXT_RESET);
	}
	
	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
