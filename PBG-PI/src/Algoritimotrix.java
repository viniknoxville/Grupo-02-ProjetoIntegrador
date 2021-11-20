import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Algoritimotrix {
	
	// VARIÁVEIS GLOBAIS
	static Scanner entrada = new Scanner(System.in);
	static boolean sair = false; // SAÍDA LAÇOS
	static int somaPontosJogo = 0; // SOMAR PONTUAÇÃO DOS JOGADORES
	static int pontosPorQuestao = 10; // CADA QUESTÃO COMEÇA COM 10 PONTUAÇÃO
	static int timer = 0; // TIMER DELAY NOS TEXTOS
	static int erroQuestoes = 3; // QUANTIDADE MÁXIMA DE ERRO DAS QUESTÕES
	static String nome = ""; // NOME DO USUÁRIO
	static int pontosFinais = 55; // MÍNIMO DEPONTUAÇÃO

	// MÉTODOS E FUNÇÕES
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
		String[] opcaoMenu = { "1 - Jogar		", "2 - Instruções		", "3 - Crédito		", "4 - Sair		" };
		do {
			System.out.println("\n\t\t________________________________________________");
			System.out.println("\t\t|						|");
			System.out.println("\t\t|		     M E N U  			|");
			System.out.println("\t\t|						|");

			for (int i = 0; i < 4; i++) {
				System.out.println("\t\t|		" + opcaoMenu[i] + "	|");
			}
			System.out.println("\t\t|_______________________________________________|");

			System.out.printf("\n\t\tInforme a opção: ");
			String opcao = entrada.next();

			switch (opcao.toUpperCase()) {

			case "1", "UM":
				System.out.println("\nVocê selecionou a opção 1 - Jogar\n");
				jogar();
				saida = true;
				break;

			case "2", "DOIS":
				System.out.println("\nVocê selecionou a opção 2 - Instruções\n");
				instrucoes();
				break;

			case "3", "TRES", "TRÊS":
				System.out.println("\nVocê selecionou a opção 3 - Créditos\n");
				creditos();
				break;

			case "4", "QUATRO":
			System.out.println("\nVocê selecionou a opção - Sair");
			System.out.println("\nquer mesmo sair?");
			System.out.println("[1] SIM	[2]	NÃO");
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
				System.out.println("Opção Inválida, escolha entre 1 e 4 para selecionar uma das opções desejadas.");
			}

		} while (!saida);

	}

	public static void historia() throws InterruptedException {
		
		sysout("\n Digital World é um planeta totalmente digital e conectado que fica localizado na galáxia A23,", TimeUnit.MILLISECONDS, timer);
		sysout("\nsomos um povo multicultural, falamos diversas linguagens de programação e estamos em constante ", TimeUnit.MILLISECONDS, timer);
		sysout("\ndesenvolvimento. Nosso planeta participou das guerras galácticas e conseguimos frear o avanço do", TimeUnit.MILLISECONDS, timer);
		sysout("\nimpério dark, que tinha como missão acabar com o avanço tecnológico e impor dominação sobre", TimeUnit.MILLISECONDS, timer);
		sysout("\nmundos, galáxias e povos!", TimeUnit.MILLISECONDS, timer);
		sysout("\n A grande CPU é responsável por guardar o HD supremo que é encarregado de armazenar todos ", TimeUnit.MILLISECONDS, timer);
		sysout("\nos dados e informações do nosso planeta desde muito antes dos antigos povos de Gaia a fim", TimeUnit.MILLISECONDS, timer);
		sysout("\nde garantir o backup para que possamos passar por atualizações e manutenções com segurança.", TimeUnit.MILLISECONDS, timer);
		sysout("\n Sem o HD Supremo fica inviável manter o planeta atualizado e a vida em Digital World acaba!", TimeUnit.MILLISECONDS, timer);
		
	
	}

	public static void creditos() throws InterruptedException { // CRÉDITOS
		tempo();
		System.out.println("\n						CRÉDITOS");
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
		System.out.print("\n|				Profº Fernando Almeida, alunos da Turma A				|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|					   MÚSICAS							|");
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
				"\n|	Nós do GRUPO 2 - TURMA A, agradecemos primeiramente à todos os professores pelos ensinamentos	|");
		tempo();
		System.out
				.print("\n|	cada professor colaborou para que nós pudessemos realizar este projeto, em especial		|");
		tempo();
		System.out
				.print("\n|	ao Professor Eduardo Takeo Ueda que nos acompanhou e instruiu durante o projeto, e		|");
		tempo();
		System.out
				.print("\n|	ao Professor Fernando Almeida que nos ensinou sobre a disciplina escolhida como 		|");
		tempo();
		System.out
				.print("\n|	base para o nosso jogo RPG. Agradecemos também à todos os alunos da Turma A que 		|");
		tempo();
		System.out
				.print("\n|	também fizeram parte do nosso projeto, ao responder o questionário e nos ajudar na		|");
		tempo();
		System.out
				.print("\n|	construção do mesmo. Agradecimentos ao colégio Senac Santo Amaro pela oportunidade,		|");
		tempo();
		System.out.print("\n|	acomodação e infraestrutura para o nosso desenvolvimento.					|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print("\n|													|");
		tempo();
		System.out.print(
				"\n/////////////////////////////////////////////////////////////////////////////////////////////////////////\n");
		tempo();
	}

	public static void instrucoes() throws InterruptedException { // INSTRUÇÕES
		tempo();

		System.out.println("\n				*MANUAL DE INSTRUÇÕES*\n");
		sysout("\nO usuário ao iniciar o ALGORITMOTRIX irá para o menu e terá 4 opções: \"1 - Jogar\", \"2 - Instruções\", \"3 - Créditos\"",
				TimeUnit.MILLISECONDS, timer);
		sysout("\ne \"4 - Sair\". Ao selecionar a opção [1] o usuário terá que digitar seu nome para o",
				TimeUnit.MILLISECONDS, timer);
		sysout("inicio dos desafios... ", TimeUnit.MILLISECONDS, timer);
		sysout("\nNa opção [2] o usuário será direcionado para o manual de instruções (onde estamos agora no caso)...",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nA opção [3] irá direcionar o usuário para os créditos do jogo... E por fim, a opção [4] será para o",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nusuário sair do jogo.", TimeUnit.MILLISECONDS, timer);
		sysout("\nO jogo terá uma história, uma estrutura de 10 questões relacionadas com a disciplina de Algoritmos,",
				TimeUnit.MILLISECONDS, timer);
		sysout("\npontos para acumular e ranked de jogadores.\n", TimeUnit.MILLISECONDS, timer);

		System.out.print("\n				*QUESTÕES*\n");
		sysout("\nDeverão ser respondidas de acordo com as alternativas - A), B), C), D) ou E), portanto o usuário só irá",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nselecionar a letra da alternativa desejada como resposta.\n", TimeUnit.MILLISECONDS, timer);

		System.out.print("\n				*PONTUAÇÃO*\n");
		sysout("\nDada uma questão, o usuário terá 3 chances para tentar acertar, se o usuário acertar a questão, passa a",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nganhar pontos de experiência, caso erre a questão perderá 3 pontos de experiência a cada vez que errar.",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nSe no final o usuário conseguir uma pontuação boa, ele finaliza e ganha o jogo. Se não...",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nfinaliza e perde, ou seja, \"G A M E   O V E R\"\n", TimeUnit.MILLISECONDS, timer);

		System.out.print("\n				*RANKED*\n");
		sysout("\nO mínimo exigido de pontos de experiência para entrar no ranked é de 55 pontos, se o usuário antigir ou",
				TimeUnit.MILLISECONDS, timer);
		sysout("\npassar, será disponibilizado um link do nosso Ranked, para que o usuário possa copiar e colar na aba",
				TimeUnit.MILLISECONDS, timer);
		sysout("\nde seu navegador, os próximos passos serão digitar o nome e a pontuação feita. Por ultimo...",
				TimeUnit.MILLISECONDS, timer);
		sysout("\naguardar a divulgação das pontuações.\n", TimeUnit.MILLISECONDS, timer);
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

	public static void vilao() throws InterruptedException { // VILÃO
		tempo();
		tempo();
		System.out.println();
		System.out.println("\nDevemos deter o vilão e recuperar nosso HD Supremo\n");
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
		System.out.println("\nEste é HAL9000 DO PLANETA MIRACULOUS, o vilão mais maldoso da GALÁXIA e quer destruir"
				+ "\ntodos os planetas de toda a Galáxia, é ele quem devemos deter e isso não será uma tarefa fácil!\n");
	}

	public static void escolhaCapitulo1() { // ESCOLHA DO CAPITULO

		String escolha;
		sair = false;
		do {
			System.out.print("\nEscolha seu número da sorte: ");
			escolha = entrada.next();
			switch (escolha) {
			case "1":
				System.out.println("\nVocê selecionou a opção 1");
				System.out.println("Acaba de ganhar 5 pontos de experiência, siga para o Septo Sagrado!\n");
				sair = true;
				somaPontosJogo = somaPontosJogo + 5;
				break;
			case "2":
				System.out.println("\nVocê selecionou a opção 2");
				System.out.println("Aqui está o link de uma música caso queira ouvir: < twenty one pilots: Stressed Out - https://youtu.be/pXRviuL6vMY >");
				System.out.println("Siga para o Septo Sagrado!\n");
				sair = true;
				break;
			case "3":
				System.out.println("\nVocê selecionou a opção 3");
				System.out.println("Acaba de perder 3 pontos de experiência. siga para o Septo Sagrado!\n");
				somaPontosJogo = somaPontosJogo - 3;
				sair = true;
				break;
			case "4":
				System.out.println("\nVocê selecionou a opção 4");
				System.out.println("Acaba de ganhar 10 pontos de experiência, siga para o Septo Sagrado!\n");
				somaPontosJogo = somaPontosJogo + 10;
				sair = true;
				break;
			case "5":
				System.out.println("\nVocê selecionou a opção 5");
				System.out.println("Aqui está o link de uma música caso queira ouvir: < Ki:Theory - Enjoy The Silence - https://youtu.be/l3cEWRdCI8w >");
				System.out.println("Siga para o Septo Sagrado!\n");
				sair = true;
				break;
			default:
				System.out.println("\nOpção inválida, digite novamente\n");

			}

		} while (!sair);
	}

	public static void capitulo1 () throws InterruptedException { // CAPITULO 1
 		
 				System.out.println("- Capitulo 01 - Encontre o Oráculo\n");
 				
 				System.out.println("      _    .  ,   .           .\r\n"
 						+ "    *  / \\_ *  / \\_      _  *        *   /\\'__        *\r\n"
 						+ "      /    \\  /    \\,   ((        .    _/  /  \\  *'.\r\n"
 						+ " .   /\\/\\  /\\/ :' __ \\_  `          _^/  ^/    `--.\r\n"
 						+ "    /    \\/  \\  _/  \\-'\\      *    /.' ^_   \\_   .'\\  *\r\n"
 						+ "  /\\  .-   `. \\/     \\ /==~=-=~=-=-;.  _/ \\ -. `_/   \\\r\n"
 						+ " /  `-.__ ^   / .-'.--\\ =-=~_=-=~=^/  _ `--./ .-'  `-\r\n"
 						+ "/___     `.  / /       `.~-^=-=~=^=.-'      '-._ `._\n");
 				
 				System.out.println("\n*Alpha aparece*\n"); 
 				
 				System.out.println("Alpha2: Não temos muito tempo, a próxima atualização do planeta se aproxima e sem o HD Supremo não temos como fazer o backup");
 				System.out.println("Alpha2: Sem a atualização nosso planeta se tornara obsoleto, nossos sistemas de segurança entraram em colapso e a vida em Digital World chegará ao fim!!!");
 				System.out.println("Alpha2: Encontre o Oráculo no septo sagrado e veja através do cálice celestial a localização do clã darkweb!");
 				System.out.println("Alpha2: Siga pela Floresta dos Spams e tente a sorte ou vá pelo Desfiladeiro Codificado...\n");
 				
 				// ESCOLHA ENTRE FLORESTA DOS SPAMS OU DESFILADEIRO CODIFICADO
 				boolean sair = false;
 				do {
 				System.out.println("[1] Floresta dos spams | [2] Desfiladeiro codificado: ");
 				String escolha = entrada.next();
 				switch(escolha) {
 				case "1": // FLORESTA DOS SPAMS
 					System.out.println("Alhpa2: Olha só, parece que hoje é seu dia de sorte! Cuidado com os Spams!");
 					System.out.println("Alhpa2: Digite um número de 1 a 5 e descubra sua sorte! ");
 					escolhaCapitulo1();
 					sair = true;
 				break;
 				case "2": // DESFILADEIRO CODIFICADO
 					System.out.println("Alpha2: No jogo da sorte a sobrevivência é uma roleta russa, bem-vindo ao Desfiladeiro Codificado!");
 					System.out.println("Alpha2: A resposta correta levará você direto ao Septo Sagrado, você tem três tentativas para desbloquear a passagem.");
 					// CHAMA QUESTÃO
 					questao5();
 					sair = true;
 				break;
 				default:
 					System.out.println("\nOpção inválida, tente novamente.\n");
 				}
 				
 				} while (!sair);
 				
 				System.out.println("\n" + nome + ", você passou pelo primeiro desafio...");
 			    System.out.println("\nReconectando...\n\n");
 				
 				System.out.println("Alpha2: Chegamos ao Septo Sagrado, não poderia esperar menos de você!");
 				System.out.println("Alpha2: Encontre o Oráculo e veja através do Cálice Celestial...");
 				
 				System.out.println("\n*Procurando o Oráculo...*\n");
 						
 				System.out.println("Oráculo: Ora, ora... Temos um visitante, o que te tráz ao Septo Sagrado?");
 				System.out.println("Oráculo: Espere...");
 				System.out.println("Oráculo: Eu tenho a resposta para o que você procura, mas antes preciso testar seus conhecimentos!");
 				
 				// CHAMA QUESTÃO
 				questao2();
 				
 				System.out.println("\nOráculo: Resta uma pergunta, responda para encontrar o seu caminho...\n");
 				
 				// CHAMA QUESTÃO
 				questao9();
 				
 				System.out.println("Oráculo: Ok, vamos proseguir...");
 				System.out.println("Oráculo: Siga para masmorra dos Orcs e encontrará o que procura!!!\n\n");
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
				"Alpha2: Pelo visto deu tudo certo com o Oráculo né? Enfim, a masmorra dos Orcs te espera, siga pelo caminho das pedras...");
		System.out.println(
				"Alpha2: Os Orcs são seres inofensivos apesar da aparência, eles habitam Digital World muito antes dos primeiros homens...");
		System.out.println(
				"Alpha2: Conquiste a confiança de um Orc e terá um grande aliado na batalha contra o clã darkweb ");

		System.out.println("\n*Algumas horas de caminhada...*\n");

		System.out.println(
				"Alpha2: A jornada foi longa, mas aqui estamos, encontre o Líder dos Orcs o mais rápido possível!");
		System.out.println("\n*Orc avistado*\n");
		System.out.println("Orc Vigilante: Qual o motivo da sua visita?");
		System.out.println(nome
				+ ": Preciso da ajuda do líder dos Orcs, o clâ darkweb roubou o hd supremo e estou em uma missão de resgate");
		System.out.println("Orc Vigilante: Para entrar na masmorra, preciso testar suas habilidades! \n");

		// CHAMA QUESTÃO
		questao3();

		System.out.println(
				"Orc Vigilante: Opa, o grande líder te espera, siga até a sala do trono e aguarde instruções\n");
		
		System.out.println("Lider dos Orcs: Qual o motivo da sua visita?");
		System.out.println(nome + ": Preciso de ajuda para enfrentar o clã darkweb");
		System.out.println("Lider dos Orcs: E por qual motivo eu ajudaria?");
		System.out.println(nome + ": O grande Oráculo me enviou até aqui...");
		System.out.println(
				"Lider dos Orcs: O grande Oráculo? Aquele que tudo vê e tudo sabe? Vejamos, antes de enviar um Orc nessa jornada, me responda...");

		// CHAMA QUESTÃO
		questao7();
		// Siga as instruções do Orc e encontre seu caminho

		System.out.println(
				"Lider dos Orcs: Hey! " + nome + ", leve Akin! Um dos Orcs da minha guarda pessoal, ele lhe será bastante útil!");
		System.out.println("Lider dos Orcs: Siga pela trilha de Kharkiv e lá encontrará o clã darkweb...\n\n");

	}

	public static void capitulo3() throws InterruptedException { // CAPITULO 3

		System.out.println("- Capítulo 03 - Caminho de Kharkiv\n");
		System.out.println("\n*Alpha aparece*\n");
		System.out.println(
				"Alpha2: A grande atualização se aproxima e junto com ela o destino de Digital World! Siga pela trilha de Kharkiv, Akin será bastante útil!");
		System.out.println(
				"Alpha2: Na metade da trilha, encontre a  Bruxa da Floresta e ela irá te guiar até o clã darkweb");

		System.out.println("\n*Algumas horas de caminhada...*\n");
		
		System.out.println("Bruxa da Floresta: Ora, ora… O que temos por aqui? estão perdidos?");
		System.out.println(nome + ": Estamos procurando o clã darkweb…");
		System.out.println(
				"Bruxa da Floresta: Vejamos, existem dois caminhos possíveis, um levará ao penhasco do grito e outro ao acampamento do clã darkweb.");
		System.out.println("Responda duas perguntas se acertar irei lhe mostrar o caminho que tanto procura…");

		// CHAMA QUESTÃO
		questao4();

		System.out.println("Bruxa da Floresta: Parece que temos um sabe tudo aqui, vamos para a última pergunta…");

		// CHAMA QUESTÃO
		questao8();

		// *errar a pergunta ele vai para o penhasco do grito e volta pro inicio do jogo
		// ** acertar a pergunta ela pega a informação que queria e segue para o
		// acampamento do clã dark web

		System.out.println("Bruxa da Floresta: Siga pela esquerda, o acampamento do clã darkweb não está muito longe…");
		
		System.out.println("\n*Alpha aparece*\n");
		System.out.println("Alpha2: Ufa, até que enfim chegamos até aqui, estamos quase lá…");
		System.out.println(
				"Alpha2: Assim que chegarem ao acampamento se dirijam ao guarda da portaria, digam que querem se juntar ao clã e ele colocará vocês para dentro");
		System.out.println("\n*Chegando ao acampamento*\n\n");
		System.out.println("Guarda da Portaria: O que fazem aqui? Perderam alguma coisa?");
		System.out.println(nome + ": Viemos nos juntar ao clã darkweb…");
		System.out.println(
				"Guarda da Portaria: Preciso testar suas habilidades, se provarem sua capacidade eu deixo vocês passarem e se juntarem ao clã darkweb…");

		// CHAMA QUESTÃO
		questao6();

		System.out.println("Guarda da Portaria: Sejam bem vindos ao clã darkweb…");

		System.out.println("\n*Alpha aparece*\n");
		System.out.println(
				"Alpha2: Agora que estamos aqui dentro, vocês precisam se separar, Akin deverá seguir para o alojamento e trancar as portas...");
		System.out.println(
				"Alpha2: Você " + nome + ", deverá seguir para sala das conquistas e enfrentar o líder do clã darkweb…");
		System.out.println(
				"Alpha2: A única forma de vencer e recuperar o HD Supremo é derrotando o lider do clã darkweb!");
		System.out.println("Alpha2: Boa sorte em sua última missão haha !!!");

	}

	public static void capitulo4() throws InterruptedException { // CAPITULO 4

		System.out.println("- Capítulo 04 - Ultimato\n");

		System.out.println("Entrando na sala das conquistas um segredo é revelado...");

		System.out.println(nome + ": Alpha2, eu não consigo entender! A sala está vazia!!! Onde está o Lider do Clã?");
		System.out.println("Alpha2: Você ainda não percebeu? hahaha");
		System.out.println(
				"Alpha2: Após o final das guerras galácticas, foi decidido que a memória do lider do clã darkweb seria armazenada em Digital World no Grande HD Supremo...");
		System.out.println(
				"Alpha2: Houve um corte abrupto de energia causado por uma tempestade solar ocasionando um curto no HD Supremo");
		System.out.println("Alpha2:" + nome + "eu sou o lider do clã darkweb, eu me chamo HAL9000!!!");
		System.out.println("\n*Alpha2 transforma-se em HAL9000*\n");
		System.out.println("HAL9000: Eu me aproveitei do curto circuito no HD Supremo e infectei a memória do Alpha2");
		System.out.println(
				"HAL9000: Eu não te trouxe aqui para salvar Digital World, eu te trouxe aqui para destruir Digital World e tranferir minha memória para seu corpo orgânico!");
		System.out.println(nome + ": Eu não vou deixar isso aconceter! Vamos barganhar?");
		System.out.println(nome
				+ ": Dois desafios, se eu acertar eu ganho e você restaura a memoria do Alpha2! se eu errar fim de linha! Você ganha e tera tudo!");
		System.out.println("HAL9000: Então é isso? Que os jogos comecem!!!");

		// CHAMA QUESTÃO
		questao1();

		System.out.println("HAL9000: Ultima pergunta...");

		// CHAMA QUESTÃO
		questao10();
		// derrotou o HAL9000

		System.out.println("HAL9000: Nãooooooooooooooo...");
		System.out.println(nome + ": Game Over para você HAL9000!");

		System.out.println(
				"Alpha2: Obrigadx " + nome + " você conseguiu derrotar o HAL9000 e consequentemente o clã darkweb!");
		System.out.println(
				"Alpha2: Agora que minha memória foi reestabelecida e o HD Supremo está em segurança, podemos proseguir com a atualização de Digital World...");

		System.out.println(
				"Digital World foi atualizado, HAL9000 foi aprisionado em um pendriver, uma tecnologia absoleta e descartado em Delta-X9 um planeta isolado...");
		System.out
				.println("O clã darkweb foi dissolvido e alguns membros fugiram para planetas e galaxias distantes...");
		System.out.println("Mas enquanto a ameaça existir, estaremos de olhos bem abertos!");
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
				"Alpha2: Olá " + nome + ", seja bem-vindo a Digital World!");
		System.out.println(
				"Alpha2: Eu sou uma inteligência artificial e responsável por manter a ordem e o planeta atualizado e conectado!");
		System.out.println(
				"Alpha2: Nosso planeta está em perigo, o clã darkweb roubou o HD supremo da grande CPU e precisamos da sua ajuda para recupera-lo!!!");
		System.out.println(
				"Alpha2: Antes de iniciar nossa aventura, gostaria de conhecer a história do nosso planeta?");
		
		System.out.println("\n[1] - SIM, quero conhecer a história. | [2] - Não, iniciar aventura.\n");
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
					System.out.println("\nDigite uma opção válida.\n");
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
		alternativa.add(" Cada instrução termina com um ponto e vírgula");
		alternativa.add(
				" O método main é o ponto de partida de cada aplicativo java e deve iniciar com public static void main(String[] args)");
		alternativa.add(" O java diferencia letras maiúsculas de minúsculas"); // CORRETA
		alternativa.add(" Palavras reservadas pelo java não podem ser usada para nomear variáveis");
		alternativa.add(" A letra B e C estão incorretas");

		System.out.println("\nConsiderando linguagem em java, assinale a opção INCORRETA:\n");

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

			if (alternativa.get(index).equals(" A letra B e C estão incorretas")) {
				System.out.println("Resposta Correta");
				pontosq1 += 10;
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq1 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("você errou " + cont + " vezes.");
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
				.println("\nIndique a opção que contém o valor final da variável após a execução do trecho de programa"
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
					System.out.println("você errou " + cont + " vezes.");
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

		alternativa.add(" Variáveis não podem ser nomeadas com a palavra “string”.");
		alternativa.add(" O método main não pode ser declarado como “static”.");
		alternativa.add(" Cadeias de caracteres devem ser delimitadas por aspas duplas.");
		alternativa.add(" Não foi especificado um valor de retorno para o método.");
		alternativa.add(" O método main não pode ser declarado como “public”.");

		System.out.println("Considere o programa Java a seguir:\r\n" + "  \n public class Classe {\r\n"
				+ "       public static void main(String[] args) {\r\n" + "        String string = 'xyzk';\r\n"
				+ "        System.out.println(string);\r\n" + "      }\r\n" + "     }\r\n");

		System.out.println("\nEsse programa não pode ser compilado, pois :");

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
					System.out.println("você errou " + cont + " vezes.");
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

		System.out.println("Java é uma tecnologia de desenvolvimento, sendo simultaneamente, uma\n"
				+ "linguagem e uma plataforma. Nesse contexto, apresenta-se o código a seguir.\r\n"
				+ "\npublic class teste {\r\n" + "\r\n" + "public static void main(String[] args) {\r\n" + "\r\n"
				+ "for (int i = 0; i <= 4; i++) {\r\n" + "if (i == 2);\r\n" + "System.out.println(i);\r\n" + "   }\r\n"
				+ "  }\r\n" + "}\r\n"

				+ "\nApós a execução, a saída gerada será:\r\n" + "");

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
					System.out.println("você errou " + cont + " vezes.");
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
		alternativa.add(" Uma sequência não lógica e infinita");
		alternativa.add(" Uma sequência lógica e finita");
		alternativa.add(" Uma sequência lógica e infinita"); // CORRETA
		alternativa.add(" Uma sequência variavel");
		alternativa.add(" Nenhuma das alternativas está correta");

		System.out.println("\nAssinale a alternativa correta");

		System.out.println("\nUm algoritmo é:\n");

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

			if (alternativa.get(index).equals(" Uma sequência lógica e infinita")) {
				System.out.println("Resposta Correta");
				pontosq5 += 10;
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq5 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("você errou " + cont + " vezes.");
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
		alternativa.add(" Uma sequência não lógica e infinita");
		alternativa.add(" Uma sequência lógica e finita");
		alternativa.add(" Uma sequência lógica e infinita"); // CORRETA
		alternativa.add(" Uma sequência variavel");
		alternativa.add(" Nenhuma das alternativas está correta");

		System.out.println("\nAssinale a alternativa correta");

		System.out.println("\nUm algoritmo é:\n");

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

			if (alternativa.get(index).equals(" Uma sequência lógica e infinita")) {
				System.out.println("Resposta Correta");
				pontosq6 += 10;
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq6 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("você errou " + cont + " vezes.");
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
		alternativa.add(" linguagem de marcação");
		alternativa.add(" engenharia estrudurada");
		alternativa.add(" pseudolinguagem"); // CORRETA


		System.out.println("\nRelacionado à programação de computadores, um algoritmo, seja qual for a sua"
				+ "\ncomplexidade e a linguagem de programação na qual será codificado, pode ser descrito por"
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
					System.out.println("você errou " + cont + " vezes.");
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

		System.out.println("\nSão instruções tipicamente encontradas em linguagens de programação para codificar "
				+ "estruturas de repetição:\n");

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
					System.out.println("você errou " + cont + " vezes.");
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
		alternativa.add(" Enquanto n for igual à 100, o laço só vai parar quando x for igual à 100.");
		alternativa.add(" O laço vai se repitir, porém quando x for igual à 88, ele vai parar."); // CORRETA
		alternativa.add(" Este laço é um laço Do/While e não um laço For.");
		alternativa.add(" O laço vai imprimir de 0 até 100 e quando chegar em 88 vai repetir tudo denovo.");
		alternativa.add(" N.D.A.");

		System.out.println("Dado o código abaixo, pedimos com atenção que você observe, faça uma análise"
				+ "\ndo código, e com base nos seus conhecimentos, responda qual alternativa está correta:");

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
					.equals(" O laço vai se repitir, porém quando x for igual à 88, ele vai parar.")) {
				System.out.println("Resposta Correta");
				pontosq9 += 10;
				sair = false;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq9 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("você errou " + cont + " vezes.");
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
		alternativa.add(" Enquanto N for menor que 10, a condição booleana será TRUE e vai sair do laço repetitivo.");// CORRETA
		alternativa.add(" Quando N for maior que 10, a condição booleana será !TRUE e ele saíra do laço repetitivo.");
		alternativa.add(" Esse código não irá funcionar, pois tem um erro.");
		alternativa.add(" N.D.A.");
		alternativa.add(
				" Quando N for maior ou igual a 10, a condição booleana será TRUE e ele sairá do laço repetitivo.");

		System.out.println("\nAssinale a alternativa correta");

		System.out.println("\nDado o código abaixo, pedimos com atenção que você observe, faça uma análise"
				+ "\ndo código, e com base nos seus conhecimentos, responda qual alternativa está correta:\n");

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
					" Quando N for maior ou igual a 10, a condição booleana será TRUE e ele sairá do laço repetitivo.")) {
				System.out.println("Resposta Correta");
				pontosq10 += 10;
				
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq10 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("você errou " + cont + " vezes.");
					sair = true;
				}
			}

		} while (!sair);
		somaPontosJogo = somaPontosJogo + pontosq10;
	}

	public static void finalizaWinner() throws InterruptedException { // GANHOU
		System.out.println("\nParabéns, você concluiu o jogo e atingiu a pontuação necessária!!!");
		System.out.println("\nFicamos felizes por você...  ;) ");
		tempo();
		System.out.println("\nAgora para concluir, acesse o link da nossa Ranked: \n"
				+ "https://docs.google.com/forms/d/e/1FAIpQLSe7zFesTvPsBO8pwjj3bvx0hlGBDWTxCVwRlhJJR9kKA-xlxw/viewform?usp=sf_link"
				+ "\nCopie o link acima e cole na aba do seu navegador, digite seu nome, a sua pontuação e aguarde ser divulgado.\n");
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
				.println("\nIIIIIIIIIIIIIIIIIHHHH DEU RUIM HEIN?! MÁS CONTINUA TENTANDO, UMA HORA VAI, CONFIA!  :') ");
		System.out.println("\n\t\tF I M");
	}

	public static void main(String[] args) throws InterruptedException {

		bemVindos();

		menu();

	}
}