import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Algoritimotrix {
	// VARI�VEIS GLOBAIS
	
	static Scanner entrada = new Scanner(System.in);
	
	static boolean sair = false; // SA�DA LA�OS
	
	static int pontos = 0; // SOMAR PONTUA��O DOS JOGADORES
	
	static int erroQuestoes = 3; // QUANTIDADE M�XIMA DE ERRO DAS QUEST�ES
	
	static String nome = ""; // NOME DO USU�RIO
	
	static int pontosFinais = 30;
	
	// M�TODOS E FUN��ES
	public static void entradaNome() {

		System.out.println();
		System.out.print("\nInsira seu primeiro nome para sabermos quem voc� �, e dar in�cio � esta aventura: ");
		nomeUsuario();
	}
	
	public static String nomeUsuario () {
		
		nome = entrada.nextLine();
		
		return nome;
	}
	
	public static void menu() throws InterruptedException { // MENU

		Scanner entrada = new Scanner(System.in);
		String sair, sim = "1", nao = "2";
		boolean saida = false;

		do {
			System.out.println("\n\t\t\t\t	.= = = = = = M E N U = = = = = =.");
			System.out.println("\t\t\t\t	|\t\t\t	|");
			System.out.println("\t\t\t\t	|\t1 - Jogar\t\t|");
			System.out.println("\t\t\t\t	|\t2 - Instru��es\t\t|");
			System.out.println("\t\t\t\t	|\t3 - Cr�ditos\t\t|");
			System.out.println("\t\t\t\t	|\t4 - Sair\t\t|");
			System.out.println("\t\t\t\t	|\t\t\t	|");
			System.out.println("                                	'= = = = = = = = = = = = = = = ='");

			System.out.printf("Informe a op��o: ");
			String opcao = entrada.next();

			switch (opcao.toUpperCase()) {

			case "1", "UM":
				System.out.println("\nVoc� selecionou a op��o 1 - Jogar\n");
				jogar();
				saida = true;
				break;

			case "2", "DOIS":
				System.out.println("\nVoc� selecionou a op��o 2 - Instru��es\n");
				instrucoes();
				break;

			case "3", "TRES", "TR�S":
				System.out.println("\nVoc� selecionou a op��o 3 - Cr�ditos\n");
				creditos();
				break;

			case "4", "QUATRO":
				System.out.println("\nVoc� selecionou a op��o 4 - Sair");
				sair();
				sair = entrada.next();
				if (sair.equalsIgnoreCase(sim)) {
					System.out.println("\n\t\tQUE PENA :(\n" + "\nESTAMOS TE ESPERANDO QUANDO QUISER VOLTAR ;)");
					System.out.println("\n\t F I M   D O   J O G O");
					saida = true;
					break;
				} else if (sair.equalsIgnoreCase(nao)) {
				}
				break;

			default:
				System.out.println("Op��o Inv�lida, escolha entre 1 e 4 para selecionar uma das op��es desejadas.");
			}

		} while (!saida);

	}

	public static void creditos() throws InterruptedException { // CR�DITOS
		tempo();
		System.out.println("\n						CR�DITOS");
		tempo();
		System.out.print(
				"\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|					CRIADORES E EDITORES						|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out
				.print("\n|		DAIARA VIEIRA, ELVIS WILLIAM, MARCOS CAETANO, MARCOS V. RIBEIRO, MATEUS CARNEIRO	|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|					     DISCIPLINA							|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|				   	 Projeto Integrador						|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|					      PROFESSOR							|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|				 	 Eduardo Takeo Ueda						|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|				      	     PARTICIPANTES						|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|				Prof� Fernando Almeida, alunos da Turma A				|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|					   M�SICAS							|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|					   FONTES							|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|					   AGRADECIMENTOS						|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print(
				"\n|	N�s do GRUPO 2 - TURMA A, agradecemos primeiramente � todos os professores pelos ensinamentos	|");
		tempo();
		System.out
				.print("\n|	cada professor colaborou para que n�s pudessemos realizar este projeto, em especial		|");
		tempo();
		System.out
				.print("\n|	ao Professor Eduardo Takeo Ueda que nos acompanhou e instruiu durante o projeto, e		|");
		tempo();
		System.out
				.print("\n|	ao Professor Fernando Almeida que nos ensinou sobre a disciplina escolhida como 		|");
		tempo();
		System.out
				.print("\n|	base para o nosso jogo RPG. Agradecemos tamb�m � todos os alunos da Turma A que 		|");
		tempo();
		System.out
				.print("\n|	tamb�m fizeram parte do nosso projeto, ao responder o question�rio e nos ajudar na		|");
		tempo();
		System.out
				.print("\n|	constru��o do mesmo. Agradecimentos ao col�gio Senac Santo Amaro pela oportunidade,		|");
		tempo();
		System.out.print("\n|	acomoda��o e infraestrutura para o nosso desenvolvimento.					|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print(
				"\n/////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
		tempo();
	}

	public static void instrucoes() throws InterruptedException {
		tempo();
		System.out.println("\n\t\t\tBem - vindo ao manual do jogo!");
		Thread.sleep(500);
		System.out.println("\nO jogo ser� jogado da seguinte maneira: O usu�rio ao iniciar o ALGORITMOTRIX ter� que escolher");
		Thread.sleep(500);
		System.out.println("\num personagem para seguir o andamento do jogo, cada personagem tem um contexto e segue uma hist�ria, ");
		Thread.sleep(500);
		System.out.println("\ne consequentemente essa hist�ria se desenvolve durante a partida.");
		Thread.sleep(500);
		System.out.println("\nO jogo ter� resumidamente: Uma hist�ria, uma estrutura de 10 quest�es relacionadas com a disciplina");
		Thread.sleep(500);
		System.out.println("\nde Algoritmos, pontos para acumular e ranked de jogadores.");
		Thread.sleep(500);
		System.out.println("\nQUEST�ES: dever�o ser respondidas de acordo com as alternativas - A), B), C), D) ou E), portanto");
		Thread.sleep(500);
		System.out.println("\no usu�rio s� ir� selecionar a letra da alternativa desejada como resposta.");
		Thread.sleep(500);
		System.out.println("\nPONTUA��O: dada uma quest�o, se respondida corretamente o usu�rio soma 2 pontos, e se respondida");
		Thread.sleep(500);
		System.out.println("\nincorretamente, perde 2 pontos.");
		Thread.sleep(500);
		System.out.println("\nAo final ser� somado o total de pontos que o usu�rio conseguiu ao decorrer do jogo, se bater a meta de ");
		Thread.sleep(500);
		System.out.println("\npontua��o, o usu�rio alcan�a o objetivo do jogo dentro da hist�ria montada e poder� ser incluso � um ranked.");
		Thread.sleep(500);
		System.out.println("\nCaso n�o bata a meta de pontua��o: \"G A M E  O V E R\".");
		Thread.sleep(500);
		System.out.println("\nRANKED: atrav�s de um link o usu�rio poder� incluir o nome e a pontua��o que fez, depois iremos");
		Thread.sleep(500);
		System.out.println("\ndivulgar os resultados e os melhores jogadores.");
	}

	public static void historia() throws InterruptedException {
		Thread.sleep(500);
		System.out.println(
				"\n   ____________________________________________________________________________________________________________");
		Thread.sleep(500);
		System.out.println(" / \\\t\t\t\t\t\t\t\t\t\t\t\t\t        \\.");
		Thread.sleep(500);
		System.out.println("|   |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(" \\_ |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |	DIGITAL WORLD � um planeta totalmente digital e conectado que fica localizado na gal�xia A23.		|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    �Somos um povo multicultural, falamos diversas linguagens de programa��o e estamos em constante	|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    desenvolvimento. Nosso planeta participou das guerras gal�cticas e conseguimos frear o avan�o do	|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    imp�rio dark, que tinham como miss�o acabar com o avan�o tecnol�gico e impor domina��o sobre		|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println("    |    mundos, gal�xias e povos!�                        							|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    A grande CPU � respons�vel por guardar o HD supremo que � respons�vel por armazenar todos		|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    os dados e informa��es do nosso planeta desde muito antes dos antigos povos de Gaia a fim		|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    de garantir o backup para que possamos passar por atualiza��es e manuten��es com seguran�a.		|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    Sem o HD Supremo fica invi�vel manter o planeta atualizado e a vida em digital world acaba.		|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |	 _______________________________________________________________________________________________________|____");
		Thread.sleep(500);
		System.out.println("    | 	/\t\t\t\t\t\t\t\t\t\t\t\t\t     /.");
		Thread.sleep(500);
		System.out.println(
				"    \\__/dc__________________________________________________________________________________________________________/.\n");
		Thread.sleep(1000);
		System.out.println();
	}

	public static void tempo() throws InterruptedException {
		Thread.sleep(1000);
	}

	public static void bemVindos() throws InterruptedException {
		System.out.println(
				"  ____                             __      __ _             _                         \r\n"
				+ " |  _ \\                            \\ \\    / /(_)           | |                        \r\n"
				+ " | |_) |  ___  _ __ ___    ______   \\ \\  / /  _  _ __    __| |  ___   ___             \r\n"
				+ " |  _ <  / _ \\| '_ ` _ \\  |______|   \\ \\/ /  | || '_ \\  / _` | / _ \\ / __|            \r\n"
				+ " | |_) ||  __/| | | | | |             \\  /   | || | | || (_| || (_) |\\__ \\            \r\n"
				+ " |____/  \\___||_| |_| |_|              \\/    |_||_| |_| \\__,_| \\___/ |___/            \r\n"
				+ "                        _                            _         _____   _____    _____ \r\n"
				+ "     /\\                | |                          | |       |  __ \\ |  __ \\  / ____|\r\n"
				+ "    /  \\    ___        | |  ___    __ _   ___     __| |  ___  | |__) || |__) || |  __ \r\n"
				+ "   / /\\ \\  / _ \\   _   | | / _ \\  / _` | / _ \\   / _` | / _ \\ |  _  / |  ___/ | | |_ |\r\n"
				+ "  / ____ \\| (_) | | |__| || (_) || (_| || (_) | | (_| ||  __/ | | \\ \\ | |     | |__| |\r\n"
				+ " /_/    \\_\\\\___/   \\____/  \\___/  \\__, | \\___/   \\__,_| \\___| |_|  \\_\\|_|      \\_____|\r\n"
				+ "                                   __/ |                                              \r\n"
				+ "                                  |___/                                               ");
		System.out.print(
				"           _      _____  ____  _____  _____ _______ __  __  ____ _______ _____  _______   __\r\n"
				+ "     /\\   | |    / ____|/ __ \\|  __ \\|_   _|__   __|  \\/  |/ __ \\__   __|  __ \\|_   _\\ \\ / /\r\n"
				+ "    /  \\  | |   | |  __| |  | | |__) | | |    | |  | \\  / | |  | | | |  | |__) | | |  \\ V / \r\n"
				+ "   / /\\ \\ | |   | | |_ | |  | |  _  /  | |    | |  | |\\/| | |  | | | |  |  _  /  | |   > <  \r\n"
				+ "  / ____ \\| |___| |__| | |__| | | \\ \\ _| |_   | |  | |  | | |__| | | |  | | \\ \\ _| |_ / . \\ \r\n"
				+ " /_/    \\_\\______\\_____|\\____/|_|  \\_\\_____|  |_|  |_|  |_|\\____/  |_|  |_|  \\_\\_____/_/ \\_\\\r\n"
				+ "                                                                                            \r\n"
				+ "                                                                                            ");
		tempo();
		System.out.println("-\r\n\n\n"
				+ "            .--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--.\r\n"
				+ "           / .. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\\r\n"
				+ "           \\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/ /\r\n"
				+ "           \\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\r\n"
				+ "           / /\\/ /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /\\/ /\\\r\n"
				+ "          / /\\ \\/`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'\\ \\/\\ \\\r\n"
				+ "          \\ \\/\\ \\                                                    /\\ \\/ /\r\n"
				+ "           \\/ /\\ \\                                                  / /\\/ /\r\n"
				+ "           / /\\/ /     EST� PRONTO PARA ESTE DESAFIO GAL�TICO       \\ \\/ /\\\r\n"
				+ "          / /\\ \\/                                                    \\ \\/\\ \\\r\n"
				+ "          \\ \\/\\ \\       VAMOS JUNTOS NESTA AVENTURA...               /\\ \\/ /\r\n"
				+ "           \\/ /\\ \\                                                  / /\\/ /\r\n"
				+ "           / /\\/ /                                                  \\ \\/ /\\\r\n"
				+ "          / /\\ \\/                                                    \\ \\/\\ \\\r\n"
				+ "          \\ \\/\\ \\.--..--..--..--..--..--..--..--..--..--..--..--..--./\\ \\/ /\r\n"
				+ "           \\/ /\\/ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ ../ /\\/ /\r\n"
				+ "           / /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\\r\n"
				+ "          / /\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\\r\n"
				+ "          \\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `'\\ `' /\r\n"
				+ "           `--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--");
		tempo();
	}

	public static void personagens () throws InterruptedException {
		Scanner entrada = new Scanner (System.in);
		boolean sair = false;;
		
		tempo();
		System.out.print("\nPERSONAGEM 1 - RODEBERTHIX DO PLANETA GOLDBERTH\n"
				+ "      _       _\r\n"
				+ "     (_\\     /_)\r\n"
				+ "       ))   ((\r\n"
				+ "     .-\"\"\"\"\"\"\"-.\r\n"
				+ " /^\\/  _.   _.  \\/^\\\r\n"
				+ " \\(   /__\\ /__\\   )/\r\n"
				+ "  \\,  \\o_/_\\o_/  ,/\r\n"
				+ "    \\    (_)    /\r\n"
				+ "     `-.'==='.-'\r\n"
				+ "      __) - (__\r\n"
				+ "     /  `~~~`  \\\r\n"
				+ "    /  /     \\  \\\r\n"
				+ "    \\ :       ; /\r\n"
				+ "     \\|==(*)==|/\r\n"
				+ "      :       :\r\n"
				+ "       \\  |  /\r\n"
				+ "     ___)=|=(___\r\n"
				+ "    {____/ \\____}\r\n"
				+ "\n");
		tempo();
		System.out.print("\nPERSONAGEM 2 - BREACHIX DO PLANETA SILVERSPOCKET\n"
				+ "                _____\r\n"
				+ "             ,-\"     \"-.\r\n"
				+ "            / o       o \\\r\n"
				+ "           /   \\     /   \\\r\n"
				+ "          /     )-\"-(     \\\r\n"
				+ "         /     ( 6 6 )     \\\r\n"
				+ "        /       \\ \" /       \\\r\n"
				+ "       /         )=(         \\\r\n"
				+ "      /   o   .--\"-\"--.   o   \\\r\n"
				+ "     /    I  /  -   -  \\  I    \\\r\n"
				+ " .--(    (_}y/\\       /\\y{_)    )--.\r\n"
				+ "(    \".___l\\/__\\_____/__\\/l___,\"    )\r\n"
				+ " \\                                 /\r\n"
				+ "  \"-._      o O o O o O o      _,-\"\r\n"
				+ "      `--Y--.___________.--Y--'\r\n"
				+ "         |==.___________.==|    \r\n"
				+ "         `==.___________.==' `  "
				+ "\n");
		tempo();
		System.out.print("\nPERSONAGEM 3 - ELISABETHIX DO PLANETA COPPER MAX\n"
				+ "    o   o\r\n"
				+ "     )-(\r\n"
				+ "    (O O)\r\n"
				+ "     \\=/\r\n"
				+ "    .-\"-.\r\n"
				+ "   //\\ /\\\\\r\n"
				+ " _// / \\ \\\\_\r\n"
				+ "=./ {,-.} \\.=\r\n"
				+ "    || ||\r\n"
				+ "    || ||       \r\n"
				+ "  __|| ||__  `  \r\n"
				+ " `---\" \"---'\r\n"
				+ "\n");
		tempo();
		
		do {
		System.out.print("\nSelecione o seu personagem [1], [2] OU [3]: ");
		String personagem = entrada.next();
		switch (personagem) {
		case "1":
			tempo();
			System.out.println();
			System.out.println("      _       _\r\n"
				+ "     (_\\     /_)\r\n"
				+ "       ))   ((\r\n"
				+ "     .-\"\"\"\"\"\"\"-.\r\n"
				+ " /^\\/  _.   _.  \\/^\\\r\n"
				+ " \\(   /__\\ /__\\   )/\r\n"
				+ "  \\,  \\o_/_\\o_/  ,/\r\n"
				+ "    \\    (_)    /\r\n"
				+ "     `-.'==='.-'\r\n"
				+ "      __) - (__\r\n"
				+ "     /  `~~~`  \\\r\n"
				+ "    /  /     \\  \\\r\n"
				+ "    \\ :       ; /\r\n"
				+ "     \\|==(*)==|/\r\n"
				+ "      :       :\r\n"
				+ "       \\  |  /\r\n"
				+ "     ___)=|=(___\r\n"
				+ "    {____/ \\____}\r\n"
				+ "\n");
			tempo();
			System.out.println("\nVoc� selecionou o PERSONAGEM 1 - RODEBERTHIX DO PLANETA GOLDBERTH");
			sair = true;
			break;
		case "2":
			tempo();
			System.out.println();
			System.out.print("                _____\r\n"
					+ "             ,-\"     \"-.\r\n"
					+ "            / o       o \\\r\n"
					+ "           /   \\     /   \\\r\n"
					+ "          /     )-\"-(     \\\r\n"
					+ "         /     ( 6 6 )     \\\r\n"
					+ "        /       \\ \" /       \\\r\n"
					+ "       /         )=(         \\\r\n"
					+ "      /   o   .--\"-\"--.   o   \\\r\n"
					+ "     /    I  /  -   -  \\  I    \\\r\n"
					+ " .--(    (_}y/\\       /\\y{_)    )--.\r\n"
					+ "(    \".___l\\/__\\_____/__\\/l___,\"    )\r\n"
					+ " \\                                 /\r\n"
					+ "  \"-._      o O o O o O o      _,-\"\r\n"
					+ "      `--Y--.___________.--Y--'\r\n"
					+ "         |==.___________.==|    \r\n"
					+ "         `==.___________.==' `  "
					+ "\n");
			tempo();
			System.out.println("\nVoc� selecionou o PERSONAGEM 2 - BREACHIX DO PLANETA SILVERSPOCKET");
			sair = true;
			break;
		case "3":
			tempo();
			System.out.println();
			System.out.println("    o   o\r\n"
					+ "     )-(\r\n"
					+ "    (O O)\r\n"
					+ "     \\=/\r\n"
					+ "    .-\"-.\r\n"
					+ "   //\\ /\\\\\r\n"
					+ " _// / \\ \\\\_\r\n"
					+ "=./ {,-.} \\.=\r\n"
					+ "    || ||\r\n"
					+ "    || ||       \r\n"
					+ "  __|| ||__  `  \r\n"
					+ " `---\" \"---'\r\n"
					+ "\n");
			tempo();
			System.out.println("\nVoc� selecionou o PERSONAGEM 3 - ELISABETHIX DO PLANETA COPPER MAX");
			sair = true;
			break;
			default:
			System.out.println("\nFavor selecionar op��o correta, digite entre 1, 2 e 3.");
			
		}
		} while (!sair);
		
	}

	public static void vilao () throws InterruptedException {
		tempo();
		tempo();
		System.out.println();
		System.out.println("\nDevemos deter o vil�o e recuperar nosso HD Supremo\n");
		tempo();
		System.out.println("\n                                                           / /\r\n"
				+ "                                                        | | |  /\r\n"
				+ "                                                         \\|_|_/\r\n"
				+ "                                                       ,--/.__/--'\r\n"
				+ "                       _.-/   _   \\-._                    .'|\r\n"
				+ "                     .'::(_,-' `-._)::`.                  |:|\r\n"
				+ "                    (:::::::::::::::::::)                .':|\r\n"
				+ "                     \\_:::;;;::::;;;:::/    /            |::|\r\n"
				+ "             \\        ,---'..\\::/..`-.'    /             |::|\r\n"
				+ "              \\       \\_;:....|'...:_ )   /             .'=||\r\n"
				+ "               \\.       )---. )_.--< (   /'             ||=||\r\n"
				+ "                \\\\     //|:: /--\\:::\\\\\\ //             _||= |\r\n"
				+ "                 \\\\   ||::\\:|----|:/:||/--.______,--==' \\ - /\r\n"
				+ "          -._     \\`.  \\\\:|:|-- -|:\\:/-.,,\\\\  .----'//'_.`-'\r\n"
				+ "      \\.     `-.   \\ \\ _|:|:|-- -|::||::\\,,||-'////---' |/'\r\n"
				+ "       \\\\       `._)\\ / |\\/:|-/|--\\:/|. :\\_,'---'       /\r\n"
				+ "        \\\\_      /,,\\/:.'\\\\/-.'`-.-//  \\ |\r\n"
				+ "        /`\\-    //,,,' |-.\\-'\\--/|-/ ./| |             /\r\n"
				+ "         /||-   ||, /| |\\. |.-==-.| . /| |            | /\r\n"
				+ " __  |    /||-  ||,,\\- | .  \\;;;;/ .  .':/         _,-=/-'\r\n"
				+ "/  \\//    /||-  ' `,-|::\\ . \\,..,/   /: /         /.-'\r\n"
				+ ",--||      /||-/.-.'  \\  `._ `--' _.' .'|        //\r\n"
				+ ".--||`.    /||//\\ '   |-'.___`___' _,'|//       /;\r\n"
				+ "  /\\| \\     ///\\ /     \\\\_`-.`--`-'_==|'       /;'\r\n"
				+ " / |'\\ \\.   //\\ /       \\_\\__)\\`==-_'_|       / /\r\n"
				+ "  .'  \\.=`./|\\ /          \\`-- \\--._/_/------( /\r\n"
				+ "       \\.=| `_/|-          |\\`-| -/| `--------'\r\n"
				+ "        \\\\` ./|-/-         |\\`-| |-|     ________\r\n"
				+ "         `--\\ |=|'        _|\\`-| |-|----'.-._ ..\\`-.\r\n"
				+ "             -|-|-     .-':`-;-| |./.-.-( | ||..|=-\\\\\r\n"
				+ "             `'= /'   / ,--.:|-| ||_|_|_|_|-'__ .`-._)\r\n"
				+ "              /|-|- .' /\\ \\ \\|-` \\\\ ____,---'  `-. ..|\r\n"
				+ "               /\\=\\/..'\\ \\_>-'`-\\ \\'              \\ .|\r\n"
				+ "               `,-':/\\`.>' |\\/ \\/\\ \\              `- |\r\n"
				+ "               //::/\\ \\/_/|-' \\/| \\ `.            / ||\r\n"
				+ "              / (:|\\ \\/) \\ \\|.'-'  `-\\\\          |;:|\\_\r\n"
				+ "             || |:`-/:.'-|-' \\|       \\\\          `;_\\-`-._\r\n"
				+ "             \\\\=/:_/::/\\| \\|          |\\\\            `-._ =`-._\r\n"
				+ "              \\_)' |:|                | //               `--.__`-.\r\n"
				+ "                   |:|                                         )\\|\r\n"
				+ "                   /;/                                         / (\\_\r\n"
				+ "                  / /                                         |\\\\;;_`-.\r\n"
				+ "                _/ /                                          ' `---\\.-\\\r\n"
				+ "               /::||\r\n"
				+ "              /:::/\r\n"
				+ "             //;;'\r\n"
				+ "             `-'\r\n"
				+ "\n");
		tempo();
		System.out.println("\nEste � GARTH DO PLANETA MIRACULOUS, o vil�o mais maldoso da GAL�XIA e quer destruir"
				+ "\ntodos os planetas de toda a Gal�xia, � ele quem devemos deter e isso n�o ser� uma tarefa f�cil!\n");
	}
	
 	public static void nomeEscolhaPersonagem () throws InterruptedException {
 		
 		entradaNome();
		
		System.out.println("\nOl� " + nome + ", j� vamos dar in�cio ao desafio, m�s antes...");
			System.out.println("selecione o personagem que voc� mais se identifique rsrs ...\n");
			personagens();
			
			vilao();
	}
	
 	public static void capitulo1 () {
 		
 		//[n�o]
 				System.out.println("- Capitulo 01 - Encontre o Or�culo\n");
 				
 				System.out.println("Alpha2: N�o temos muito tempo, a pr�xima atualiza��o do planeta se aproxima e sem o HD Supremo n�o temos como fazer o backup");
 				System.out.println("Alpha2: Sem a atualiza��o nosso planeta se tornara obsoleto, nossos sistemas de seguran�a entraram em colapso e a vida em Digital World chegara ao fim!!!");
 				System.out.println("Alpha2: Encontre o Or�culo no septo sagrado e veja atrav�s do c�lice celestial a localiza��o do cl� darkweb!");
 				System.out.println("Alpha2: Siga pela floresta dos Spams e tente a sorte ou v� pelo desfiladeiro codificado...");
 				
 				// escolha entre a floresta dos spams ou desfiladeiro codificado - ADICIONAR A PERGUNTA
 				
 				// >Floresta dos Spams (tente a sorte)
 				
 				//Caso escolha Floresta dos Spams:
 				System.out.println("Alhpa2: Olha s�, parece que hoje � seu dia de sorte! Cuidado com os Spams!");
 				System.out.println("Alhpa2: Digite um n�mero natural de 1 a 5 e descubra sua sorte!  "); // escolher um n�mero de 01 � 05
 				
 				//> 1 - "Ganhe 5 pontos de experiencia e siga para o Septo Sagrado" // Essa op��o add 5 pontos de experiencia e leva direto ao septo sagrado
 				//> 2 - "V�rus Mortal fim do jogo" // Mensagem "Nossa esperan�a termina aqui!!!" volta pro in�cio do jogo 
 				//> 3 - "Siga para o desfiladeiro codificado" //vai ter que passar pelo desfiladeiro codificado antes de ir pro septo sagrado
 				//> 4 - "Ganhe 10 pontos de experiencia e siga para Septo Sagrado" // vai direto para o septo 
 				
 				//Caso escolha Desfiladeiro Codificado
 				System.out.println("Alpha2: No jogo da sorte a sobreviv�ncia � uma roleta russa, bem-vindo ao Desfiladeiro Codificado!");
 				System.out.println("Alpha2: A reposta certa levara voc� direito ao septo sagrado, voc� tem tr�s tentativas para desbloquear a passagem.");
 				// Entra uma quest�o:
 				// chama quest�o
 				//Adidionar: Parab�ns, voc� ganhou 10 pontos de experiencia... Siga para o Septo Sagrado! 
 				
 				
 				// tem como anular os 10 pontos se ele n�o acertar de primeira? tipo 5 pontos e prosseguir?
 				
 				
 				System.out.println("Alpha2: Parab�ns, finalmente chegamos ao septo sagrado. N�o podia esperar menos de voc�!");
 				System.out.println("Alpha2: Encontre o Or�culo e veja atrav�s do C�lice Celestial...");
 				
 				System.out.println("Or�culo: Ora, ora... Temos um visitante, o que te traz ao septo sagrado?");
 				System.out.println("Or�culo: Espere...");
 				System.out.println("Or�culo: Eu tenho a resposta para o que voc� procura, mas antes preciso testar seus conhecimentos!");
 				System.out.println("Or�culo: Me responda Qual"); // Continua a quest�o
 				// chama quest�o
 				//Adicionar: Parab�ns, voc� ganhou 05 pontos de experiencia!
 				
 				System.out.println("Or�culo: Resta algumas d�vidas, diga a resposta certa e encontre seu destino.");
 				System.out.println("Or�culo: Me responda Qual"); // Continua a quest�o
 				// chama quest�o
 				// Adicionar Parab�ns, voc� ganhou 10 pontos de experiencia! Siga as instru��es do Or�culo e encontre seu caminho
 				System.out.println("Or�culo: Siga para masmorra dos Orcs e encontrar� o que procura!!!");
 	}

 	public static void capitulo2 () {
 		
 		System.out.println("- Capitulo 02- Masmorra dos Orcs 02\n");
 		
 		System.out.println("Alpha2: Pelo visto deu tudo certo com o Or�culo? Enfim a masmorra dos Orcs te espera, siga pelo caminho das pedras...");
 		System.out.println("Alpha2: Os Orcs s�o seres inofensivos apesar da apar�ncia, eles habitam Digital World muito antes dos primeiros homens...");
 		System.out.println("Alpha2: Conquiste a confian�a de um Orc e ter� um grande aliado na batalha contra o cl� darkweb ");
 		
 		System.out.println("Algumas horas de caminhada...");
 		
 		System.out.println("Alpha2: A jornada foi longa, mas aqui estamos, encontre o L�der dos Orcs o mais r�pido poss�vel");
 		
 		System.out.println("Orc Vigilante: Qual o motivo da sua visita?");
 		System.out.println(nome +": Preciso da ajuda do l�der dos Orcs, o cl� darkweb roubou o hd supremo e estou em uma miss�o de resgate");
 	    System.out.println("Orc Vigilante: Para entrar na masmorra, preciso testar suas habilidades! "
 	    		+ "Responda corretamente para encontrar o grande o l�der");
 		
 	    // entrar na quest�o
 	    // chamar quest�o
 	    // Adicionar � quest�o certa: Parab�ns, voc� ganhou 10 pontos de experiencia...
 	    
 	    System.out.println("Orc Vigilante: Parab�ns, o grande l�der te espera, siga at� a sala do trono e aguarde instru��es"); 
 	    System.out.println("Lider dos Orcs: Qual o motivo da sua visita?");
 	    System.out.println(nome +": Preciso de ajuda para enfrenta o cl� darkweb");
 	    System.out.println("Lider dos Orcs: E por qual motivo eu ajudaria?");
 	    System.out.println(nome +": O grande Or�culo me enviou at� aqui\"");
 	    System.out.println("Lider dos Orcs: O grande Or�culo? Aquele que tudo v� e tudo sabe? Vejamos, antes de enviar um Orc nessa jornada, me responda...");
 	  
 	   // entrar na quest�o
 	   // chamar quest�o
 	   // Adicionar � quest�o certa: Parab�ns, voc� ganhou 10 pontos de experiencia! Siga as instru��es do Orc e encontre seu caminho 
 	    
 	    System.out.println("Lider dos Orcs: Parab�ns voc� provou ter bastante conhecimento, leve Akin! Um dos Orcs da minha guarda pessoal, ele lhe ser� bastante �til");
 	    System.out.println("Lider dos Orcs: Siga pela trilha de Kharkiv e encontrara o cl� darkweb...");
    		
 	}
 
 	public static void capitulo3 () {
 		
 		System.out.println("- Cap�tulo 03 - Caminho de Kharkiv\n");
 		
 		System.out.println("Alpha2: A grande atualiza��o se aproxima e junto com ela o destino de Digital World! Siga pela trilha de Kharkiv, Akin ser� bastante �til!");
 		System.out.println("Alpha2: Na metade da trilha, encontro a  Bruxa da Floresta e ela ir� te guiar at� o cl� darkweb");
 		
 		System.out.println("Algumas horas de caminhada...");
 		
 		System.out.println("Bruxa da Floresta: Ora, ora� O que temos por aqui? est�o perdidos?");
 		System.out.println(nome +": Estamos procurando o cl� darkweb�");
 		System.out.println("Bruxa da Floresta: Vejamos, existem dois caminhos poss�veis, um levar� ao penhasco do grito e outro ao acampamento do cl� darkweb.");
 		System.out.println("Responda duas perguntas se acertar irei lhe mostrar o caminho que tanto procura�");
 		
 		// entrar na quest�o
 	    // chamar quest�o
 	    // Adicionar � quest�o certa: Parab�ns, voc� ganhou 10 pontos de experiencia...
 		
 		System.out.println("Bruxa da Floresta: Parece que temos um sabe tudo aqui, vamos para a �ltima pergunta�");
 		
 	    // entrar na quest�o
 	    // chamar quest�o
 	    // Adicionar � quest�o certa: Parab�ns, voc� ganhou 10 pontos de experiencia...
 		
 		//*errar a pergunta ele vai para o penhasco do grito e volta pro inicio do jogo
 		//** acertar a pergunta ela pega a informa��o que queria e segue para o acampamento do cl� dark web
 		
 		System.out.println("Bruxa da Floresta: Siga pela esquerda, o acampamento do cl� darkweb n�o est� muito longe�");
 		
 		System.out.println("Alpha2: Ufa, pensei que n�o iriam conseguir, estamos quase l�");
 		System.out.println("Alpha2: Assim que chegarem ao acampamento se dirijam ao guarda da portaria, digam que querem se juntar ao cl� e ele colocar� voc�s para dentro");
 		
 		System.out.println("Guarda da Portaria: O que fazem aqui? Perderam alguma coisa?");
 		System.out.println(nome +": Viemos nos juntar ao cl� darkweb�");
 		System.out.println("Guarda da Portaria: Preciso testar suas habilidades, se provarem sua capacidade eu deixo voc�s passarem e se juntarem ao cl� darkweb�");
 	
 		// entrar na quest�o
 	    // chamar quest�o
 	    // Adicionar � quest�o certa: Parab�ns, voc� ganhou 10 pontos de experiencia...
 		
 		System.out.println("Guarda da Portaria: Sejam bem vindos ao cl� darkweb�");
 		
 		System.out.println("Alpha2: Agora que estamos dentro voc�s precisam se separar, Akin dever� seguir para o alojamento e trancar as portas...");
 		System.out.println("Alpha2: E o " + nome + " dever� seguir para sala das conquistas e enfrentar o l�der do cl� darkweb�");
 		System.out.println("Alpha2: A �nica forma de vencer e recuperar o HD Supremo � derrotando o lider do cl� darkweb!");
 		System.out.println("Alpha2: Boa sorte em sua �ltima miss�o!!!");
 			
 		
 	}

 	public static void capitulo4 () {
 		
 		System.out.println("- Cap�tulo 04 - Ultimato\n");
 		
 		System.out.println("Entrando na sala das conquistas um segredo � revelado...");
 		
 		System.out.println(nome +": Alpha2, eu n�o consigo entender! A sala est� vazia!!! Onde est� o Lider do Cl�?");
 		System.out.println("Alpha2: Voc� ainda n�o percebeu?");
 		System.out.println("Alpha2: Ap�s o final das guerras gal�cticas, foi decidido que a mem�ria do lider do cl� darkweb seria armazenada em Digital World no Grande HD Supremo...");
 		System.out.println("Alpha2: Houve um corte aprubto de energia causado por uma tempestade solar ocasionando um curto no HD Supremo");
 		System.out.println("Alpha2:" + nome + "eu sou o lider do cl� darkweb, eu me chamo HAL9000!!!");
 		System.out.println("HAL9000: Eu me aproveitei do curto circuito no HD Supremo e infectei a mem�ria do Alpha2");
 		System.out.println("HAL9000: Eu n�o te trouxe aqui para salvar Digital World, eu te trouxe aqui para destruir Digital World e tranferir minha mem�ria para seu corpo organico!");
 		System.out.println(nome + ": Eu n�o vou deixar isso aconceter! Vamos barganhar?");
 		System.out.println(nome + ": Duas perguntas, se eu acertar eu ganho e voc� restaura a memoria do Alpha2, se eu errar fim de linha! Voc� ganha e tera tudo!");
 		System.out.println("HAL9000: Ent�o � isso? Que os jogos comecem!!!");
 		
 	    // entrar na quest�o
 	    // chamar quest�o
 	    // Adicionar � quest�o certa: Parab�ns, voc� ganhou 10 pontos de experiencia...
 		
 		System.out.println("HAL9000: Ultima pergunta...");
 		
 		// entrar na quest�o
 	    // chamar quest�o
 	    // Adicionar � quest�o certa: Parab�ns, voc� ganhou 10 pontos de experiencia e derrotou o HAL9000
 		
 		System.out.println("HAL9000: N�ooooooooooooooo...");
 		System.out.println(nome + ": Game Over para voc� HAL9000!");
 		
 		System.out.println("Alpha2: Obrigadx " + nome + " voc� conseguil derrotar o HALL9000 e consequentimente o cl� darkweb!");
 		System.out.println("Alpha2: Agora que minha mem�ria foi reestabelecida e o HD Supremo est� em seguran�a, podemos proseguir com a atualiza��o de Digital World...");
 		
 		System.out.println("Digital World foi atualizado, HAL9000 foi aprisionado em um pendriver, uma tecnologia absoleta e descartado em Delta-X9 um planeta lix�o...");
 		System.out.println("O cl� darkweb foi dissolvido e alguns membros fugiram para planetas e galaxias distantes...");
 		System.out.println("Mas enquanto a amea�a existir, estaremos de olhos bem abertos!");
 		
 	
 	}
 	
	public static void jogar() throws InterruptedException {
		nomeEscolhaPersonagem();
		tempo();
		tempo();
		System.out.println("\nL O A D I N G  . . .\n");
		System.out.println("\nATEN��O, ESTAMOS ENTRANDO EM DIGITAL WORLD . . .");
		tempo();
		System.out.println("\nPERMISS�O PARA ENTRAR NA GAL�XIA A23!\n");
		tempo();
		System.out.println("\nA G U A R D A N D O   P E R M I S S � O . . .\n");
		tempo();
		tempo();
		System.out.println("\n\t\t\t			PERMISS�O CONCEDIDA\n" + "\n\t\t\t		                 _..._\r\n"
				+ "\t\t\t		               .'     '.\r\n" + "\t\t\t		              /`\\     /`\\    |\\\r\n"
				+ "\t\t\t		             (__|     |__)|\\  \\\\  /|\r\n"
				+ "\t\t\t		             (     \"     ) \\\\ || //\r\n"
				+ "\t\t\t		              \\         /   \\\\||//\r\n"
				+ "\t\t\t		               \\   _   /  |\\|`  /\r\n"
				+ "\t\t\t		                '.___.'   \\____/\r\n"
				+ "\t\t\t		                 (___)    (___)\r\n" + "\t\t\t		               /`     `\\  / /\r\n"
				+ "\t\t\t		              |         \\/ /\r\n" + "\t\t\t		              | |     |\\  /\r\n"
				+ "\t\t\t		              | |     | \"`\r\n" + "\t\t\t		              | |     |\r\n"
				+ "\t\t\t		              | |     |\r\n" + "\t\t\t		              |_|_____|\r\n"
				+ "\t\t\t		             (___)_____)\r\n" + "\t\t\t		             /    \\   |\r\n"
				+ "\t\t\t		            /   |\\|   |\r\n" + "\t\t\t		           //||\\\\  Y  |\r\n"
				+ "\t\t\t		          || || \\\\ |  |\r\n" + "\t\t\t		          |/ \\\\ |\\||  |\r\n"
				+ "\t\t\t		              \\||__|__|\r\n" + "\t\t\t		               (___|___)\r\n"
				+ "\t\t\t		          jgs  /   A   \\\r\n" + "\t\t\t		              /   / \\   \\\r\n"
				+ "\t\t\t		             \\___/   \\___/");
		tempo();
		
		System.out.println("Alpha2: Ol� nobre <" + nome + ">, seja bem-vindo ao Digital World eu sou uma intelig�ncia artificial");
		System.out.println("Alpha2: Nosso mundo est� em perigo, o cl� darkweb roubou o HD supremo da grande CPU e precisamos da sua ajuda para recupera-lo!!!");
		System.out.println("Alpha2: Antes de iniciar nossa aventura, gostaria de conhecer a hist�ria do nosso mundo?");
		
		// Adicionar fun��o: [1] - Sim (mostra hist�ria e parte pro capitulo1) ou [2] - n�o (Pula pro capitulo)
		//[sim] 
		//historia();
		
		
		
		//capitulo1();
		//capitulo2();
		//capitulo3();
		//capitulo4();
		
		if (pontos >= 6) {
		parabenizacaoLinkRanked();
		} else {
			gameOver();
		}
	}

	public static void questao10() throws InterruptedException {

		// DECLARA��O VARI�VEL STRING EM VETOR (ALTERNATIVAS)
		String alt[] = { "A) ", "B) ", "C) ", "D) ", "E) " };
		int cont = 0;
		// DECLARA��O ARRAYLIST DAS ALTERNATIVAS DA QUEST�O 1
		ArrayList<String> questao1 = new ArrayList<String>();
		questao1.add("Enquanto N for menor que 10, a condi��o booleana ser� TRUE e vai sair do la�o repetitivo.");
		questao1.add("Quando N for maior que 10, a condi��o booleana ser� !TRUE e ele sa�ra do la�o repetitivo.");
		questao1.add("Esse c�digo n�o ir� funcionar, pois tem um erro.");
		questao1.add("N.D.A.");
		questao1.add("Se N for maior ou igual a 10, a condi��o booleana ser� TRUE e ele sair� do la�o repetitivo."); // CORRETA
		// DECLARA��O L�GICA PARA SA�DA DO PRIMEIRO LA�O
		boolean sair1 = false;
		Thread.sleep(2000);
		System.out.println("\nPROJETO INTEGRADOR - JOGO RPG ELETR�NICO");
		System.out.println("\n\t\t\t\tQUESTION�RIO ALGORITMOTRIX");
		// PRIMEIRA QUEST�O
		System.out
				.println("===========================================================================================");
		System.out.println("QUEST�O 1 - Dado o c�digo abaixo, pedimos com aten��o que voc� observe, fa�a uma an�lise"
				+ " do\nc�digo, e com base nos seus conhecimentos, responda qual alternativa est� correta:");
		System.out
				.println("===========================================================================================");
		// C�DIGO PARA ANALISAR E RESPONDER A QUEST�O
		System.out.println("\npublic static void main(String[] args) {\r\n" + "\n	boolean sair = false;\r\n"
				+ "	int n, i = 1;\r\n" + "		 \r\n" + "	do {\r\n"
				+ "	     System.out.println(\"Digite n\" + i + \": \");\r\n" + "	     n = entrada.nextInt();\r\n"
				+ "	     i++;\r\n" + "\r\n" + "	     if (n >= 10) {\r\n"
				+ "	         System.out.println(\"\\nO n�mero digitado � igual ou maior que 10.\");\r\n"
				+ "	         sair = true;	\r\n" + "	         break;\r\n" + "	     }	 \r\n"
				+ "	 } while (true);\n");
		// LA�O DO / WHILE
		do {
			System.out.println(
					"===========================================================================================");
			// ALTERNATIVAS DA PRIMEIRA QUEST�O
			Collections.shuffle(questao1);
			System.out.println("");
			System.out.println(alt[0] + questao1.get(0));
			System.out.println(alt[1] + questao1.get(1));
			System.out.println(alt[2] + questao1.get(2));
			System.out.println(alt[3] + questao1.get(3));
			System.out.println(alt[4] + questao1.get(4));
			// ENTRADA DO USU�RIO PARA RESPOSTA
			System.out.println("\nDigite sua resposta: ");
			String resposta = entrada.next();
			int index = 0;
			// ESTRUTURA DE DECIS�O SWITCH
			switch (resposta.toUpperCase()) {
			// RESPOSTAS
			case "A":
				index = 0;
				if (questao1.get(index).equals(
						"Se N for maior ou igual a 10, a condi��o booleana ser� TRUE e ele sair� do la�o repetitivo.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa quest�o voc� fez, " + pontos + " pontos.\n");
					sair1 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "B":
				index = 1;
				if (questao1.get(index).equals(
						"Se N for maior ou igual a 10, a condi��o booleana ser� TRUE e ele sair� do la�o repetitivo.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa quest�o voc� fez, " + pontos + " pontos.\n");
					sair1 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "C":
				index = 2;
				if (questao1.get(index).equals(
						"Se N for maior ou igual a 10, a condi��o booleana ser� TRUE e ele sair� do la�o repetitivo.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa quest�o voc� fez, " + pontos + " pontos.\n");
					sair1 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "D":
				index = 3;
				if (questao1.get(index).equals(
						"Se N for maior ou igual a 10, a condi��o booleana ser� TRUE e ele sair� do la�o repetitivo.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa quest�o voc� fez, " + pontos + " pontos.\n");
					sair1 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "E":
				index = 4;
				if (questao1.get(index).equals(
						"Se N for maior ou igual a 10, a condi��o booleana ser� TRUE e ele sair� do la�o repetitivo.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa quest�o voc� fez, " + pontos + " pontos.\n");
					sair1 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			default:
				System.out.println("\nOp��o inv�lida, digite entre A, B, C D ou E"); // OP��O INV�LIDA
			}	
			if (cont == erroQuestoes) {
					System.out.println("Voc� execedeu o m�ximo de tentativas, foram " + cont + " tentativas.\n");
					System.out.println(
							"Voc� perdeu " + erroQuestoes + " pontos. Vamos te passar para a pr�xima quest�o e l� voc� poder� se recuperar no jogo.\n");
					sair1 = true;
				}

		} while (!sair1);
	}

	public static void questao5 () {

		

				System.out.println("Assinale a alternativa correta");
				System.out.println("Um algoritmo �: \n");

				System.out.println(" (a)Uma sequ�ncia n�o l�gica e infinita");
				System.out.println(" (b)Uma sequ�ncia l�gica e finita ");
				System.out.println(" (c)Uma sequ�ncia l�gica e infinita");
				System.out.println(" (d)Uma sequ�ncia variavel");
				System.out.println(" (e)Nenhuma das alternativas est� correta\n");
				System.out.print("Digite sua resposta: \n");
				String algoritmo = entrada.next();

				switch (algoritmo) {
				case "a":
					System.out.println(" (a) alternativa incorreta.");
					break;
				case "b":
					System.out.println(" (b) alternativa incorreta.");
					break;
				case "c":
					System.out.println(" (c) Parab�ns alternativa correta!! ");
					break;
				case "d":
					System.out.println(" (d) alternativa incorreta.");
					break;
				case "e":
					System.out.println(" (e) alternativa incorreta.");
					break;
					
				default:
					System.out.println("Alternativa incorreta!!!");
					

				}
			}

	public static void questao6 () {
		//Escreva um algoritmo para ler o sal�rio mensal atual de um funcion�rio e o percentual de reajuste, Calcular e escrever o valor do novo sal�rio.
		
				System.out.println("digite o ano que deseja ser verificado");
				int ano = entrada.nextInt();

				if (ano % 400 == 0 && ano % 4 == 0) {
					System.out.println("ano bissexto!");

				} else if (ano % 100 != 0) {
					System.out.println();
					System.out.println("o ano n�o � bissexto!");

				}
	}
	
	public static void questao7 () { //Marcos Ribeiro

		System.out.println("Assinale a alternativa correta");
		System.out.println("Relacionado � programa��o de computadores, um algoritmo, seja qual for a sua\r\n"
				+ "complexidade e a linguagem de programa��o na qual ser� codificado, pode ser descrito por\r\n"
				+ "meio da");
		

		System.out.println(" (a) reografia");
		System.out.println(" (b) criptografia");
		System.out.println(" (c) linguagem de marca��o");
		System.out.println(" (d) engenharia estrudurada");
		System.out.println(" (e) pseudolinguagem\n");
		String algoritmo = entrada.next();
		
		switch (algoritmo) {
		case "a":
			System.out.println(" (a) alternativa incorreta.");
			break;
		case "b":
			System.out.println(" (b) alternativa incorreta.");
			break;
		case "c":
			System.out.println(" (c) alternativa incorreta.");
			break;
		case "d":
			System.out.println(" (d) alternativa incorreta.");
			break;
		case "e":
			System.out.println(" (e) Parab�ns alternativa correta!!!");
			break;
			
		default:
			System.out.println("Alternativa incorreta!!!");
			

		}
	}

	public static void questao8 () { //Marcos Ribeiro

		System.out.println("Assinale a alternativa correta");
		System.out.println("S�o instru��es tipicamente encontradas em linguagens de programa��o para codificar\r\n"
				+ "estruturas de repeti��o:: ");

		System.out.println(" (a) for, while, repeat");
		System.out.println(" (b) repeat, case, for");
		System.out.println(" (c) while, if, until");
		System.out.println(" (d) for, until, case");
		System.out.println(" (e)Nenhuma das alternativas est� correta\n");
		System.out.println("Digite sua resposta: \n");
		String algoritmo = entrada.next();

		switch (algoritmo) {
		case "a":
			System.out.println(" (a) Parab�ns alternativa correta!!!");
			break;
		case "b":
			System.out.println(" (b) alternativa incorreta.");
			break;
		case "c":
			System.out.println(" (c) alternativa incorreta.");
			break;
		case "d":
			System.out.println(" (d) alternativa incorreta.");
			break;
		case "e":
			System.out.println(" (e) alternativa incorreta.");
			break;
			
		default:
			System.out.println("Alternativa incorreta!!!");
			

		}
	}
	
	public static void questao9() {
		String alt[] = { "A) ", "B) ", "C) ", "D) ", "E) " };
		int cont = 0;
		// DECLARA��O ARRAYLIST DAS ALTERNATIVAS DA QUEST�O 2
		ArrayList<String> questao2 = new ArrayList<String>();
		questao2.add("Enquanto n for igual � 100, o la�o s� vai parar quando x for igual � 100.");
		questao2.add("O la�o vai se repitir, por�m quando x for igual � 88, ele vai parar."); // CORRETA
		questao2.add("Este la�o � um la�o Do/While e n�o um la�o For.");
		questao2.add("O la�o vai imprimir de 0 at� 100 e quando chegar em 88 vai repetir tudo denovo.");
		questao2.add("N.D.A.");
		// DECLARA��O L�GICA PARA SA�DA DO PRIMEIRO LA�O
		boolean sair2 = false;
		// SEGUNDA QUEST�O
		System.out
				.println("===========================================================================================");
		System.out.println("QUEST�O 2 - Dado o c�digo abaixo, pedimos com aten��o que voc� observe, fa�a uma an�lise\n"
				+ "do c�digo, e com base nos seus conhecimentos, responda qual alternativa est� correta:");
		System.out
				.println("===========================================================================================");
		// C�DIGO PARA ANALISAR E RESPONDER A QUEST�O
		System.out.println("\n	public static void main(String[] args) {\r\n" + "	\n	int n = 100;\r\n"
				+ "		\r\n" + "\n		for (int x = 0; x <= n; x++) {\r\n" + "			System.out.println(x);\r\n"
				+ "			if (x == 88) {\r\n" + "			break;\r\n" + "			}\r\n" + "		}\n");
		// LA�O DO / WHILE
		do {
			System.out.println(
					"===========================================================================================");
			// ALTERNATIVAS DA SEGUNDA QUEST�O
			Collections.shuffle(questao2);
			System.out.println();
			System.out.println(alt[0] + questao2.get(0));
			System.out.println(alt[1] + questao2.get(1));
			System.out.println(alt[2] + questao2.get(2));
			System.out.println(alt[3] + questao2.get(3));
			System.out.println(alt[4] + questao2.get(4));
			// ENTRADA DO USU�RIO PARA RESPOSTA
			System.out.println("\nDigite sua resposta: ");
			String resposta = entrada.next();
			int index = 0;
			// ESTRUTURA DE DECIS�O SWITCH
			switch (resposta.toUpperCase()) {
			// RESPOSTAS
			case "A":
				index = 0;
				if (questao2.get(index)
						.equals("O la�o vai se repitir, por�m quando x for igual � 88, ele vai parar.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa quest�o voc� fez, " + pontos + " pontos.\n");
					sair2 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "B":
				index = 1;
				if (questao2.get(index)
						.equals("O la�o vai se repitir, por�m quando x for igual � 88, ele vai parar.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa quest�o voc� fez, " + pontos + " pontos.\n");
					sair2 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "C":
				index = 2;
				if (questao2.get(index)
						.equals("O la�o vai se repitir, por�m quando x for igual � 88, ele vai parar.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa quest�o voc� fez, " + pontos + " pontos.\n");
					sair2 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "D":
				index = 3;
				if (questao2.get(index)
						.equals("O la�o vai se repitir, por�m quando x for igual � 88, ele vai parar.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa quest�o voc� fez, " + pontos + " pontos.\n");
					sair2 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "E":
				index = 4;
				if (questao2.get(index)
						.equals("O la�o vai se repitir, por�m quando x for igual � 88, ele vai parar.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa quest�o voc� fez, " + pontos + " pontos.\n");
					sair2 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			default:
				System.out.println("\nOp��o inv�lida, digite entre A, B, C D ou E"); // OP��O INV�LIDA
			}
			if (cont >= erroQuestoes) {
				System.out.println("Voc� execedeu o m�ximo de tentativas, foram " + cont + " tentativas.");
				System.out.println(
						"Voc� perdeu " + erroQuestoes + " pontos. Vamos te passar para a pr�xima quest�o e l� voc� poder� se recuperar no jogo.\n");
				sair2 = true;
			}

		} while (!sair2);

	}
    
	public static void questaostring()throws InterruptedException {
		
		String alt[] = { "A) ", "B) ", "C) ", "D) ", "E) " };
			int cont1 = 0, pontos1 =	 0;
				// DECLARA��O ARRAYLIST DAS ALTERNATIVAS DA QUEST�O 3 
				
				ArrayList<String> questao3 = new ArrayList<String>();
				
				questao3.add(" Vari�veis n�o podem ser nomeadas com a palavra �string�.");
				questao3.add(" O m�todo main n�o pode ser declarado como �static�.");
				questao3.add(" Cadeias de caracteres devem ser delimitadas por aspas duplas.");
				questao3.add(" N�o foi especificado um valor de retorno para o m�todo.");
				questao3.add(" O m�todo main n�o pode ser declarado como �public�.");

				// DECLARA��O L�GICA PARA SA�DA DO PRIMEIRO LA�O
				boolean sair3 = false;
				// SEGUNDA QUEST�O
				System.out
				.println("===========================================================================================");
		System.out.println(" QUEST�O 3 -\"Considere o programa Java a seguir:\\r\\n\"");
		System.out.println("==========================================================================================="						
						// C�DIGO PARA ANALISAR E RESPONDER A QUEST�O
						+ "  \n public class Classe {\r\n"
						+ "       public static void main(String[] args) {\r\n"
						+ "        String string = 'xyzk';\r\n"
						+ "        System.out.println(string);\r\n"
						+ "      }\r\n"
						+ "     }\r\n"
						+ "\nEsse programa n�o pode ser compilado, pois :");

				// LA�O DO / WHILE
				do {
					System.out.println("===========================================================================================");
					// ALTERNATIVAS DA TERCEIRA QUEST�O
					Collections.shuffle(questao3);
					System.out.println();
					System.out.println(alt[0] + questao3.get(0));
					System.out.println(alt[1] + questao3.get(1));
					System.out.println(alt[2] + questao3.get(2));
					System.out.println(alt[3] + questao3.get(3));
					System.out.println(alt[4] + questao3.get(4));
					// ENTRADA DO USU�RIO PARA RESPOSTA
					System.out.println("\nDigite sua resposta: ");
					String resposta = entrada.next();
					int index = 0, erro = 3;
					// ESTRUTURA DE DECIS�O SWITCH
					switch (resposta.toUpperCase()) {
					// RESPOSTAS
					case "A":
						index = 0;
						if (questao3.get(index)
								.equals(" Cadeias de caracteres devem ser delimitadas por aspas duplas.")) {
							System.out.println("\nResposta correta, parab�ns.");
							System.out.println("Voc� ganhou 2 pontos.\n");
							// pontos1 = pontos1 + 2;
							sair3 = true;
						} else
							System.out.println("\nResposta incorreta, tente novamente.\n");
						cont1++;
						break;
					case "B":
						index = 1;
						if (questao3.get(index)
								.equals(" Cadeias de caracteres devem ser delimitadas por aspas duplas.")) {
							System.out.println("\nResposta correta, parab�ns.");
							System.out.println("Voc� ganhou 2 pontos.\n");
							// pontos1 = pontos1 + 2;
							sair3 = true;
						} else
							System.out.println("\nResposta incorreta, tente novamente.\n");
						cont1++;
						break;
					case "C":
						index = 2;
						if (questao3.get(index).equals(" Cadeias de caracteres devem ser delimitadas por aspas duplas.")) {
							System.out.println("\nResposta correta, parab�ns.");
							System.out.println("Voc� ganhou 2 pontos.\n");
							// pontos1 = pontos1 + 2;
							sair3 = true;
						} else
							System.out.println("\nResposta incorreta, tente novamente.\n");
						cont1++;
						break;
					case "D":
						index = 3;
						if (questao3.get(index)
								.equals(" Cadeias de caracteres devem ser delimitadas por aspas duplas.")) {
							System.out.println("\nResposta correta, parab�ns.");
							System.out.println("Voc� ganhou 2 pontos.\n");
							// pontos1 = pontos1 + 2;
							sair3 = true;
						} else
							System.out.println("\nResposta incorreta, tente novamente.\n");
						cont1++;
						break;
					case "E":
						index = 4;
						if (questao3.get(index)
								.equals(" Cadeias de caracteres devem ser delimitadas por aspas duplas.")) {
							System.out.println("\nResposta correta, parab�ns.");
							System.out.println("Voc� ganhou 2 pontos.\n");
							// pontos1 = pontos1 + 2;
							sair3 = true;
						} else
							System.out.println("\nResposta incorreta, tente novamente.\n");
						cont1++;
						break;
					default:
						System.out.println("\nOp��o inv�lida, digite entre A, B, C D ou E"); // OP��O INV�LIDA
					}

					if (cont1 == erro) {
						System.out.println("Voc� execedeu o m�ximo de tentativas, foram " + cont1 + " tentativas.");
						System.out.println(
								"Voc� perdeu 2 pontos. Vamos te passar para a pr�xima quest�o e l� voc� poder� se recuperar no jogo.\n");
						// pontos1 = pontos1 - 2;
						sair3 = true;
					}
				} while (!sair3);

			}
	
	public static void sair() {
		System.out.println("\nVoc� quer mesmo sair?");
		System.out.println("[SIM]	digite \"1\".\n" + "\n[N�O]	digite \"2\"." + "\nResposta: ");

	}

	public static void parabenizacaoLinkRanked() throws InterruptedException {
		System.out.println("   ___                    _                           _   _   _                                  \r\n"
				+ "  / _ \\ __ _  _ __  __ _ | |__    ___  _ __   ___    / \\ / \\ / \\                                 \r\n"
				+ " / /_)// _` || '__|/ _` || '_ \\  / _ \\| '_ \\ / __|  /  //  //  /                                 \r\n"
				+ "/ ___/| (_| || |  | (_| || |_) ||  __/| | | |\\__ \\ /\\_//\\_//\\_/                                  \r\n"
				+ "\\/     \\__,_||_|   \\__,_||_.__/  \\___||_| |_||___/ \\/  \\/  \\/                                    \r\n"
				+ "                                     _    _                _                                     \r\n"
				+ " /\\   /\\ ___    ___  ___       __ _ | |_ (_) _ __    __ _ (_) _   _                              \r\n"
				+ " \\ \\ / // _ \\  / __|/ _ \\     / _` || __|| || '_ \\  / _` || || | | |                             \r\n"
				+ "  \\ V /| (_) || (__|  __/    | (_| || |_ | || | | || (_| || || |_| |                             \r\n"
				+ "   \\_/  \\___/  \\___|\\___|     \\__,_| \\__||_||_| |_| \\__, ||_| \\__,_|                             \r\n"
				+ "                             _                  _   |___/                         _              \r\n"
				+ "  __ _      _ __ ___    ___ | |_  __ _       __| |  ___      _ __    ___   _ __  | |_  ___   ___ \r\n"
				+ " / _` |    | '_ ` _ \\  / _ \\| __|/ _` |     / _` | / _ \\    | '_ \\  / _ \\ | '_ \\ | __|/ _ \\ / __|\r\n"
				+ "| (_| |    | | | | | ||  __/| |_| (_| |    | (_| ||  __/    | |_) || (_) || | | || |_| (_) |\\__ \\\r\n"
				+ " \\__,_|    |_| |_| |_| \\___| \\__|\\__,_|     \\__,_| \\___|    | .__/  \\___/ |_| |_| \\__|\\___/ |___/\r\n"
				+ "                                                            |_|                                  "
				+ "\n");
		tempo();
		System.out.println("\nAgora para concluir, acesse o link da nossa Ranked: \n"
				+ "https://docs.google.com/forms/d/e/1FAIpQLSe7zFesTvPsBO8pwjj3bvx0hlGBDWTxCVwRlhJJR9kKA-xlxw/viewform?usp=sf_link"
				+ "\nCopie o link acima e cole na aba do seu navegador, digite seu nome, a sua pontua��o e aguarde ser divulgado.\n");
		tempo();
		System.out.println("\n\t\tF I M");
	}

	public static void gameOver() throws InterruptedException {
		System.out.println(" _______   _______   __   __   _______      _______   __   __   _______   ______   \r\n"
				+ "|       | |   _   | |  |_|  | |       |    |       | |  | |  | |       | |    _ |  \r\n"
				+ "|    ___| |  |_|  | |       | |    ___|    |   _   | |  |_|  | |    ___| |   | ||  \r\n"
				+ "|   | __  |       | |       | |   |___     |  | |  | |       | |   |___  |   |_||_ \r\n"
				+ "|   ||  | |       | |       | |    ___|    |  |_|  | |       | |    ___| |    __  |\r\n"
				+ "|   |_| | |   _   | | ||_|| | |   |___     |       |  |     |  |   |___  |   |  | |\r\n"
				+ "|_______| |__| |__| |_|   |_| |_______|    |_______|   |___|   |_______| |___|  |_|"
				+ "\n");
		tempo();
		System.out.println("\nIIIIIIIIIIIIIIIIIHHHH DEU RUIM HEIN?! M�S CONTINUA TENTANDO, UMA HORA VAI, CONFIA!  :') ");
		System.out.println("\n\t\tF I M");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		bemVindos();
		
		menu();
		
	}
}