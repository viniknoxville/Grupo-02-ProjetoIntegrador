import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Algoritimotrix {
	
	// VARI�VEIS GLOBAIS
	static Scanner entrada = new Scanner(System.in);
	static boolean sair = false; // SA�DA LA�OS
	static int somaPontosJogo = 0; // SOMAR PONTUA��O DOS JOGADORES
	static int pontosPorQuestao = 10; // CADA QUEST�O COME�A COM 10 PONTUA��O
	static int timer = 0; // TIMER DELAY NOS TEXTOS
	static int erroQuestoes = 3; // QUANTIDADE M�XIMA DE ERRO DAS QUEST�ES
	static String nome = ""; // NOME DO USU�RIO
	static int pontosFinais = 55; // M�NIMO DEPONTUA��O

	// M�TODOS E FUN��ES
	public static String nomeUsuario() {

		nome = entrada.nextLine();

		return nome;
	}

	static void sysout(String texto, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
		for (char caractere : texto.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempo_mensagem);
		}
	}

	public static void menu() throws InterruptedException { // MENU

		Scanner entrada = new Scanner(System.in);
		String sair, sim = "1", nao = "2";
		boolean saida = false;
		String[] opcaoMenu = { "1 - Jogar		", "2 - Instru��es		", "3 - Cr�dito		", "4 - Sair		" };
		do {
			System.out.println("\n\t\t________________________________________________");
			System.out.println("\t\t|						|");
			System.out.println("\t\t|		     M E N U  			|");
			System.out.println("\t\t|						|");

			for (int i = 0; i < 4; i++) {
				System.out.println("\t\t|		" + opcaoMenu[i] + "	|");
			}
			System.out.println("\t\t|_______________________________________________|");

			System.out.printf("\n\t\tInforme a op��o: ");
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
			System.out.println("\nVoc� selecionou a op��o - Sair");
			System.out.println("\nquer mesmo sair?");
			System.out.println("[1] SIM	[2]	N�O");
			System.out.println("\nResposta: ");
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

	public static void historia() throws InterruptedException {
		
		sysout("\n Digital World � um planeta totalmente digital e conectado que fica localizado na gal�xia A23,", TimeUnit.MILLISECONDS, timer);
		sysout("\nsomos um povo multicultural, falamos diversas linguagens de programa��o e estamos em constante ", TimeUnit.MILLISECONDS, timer);
		sysout("\ndesenvolvimento. Nosso planeta participou das guerras gal�cticas e conseguimos frear o avan�o do", TimeUnit.MILLISECONDS, timer);
		sysout("\nimp�rio dark, que tinha como miss�o acabar com o avan�o tecnol�gico e impor domina��o sobre", TimeUnit.MILLISECONDS, timer);
		sysout("\nmundos, gal�xias e povos!", TimeUnit.MILLISECONDS, timer);
		sysout("\n A grande CPU � respons�vel por guardar o HD supremo que � encarregado de armazenar todos ", TimeUnit.MILLISECONDS, timer);
		sysout("\nos dados e informa��es do nosso planeta desde muito antes dos antigos povos de Gaia a fim", TimeUnit.MILLISECONDS, timer);
		sysout("\nde garantir o backup para que possamos passar por atualiza��es e manuten��es com seguran�a.", TimeUnit.MILLISECONDS, timer);
		sysout("\n Sem o HD Supremo fica invi�vel manter o planeta atualizado e a vida em Digital World acaba!", TimeUnit.MILLISECONDS, timer);
		
	
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
		System.out.print("\n|			Ki:Theory - Enjoy The Silence: https://youtu.be/l3cEWRdCI8w		               |");
		tempo();
		System.out.print("\n|			twenty one pilots - Stressed Out: https://youtu.be/pXRviuL6vMY            |");
		tempo();
		System.out.print("\n|			Radiohead - Nude: https://youtu.be/BbWBRnDK_AE		                         |");
		tempo();
		System.out.print("\n|			Moby - Porcelain: https://youtu.be/13EifDb4GYs							   |");
		tempo();
		System.out.print("\n|			LSD - Genius ft. Sia, Diplo, Labrinth: https://youtu.be/HhoATZ1Imtw		   |");
		tempo();
		System.out.print("\n|			Julian Casablancas - 11th Dimension: https://youtu.be/pl15PlIXHIk		   |");
		tempo();
		System.out.print("\n|			Daft Punk - One More Time: https://youtu.be/FGBhQbmPwH8					   |");
		tempo();
		System.out.print("\n|			The Weeknd & Ariana Grande - Save Your Tears (Remix): https://youtu.be/LIIDh-qI9oI						   |");
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

	public static void instrucoes() throws InterruptedException { // INSTRU��ES
		tempo();

		System.out.println("\n				*MANUAL DE INSTRU��ES*\n");
		sysout("\nO usu�rio ao iniciar o ALGORITMOTRIX ir� para o menu e ter� 4 op��es: \"1 - Jogar\", \"2 - Instru��es\", \"3 - Cr�ditos\"",
				TimeUnit.MILLISECONDS, timer);
		sysout("\ne \"4 - Sair\". Ao selecionar a op��o [1] o usu�rio ter� que digitar seu nome para o",
				TimeUnit.MILLISECONDS, timer);
		sysout("inicio dos desafios... ", TimeUnit.MILLISECONDS, timer);
		sysout("\nNa op��o [2] o usu�rio ser� direcionado para o manual de instru��es (onde estamos agora no caso)...",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nA op��o [3] ir� direcionar o usu�rio para os cr�ditos do jogo... E por fim, a op��o [4] ser� para o",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nusu�rio sair do jogo.", TimeUnit.MILLISECONDS, timer);
		sysout("\nO jogo ter� uma hist�ria, uma estrutura de 10 quest�es relacionadas com a disciplina de Algoritmos,",
				TimeUnit.MILLISECONDS, timer);
		sysout("\npontos para acumular e ranked de jogadores.\n", TimeUnit.MILLISECONDS, timer);

		System.out.print("\n				*QUEST�ES*\n");
		sysout("\nDever�o ser respondidas de acordo com as alternativas - A), B), C), D) ou E), portanto o usu�rio s� ir�",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nselecionar a letra da alternativa desejada como resposta.\n", TimeUnit.MILLISECONDS, timer);

		System.out.print("\n				*PONTUA��O*\n");
		sysout("\nDada uma quest�o, o usu�rio ter� 3 chances para tentar acertar, se o usu�rio acertar a quest�o, passa a",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nganhar pontos de experi�ncia, caso erre a quest�o perder� 3 pontos de experi�ncia a cada vez que errar.",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nSe no final o usu�rio conseguir uma pontua��o boa, ele finaliza e ganha o jogo. Se n�o...",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nfinaliza e perde, ou seja, \"G A M E   O V E R\"\n", TimeUnit.MILLISECONDS, timer);

		System.out.print("\n				*RANKED*\n");
		sysout("\nO m�nimo exigido de pontos de experi�ncia para entrar no ranked � de 55 pontos, se o usu�rio antigir ou",
				TimeUnit.MILLISECONDS, timer);
		sysout("\npassar, ser� disponibilizado um link do nosso Ranked, para que o usu�rio possa copiar e colar na aba",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nde seu navegador, os pr�ximos passos ser�o digitar o nome e a pontua��o feita. Por ultimo...",
				TimeUnit.MILLISECONDS, timer);
		sysout("\naguardar a divulga��o das pontua��es.\n", TimeUnit.MILLISECONDS, timer);
	}

	public static void tempo() throws InterruptedException { // DELAY LINHAS
		Thread.sleep(1000);
	}

	public static void bemVindos() throws InterruptedException { // BEM VINDO
		System.out.print(
				"           _      _____  ____  _____  _____ _______ __  __  ____ _______ _____  _______   __\r\n"
						+ "     /\\   | |    / ____|/ __ \\|  __ \\|_   _|__   __|  \\/  |/ __ \\__   __|  __ \\|_   _\\ \\ / /\r\n"
						+ "    /  \\  | |   | |  __| |  | | |__) | | |    | |  | \\  / | |  | | | |  | |__) | | |  \\ V / \r\n"
						+ "   / /\\ \\ | |   | | |_ | |  | |  _  /  | |    | |  | |\\/| | |  | | | |  |  _  /  | |   > <  \r\n"
						+ "  / ____ \\| |___| |__| | |__| | | \\ \\ _| |_   | |  | |  | | |__| | | |  | | \\ \\ _| |_ / . \\ \r\n"
						+ " /_/    \\_\\______\\_____|\\____/|_|  \\_\\_____|  |_|  |_|  |_|\\____/  |_|  |_|  \\_\\_____/_/ \\_\\\r\n"
						+ "                                                                                            \r\n"
						+ "                                                                                            ");
		
	}

	public static void vilao() throws InterruptedException { // VIL�O
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
				+ "               /::||\r\n" + "              /:::/\r\n" + "             //;;'\r\n"
				+ "             `-'\r\n" + "\n");
		tempo();
		System.out.println("\nEste � HAL9000 DO PLANETA MIRACULOUS, o vil�o mais maldoso da GAL�XIA e quer destruir"
				+ "\ntodos os planetas de toda a Gal�xia, � ele quem devemos deter e isso n�o ser� uma tarefa f�cil!\n");
	}

	public static void escolhaCapitulo1() { // ESCOLHA DO CAPITULO

		String escolha;
		sair = false;
		do {
			System.out.print("\nEscolha seu n�mero da sorte: ");
			escolha = entrada.next();
			switch (escolha) {
			case "1":
				System.out.println("\nVoc� selecionou a op��o 1");
				System.out.println("Acaba de ganhar 5 pontos de experi�ncia, siga para o Septo Sagrado!\n");
				sair = true;
				somaPontosJogo = somaPontosJogo + 5;
				break;
			case "2":
				System.out.println("\nVoc� selecionou a op��o 2");
				System.out.println("Aqui est� o link de uma m�sica caso queira ouvir: < twenty one pilots: Stressed Out - https://youtu.be/pXRviuL6vMY >");
				System.out.println("Siga para o Septo Sagrado!\n");
				sair = true;
				break;
			case "3":
				System.out.println("\nVoc� selecionou a op��o 3");
				System.out.println("Acaba de perder 3 pontos de experi�ncia. siga para o Septo Sagrado!\n");
				somaPontosJogo = somaPontosJogo - 3;
				sair = true;
				break;
			case "4":
				System.out.println("\nVoc� selecionou a op��o 4");
				System.out.println("Acaba de ganhar 10 pontos de experi�ncia, siga para o Septo Sagrado!\n");
				somaPontosJogo = somaPontosJogo + 10;
				sair = true;
				break;
			case "5":
				System.out.println("\nVoc� selecionou a op��o 5");
				System.out.println("Aqui est� o link de uma m�sica caso queira ouvir: < Ki:Theory - Enjoy The Silence - https://youtu.be/l3cEWRdCI8w >");
				System.out.println("Siga para o Septo Sagrado!\n");
				sair = true;
				break;
			default:
				System.out.println("\nOp��o inv�lida, digite novamente\n");

			}

		} while (!sair);
	}

	public static void capitulo1 () throws InterruptedException { // CAPITULO 1
 		
 				System.out.println("- Capitulo 01 - Encontre o Or�culo\n");
 				
 				System.out.println("      _    .  ,   .           .\r\n"
 						+ "    *  / \\_ *  / \\_      _  *        *   /\\'__        *\r\n"
 						+ "      /    \\  /    \\,   ((        .    _/  /  \\  *'.\r\n"
 						+ " .   /\\/\\  /\\/ :' __ \\_  `          _^/  ^/    `--.\r\n"
 						+ "    /    \\/  \\  _/  \\-'\\      *    /.' ^_   \\_   .'\\  *\r\n"
 						+ "  /\\  .-   `. \\/     \\ /==~=-=~=-=-;.  _/ \\ -. `_/   \\\r\n"
 						+ " /  `-.__ ^   / .-'.--\\ =-=~_=-=~=^/  _ `--./ .-'  `-\r\n"
 						+ "/___     `.  / /       `.~-^=-=~=^=.-'      '-._ `._\n");
 				
 				System.out.println("\n*Alpha aparece*\n"); 
 				
 				System.out.println("Alpha2: N�o temos muito tempo, a pr�xima atualiza��o do planeta se aproxima e sem o HD Supremo n�o temos como fazer o backup");
 				System.out.println("Alpha2: Sem a atualiza��o nosso planeta se tornara obsoleto, nossos sistemas de seguran�a entraram em colapso e a vida em Digital World chegar� ao fim!!!");
 				System.out.println("Alpha2: Encontre o Or�culo no septo sagrado e veja atrav�s do c�lice celestial a localiza��o do cl� darkweb!");
 				System.out.println("Alpha2: Siga pela Floresta dos Spams e tente a sorte ou v� pelo Desfiladeiro Codificado...\n");
 				
 				// ESCOLHA ENTRE FLORESTA DOS SPAMS OU DESFILADEIRO CODIFICADO
 				boolean sair = false;
 				do {
 				System.out.println("[1] Floresta dos spams | [2] Desfiladeiro codificado: ");
 				String escolha = entrada.next();
 				switch(escolha) {
 				case "1": // FLORESTA DOS SPAMS
 					System.out.println("Alhpa2: Olha s�, parece que hoje � seu dia de sorte! Cuidado com os Spams!");
 					System.out.println("Alhpa2: Digite um n�mero de 1 a 5 e descubra sua sorte! ");
 					escolhaCapitulo1();
 					sair = true;
 				break;
 				case "2": // DESFILADEIRO CODIFICADO
 					System.out.println("Alpha2: No jogo da sorte a sobreviv�ncia � uma roleta russa, bem-vindo ao Desfiladeiro Codificado!");
 					System.out.println("Alpha2: A resposta correta levar� voc� direto ao Septo Sagrado, voc� tem tr�s tentativas para desbloquear a passagem.");
 					// CHAMA QUEST�O
 					questao5();
 					sair = true;
 				break;
 				default:
 					System.out.println("\nOp��o inv�lida, tente novamente.\n");
 				}
 				
 				} while (!sair);
 				
 				System.out.println("\n" + nome + ", voc� passou pelo primeiro desafio...");
 			    System.out.println("\nReconectando...\n\n");
 				
 				System.out.println("Alpha2: Chegamos ao Septo Sagrado, n�o poderia esperar menos de voc�!");
 				System.out.println("Alpha2: Encontre o Or�culo e veja atrav�s do C�lice Celestial...");
 				
 				System.out.println("\n*Procurando o Or�culo...*\n");
 						
 				System.out.println("Or�culo: Ora, ora... Temos um visitante, o que te tr�z ao Septo Sagrado?");
 				System.out.println("Or�culo: Espere...");
 				System.out.println("Or�culo: Eu tenho a resposta para o que voc� procura, mas antes preciso testar seus conhecimentos!");
 				
 				// CHAMA QUEST�O
 				questao2();
 				
 				System.out.println("\nOr�culo: Resta uma pergunta, responda para encontrar o seu caminho...\n");
 				
 				// CHAMA QUEST�O
 				questao9();
 				
 				System.out.println("Or�culo: Ok, vamos proseguir...");
 				System.out.println("Or�culo: Siga para masmorra dos Orcs e encontrar� o que procura!!!\n\n");
 	}

	public static void capitulo2() throws InterruptedException { // CAPITULO 2

		System.out.println("- Capitulo 02- Masmorra dos Orcs 02\n");
		
		System.out.println("\n .       ..       .\r\n"
				+ "    |\\      ||      /|\r\n"
				+ "    | \\     ||     / |\r\n"
				+ "    |  \\    ||    /  |\r\n"
				+ "    |  :\\___JL___/   |\r\n"
				+ "    |  :|##XLJ: :|   |\r\n"
				+ "    '\\ :|###||: X|  /'\r\n"
				+ "      \\:|###||:X#| /\r\n"
				+ "       |==========|\r\n"
				+ "        |###XXX;;|\r\n"
				+ "        |##XX:: :|\r\n"
				+ "        |##Xn:: :|\r\n"
				+ "        |##XU:: :|\r\n"
				+ "        |##XX:: :|\r\n"
				+ "        |##XX:: :|\r\n"
				+ "        |##XX:: :|\r\n"
				+ "        |##XX:: n|\r\n"
				+ "        |##XX:: U|\r\n"
				+ "        |##XX:: :|\r\n"
				+ "        |##XX:: n|\r\n"
				+ "        |##XX:: U|\r\n"
				+ "        |##XX:: :|\r\n"
				+ "        |##XX:: :|\r\n"
				+ "        |##XX:: :|\r\n"
				+ "        |##,_,: :|\r\n"
				+ "        |./ T \\.:|\r\n"
				+ "        || o|o |:|\r\n"
				+ "        ||  |  |:|\r\n"
				+ "      .============.\r\n"
				+ "     .==============.\r\n"
				+ "    .================.\n");

		System.out.println(
				"Alpha2: Pelo visto deu tudo certo com o Or�culo n�? Enfim, a masmorra dos Orcs te espera, siga pelo caminho das pedras...");
		System.out.println(
				"Alpha2: Os Orcs s�o seres inofensivos apesar da apar�ncia, eles habitam Digital World muito antes dos primeiros homens...");
		System.out.println(
				"Alpha2: Conquiste a confian�a de um Orc e ter� um grande aliado na batalha contra o cl� darkweb ");

		System.out.println("\n*Algumas horas de caminhada...*\n");

		System.out.println(
				"Alpha2: A jornada foi longa, mas aqui estamos, encontre o L�der dos Orcs o mais r�pido poss�vel!");
		System.out.println("\n*Orc avistado*\n");
		System.out.println("Orc Vigilante: Qual o motivo da sua visita?");
		System.out.println(nome
				+ ": Preciso da ajuda do l�der dos Orcs, o cl� darkweb roubou o hd supremo e estou em uma miss�o de resgate");
		System.out.println("Orc Vigilante: Para entrar na masmorra, preciso testar suas habilidades! \n");

		// CHAMA QUEST�O
		questao3();

		System.out.println(
				"Orc Vigilante: Opa, o grande l�der te espera, siga at� a sala do trono e aguarde instru��es\n");
		
		System.out.println("Lider dos Orcs: Qual o motivo da sua visita?");
		System.out.println(nome + ": Preciso de ajuda para enfrentar o cl� darkweb");
		System.out.println("Lider dos Orcs: E por qual motivo eu ajudaria?");
		System.out.println(nome + ": O grande Or�culo me enviou at� aqui...");
		System.out.println(
				"Lider dos Orcs: O grande Or�culo? Aquele que tudo v� e tudo sabe? Vejamos, antes de enviar um Orc nessa jornada, me responda...");

		// CHAMA QUEST�O
		questao7();
		// Siga as instru��es do Orc e encontre seu caminho

		System.out.println(
				"Lider dos Orcs: Hey! " + nome + ", leve Akin! Um dos Orcs da minha guarda pessoal, ele lhe ser� bastante �til!");
		System.out.println("Lider dos Orcs: Siga pela trilha de Kharkiv e l� encontrar� o cl� darkweb...\n\n");

	}

	public static void capitulo3() throws InterruptedException { // CAPITULO 3

		System.out.println("- Cap�tulo 03 - Caminho de Kharkiv\n");
		System.out.println("\n*Alpha aparece*\n");
		System.out.println(
				"Alpha2: A grande atualiza��o se aproxima e junto com ela o destino de Digital World! Siga pela trilha de Kharkiv, Akin ser� bastante �til!");
		System.out.println(
				"Alpha2: Na metade da trilha, encontre a  Bruxa da Floresta e ela ir� te guiar at� o cl� darkweb");

		System.out.println("\n*Algumas horas de caminhada...*\n");
		
		System.out.println("Bruxa da Floresta: Ora, ora� O que temos por aqui? est�o perdidos?");
		System.out.println(nome + ": Estamos procurando o cl� darkweb�");
		System.out.println(
				"Bruxa da Floresta: Vejamos, existem dois caminhos poss�veis, um levar� ao penhasco do grito e outro ao acampamento do cl� darkweb.");
		System.out.println("Responda duas perguntas se acertar irei lhe mostrar o caminho que tanto procura�");

		// CHAMA QUEST�O
		questao4();

		System.out.println("Bruxa da Floresta: Parece que temos um sabe tudo aqui, vamos para a �ltima pergunta�");

		// CHAMA QUEST�O
		questao8();

		// *errar a pergunta ele vai para o penhasco do grito e volta pro inicio do jogo
		// ** acertar a pergunta ela pega a informa��o que queria e segue para o
		// acampamento do cl� dark web

		System.out.println("Bruxa da Floresta: Siga pela esquerda, o acampamento do cl� darkweb n�o est� muito longe�");
		
		System.out.println("\n*Alpha aparece*\n");
		System.out.println("Alpha2: Ufa, at� que enfim chegamos at� aqui, estamos quase l�");
		System.out.println(
				"Alpha2: Assim que chegarem ao acampamento se dirijam ao guarda da portaria, digam que querem se juntar ao cl� e ele colocar� voc�s para dentro");
		System.out.println("\n*Chegando ao acampamento*\n\n");
		System.out.println("Guarda da Portaria: O que fazem aqui? Perderam alguma coisa?");
		System.out.println(nome + ": Viemos nos juntar ao cl� darkweb�");
		System.out.println(
				"Guarda da Portaria: Preciso testar suas habilidades, se provarem sua capacidade eu deixo voc�s passarem e se juntarem ao cl� darkweb�");

		// CHAMA QUEST�O
		questao6();

		System.out.println("Guarda da Portaria: Sejam bem vindos ao cl� darkweb�");

		System.out.println("\n*Alpha aparece*\n");
		System.out.println(
				"Alpha2: Agora que estamos aqui dentro, voc�s precisam se separar, Akin dever� seguir para o alojamento e trancar as portas...");
		System.out.println(
				"Alpha2: Voc� " + nome + ", dever� seguir para sala das conquistas e enfrentar o l�der do cl� darkweb�");
		System.out.println(
				"Alpha2: A �nica forma de vencer e recuperar o HD Supremo � derrotando o lider do cl� darkweb!");
		System.out.println("Alpha2: Boa sorte em sua �ltima miss�o haha !!!");

	}

	public static void capitulo4() throws InterruptedException { // CAPITULO 4

		System.out.println("- Cap�tulo 04 - Ultimato\n");

		System.out.println("Entrando na sala das conquistas um segredo � revelado...");

		System.out.println(nome + ": Alpha2, eu n�o consigo entender! A sala est� vazia!!! Onde est� o Lider do Cl�?");
		System.out.println("Alpha2: Voc� ainda n�o percebeu? hahaha");
		System.out.println(
				"Alpha2: Ap�s o final das guerras gal�cticas, foi decidido que a mem�ria do lider do cl� darkweb seria armazenada em Digital World no Grande HD Supremo...");
		System.out.println(
				"Alpha2: Houve um corte abrupto de energia causado por uma tempestade solar ocasionando um curto no HD Supremo");
		System.out.println("Alpha2:" + nome + "eu sou o lider do cl� darkweb, eu me chamo HAL9000!!!");
		System.out.println("\n*Alpha2 transforma-se em HAL9000*\n");
		System.out.println("HAL9000: Eu me aproveitei do curto circuito no HD Supremo e infectei a mem�ria do Alpha2");
		System.out.println(
				"HAL9000: Eu n�o te trouxe aqui para salvar Digital World, eu te trouxe aqui para destruir Digital World e tranferir minha mem�ria para seu corpo org�nico!");
		System.out.println(nome + ": Eu n�o vou deixar isso aconceter! Vamos barganhar?");
		System.out.println(nome
				+ ": Dois desafios, se eu acertar eu ganho e voc� restaura a memoria do Alpha2! se eu errar fim de linha! Voc� ganha e tera tudo!");
		System.out.println("HAL9000: Ent�o � isso? Que os jogos comecem!!!");

		// CHAMA QUEST�O
		questao1();

		System.out.println("HAL9000: Ultima pergunta...");

		// CHAMA QUEST�O
		questao10();
		// derrotou o HAL9000

		System.out.println("HAL9000: N�ooooooooooooooo...");
		System.out.println(nome + ": Game Over para voc� HAL9000!");

		System.out.println(
				"Alpha2: Obrigadx " + nome + " voc� conseguiu derrotar o HAL9000 e consequentemente o cl� darkweb!");
		System.out.println(
				"Alpha2: Agora que minha mem�ria foi reestabelecida e o HD Supremo est� em seguran�a, podemos proseguir com a atualiza��o de Digital World...");

		System.out.println(
				"Digital World foi atualizado, HAL9000 foi aprisionado em um pendriver, uma tecnologia absoleta e descartado em Delta-X9 um planeta isolado...");
		System.out
				.println("O cl� darkweb foi dissolvido e alguns membros fugiram para planetas e galaxias distantes...");
		System.out.println("Mas enquanto a amea�a existir, estaremos de olhos bem abertos!");
		System.out.println(". . .");
		tempo();
		System.out.println("\n .           ..         .           .       .           .           .\r\n"
				+ "      .         .            .          .       .\r\n"
				+ "            .         ..xxxxxxxxxx....               .       .             .\r\n"
				+ "    .             MWMWMWWMWMWMWMWMWMWMWMWMW                       .\r\n"
				+ "              IIIIMWMWMWMWMWMWMWMWMWMWMWMWMWMttii:        .           .\r\n"
				+ " .      IIYVVXMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWxx...         .           .\r\n"
				+ "     IWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMx..\r\n"
				+ "   IIWMWMWMWMWMWMWMWMWBY%ZACH%AND%OWENMWMWMWMWMWMWMWMWMWMWMWMWMx..        .\r\n"
				+ "    \"\"MWMWMWMWMWM\"\"\"\"\"\"\"\".  .:..   .\"\"\"\"\"MWMWMWMWMWMWMWMWMWMWMWMWMWti.\r\n"
				+ " .     \"\"   . `  .: . :. : .  . :.  .  . . .  \"\"\"\"MWMWMWMWMWMWMWMWMWMWMWMWMti=\r\n"
				+ "        . .   :` . :   .  .'.' '....xxxxx...,'. '   ' .\"\"\"YWMWMWMWMWMWMWMWMWMW+\r\n"
				+ "     ; . ` .  . : . .' :  . ..XXXXXXXXXXXXXXXXXXXXx.    `     . \"YWMWMWMWMWMWMW\r\n"
				+ ".    .  .  .    . .   .  ..XXXXXXXXWWWWWWWWWWWWWWWWXXXX.  .     .     \"\"\"\"\"\"\"\r\n"
				+ "        ' :  : . : .  ...XXXXXWWW\"   W88N88@888888WWWWWXX.   .   .       . .\r\n"
				+ "   . ' .    . :   ...XXXXXXWWW\"    M88N88GGGGGG888^8M \"WMBX.          .   ..  :\r\n"
				+ "         :     ..XXXXXXXXWWW\"     M88888WWRWWWMW8oo88M   WWMX.     .    :    .\r\n"
				+ "           \"XXXXXXXXXXXXWW\"       WN8888WWWWW  W8@@@8M    BMBRX.         .  : :\r\n"
				+ "  .       XXXXXXXX=MMWW\":  .      W8N888WWWWWWWW88888W      XRBRXX.  .       .\r\n"
				+ "     ....  \"\"XXXXXMM::::. .        W8@889WWWWWM8@8N8W      . . :RRXx.    .\r\n"
				+ "         ``...'''  MMM::.:.  .      W888N89999888@8W      . . ::::\"RXV    .  :\r\n"
				+ " .       ..'''''      MMMm::.  .      WW888N88888WW     .  . mmMMMMMRXx\r\n"
				+ "      ..' .            \"\"MMmm .  .       WWWWWWW   . :. :,miMM\"\"\"  : \"\"`    .\r\n"
				+ "   .                .       \"\"MMMMmm . .  .  .   ._,mMMMM\"\"\"  :  ' .  :\r\n"
				+ "               .                  \"\"MMMMMMMMMMMMM\"\"\" .  : . '   .        .\r\n"
				+ "          .              .     .    .                      .         .\r\n"
				+ ".                                         .          .         .\r\n"
				+ "\r\n"
				+ "\n ");
		tempo();
		System.out.println(". . .");
		System.out.println("Musica final >>> Moby - Porcelain: https://youtu.be/13EifDb4GYs");
		

	}

	public static void jogar() throws InterruptedException {
		tempo();
		System.out.println();
		System.out.print("\nInsira seu nome para se conectar ao mundo de Digital World:  ");
		nomeUsuario();
		tempo();
		System.out.println("\nL O A D I N G  . . .\n");
		tempo();
		System.out.println("~+\r\n"
				+ "\r\n"
				+ "                 *       +\r\n"
				+ "           '                  |\r\n"
				+ "       ()    .-.,=\"``\"=.    - o -\r\n"
				+ "             '=/_       \\     |\r\n"
				+ "          *   |  '=._    |\r\n"
				+ "               \\     `=./`,        '\r\n"
				+ "            .   '=.__.=' `='      *\r\n"
				+ "   +                         +\r\n"
				+ "        O      *        '       .\n\n");
		tempo();

		System.out.println(
				"Alpha2: Ol� " + nome + ", seja bem-vindo a Digital World!");
		System.out.println(
				"Alpha2: Eu sou uma intelig�ncia artificial e respons�vel por manter a ordem e o planeta atualizado e conectado!");
		System.out.println(
				"Alpha2: Nosso planeta est� em perigo, o cl� darkweb roubou o HD supremo da grande CPU e precisamos da sua ajuda para recupera-lo!!!");
		System.out.println(
				"Alpha2: Antes de iniciar nossa aventura, gostaria de conhecer a hist�ria do nosso planeta?");
		
		System.out.println("\n[1] - SIM, quero conhecer a hist�ria. | [2] - N�o, iniciar aventura.\n");
		boolean sair = false;
		do {
			System.out.println("Qual sua escolha?: ");
			String resposta = entrada.next();
			switch (resposta) {
			case "1":
				historia();
				System.out.print("\n\n");
				capitulo1();
				sair = true;
				break;
			case "2":
				capitulo1();
				sair = true;
				
				default:
					System.out.println("\nDigite uma op��o v�lida.\n");
			}
				
		} while (!sair);
		capitulo2();
		capitulo3();
		capitulo4();
		
		//SOMAR PONTOS
		somaPontosJogo = somaPontosJogo;
		if (somaPontosJogo >= pontosFinais) {
			finalizaWinner();
		} else if(somaPontosJogo <= pontosFinais) {
			finalizaLoser();
		}
		System.out.println(somaPontosJogo);
	}

	public static void questao1() { // MATEUS CARNEIRO *ATUALIZADA*
		String opcao;
		sair = false;
		int cont = 0;
		int pontosq1 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();
		alternativa.add(" Cada instru��o termina com um ponto e v�rgula");
		alternativa.add(
				" O m�todo main � o ponto de partida de cada aplicativo java e deve iniciar com public static void main(String[] args)");
		alternativa.add(" O java diferencia letras mai�sculas de min�sculas"); // CORRETA
		alternativa.add(" Palavras reservadas pelo java n�o podem ser usada para nomear vari�veis");
		alternativa.add(" A letra B e C est�o incorretas");

		System.out.println("\nConsiderando linguagem em java, assinale a op��o INCORRETA:\n");

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
		somaPontosJogo = somaPontosJogo + pontosq1;
	}

	public static void questao2() { // MATEUS CARNEIRO *ATUALIZADA*
		String opcao;
		sair = false;
		int cont = 0;
		int pontosq2 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();
		alternativa.add(" 10");
		alternativa.add(" 5");
		alternativa.add(" zero"); // CORRETA
		alternativa.add(" A + D");
		alternativa.add(" Nenhuma das anteriores");

		System.out
				.println("\nIndique a op��o que cont�m o valor final da vari�vel ap�s a execu��o do trecho de programa"
						+ "\nem Java. Considere os seguintes valores:\n");

		System.out.println("\nint A = 3, B = 2, C = 8, D = 7, X = 0;" + "\nif (!(A > 3) && !(B < 5)) {" + "\n	X = 10;"
				+ "\n} else if ((A >= 2) || (C <= 1)) {" + "\n	X = (A + D) / 2;" + "\n} else if (A == 2 || B < 7) {"
				+ "\n	X = (A + 2) * (B - 2);" + "\n	} else {\r\n" + "\n		X = ((A + C) / B * (C + D));"
				+ "}\n\n");

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

			if (alternativa.get(index).equals(" 5")) {
				System.out.println("Resposta Correta");
				pontosq2 += 10;
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq2 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("voc� errou " + cont + " vezes.");
					sair = true;
				}
			}

		} while (!sair);
		somaPontosJogo = somaPontosJogo + pontosq2;
	}

	public static void questao3() { // MARCOS C. *ATUALIZADA*

		String opcao;
		int cont = 0;
		sair = false;
		int pontosq3 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();

		alternativa.add(" Vari�veis n�o podem ser nomeadas com a palavra �string�.");
		alternativa.add(" O m�todo main n�o pode ser declarado como �static�.");
		alternativa.add(" Cadeias de caracteres devem ser delimitadas por aspas duplas.");
		alternativa.add(" N�o foi especificado um valor de retorno para o m�todo.");
		alternativa.add(" O m�todo main n�o pode ser declarado como �public�.");

		System.out.println("Considere o programa Java a seguir:\r\n" + "  \n public class Classe {\r\n"
				+ "       public static void main(String[] args) {\r\n" + "        String string = 'xyzk';\r\n"
				+ "        System.out.println(string);\r\n" + "      }\r\n" + "     }\r\n");

		System.out.println("\nEsse programa n�o pode ser compilado, pois :");

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

			if (alternativa.get(index).equals(" Cadeias de caracteres devem ser delimitadas por aspas duplas.")) {
				System.out.println("Resposta Correta");
				pontosq3 += 10;
				sair = false;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq3 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("voc� errou " + cont + " vezes.");
					sair = false;
				}
			}
		} while (sair);
		somaPontosJogo = somaPontosJogo + pontosq3;
	}

	public static void questao4() { // MARCOS C. *ATUALIZADA*
		String opcao;
		int cont = 0;
		sair = false;
		int pontosq4 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();

		alternativa.add("(A) 0 1 3");
		alternativa.add("(B) 0 1 3 4");
		alternativa.add("(C) 0 1 2 3 ");
		alternativa.add("(D) 0 1 2 3 4");
		alternativa.add("(E) Nenhuma das alternativas");

		System.out.println("Java � uma tecnologia de desenvolvimento, sendo simultaneamente, uma\n"
				+ "linguagem e uma plataforma. Nesse contexto, apresenta-se o c�digo a seguir.\r\n"
				+ "\npublic class teste {\r\n" + "\r\n" + "public static void main(String[] args) {\r\n" + "\r\n"
				+ "for (int i = 0; i <= 4; i++) {\r\n" + "if (i == 2);\r\n" + "System.out.println(i);\r\n" + "   }\r\n"
				+ "  }\r\n" + "}\r\n"

				+ "\nAp�s a execu��o, a sa�da gerada ser�:\r\n" + "");

		do {

			for (int i = 0; i < 5; i++) {
				switch (i) {
				case 0:
					System.out.println(alternativa.get(i));
					break;
				case 1:
					System.out.println(alternativa.get(i));
					break;
				case 2:
					System.out.println(alternativa.get(i));
					break;
				case 3:
					System.out.println(alternativa.get(i));
					break;
				case 4:
					System.out.println(alternativa.get(i));
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

			if (alternativa.get(index).equals("(D) 0 1 2 3 4")) {
				System.out.println("Resposta Correta");
				pontosq4 += 10;
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq4 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("voc� errou " + cont + " vezes.");
					sair = true;
				}
			}

		} while (!sair);
		somaPontosJogo = somaPontosJogo + pontosq4;
	}

	public static void questao5() { // DAIRA V. *ATUALIZADA*

		String opcao;
		sair = false;
		int cont = 0;
		int pontosq5 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();
		alternativa.add(" Uma sequ�ncia n�o l�gica e infinita");
		alternativa.add(" Uma sequ�ncia l�gica e finita");
		alternativa.add(" Uma sequ�ncia l�gica e infinita"); // CORRETA
		alternativa.add(" Uma sequ�ncia variavel");
		alternativa.add(" Nenhuma das alternativas est� correta");

		System.out.println("\nAssinale a alternativa correta");

		System.out.println("\nUm algoritmo �:\n");

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

			System.out.println("\nDigite sua resposta: ");
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

			if (alternativa.get(index).equals(" Uma sequ�ncia l�gica e infinita")) {
				System.out.println("Resposta Correta");
				pontosq5 += 10;
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq5 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("voc� errou " + cont + " vezes.");
					sair = true;
				}
			}

		} while (!sair);
		somaPontosJogo = somaPontosJogo + pontosq5;
	}

	public static void questao6() { // DAIARA V. PRECISA REFAZER!!!
		
		String opcao;
		sair = false;
		int cont = 0;
		int pontosq6 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();
		alternativa.add(" Uma sequ�ncia n�o l�gica e infinita");
		alternativa.add(" Uma sequ�ncia l�gica e finita");
		alternativa.add(" Uma sequ�ncia l�gica e infinita"); // CORRETA
		alternativa.add(" Uma sequ�ncia variavel");
		alternativa.add(" Nenhuma das alternativas est� correta");

		System.out.println("\nAssinale a alternativa correta");

		System.out.println("\nUm algoritmo �:\n");

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

			System.out.println("\nDigite sua resposta: ");
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

			if (alternativa.get(index).equals(" Uma sequ�ncia l�gica e infinita")) {
				System.out.println("Resposta Correta");
				pontosq6 += 10;
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq6 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("voc� errou " + cont + " vezes.");
					sair = true;
				}
			}

		} while (!sair);
		somaPontosJogo = somaPontosJogo + pontosq6;
	}

	public static void questao7() { // MARCOS RIBEIRO *ATUALIZADA*

		String opcao;
		sair = false;
		int cont = 0;
		int pontosq7 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();
		alternativa.add(" reografia");
		alternativa.add(" criptografia");
		alternativa.add(" linguagem de marca��o");
		alternativa.add(" engenharia estrudurada");
		alternativa.add(" pseudolinguagem"); // CORRETA


		System.out.println("\nRelacionado � programa��o de computadores, um algoritmo, seja qual for a sua"
				+ "\ncomplexidade e a linguagem de programa��o na qual ser� codificado, pode ser descrito por"
				+ "\nmeio da:\n");

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

			System.out.println("\nDigite sua resposta: ");
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

			if (alternativa.get(index).equals(" pseudolinguagem")) {
				System.out.println("Resposta Correta");
				pontosq7 += 10;
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq7 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("voc� errou " + cont + " vezes.");
					sair = true;
				}
			}

		} while (!sair);
		somaPontosJogo = somaPontosJogo + pontosq7;
	}

	public static void questao8() { // MARCOS RIBEIRO *ATUALIZADA*
		String opcao;
		sair = false;
		int cont = 0;
		int pontosq8 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();
		alternativa.add(" for, while, repeat");// CORRETA
		alternativa.add(" repeat, case, for");
		alternativa.add(" while, if, until");
		alternativa.add(" for, until, case");
		alternativa.add(" N.D.A.");

		System.out.println("\nAssinale a alternativa correta");

		System.out.println("\nS�o instru��es tipicamente encontradas em linguagens de programa��o para codificar "
				+ "estruturas de repeti��o:\n");

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

			System.out.println("\nDigite sua resposta: ");
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

			if (alternativa.get(index).equals(" for, while, repeat")) {
				System.out.println("Resposta Correta");
				pontosq8 += 10;
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq8 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("voc� errou " + cont + " vezes.");
					sair = true;
				}
			}

		} while (!sair);
		somaPontosJogo = somaPontosJogo + pontosq8;

	}

	public static void questao9() { // ELVIS W. *ATUALIZADA*

		String opcao;
		sair = false;
		int cont = 0;
		int pontosq9 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();
		alternativa.add(" Enquanto n for igual � 100, o la�o s� vai parar quando x for igual � 100.");
		alternativa.add(" O la�o vai se repitir, por�m quando x for igual � 88, ele vai parar."); // CORRETA
		alternativa.add(" Este la�o � um la�o Do/While e n�o um la�o For.");
		alternativa.add(" O la�o vai imprimir de 0 at� 100 e quando chegar em 88 vai repetir tudo denovo.");
		alternativa.add(" N.D.A.");

		System.out.println("Dado o c�digo abaixo, pedimos com aten��o que voc� observe, fa�a uma an�lise"
				+ "\ndo c�digo, e com base nos seus conhecimentos, responda qual alternativa est� correta:");

		System.out.println("\n	public static void main(String[] args) {\r\n" + "	\n	int n = 100;\r\n"
				+ "		\r\n" + "\n		for (int x = 0; x <= n; x++) {\r\n" + "			System.out.println(x);\r\n"
				+ "			if (x == 88) {\r\n" + "			break;\r\n" + "			}\r\n" + "		}\n");

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

			System.out.println("\nDigite sua resposta: ");
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

			if (alternativa.get(index)
					.equals(" O la�o vai se repitir, por�m quando x for igual � 88, ele vai parar.")) {
				System.out.println("Resposta Correta");
				pontosq9 += 10;
				sair = false;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq9 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("voc� errou " + cont + " vezes.");
					sair = false;
				}
			}

		} while (sair);
		somaPontosJogo = somaPontosJogo + pontosq9;
	}

	public static void questao10() { // ELVIS W. *ATUALIZADA*

		String opcao;
		sair = false;
		int cont = 0;
		int pontosq10 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();
		alternativa.add(" Enquanto N for menor que 10, a condi��o booleana ser� TRUE e vai sair do la�o repetitivo.");// CORRETA
		alternativa.add(" Quando N for maior que 10, a condi��o booleana ser� !TRUE e ele sa�ra do la�o repetitivo.");
		alternativa.add(" Esse c�digo n�o ir� funcionar, pois tem um erro.");
		alternativa.add(" N.D.A.");
		alternativa.add(
				" Quando N for maior ou igual a 10, a condi��o booleana ser� TRUE e ele sair� do la�o repetitivo.");

		System.out.println("\nAssinale a alternativa correta");

		System.out.println("\nDado o c�digo abaixo, pedimos com aten��o que voc� observe, fa�a uma an�lise"
				+ "\ndo c�digo, e com base nos seus conhecimentos, responda qual alternativa est� correta:\n");

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

			System.out.println("\nDigite sua resposta: ");
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

			if (alternativa.get(index).equals(
					" Quando N for maior ou igual a 10, a condi��o booleana ser� TRUE e ele sair� do la�o repetitivo.")) {
				System.out.println("Resposta Correta");
				pontosq10 += 10;
				
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq10 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("voc� errou " + cont + " vezes.");
					sair = true;
				}
			}

		} while (!sair);
		somaPontosJogo = somaPontosJogo + pontosq10;
	}

	public static void finalizaWinner() throws InterruptedException { // GANHOU
		System.out.println("\nParab�ns, voc� concluiu o jogo e atingiu a pontua��o necess�ria!!!");
		System.out.println("\nFicamos felizes por voc�...  ;) ");
		tempo();
		System.out.println("\nAgora para concluir, acesse o link da nossa Ranked: \n"
				+ "https://docs.google.com/forms/d/e/1FAIpQLSe7zFesTvPsBO8pwjj3bvx0hlGBDWTxCVwRlhJJR9kKA-xlxw/viewform?usp=sf_link"
				+ "\nCopie o link acima e cole na aba do seu navegador, digite seu nome, a sua pontua��o e aguarde ser divulgado.\n");
		tempo();
		System.out.println("\n\t\tF I M");
	}

	public static void finalizaLoser() throws InterruptedException { // PERDER
		System.out.println(" _______   _______   __   __   _______      _______   __   __   _______   ______   \r\n"
				+ "|       | |   _   | |  |_|  | |       |    |       | |  | |  | |       | |    _ |  \r\n"
				+ "|    ___| |  |_|  | |       | |    ___|    |   _   | |  |_|  | |    ___| |   | ||  \r\n"
				+ "|   | __  |       | |       | |   |___     |  | |  | |       | |   |___  |   |_||_ \r\n"
				+ "|   ||  | |       | |       | |    ___|    |  |_|  | |       | |    ___| |    __  |\r\n"
				+ "|   |_| | |   _   | | ||_|| | |   |___     |       |  |     |  |   |___  |   |  | |\r\n"
				+ "|_______| |__| |__| |_|   |_| |_______|    |_______|   |___|   |_______| |___|  |_|" + "\n");
		tempo();
		System.out
				.println("\nIIIIIIIIIIIIIIIIIHHHH DEU RUIM HEIN?! M�S CONTINUA TENTANDO, UMA HORA VAI, CONFIA!  :') ");
		System.out.println("\n\t\tF I M");
	}

	public static void main(String[] args) throws InterruptedException {

		bemVindos();

		menu();

	}
}