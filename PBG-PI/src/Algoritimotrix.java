import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Algoritimotrix {
	// VARIÁVEIS GLOBAIS
	
	static Scanner entrada = new Scanner(System.in);
	
	static boolean sair = false; // SAÍDA LAÇOS
	
	static int pontos = 0; // SOMAR PONTUAÇÃO DOS JOGADORES
	
	static int erroQuestoes = 3; // QUANTIDADE MÁXIMA DE ERRO DAS QUESTÕES
	
	static String nome = ""; // NOME DO USUÁRIO
	
	static int pontosFinais = 30;
	
	// MÉTODOS E FUNÇÕES
	public static void entradaNome() {

		System.out.println();
		System.out.print("\nInsira seu primeiro nome para sabermos quem você é, e dar início à esta aventura: ");
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
			System.out.println("\t\t\t\t	|\t2 - Instruções\t\t|");
			System.out.println("\t\t\t\t	|\t3 - História do jogo\t|");
			System.out.println("\t\t\t\t	|\t4 - Créditos\t\t|");
			System.out.println("\t\t\t\t	|\t5 - Sair\t\t|");
			System.out.println("\t\t\t\t	|\t\t\t	|");
			System.out.println("                                	'= = = = = = = = = = = = = = = ='");

			System.out.printf("Informe a opção: ");
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
				System.out.println("\nVocê selecionou a opção 3 - História do Jogo\n");
				historia();
				break;

			case "4", "QUATRO":
				System.out.println("\nVocê selecionou a opção 4 - Créditos\n");
				creditos();
				break;

			case "5", "CINCO":
				System.out.println("\nVocê selecionou a opção 5 - Sair");
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
				System.out.println("Opção Inválida, escolha entre 1 e 5 para selecionar uma das opções desejadas.");
			}

		} while (!saida);

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

	public static void instrucoes() throws InterruptedException {
		tempo();
		System.out.println("\n\t\t\tBem - vindo ao manual do jogo!");
		Thread.sleep(500);
		System.out.println("\nO jogo será jogado da seguinte maneira: O usuário ao iniciar o ALGORITMOTRIX terá que escolher");
		Thread.sleep(500);
		System.out.println("\num personagem para seguir o andamento do jogo, cada personagem tem um contexto e segue uma história, ");
		Thread.sleep(500);
		System.out.println("\ne consequentemente essa história se desenvolve durante a partida.");
		Thread.sleep(500);
		System.out.println("\nO jogo terá resumidamente: Uma história, uma estrutura de 10 questões relacionadas com a disciplina");
		Thread.sleep(500);
		System.out.println("\nde Algoritmos, pontos para acumular e ranked de jogadores.");
		Thread.sleep(500);
		System.out.println("\nQUESTÕES: deverão ser respondidas de acordo com as alternativas - A), B), C), D) ou E), portanto");
		Thread.sleep(500);
		System.out.println("\no usuário só irá selecionar a letra da alternativa desejada como resposta.");
		Thread.sleep(500);
		System.out.println("\nPONTUAÇÃO: dada uma questão, se respondida corretamente o usuário soma 2 pontos, e se respondida");
		Thread.sleep(500);
		System.out.println("\nincorretamente, perde 2 pontos.");
		Thread.sleep(500);
		System.out.println("\nAo final será somado o total de pontos que o usuário conseguiu ao decorrer do jogo, se bater a meta de ");
		Thread.sleep(500);
		System.out.println("\npontuação, o usuário alcança o objetivo do jogo dentro da história montada e poderá ser incluso à um ranked.");
		Thread.sleep(500);
		System.out.println("\nCaso não bata a meta de pontuação: \"G A M E  O V E R\".");
		Thread.sleep(500);
		System.out.println("\nRANKED: através de um link o usuário poderá incluir o nome e a pontuação que fez, depois iremos");
		Thread.sleep(500);
		System.out.println("\ndivulgar os resultados e os melhores jogadores.");
	}

	public static void historia() throws InterruptedException {
		System.out.println(
				"\n\t------------------------------- BEM-VINDOS À DIGITAL WORLD -------------------------------\n");
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
				"    |	DIGITAL WORLD é um planeta totalmente digital e conectado que fica localizado na galáxia A23.		|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    “Somos um povo multicultural, falamos diversas linguagens de programação e estamos em constante	|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    desenvolvimento. Nosso planeta participou das guerras galácticas e conseguimos frear o avanço do	|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    império dark, que tinham como missão acabar com o avanço tecnológico e impor dominação sobre		|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println("    |    mundos, galáxias e povos!”                        							|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    A grande CPU é responsável por guardar o HD supremo que é responsável por armazenar todos		|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    os dados e informações do nosso planeta desde muito antes dos antigos povos de Gaia a fim		|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    de garantir o backup para que possamos passar por atualizações e manutenções com segurança.		|.");
		Thread.sleep(500);
		System.out.println("    |\t\t\t\t\t\t\t\t\t\t\t\t\t\t|.");
		Thread.sleep(500);
		System.out.println(
				"    |    Sem o HD Supremo fica inviável manter o planeta atualizado e a vida em digital world acaba.		|.");
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
		System.out.println("\n\t\t\t\t VOCÊ ESTÁ REALMENTE PRONTO PARA ESTE DESAFIO?\n");
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
			System.out.println("\nVocê selecionou o PERSONAGEM 1 - RODEBERTHIX DO PLANETA GOLDBERTH");
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
			System.out.println("\nVocê selecionou o PERSONAGEM 2 - BREACHIX DO PLANETA SILVERSPOCKET");
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
			System.out.println("\nVocê selecionou o PERSONAGEM 3 - ELISABETHIX DO PLANETA COPPER MAX");
			sair = true;
			break;
			default:
			System.out.println("\nFavor selecionar opção correta, digite entre 1, 2 e 3.");
			
		}
		} while (!sair);
		
	}

	public static void vilao () throws InterruptedException {
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
				+ "               /::||\r\n"
				+ "              /:::/\r\n"
				+ "             //;;'\r\n"
				+ "             `-'\r\n"
				+ "\n");
		tempo();
		System.out.println("\nEste é GARTH DO PLANETA MIRACULOUS, o vilão mais maldoso da GALÁXIA e quer destruir"
				+ "\ntodos os planetas de toda a Galáxia, é ele quem devemos deter e isso não será uma tarefa fácil!\n");
	}
	
 	public static void nomeEscolhaPersonagem () throws InterruptedException {
 		
 		entradaNome();
		
		System.out.println("\nOlá " + nome + ", já vamos dar início ao desafio, más antes...");
			System.out.println("selecione o personagem que você mais se identifique rsrs ...\n");
			personagens();
			
			vilao();
	}
	
	public static void jogar() throws InterruptedException {
		nomeEscolhaPersonagem();
		tempo();
		tempo();
		System.out.println("\nL O A D I N G  . . .\n");
		System.out.println("\nATENÇÃO, ESTAMOS ENTRANDO EM DIGITAL WORLD . . .");
		tempo();
		System.out.println("\nPERMISSÃO PARA ENTRAR NA GALÁXIA A23!\n");
		tempo();
		System.out.println("\nA G U A R D A N D O   P E R M I S S Ã O . . .\n");
		tempo();
		tempo();
		System.out.println("\n\t\t\t			PERMISSÃO CONCEDIDA\n" + "\n\t\t\t		                 _..._\r\n"
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
		
		System.out.println("\nOLÁ " + nome + ", SEJA BEM-VINDO À GALÁXIA A23!!!");

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

		// DECLARAÇÃO VARIÁVEL STRING EM VETOR (ALTERNATIVAS)
		String alt[] = { "A) ", "B) ", "C) ", "D) ", "E) " };
		int cont = 0;
		// DECLARAÇÃO ARRAYLIST DAS ALTERNATIVAS DA QUESTÃO 1
		ArrayList<String> questao1 = new ArrayList<String>();
		questao1.add("Enquanto N for menor que 10, a condição booleana será TRUE e vai sair do laço repetitivo.");
		questao1.add("Quando N for maior que 10, a condição booleana será !TRUE e ele saíra do laço repetitivo.");
		questao1.add("Esse código não irá funcionar, pois tem um erro.");
		questao1.add("N.D.A.");
		questao1.add("Se N for maior ou igual a 10, a condição booleana será TRUE e ele sairá do laço repetitivo."); // CORRETA
		// DECLARAÇÃO LÓGICA PARA SAÍDA DO PRIMEIRO LAÇO
		boolean sair1 = false;
		Thread.sleep(2000);
		System.out.println("\nPROJETO INTEGRADOR - JOGO RPG ELETRÔNICO");
		System.out.println("\n\t\t\t\tQUESTIONÁRIO ALGORITMOTRIX");
		// PRIMEIRA QUESTÃO
		System.out
				.println("===========================================================================================");
		System.out.println("QUESTÃO 1 - Dado o código abaixo, pedimos com atenção que você observe, faça uma análise"
				+ " do\ncódigo, e com base nos seus conhecimentos, responda qual alternativa está correta:");
		System.out
				.println("===========================================================================================");
		// CÓDIGO PARA ANALISAR E RESPONDER A QUESTÃO
		System.out.println("\npublic static void main(String[] args) {\r\n" + "\n	boolean sair = false;\r\n"
				+ "	int n, i = 1;\r\n" + "		 \r\n" + "	do {\r\n"
				+ "	     System.out.println(\"Digite n\" + i + \": \");\r\n" + "	     n = entrada.nextInt();\r\n"
				+ "	     i++;\r\n" + "\r\n" + "	     if (n >= 10) {\r\n"
				+ "	         System.out.println(\"\\nO número digitado é igual ou maior que 10.\");\r\n"
				+ "	         sair = true;	\r\n" + "	         break;\r\n" + "	     }	 \r\n"
				+ "	 } while (true);\n");
		// LAÇO DO / WHILE
		do {
			System.out.println(
					"===========================================================================================");
			// ALTERNATIVAS DA PRIMEIRA QUESTÃO
			Collections.shuffle(questao1);
			System.out.println("");
			System.out.println(alt[0] + questao1.get(0));
			System.out.println(alt[1] + questao1.get(1));
			System.out.println(alt[2] + questao1.get(2));
			System.out.println(alt[3] + questao1.get(3));
			System.out.println(alt[4] + questao1.get(4));
			// ENTRADA DO USUÁRIO PARA RESPOSTA
			System.out.println("\nDigite sua resposta: ");
			String resposta = entrada.next();
			int index = 0;
			// ESTRUTURA DE DECISÃO SWITCH
			switch (resposta.toUpperCase()) {
			// RESPOSTAS
			case "A":
				index = 0;
				if (questao1.get(index).equals(
						"Se N for maior ou igual a 10, a condição booleana será TRUE e ele sairá do laço repetitivo.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa questão você fez, " + pontos + " pontos.\n");
					sair1 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "B":
				index = 1;
				if (questao1.get(index).equals(
						"Se N for maior ou igual a 10, a condição booleana será TRUE e ele sairá do laço repetitivo.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa questão você fez, " + pontos + " pontos.\n");
					sair1 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "C":
				index = 2;
				if (questao1.get(index).equals(
						"Se N for maior ou igual a 10, a condição booleana será TRUE e ele sairá do laço repetitivo.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa questão você fez, " + pontos + " pontos.\n");
					sair1 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "D":
				index = 3;
				if (questao1.get(index).equals(
						"Se N for maior ou igual a 10, a condição booleana será TRUE e ele sairá do laço repetitivo.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa questão você fez, " + pontos + " pontos.\n");
					sair1 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "E":
				index = 4;
				if (questao1.get(index).equals(
						"Se N for maior ou igual a 10, a condição booleana será TRUE e ele sairá do laço repetitivo.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa questão você fez, " + pontos + " pontos.\n");
					sair1 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			default:
				System.out.println("\nOpção inválida, digite entre A, B, C D ou E"); // OPÇÃO INVÁLIDA
			}	
			if (cont == erroQuestoes) {
					System.out.println("Você execedeu o máximo de tentativas, foram " + cont + " tentativas.\n");
					System.out.println(
							"Você perdeu " + erroQuestoes + " pontos. Vamos te passar para a próxima questão e lá você poderá se recuperar no jogo.\n");
					sair1 = true;
				}

		} while (!sair1);
	}

	public static void questao5 () {

				System.out.println("Assinale a alternativa correta");
				System.out.println("Um algoritmo é: \n");

				System.out.println(" (a)Uma sequência não lógica e infinita");
				System.out.println(" (b)Uma sequência lógica e finita ");
				System.out.println(" (c)Uma sequência lógica e infinita");
				System.out.println(" (d)Uma sequência variavel");
				System.out.println(" (e)Nenhuma das alternativas está correta\n");
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
					System.out.println(" (c) Parabéns alternativa correta!! ");
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
		// DECLARAÇÃO ARRAYLIST DAS ALTERNATIVAS DA QUESTÃO 2
		ArrayList<String> questao2 = new ArrayList<String>();
		questao2.add("Enquanto n for igual à 100, o laço só vai parar quando x for igual à 100.");
		questao2.add("O laço vai se repitir, porém quando x for igual à 88, ele vai parar."); // CORRETA
		questao2.add("Este laço é um laço Do/While e não um laço For.");
		questao2.add("O laço vai imprimir de 0 até 100 e quando chegar em 88 vai repetir tudo denovo.");
		questao2.add("N.D.A.");
		// DECLARAÇÃO LÓGICA PARA SAÍDA DO PRIMEIRO LAÇO
		boolean sair2 = false;
		// SEGUNDA QUESTÃO
		System.out
				.println("===========================================================================================");
		System.out.println("QUESTÃO 2 - Dado o código abaixo, pedimos com atenção que você observe, faça uma análise\n"
				+ "do código, e com base nos seus conhecimentos, responda qual alternativa está correta:");
		System.out
				.println("===========================================================================================");
		// CÓDIGO PARA ANALISAR E RESPONDER A QUESTÃO
		System.out.println("\n	public static void main(String[] args) {\r\n" + "	\n	int n = 100;\r\n"
				+ "		\r\n" + "\n		for (int x = 0; x <= n; x++) {\r\n" + "			System.out.println(x);\r\n"
				+ "			if (x == 88) {\r\n" + "			break;\r\n" + "			}\r\n" + "		}\n");
		// LAÇO DO / WHILE
		do {
			System.out.println(
					"===========================================================================================");
			// ALTERNATIVAS DA SEGUNDA QUESTÃO
			Collections.shuffle(questao2);
			System.out.println();
			System.out.println(alt[0] + questao2.get(0));
			System.out.println(alt[1] + questao2.get(1));
			System.out.println(alt[2] + questao2.get(2));
			System.out.println(alt[3] + questao2.get(3));
			System.out.println(alt[4] + questao2.get(4));
			// ENTRADA DO USUÁRIO PARA RESPOSTA
			System.out.println("\nDigite sua resposta: ");
			String resposta = entrada.next();
			int index = 0;
			// ESTRUTURA DE DECISÃO SWITCH
			switch (resposta.toUpperCase()) {
			// RESPOSTAS
			case "A":
				index = 0;
				if (questao2.get(index)
						.equals("O laço vai se repitir, porém quando x for igual à 88, ele vai parar.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa questão você fez, " + pontos + " pontos.\n");
					sair2 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "B":
				index = 1;
				if (questao2.get(index)
						.equals("O laço vai se repitir, porém quando x for igual à 88, ele vai parar.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa questão você fez, " + pontos + " pontos.\n");
					sair2 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "C":
				index = 2;
				if (questao2.get(index)
						.equals("O laço vai se repitir, porém quando x for igual à 88, ele vai parar.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa questão você fez, " + pontos + " pontos.\n");
					sair2 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "D":
				index = 3;
				if (questao2.get(index)
						.equals("O laço vai se repitir, porém quando x for igual à 88, ele vai parar.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa questão você fez, " + pontos + " pontos.\n");
					sair2 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			case "E":
				index = 4;
				if (questao2.get(index)
						.equals("O laço vai se repitir, porém quando x for igual à 88, ele vai parar.")) {
					System.out.println("\nResposta correta.\n");
					pontos = pontos + 3;
					System.out.println("Nessa questão você fez, " + pontos + " pontos.\n");
					sair2 = true;
				} else
					System.out.println("\nResposta incorreta, tente novamente.\n");
				pontos = pontos - 1;
				cont++;
				break;
			default:
				System.out.println("\nOpção inválida, digite entre A, B, C D ou E"); // OPÇÃO INVÁLIDA
			}
			if (cont >= erroQuestoes) {
				System.out.println("Você execedeu o máximo de tentativas, foram " + cont + " tentativas.");
				System.out.println(
						"Você perdeu " + erroQuestoes + " pontos. Vamos te passar para a próxima questão e lá você poderá se recuperar no jogo.\n");
				sair2 = true;
			}

		} while (!sair2);

	}

	public static void sair() {
		System.out.println("\nVocê quer mesmo sair?");
		System.out.println("[SIM]	digite \"1\".\n" + "\n[NÃO]	digite \"2\"." + "\nResposta: ");

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
				+ "\nCopie o link acima e cole na aba do seu navegador, digite seu nome, a sua pontuação e aguarde ser divulgado.\n");
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
		System.out.println("\nIIIIIIIIIIIIIIIIIHHHH DEU RUIM HEIN?! MÁS CONTINUA TENTANDO, UMA HORA VAI, CONFIA!  :') ");
		System.out.println("\n\t\tF I M");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		bemVindos();
		
		menu();
		
	}
}