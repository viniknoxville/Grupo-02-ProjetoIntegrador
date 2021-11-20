import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Algoritimotrix {
	
	// VARIÁVEIS GLOBAIS
	static Scanner entrada = new Scanner(System.in);
	static boolean sair = false; // SAÍDA LAÇOS
	static int somaDePontos = 0; // SOMAR PONTUAÇÃO DOS JOGADORES
	static int timer = 10; // TIMER DELAY NOS TEXTOS
	static String nome = ""; // NOME DO USUÁRIO
	static int pontosMin = 55; // MÍNIMO DEPONTUAÇÃO

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
				sysout("\nVocê selecionou a opção 1 - Jogar\n", TimeUnit.MILLISECONDS, timer);
				jogar();
				saida = true;
				break;

			case "2", "DOIS":
				sysout("\nVocê selecionou a opção 2 - Instruções\n", TimeUnit.MILLISECONDS, timer);
				instrucoes();
				break;

			case "3", "TRES", "TRÊS":
				sysout("\nVocê selecionou a opção 3 - Créditos\n", TimeUnit.MILLISECONDS, timer);
				creditos();
				break;

			case "4", "QUATRO":
			sysout("\nVocê selecionou a opção - Sair", TimeUnit.MILLISECONDS, timer);
			System.out.println("\nquer mesmo sair?");
			System.out.println("[1] SIM	[2]	NÃO");
			System.out.println("\nResposta: ");
				sair = entrada.next();
				if (sair.equalsIgnoreCase(sim)) {
					sysout("\n\t\tQUE PENA :(\n" + "\nESTAMOS TE ESPERANDO QUANDO QUISER VOLTAR ;)", TimeUnit.MILLISECONDS, timer);
					sysout("\n\t F I M   D O   J O G O", TimeUnit.MILLISECONDS, timer);
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
		sysout("\n\nsomos um povo multicultural, falamos diversas linguagens de programação e estamos em constante ", TimeUnit.MILLISECONDS, timer);
		sysout("\n\ndesenvolvimento. Nosso planeta participou das guerras galácticas e conseguimos frear o avanço do", TimeUnit.MILLISECONDS, timer);
		sysout("\n\nimpério dark, que tinha como missão acabar com o avanço tecnológico e impor dominação sobre", TimeUnit.MILLISECONDS, timer);
		sysout("\n\nmundos, galáxias e povos!", TimeUnit.MILLISECONDS, timer);
		sysout("\n\n A grande CPU é responsável por guardar o HD supremo que é encarregado de armazenar todos ", TimeUnit.MILLISECONDS, timer);
		sysout("\n\nos dados e informações do nosso planeta desde muito antes dos antigos povos de Gaia a fim", TimeUnit.MILLISECONDS, timer);
		sysout("\n\nde garantir o backup para que possamos passar por atualizações e manutenções com segurança.", TimeUnit.MILLISECONDS, timer);
		sysout("\n\n Sem o HD Supremo fica inviável manter o planeta atualizado e a vida em Digital World acaba!", TimeUnit.MILLISECONDS, timer);
		
	
	}

	public static void creditos() throws InterruptedException { // CRÉDITOS

			tempo();
			System.out.println("\n						*CRÉDITOS*");
			tempo();
			System.out.print(
					"\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|					*CRIADORES E EDITORES*						|");
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
			System.out.print("\n|					     *DISCIPLINA*						|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|				   	 Projeto Integrador						|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|					      *ORIENTADOR*						|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|				 	 Eduardo Takeo Ueda						|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|				      	     *PARTICIPANTES*						|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|			Professores Eduardo Takeo e Fernando Almeida, alunos Turma A			|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|					   *MÚSICAS*							|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|		Ki:Theory - Enjoy The Silence: https://youtu.be/l3cEWRdCI8w				|");
			tempo();
			System.out.print("\n|		twenty one pilots - Stressed Out: https://youtu.be/pXRviuL6vMY				|");
			tempo();
			System.out.print("\n|		Radiohead - Nude: https://youtu.be/BbWBRnDK_AE						|");
			tempo();
			System.out.print("\n|		Moby - Porcelain: https://youtu.be/13EifDb4GYs						|");
			tempo();
			System.out.print("\n|		LSD - Genius ft. Sia, Diplo, Labrinth: https://youtu.be/HhoATZ1Imtw			|");
			tempo();
			System.out.print("\n|		Julian Casablancas - 11th Dimension: https://youtu.be/pl15PlIXHIk			|");
			tempo();
			System.out.print("\n|		Daft Punk - One More Time: https://youtu.be/FGBhQbmPwH8					|");
			tempo();
			System.out.print("\n|		The Weeknd & Ariana Grande - Save Your Tears (Remix): https://youtu.be/LIIDh-qI9oI	|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|													|");
			tempo();
			System.out.print("\n|					   *AGRADECIMENTOS*						|");
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
		sysout("\n\nO usuário ao iniciar o ALGORITMOTRIX irá para o menu e terá 4 opções: \"1 - Jogar\", \"2 - Instruções\", \"3 - Créditos\"",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\ne \"4 - Sair\". Ao selecionar a opção [1] o usuário terá que digitar seu nome para o",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\ninicio dos desafios... ", TimeUnit.MILLISECONDS, timer);
		sysout("\n\nNa opção [2] o usuário será direcionado para o manual de instruções (onde estamos agora no caso)...",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\nA opção [3] irá direcionar o usuário para os créditos do jogo... E por fim, a opção [4] será para o",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\nusuário sair do jogo.", TimeUnit.MILLISECONDS, timer);
		sysout("\n\nO jogo terá uma história, uma estrutura de 10 questões relacionadas com a disciplina de Algoritmos,",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\npontos para acumular e ranked de jogadores.\n", TimeUnit.MILLISECONDS, timer);

		System.out.print("\n				*QUESTÕES*\n");
		sysout("\n\nDeverão ser respondidas de acordo com as alternativas - A), B), C), D) ou E), portanto o usuário só irá",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\nselecionar a letra da alternativa desejada como resposta.\n", TimeUnit.MILLISECONDS, timer);

		System.out.print("\n				*PONTUAÇÃO*\n");
		sysout("\n\nDada uma questão, o usuário terá 3 chances para tentar acertar, se o usuário acertar a questão, passa a",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\nganhar pontos de experiência, caso erre a questão perderá 3 pontos de experiência a cada vez que errar.",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\nSe no final o usuário conseguir uma pontuação boa, ele finaliza e ganha o jogo. Se não...",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\nfinaliza e perde, ou seja, \"G A M E   O V E R\"\n", TimeUnit.MILLISECONDS, timer);

		System.out.print("\n				*RANKED*\n");
		sysout("\n\nO mínimo exigido de pontos de experiência para entrar no ranked é de 55 pontos, se o usuário antigir ou",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\npassar, será disponibilizado um link do nosso Ranked, para que o usuário possa copiar e colar na aba",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\nde seu navegador, os próximos passos serão digitar o nome e a pontuação feita. Por ultimo...",
				TimeUnit.MILLISECONDS, timer);
		sysout("\n\naguardar a divulgação das pontuações.\n", TimeUnit.MILLISECONDS, timer);
	}

	public static void tempo () throws InterruptedException { // DELAY LINHAS
		Thread.sleep(1000);
	}

	public static void bemVindos() throws InterruptedException { // BEM VINDO
		tempo();
		System.out.println("           _      _____  ____  _____  _____ _______ __  __  ____ _______ _____  _______   __");
		Thread.sleep(100);
		System.out.println("     /\\   | |    / ____|/ __ \\|  __ \\|_   _|__   __|  \\/  |/ __ \\__   __|  __ \\|_   _\\ \\ / /");
		Thread.sleep(100);
		System.out.println("    /  \\  | |   | |  __| |  | | |__) | | |    | |  | \\  / | |  | | | |  | |__) | | |  \\ V / ");
		Thread.sleep(100);
		System.out.println("   / /\\ \\ | |   | | |_ | |  | |  _  /  | |    | |  | |\\/| | |  | | | |  |  _  /  | |   > <  ");
		Thread.sleep(100);;
		System.out.println("  / ____ \\| |___| |__| | |__| | | \\ \\ _| |_   | |  | |  | | |__| | | |  | | \\ \\ _| |_ / . \\ ");
		Thread.sleep(100);
		System.out.println(" /_/    \\_\\______\\_____|\\____/|_|  \\_\\_____|  |_|  |_|  |_|\\____/  |_|  |_|  \\_\\_____/_/ \\_\\");
		
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

	public static void escolhaCapitulo1() throws InterruptedException { // ESCOLHA DO CAPITULO

		String escolha;
		sair = false;
		do {
			sysout("\n\nEscolha seu número da sorte: ", TimeUnit.MILLISECONDS, timer);
			escolha = entrada.next();
			switch (escolha) {
			case "1":
				sysout("\n\nVocê selecionou a opção 1", TimeUnit.MILLISECONDS, timer);
				sysout("\nAcaba de ganhar 5 pontos de experiência, siga para o Septo Sagrado! Más antes... um desafio para aquecer rsrs\n", TimeUnit.MILLISECONDS, timer);
				sair = true;
				somaDePontos = somaDePontos + 5;
				break;
			case "2":
				sysout("\n\nVocê selecionou a opção 2", TimeUnit.MILLISECONDS, timer);
				System.out.println("\nAqui está o link de uma música caso queira ouvir: < twenty one pilots: Stressed Out - https://youtu.be/pXRviuL6vMY >\n");
				sysout("\nSiga para o Septo Sagrado! Más antes... um desafio para aquecer rsrs\n", TimeUnit.MILLISECONDS, timer);
				sair = true;
				break;
			case "3":
				sysout("\n\nVocê selecionou a opção 3", TimeUnit.MILLISECONDS, timer);
				sysout("\nAcaba de perder 3 pontos de experiência. siga para o Septo Sagrado! Más antes... um desafio para aquecer rsrs\n", TimeUnit.MILLISECONDS, timer);
				somaDePontos = somaDePontos - 3;
				sair = true;
				break;
			case "4":
				sysout("\n\nVocê selecionou a opção 4", TimeUnit.MILLISECONDS, timer);
				sysout("\nAcaba de ganhar 10 pontos de experiência, siga para o Septo Sagrado! Más antes... um desafio para aquecer rsrs\n", TimeUnit.MILLISECONDS, timer);
				somaDePontos = somaDePontos + 10;
				sair = true;
				break;
			case "5":
				sysout("\n\nVocê selecionou a opção 5", TimeUnit.MILLISECONDS, timer);
				System.out.println("\nAqui está o link de uma música caso queira ouvir: < Ki:Theory - Enjoy The Silence - https://youtu.be/l3cEWRdCI8w >\n");
				sysout("\nSiga para o Septo Sagrado! Más antes... um desafio para aquecer rsrs\n", TimeUnit.MILLISECONDS, timer);
				sair = true;
				break;
			default:
				System.out.println("\nOpção inválida, digite novamente\n");

			}

		} while (!sair);
	}

	public static void capitulo1 () throws InterruptedException { // CAPITULO 1
 		
 				sysout("\n- Capitulo 01 - Encontre o Oráculo\n", TimeUnit.MILLISECONDS, 40);
 				
 				System.out.println("      _    .  ,   .           .\r\n"
 						+ "    *  / \\_ *  / \\_      _  *        *   /\\'__        *\r\n"
 						+ "      /    \\  /    \\,   ((        .    _/  /  \\  *'.\r\n"
 						+ " .   /\\/\\  /\\/ :' __ \\_  `          _^/  ^/    `--.\r\n"
 						+ "    /    \\/  \\  _/  \\-'\\      *    /.' ^_   \\_   .'\\  *\r\n"
 						+ "  /\\  .-   `. \\/     \\ /==~=-=~=-=-;.  _/ \\ -. `_/   \\\r\n"
 						+ " /  `-.__ ^   / .-'.--\\ =-=~_=-=~=^/  _ `--./ .-'  `-\r\n"
 						+ "/___     `.  / /       `.~-^=-=~=^=.-'      '-._ `._\n");
 				
 				sysout("\n\n*Alpha aparece*\n\n", TimeUnit.MILLISECONDS, timer); 
 				
 				sysout("\nAlpha2: Não temos muito tempo, a próxima atualização do planeta se aproxima e sem o HD Supremo não temos como fazer o backup", TimeUnit.MILLISECONDS, timer);
 				sysout("\nAlpha2: Sem a atualização nosso planeta se tornara obsoleto, nossos sistemas de segurança entraram em colapso e a vida em Digital World chegará ao fim!!!", TimeUnit.MILLISECONDS, timer);
 				sysout("\nAlpha2: Encontre o Oráculo no septo sagrado e veja através do cálice celestial a localização do clã darkweb!", TimeUnit.MILLISECONDS, timer);
 				sysout("\nAlpha2: Siga pela Floresta dos Spams e tente a sorte ou vá pelo Desfiladeiro Codificado...\n", TimeUnit.MILLISECONDS, timer);
 				
 				// ESCOLHA ENTRE FLORESTA DOS SPAMS OU DESFILADEIRO CODIFICADO
 				boolean sair = false;
 				do {
 					sysout("\n[1] Floresta dos spams | [2] Desfiladeiro codificado: \n", TimeUnit.MILLISECONDS, timer);
 				String escolha = entrada.next();
 				switch(escolha) {
 				case "1": // FLORESTA DOS SPAMS
 					sysout("\nAlhpa2: Olha só, parece que hoje é seu dia de sorte! Cuidado com os Spams!", TimeUnit.MILLISECONDS, timer);
 					sysout("\nAlhpa2: Digite um número de 1 a 5 e descubra sua sorte! \n", TimeUnit.MILLISECONDS, timer);
 					escolhaCapitulo1();
 					questao5();
 					sair = true;
 				break;
 				case "2": // DESFILADEIRO CODIFICADO
 					sysout("\nAlpha2: No jogo da sorte a sobrevivência é uma roleta russa, bem-vindo ao Desfiladeiro Codificado!", TimeUnit.MILLISECONDS, timer);
 					sysout("\nAlpha2: A resposta correta levará você direto ao Septo Sagrado, vá para o primeiro desafio para desbloquear a passagem.", TimeUnit.MILLISECONDS, timer);
 					// CHAMA QUESTÃO
 					questao5();
 					sair = true;
 				break;
 				default:
 					sysout("\nOpção inválida, tente novamente.\n", TimeUnit.MILLISECONDS, timer);
 				}
 				
 				} while (!sair);
 				
 				sysout("\n" + nome + ", você passou pelo primeiro desafio...", TimeUnit.MILLISECONDS, timer);
 				tempo();
 			    sysout("\n\nReconectando...\n\n", TimeUnit.MILLISECONDS, 40);
 				tempo();
 				tempo();
 			   sysout("\n\nAlpha2: Chegamos ao Septo Sagrado, não poderia esperar menos de você!", TimeUnit.MILLISECONDS, timer);
 			  sysout("\n\nAlpha2: Encontre o Oráculo e veja através do Cálice Celestial...", TimeUnit.MILLISECONDS, timer);
 				
 			 sysout("\n\n*Procurando o Oráculo...*\n", TimeUnit.MILLISECONDS, timer);
 						
 			sysout("\nOráculo: Ora, ora... Temos um visitante, o que te tráz ao Septo Sagrado?", TimeUnit.MILLISECONDS, timer);
 			sysout("\nOráculo: Espere...", TimeUnit.MILLISECONDS, timer);
 			sysout("\nOráculo: Eu tenho a resposta para o que você procura, mas antes preciso testar seus conhecimentos!", TimeUnit.MILLISECONDS, timer);
 				
 				// CHAMA QUESTÃO
 				questao2();
 				
 				sysout("\n\nOráculo: Resta uma pergunta, responda para encontrar o seu caminho...\n", TimeUnit.MILLISECONDS, timer);
 				
 				// CHAMA QUESTÃO
 				questao9();
 				
 				sysout("\nOráculo: Ok, vamos proseguir...", TimeUnit.MILLISECONDS, timer);
 				sysout("\nOráculo: Siga para masmorra dos Orcs e encontrará o que procura!!!\n\n", TimeUnit.MILLISECONDS, timer);
 	}

	public static void capitulo2() throws InterruptedException { // CAPITULO 2

		sysout("\n- Capitulo 02- Masmorra dos Orcs 02\n", TimeUnit.MILLISECONDS, 40);
		
		tempo();
		System.out.print("\n    .       ..       .\r\n");
		Thread.sleep(200);
		System.out.print("    |\\      ||      /|\r\n");
		Thread.sleep(200);
		System.out.print("    | \\     ||     / |\r\n");
		Thread.sleep(200);
		System.out.print("    |  \\    ||    /  |\r\n");
		Thread.sleep(200);
		System.out.print("    |  :\\___JL___/   |\r\n");
		Thread.sleep(200);
		System.out.print("    |  :|##XLJ: :|   |\r\n");
		Thread.sleep(200);
		System.out.print("    '\\ :|###||: X|  /'\r\n");
		Thread.sleep(200);
		System.out.print("      \\:|###||:X#| /\r\n");
		Thread.sleep(200);
		System.out.print("       |==========|\r\n");
		Thread.sleep(200);
		System.out.print("        |###XXX;;|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: :|\r\n");
		Thread.sleep(200);
		System.out.print("        |##Xn:: :|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XU:: :|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: :|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: :|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: :|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: n|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: U|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: :|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: n|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: U|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: :|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: :|\r\n");
		Thread.sleep(200);
		System.out.print("        |##XX:: :|\r\n");
		Thread.sleep(200);
		System.out.print("        |##,_,: :|\r\n");
		Thread.sleep(200);
		System.out.print("        |./ T \\.:|\r\n");
		Thread.sleep(200);
		System.out.print("        || o|o |:|\r\n");
		Thread.sleep(200);
		System.out.print("        ||  |  |:|\r\n");
		Thread.sleep(200);
		System.out.print("      .============.\r\n");
		Thread.sleep(200);
		System.out.print("     .==============.\r\n");
		Thread.sleep(200);
		System.out.print("    .================.\n");

		sysout(
				"\nAlpha2: Pelo visto deu tudo certo com o Oráculo né? Enfim, a masmorra dos Orcs te espera, siga pelo caminho das pedras...", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Os Orcs são seres inofensivos apesar da aparência, eles habitam Digital World muito antes dos primeiros homens...", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Conquiste a confiança de um Orc e terá um grande aliado na batalha contra o clã darkweb ", TimeUnit.MILLISECONDS, timer);

		sysout("\n\n*Algumas horas de caminhada...*\n\n", TimeUnit.MILLISECONDS, timer);

		sysout(
				"\nAlpha2: A jornada foi longa, mas aqui estamos, encontre o Líder dos Orcs o mais rápido possível!", TimeUnit.MILLISECONDS, timer);
		sysout("\n\n*Orc avistado*\n\n", TimeUnit.MILLISECONDS, timer);
		sysout("\nOrc Vigilante: Qual o motivo da sua visita?", TimeUnit.MILLISECONDS, timer);
		sysout("\n" + nome
				+ ": Preciso da ajuda do líder dos Orcs, o clâ darkweb roubou o hd supremo e estou em uma missão de resgate", TimeUnit.MILLISECONDS, timer);
		sysout("\nOrc Vigilante: Para entrar na masmorra, preciso testar suas habilidades! \n", TimeUnit.MILLISECONDS, timer);

		// CHAMA QUESTÃO
		questao3();

		sysout(
				"\nOrc Vigilante: Opa, o grande líder te espera, siga até a sala do trono e aguarde instruções\n", TimeUnit.MILLISECONDS, timer);
		
		sysout("\nLider dos Orcs: Qual o motivo da sua visita?", TimeUnit.MILLISECONDS, timer);
		sysout("\n" + nome + ": Preciso de ajuda para enfrentar o clã darkweb", TimeUnit.MILLISECONDS, timer);
		sysout("\nLider dos Orcs: E por qual motivo eu ajudaria?", TimeUnit.MILLISECONDS, timer);
		sysout("\n" + nome + ": O grande Oráculo me enviou até aqui...", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nLider dos Orcs: O grande Oráculo? Aquele que tudo vê e tudo sabe? Vejamos, antes de enviar um Orc nessa jornada, me responda...", TimeUnit.MILLISECONDS, timer);

		// CHAMA QUESTÃO
		questao7();
		// Siga as instruções do Orc e encontre seu caminho

		sysout(
				"\nLider dos Orcs: Hey! " + nome + ", leve Akin! Um dos Orcs da minha guarda pessoal, ele lhe será bastante útil!", TimeUnit.MILLISECONDS, timer);
		sysout("\nLider dos Orcs: Siga pela trilha de Kharkiv e lá encontrará o clã darkweb...\n\n", TimeUnit.MILLISECONDS, timer);

	}

	public static void capitulo3() throws InterruptedException { // CAPITULO 3

		sysout("\n- Capítulo 03 - Caminho de Kharkiv\n", TimeUnit.MILLISECONDS, 40);
		sysout("\n\n*Alpha aparece*\n\n", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: A grande atualização se aproxima e junto com ela o destino de Digital World! Siga pela trilha de Kharkiv, Akin será bastante útil!", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Na metade da trilha, encontre a  Bruxa da Floresta e ela irá te guiar até o clã darkweb", TimeUnit.MILLISECONDS, timer);

		sysout("\n\n*Algumas horas de caminhada...*\n\n", TimeUnit.MILLISECONDS, timer);
		
		sysout("\nBruxa da Floresta: Ora, ora… O que temos por aqui? estão perdidos?", TimeUnit.MILLISECONDS, timer);
		sysout("\n" + nome + ": Estamos procurando o clã darkweb…", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nBruxa da Floresta: Vejamos, existem dois caminhos possíveis, um levará ao penhasco do grito e outro ao acampamento do clã darkweb.", TimeUnit.MILLISECONDS, timer);
		sysout("\nResponda duas perguntas se acertar irei lhe mostrar o caminho que tanto procura…", TimeUnit.MILLISECONDS, timer);

		// CHAMA QUESTÃO
		questao4();

		sysout("\nBruxa da Floresta: Parece que temos um sabe tudo aqui, vamos para a última pergunta…", TimeUnit.MILLISECONDS, timer);

		// CHAMA QUESTÃO
		questao8();

		// *errar a pergunta ele vai para o penhasco do grito e volta pro inicio do jogo
		// ** acertar a pergunta ela pega a informação que queria e segue para o
		// acampamento do clã dark web

		sysout("\nBruxa da Floresta: Siga pela esquerda, o acampamento do clã darkweb não está muito longe…", TimeUnit.MILLISECONDS, timer);
		
		sysout("\n\n*Alpha aparece*\n\n", TimeUnit.MILLISECONDS, timer);
		sysout("\nAlpha2: Ufa, até que enfim chegamos até aqui, estamos quase lá…", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Assim que chegarem ao acampamento se dirijam ao guarda da portaria, digam que querem se juntar ao clã e ele colocará vocês para dentro", TimeUnit.MILLISECONDS, timer);
		sysout("\n*Chegando ao acampamento*\n\n", TimeUnit.MILLISECONDS, timer);
		sysout("\nGuarda da Portaria: O que fazem aqui? Perderam alguma coisa?", TimeUnit.MILLISECONDS, timer);
		sysout("\n" + nome + ": Viemos nos juntar ao clã darkweb…", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nGuarda da Portaria: Preciso testar suas habilidades, se provarem sua capacidade eu deixo vocês passarem e se juntarem ao clã darkweb…", TimeUnit.MILLISECONDS, timer);

		// CHAMA QUESTÃO
		questao6();

		sysout("\nGuarda da Portaria: Sejam bem vindos ao clã darkweb…", TimeUnit.MILLISECONDS, timer);

		sysout("\n\n*Alpha aparece*\n\n", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Agora que estamos aqui dentro, vocês precisam se separar, Akin deverá seguir para o alojamento e trancar as portas...", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Você " + nome + ", deverá seguir para sala das conquistas e enfrentar o líder do clã darkweb…", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: A única forma de vencer e recuperar o HD Supremo é derrotando o lider do clã darkweb!", TimeUnit.MILLISECONDS, timer);
		sysout("\nAlpha2: Boa sorte em sua última missão haha !!!", TimeUnit.MILLISECONDS, timer);

	}

	public static void capitulo4() throws InterruptedException { // CAPITULO 4

		sysout("\n- Capítulo 04 - Ultimato\n", TimeUnit.MILLISECONDS, 40);

		sysout("\nEntrando na sala das conquistas um segredo é revelado...", TimeUnit.MILLISECONDS, timer);

		sysout("\n" + nome + ": Alpha2, eu não consigo entender! A sala está vazia!!! Onde está o Lider do Clã?", TimeUnit.MILLISECONDS, timer);
		sysout("\nAlpha2: Você ainda não percebeu? hahaha", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Após o final das guerras galácticas, foi decidido que a memória do lider do clã darkweb seria armazenada em Digital World no Grande HD Supremo...", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Houve um corte abrupto de energia causado por uma tempestade solar ocasionando um curto no HD Supremo", TimeUnit.MILLISECONDS, timer);
		sysout("\nAlpha2:" + nome + "eu sou o lider do clã darkweb, eu me chamo HAL9000!!!", TimeUnit.MILLISECONDS, timer);
		sysout("\n\n*Alpha2 transforma-se em HAL9000*\n\n", TimeUnit.MILLISECONDS, timer);
		sysout("\nHAL9000: Eu me aproveitei do curto circuito no HD Supremo e infectei a memória do Alpha2", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nHAL9000: Eu não te trouxe aqui para salvar Digital World, eu te trouxe aqui para destruir Digital World e tranferir minha memória para seu corpo orgânico!", TimeUnit.MILLISECONDS, timer);
		sysout("\n" + nome + ": Eu não vou deixar isso aconceter! Vamos barganhar?", TimeUnit.MILLISECONDS, timer);
		sysout("\n" + nome
				+ ": Dois desafios, se eu acertar eu ganho e você restaura a memoria do Alpha2! se eu errar fim de linha! Você ganha e tera tudo!", TimeUnit.MILLISECONDS, timer);
		sysout("\nHAL9000: Então é isso? Que os jogos comecem!!!", TimeUnit.MILLISECONDS, timer);

		// CHAMA QUESTÃO
		questao1();

		sysout("\nHAL9000: Ultima pergunta...", TimeUnit.MILLISECONDS, timer);

		// CHAMA QUESTÃO
		questao10();
		// derrotou o HAL9000

		sysout("\nHAL9000: Nãooooooooooooooo...", TimeUnit.MILLISECONDS, timer);
		sysout("\n" + nome + ": Game Over para você HAL9000!", TimeUnit.MILLISECONDS, timer);

		sysout(
				"\nAlpha2: Obrigadx " + nome + " você conseguiu derrotar o HAL9000 e consequentemente o clã darkweb!", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Agora que minha memória foi reestabelecida e o HD Supremo está em segurança, podemos proseguir com a atualização de Digital World...", TimeUnit.MILLISECONDS, timer);

		sysout(
				"\nDigital World foi atualizado, HAL9000 foi aprisionado em um pendriver, uma tecnologia absoleta e descartado em Delta-X9 um planeta isolado...", TimeUnit.MILLISECONDS, timer);
		sysout("\nO clã darkweb foi dissolvido e alguns membros fugiram para planetas e galaxias distantes...", TimeUnit.MILLISECONDS, timer);
		sysout("\nMas enquanto a ameaça existir, estaremos de olhos bem abertos!", TimeUnit.MILLISECONDS, timer);
		sysout("\n. . .", TimeUnit.MILLISECONDS, timer);
		
		tempo();
		System.out.print("\n .           ..         .           .       .           .           .\r\n");
		Thread.sleep(200);
		System.out.print("      .         .            .          .       .\r\n");
		Thread.sleep(200);
		System.out.print("            .         ..xxxxxxxxxx....               .       .             .\r\n");
		Thread.sleep(200);
		System.out.print("    .             MWMWMWWMWMWMWMWMWMWMWMWMW                       .\r\n");
		Thread.sleep(200);
		System.out.print("              IIIIMWMWMWMWMWMWMWMWMWMWMWMWMWMttii:        .           .\r\n");
		Thread.sleep(200);
		System.out.print(" .      IIYVVXMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWxx...         .           .\r\n");
		Thread.sleep(200);
		System.out.print("     IWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMWMx..\r\n");
		Thread.sleep(200);
		System.out.print("   IIWMWMWMWMWMWMWMWMWBY%ZACH%AND%OWENMWMWMWMWMWMWMWMWMWMWMWMWMx..        .\r\n");
		Thread.sleep(200);
		System.out.print("    \"\"MWMWMWMWMWM\"\"\"\"\"\"\"\".  .:..   .\"\"\"\"\"MWMWMWMWMWMWMWMWMWMWMWMWMWti.\r\n");
		Thread.sleep(200);
		System.out.print(" .     \"\"   . `  .: . :. : .  . :.  .  . . .  \"\"\"\"MWMWMWMWMWMWMWMWMWMWMWMWMti=\r\n");
		Thread.sleep(200);
		System.out.print("        . .   :` . :   .  .'.' '....xxxxx...,'. '   ' .\"\"\"YWMWMWMWMWMWMWMWMWMW+\r\n");
		Thread.sleep(200);
		System.out.print("     ; . ` .  . : . .' :  . ..XXXXXXXXXXXXXXXXXXXXx.    `     . \"YWMWMWMWMWMWMW\r\n");
		Thread.sleep(200);
		System.out.print(".    .  .  .    . .   .  ..XXXXXXXXWWWWWWWWWWWWWWWWXXXX.  .     .     \"\"\"\"\"\"\"\r\n");
		Thread.sleep(200);
		System.out.print("        ' :  : . : .  ...XXXXXWWW\"   W88N88@888888WWWWWXX.   .   .       . .\r\n");
		Thread.sleep(200);
		System.out.print("   . ' .    . :   ...XXXXXXWWW\"    M88N88GGGGGG888^8M \"WMBX.          .   ..  :\r\n");
		Thread.sleep(200);
		System.out.print("         :     ..XXXXXXXXWWW\"     M88888WWRWWWMW8oo88M   WWMX.     .    :    .\r\n");
		Thread.sleep(200);
		System.out.print("           \"XXXXXXXXXXXXWW\"       WN8888WWWWW  W8@@@8M    BMBRX.         .  : :\r\n");
		Thread.sleep(200);
		System.out.print("  .       XXXXXXXX=MMWW\":  .      W8N888WWWWWWWW88888W      XRBRXX.  .       .\r\n");
		Thread.sleep(200);
		System.out.print("     ....  \"\"XXXXXMM::::. .        W8@889WWWWWM8@8N8W      . . :RRXx.    .\r\n");
		Thread.sleep(200);
		System.out.print("         ``...'''  MMM::.:.  .      W888N89999888@8W      . . ::::\"RXV    .  :\r\n");
		Thread.sleep(200);
		System.out.print(" .       ..'''''      MMMm::.  .      WW888N88888WW     .  . mmMMMMMRXx\r\n");
		Thread.sleep(200);
		System.out.print("      ..' .            \"\"MMmm .  .       WWWWWWW   . :. :,miMM\"\"\"  : \"\"`    .\r\n");
		Thread.sleep(200);
		System.out.print("   .                .       \"\"MMMMmm . .  .  .   ._,mMMMM\"\"\"  :  ' .  :\r\n");
		Thread.sleep(200);
		System.out.print("               .                  \"\"MMMMMMMMMMMMM\"\"\" .  : . '   .        .\r\n");
		Thread.sleep(200);
		System.out.print("          .              .     .    .                      .         .\r\n");
		Thread.sleep(200);
		System.out.print(".                                         .          .         .\r\n");
		Thread.sleep(200);
		System.out.print("\r\n");
		Thread.sleep(200);
		System.out.print("\n");
		tempo();

		sysout("\n. . .", TimeUnit.MILLISECONDS, timer);
		sysout("\nMusica final >>> Moby - Porcelain: https://youtu.be/13EifDb4GYs", TimeUnit.MILLISECONDS, timer);
		

	}

	public static void jogar() throws InterruptedException {
		tempo();
		System.out.println();
		sysout("\nInsira seu nome para se conectar ao mundo de Digital World:  ", TimeUnit.MILLISECONDS, timer);
		nomeUsuario();
		tempo();
		sysout("\nL O A D I N G  . . .\n", TimeUnit.MILLISECONDS, 30);
		tempo();
		tempo();
		Thread.sleep(200);
		System.out.print("\n~+\r\n");
		Thread.sleep(200);
		System.out.print("\r\n");
		Thread.sleep(200);
		System.out.print("                 *       +\r\n");
		Thread.sleep(200);
		System.out.print("           '                  |\r\n");
		Thread.sleep(200);
		System.out.print("       ()    .-.,=\\\"``\\\"=.    - o -\r\n");
		Thread.sleep(200);
		System.out.print("             '=/_       \\\\     |\r\n");
		Thread.sleep(200);
		System.out.print("          *   |  '=._    |\r\n");
		Thread.sleep(200);
		System.out.print("               \\\\     `=./`,        '\r\n");
		Thread.sleep(200);
		System.out.print("            .   '=.__.=' `='      *\r\n");
		Thread.sleep(200);
		System.out.print("   +                         +\r\n");
		Thread.sleep(200);
		System.out.print("        O      *        '       .\r\n");
		tempo();

		sysout(
				"\nAlpha2: Olá " + nome + ", seja bem-vindo a Digital World!", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Eu sou uma inteligência artificial e responsável por manter a ordem e o planeta atualizado e conectado!", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Nosso planeta está em perigo, o clã darkweb roubou o HD supremo da grande CPU e precisamos da sua ajuda para recupera-lo!!!", TimeUnit.MILLISECONDS, timer);
		sysout(
				"\nAlpha2: Antes de iniciar nossa aventura, gostaria de conhecer a história do nosso planeta?", TimeUnit.MILLISECONDS, timer);
		
		sysout("\n[1] - SIM, quero conhecer a história. | [2] - Não, iniciar aventura.\n", TimeUnit.MILLISECONDS, timer);
		boolean sair = false;
		do {
			sysout("\nQual sua escolha? ", TimeUnit.MILLISECONDS, timer);
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
		if (somaDePontos >= pontosMin) {
			finalizaWinner();
		} else if(somaDePontos <= pontosMin) {
			finalizaLoser();
		}
		System.out.println(somaDePontos);
	}

	public static void questao1() throws InterruptedException { // MATEUS CARNEIRO *ATUALIZADA*
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

		sysout("\n\nConsiderando linguagem em java, assinale a opção INCORRETA:\n", TimeUnit.MILLISECONDS, timer);

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
		somaDePontos = somaDePontos + pontosq1;
	}

	public static void questao2() throws InterruptedException { // MATEUS CARNEIRO *ATUALIZADA*
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

		sysout("\n\nIndique a opção que contém o valor final da variável após a execução do trecho de programa"
						+ "\nem Java. Considere os seguintes valores:\n", TimeUnit.MILLISECONDS, timer);

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
		somaDePontos = somaDePontos + pontosq2;
	}

	public static void questao3() throws InterruptedException { // MARCOS C. *ATUALIZADA*

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

		sysout("\n\nConsidere o programa Java a seguir:\n", TimeUnit.MILLISECONDS, timer);
		System.out.println("\n   public class Classe {\r\n"
				+ "       public static void main(String[] args) {\r\n" + "        String string = 'xyzk';\r\n"
				+ "        System.out.println(string);\r\n" + "      }\r\n" + "     }\r\n");

		sysout("\n\nEsse programa não pode ser compilado, pois :", TimeUnit.MILLISECONDS, timer);

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
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq3 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("você errou " + cont + " vezes.");
					sair = true;
				}
			}
		} while (!sair);
		somaDePontos = somaDePontos + pontosq3;
	}

	public static void questao4() throws InterruptedException { // MARCOS C. *ATUALIZADA*
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

		sysout("\nJava é uma tecnologia de desenvolvimento, sendo simultaneamente, uma\n"
				+ "linguagem e uma plataforma. Nesse contexto, apresenta-se o código a seguir.\n", TimeUnit.MILLISECONDS, timer);
				
		System.out.println("\npublic class teste {\r\n" + "\r\n" + "	public static void main(String[] args) {\r\n" + "\r\n"
				+ "for (int i = 0; i <= 4; i++) {\r\n" + "if (i == 2);\r\n" + "System.out.println(i);\r\n" + "   }\r\n"
				+ "  }\r\n" + "}\r\n");

		sysout("\n\nApós a execução, a saída gerada será:\n", TimeUnit.MILLISECONDS, timer);

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
		somaDePontos = somaDePontos + pontosq4;
	}

	public static void questao5() throws InterruptedException  { // DAIRA V. *ATUALIZADA*

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

		sysout("\n\nAssinale a alternativa correta", TimeUnit.MILLISECONDS, timer);

		sysout("\n\nUm algoritmo é:\n", TimeUnit.MILLISECONDS, timer);

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
		somaDePontos = somaDePontos + pontosq5;
	}

	public static void questao6() throws InterruptedException { // DAIARA V. PRECISA REFAZER!!!
		
		String opcao;
		sair = false;
		int cont = 0;
		int pontosq6 = 10;
		ArrayList<String> alternativa = new ArrayList<String>();
		alternativa.add(" Objetiva, lógicas e reais");
		alternativa.add(" Numéricas, literais e lógicas");
		alternativa.add(" Numericas, falsas e lógicas"); // CORRETA
		alternativa.add(" Literais, objetivas e lógica");
		alternativa.add(" Nenhuma das alternativas está correta");

		sysout("\n\nquais são os tipos de contantes existentes ? ", TimeUnit.MILLISECONDS, timer);

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

			if (alternativa.get(index).equals(" Numéricas, literais e lógicas")) {
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
		somaDePontos = somaDePontos + pontosq6;
}

	public static void questao7() throws InterruptedException { // MARCOS RIBEIRO *ATUALIZADA*

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


		sysout("\n\nRelacionado à programação de computadores, um algoritmo, seja qual for a sua"
				+ "\ncomplexidade e a linguagem de programação na qual será codificado, pode ser descrito por"
				+ "\nmeio da:\n", TimeUnit.MILLISECONDS, timer);

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
		somaDePontos = somaDePontos + pontosq7;
	}

	public static void questao8() throws InterruptedException { // MARCOS RIBEIRO *ATUALIZADA*
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

		sysout("\n\nAssinale a alternativa correta", TimeUnit.MILLISECONDS, timer);

		sysout("\n\nSão instruções tipicamente encontradas em linguagens de programação para codificar "
				+ "estruturas de repetição:\n", TimeUnit.MILLISECONDS, timer);

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
		somaDePontos = somaDePontos + pontosq8;

	}

	public static void questao9() throws InterruptedException { // ELVIS W. *ATUALIZADA*

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

		sysout("\n\nDado o código abaixo, pedimos com atenção que você observe, faça uma análise"
				+ "\ndo código, e com base nos seus conhecimentos, responda qual alternativa está correta:", TimeUnit.MILLISECONDS, timer);

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
				sair = true;
			} else {
				System.out.println("Resposta incorreta\n");
				pontosq9 -= 3;
				cont++;
				if (cont == 3) {
					System.out.println("você errou " + cont + " vezes.");
					sair = true;
				}
			}

		} while (!sair);
		somaDePontos = somaDePontos + pontosq9;
	}

	public static void questao10() throws InterruptedException { // ELVIS W. *ATUALIZADA*

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

		sysout("\n\nAssinale a alternativa correta", TimeUnit.MILLISECONDS, timer);

		sysout("\n\nDado o código abaixo, pedimos com atenção que você observe, faça uma análise"
				+ "\ndo código, e com base nos seus conhecimentos, responda qual alternativa está correta:\n", TimeUnit.MILLISECONDS, timer);

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
		somaDePontos = somaDePontos + pontosq10;
	}

	public static void finalizaWinner() throws InterruptedException { // GANHOU
		
		tempo();
		System.out.println(" _______  _______  ______    _______  _______  _______  __    _  _______ ");
		Thread.sleep(100);
		System.out.println("|       ||   _   ||    _ |  |   _   ||  _    ||       ||  |  | ||       |");
		Thread.sleep(100);
		System.out.println("|    _  ||  |_|  ||   | ||  |  |_|  || |_|   ||    ___||   |_| ||  _____|");
		Thread.sleep(100);
		System.out.println("|   |_| ||       ||   |_||_ |       ||       ||   |___ |       || |_____ ");
		Thread.sleep(100);;
		System.out.println("|    ___||       ||    __  ||       ||  _   | |    ___||  _    ||_____  |");
		Thread.sleep(100);
		System.out.println("|   |    |   _   ||   |  | ||   _   || |_|   ||   |___ | | |   | _____| |");
		Thread.sleep(100);
		System.out.println("|___|    |__| |__||___|  |_||__| |__||_______||_______||_|  |__||_______|\n	");
		
		sysout("\n\nUHHUUUUUUUULLLLLLLLLLLL, você concluiu o jogo e atingiu a pontuação necessária!!!", TimeUnit.MILLISECONDS, timer);
		sysout("\nFicamos felizes por você...  ;) ", TimeUnit.MILLISECONDS, timer);
		tempo();
		sysout("\nAgora para concluir, acesse o link da nossa Ranked:\n\n", TimeUnit.MILLISECONDS, timer);
		System.out.println("\nhttps://docs.google.com/forms/d/e/1FAIpQLSe7zFesTvPsBO8pwjj3bvx0hlGBDWTxCVwRlhJJR9kKA-xlxw/viewform?usp=sf_link");
		sysout("\n\nCopie o link acima e cole na aba do seu navegador, digite seu nome, a sua pontuação e aguarde ser divulgado.\n", TimeUnit.MILLISECONDS, timer);
		tempo();
		sysout("\n\t\tF I M", TimeUnit.MILLISECONDS, 30);
	}

	public static void finalizaLoser() throws InterruptedException { // PERDER
		tempo();
		System.out.println(" _______   _______   __   __   _______      _______   __   __   _______   ______   ");
		Thread.sleep(100);
		System.out.println("|       | |   _   | |  |_|  | |       |    |       | |  | |  | |       | |    _ |  ");
		Thread.sleep(100);
		System.out.println("|    ___| |  |_|  | |       | |    ___|    |   _   | |  |_|  | |    ___| |   | ||  ");
		Thread.sleep(100);
		System.out.println("|   | __  |       | |       | |   |___     |  | |  | |       | |   |___  |   |_||_ ");
		Thread.sleep(100);;
		System.out.println("|   ||  | |       | |       | |    ___|    |  |_|  | |       | |    ___| |    __  |");
		Thread.sleep(100);
		System.out.println("|   |_| | |   _   | | ||_|| | |   |___     |       |  |     |  |   |___  |   |  | |");
		Thread.sleep(100);
		System.out.println("|_______| |__| |__| |_|   |_| |_______|    |_______|   |___|   |_______| |___|  |_|");
		tempo();
		sysout("\n\nIIIIIIIIIIIIIIIIIHHHH DEU RUIM HEIN?! MÁS CONTINUA TENTANDO, UMA HORA VAI, CONFIA!  :') ", TimeUnit.MILLISECONDS, timer);
		sysout("\n\n\t\tF I M", TimeUnit.MILLISECONDS, 30);
	}

	public static void main(String[] args) throws InterruptedException {

		bemVindos();

		menu();

	}
}