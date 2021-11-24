import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Teste {
	
	//variaveis globais
	static Scanner entrada = new Scanner(System.in);
	static String opcao = "";
	static boolean sair = false;

	//metodo a ser testado
	public static void questao1() { // MATEUS CARNEIRO *ATUALIZADA*
		int cont = 0;
		int pontosq1 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();
		alternativa.add(" Cada instru��o termina com um ponto e v�rgula");
		alternativa.add(
				" O m�todo main � o ponto de partida de cada aplicativo java e deve iniciar com public static void main(String[] args)");
		alternativa.add(" O java diferencia letras mai�sculas de min�sculas");
		alternativa.add(" Palavras reservadas pelo java n�o podem ser usada para nomear vari�veis");
		alternativa.add(" A letra B e C est�o incorretas"); // CORRETA

		// sysout("\n\nConsiderando linguagem em java, assinale a op��o INCORRETA:\n\n",
		// TimeUnit.MILLISECONDS, timer);

		do {
			Collections.shuffle(alternativa);

			for (int i = 0; i < 5; i++) {
				switch (i) {
				case 0:
					System.out.println("(A)" + alternativa.get(i));
					break;
				case 1:
					System.out.println("(B)" + alternativa.get(i));
					break;
				case 2:
					System.out.println("(C)" + alternativa.get(i));
					break;
				case 3:
					System.out.println("(D)" + alternativa.get(i));
					break;
				case 4:
					System.out.println("(E)" + alternativa.get(i));
					break;
				}
			}

			System.out.print("\nDigite sua resposta: ");
			opcao = entrada.next();
			Integer index = 0;

			switch (opcao.toLowerCase()) {

			case "a":
				index = 0;
				break;
			case "b":
				index = 1;
				break;
			case "c":
				index = 2;
				break;
			case "d":
				index = 3;
				break;
			case "e":
				index = 4;
				break;
			}

			if (alternativa.get(index).equals(" A letra B e C est�o incorretas")) {
				System.out.println("Resposta Correta");
				pontosq1 += 10;
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq1 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("voc� errou " + cont + " vezes.");
					sair = true;
				}
			}

		} while (!sair);
		// somaDePontos = somaDePontos + pontosq1;
	}

	//teste no main principal
	public static void main(String[] args) {

		questao1();

		  if (opcao.equals("a") || opcao.equals("b") || opcao.equals("c")
				|| opcao.equals("d") || opcao.equals("e") || opcao.equals("A") || opcao.equals("B") || opcao.equals("C")
				|| opcao.equals("D") || opcao.equals("E")) {
			System.out.println("OK! Passou do teste.");
		} else
			System.out.println("Oops! Deu um resultado n�o esperado: " + opcao);
	}
}
