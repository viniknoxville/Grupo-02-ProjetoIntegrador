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
			System.out.println("\t\t\t\t	|\t3 - Hist�ria do jogo\t|");
			System.out.println("\t\t\t\t	|\t4 - Cr�ditos\t\t|");
			System.out.println("\t\t\t\t	|\t5 - Sair\t\t|");
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
				System.out.println("\nVoc� selecionou a op��o 3 - Hist�ria do Jogo\n");
				historia();
				break;

			case "4", "QUATRO":
				System.out.println("\nVoc� selecionou a op��o 4 - Cr�ditos\n");
				creditos();
				break;

			case "5", "CINCO":
				System.out.println("\nVoc� selecionou a op��o 5 - Sair");
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
				System.out.println("Op��o Inv�lida, escolha entre 1 e 5 para selecionar uma das op��es desejadas.");
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
		System.out.println(
				"\n\t------------------------------- BEM-VINDOS � DIGITAL WORLD -------------------------------\n");
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
		System.out.println("\n\t\t\t\t VOC� EST� REALMENTE PRONTO PARA ESTE DESAFIO?\n");
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
		
		System.out.println("\nOL� " + nome + ", SEJA BEM-VINDO � GAL�XIA A23!!!");

		questaoSaidaLaco();
		
		questao5();
		
		questaoFor();
		
		if (pontos >= 6) {
		parabenizacaoLinkRanked();
		} else {
			gameOver();
		}
	}

	public static void questaoSaidaLaco() throws InterruptedException {

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
	
	public static void questaoFor() {
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