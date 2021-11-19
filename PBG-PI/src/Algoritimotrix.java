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
			System.out.println("\t\t\t\t	|\t3 - Créditos\t\t|");
			System.out.println("\t\t\t\t	|\t4 - Sair\t\t|");
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
				System.out.println("\nVocê selecionou a opção 3 - Créditos\n");
				creditos();
				break;

			case "4", "QUATRO":
				System.out.println("\nVocê selecionou a opção 4 - Sair");
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
				System.out.println("Opção Inválida, escolha entre 1 e 4 para selecionar uma das opções desejadas.");
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
		System.out.println("-\r\n\n\n"
				+ "            .--..--..--..--..--..--..--..--..--..--..--..--..--..--..--..--.\r\n"
				+ "           / .. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\.. \\\r\n"
				+ "           \\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/\\ \\/ /\r\n"
				+ "           \\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\\/ /\r\n"
				+ "           / /\\/ /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /`' /\\/ /\\\r\n"
				+ "          / /\\ \\/`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'`--'\\ \\/\\ \\\r\n"
				+ "          \\ \\/\\ \\                                                    /\\ \\/ /\r\n"
				+ "           \\/ /\\ \\                                                  / /\\/ /\r\n"
				+ "           / /\\/ /     ESTÁ PRONTO PARA ESTE DESAFIO GALÁTICO       \\ \\/ /\\\r\n"
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
	
 	public static void capitulo1 () {
 		
 		//[não]
 				System.out.println("- Capitulo 01 - Encontre o Oráculo\n");
 				
 				System.out.println("Alpha2: Não temos muito tempo, a próxima atualização do planeta se aproxima e sem o HD Supremo não temos como fazer o backup");
 				System.out.println("Alpha2: Sem a atualização nosso planeta se tornara obsoleto, nossos sistemas de segurança entraram em colapso e a vida em Digital World chegara ao fim!!!");
 				System.out.println("Alpha2: Encontre o Oráculo no septo sagrado e veja através do cálice celestial a localização do clã darkweb!");
 				System.out.println("Alpha2: Siga pela floresta dos Spams e tente a sorte ou vá pelo desfiladeiro codificado...");
 				
 				// escolha entre a floresta dos spams ou desfiladeiro codificado - ADICIONAR A PERGUNTA
 				
 				// >Floresta dos Spams (tente a sorte)
 				
 				//Caso escolha Floresta dos Spams:
 				System.out.println("Alhpa2: Olha só, parece que hoje é seu dia de sorte! Cuidado com os Spams!");
 				System.out.println("Alhpa2: Digite um número natural de 1 a 5 e descubra sua sorte!  "); // escolher um número de 01 á 05
 				
 				//> 1 - "Ganhe 5 pontos de experiencia e siga para o Septo Sagrado" // Essa opção add 5 pontos de experiencia e leva direto ao septo sagrado
 				//> 2 - "Vírus Mortal fim do jogo" // Mensagem "Nossa esperança termina aqui!!!" volta pro início do jogo 
 				//> 3 - "Siga para o desfiladeiro codificado" //vai ter que passar pelo desfiladeiro codificado antes de ir pro septo sagrado
 				//> 4 - "Ganhe 10 pontos de experiencia e siga para Septo Sagrado" // vai direto para o septo 
 				
 				//Caso escolha Desfiladeiro Codificado
 				System.out.println("Alpha2: No jogo da sorte a sobrevivência é uma roleta russa, bem-vindo ao Desfiladeiro Codificado!");
 				System.out.println("Alpha2: A reposta certa levara você direito ao septo sagrado, você tem três tentativas para desbloquear a passagem.");
 				// Entra uma questão:
 				// chama questão
 				//Adidionar: Parabéns, você ganhou 10 pontos de experiencia... Siga para o Septo Sagrado! 
 				
 				
 				// tem como anular os 10 pontos se ele não acertar de primeira? tipo 5 pontos e prosseguir?
 				
 				
 				System.out.println("Alpha2: Parabéns, finalmente chegamos ao septo sagrado. Não podia esperar menos de você!");
 				System.out.println("Alpha2: Encontre o Oráculo e veja através do Cálice Celestial...");
 				
 				System.out.println("Oráculo: Ora, ora... Temos um visitante, o que te traz ao septo sagrado?");
 				System.out.println("Oráculo: Espere...");
 				System.out.println("Oráculo: Eu tenho a resposta para o que você procura, mas antes preciso testar seus conhecimentos!");
 				System.out.println("Oráculo: Me responda Qual"); // Continua a questão
 				// chama questão
 				//Adicionar: Parabéns, você ganhou 05 pontos de experiencia!
 				
 				System.out.println("Oráculo: Resta algumas dúvidas, diga a resposta certa e encontre seu destino.");
 				System.out.println("Oráculo: Me responda Qual"); // Continua a questão
 				// chama questão
 				// Adicionar Parabéns, você ganhou 10 pontos de experiencia! Siga as instruções do Oráculo e encontre seu caminho
 				System.out.println("Oráculo: Siga para masmorra dos Orcs e encontrará o que procura!!!");
 	}

 	public static void capitulo2 () {
 		
 		System.out.println("- Capitulo 02- Masmorra dos Orcs 02\n");
 		
 		System.out.println("Alpha2: Pelo visto deu tudo certo com o Oráculo? Enfim a masmorra dos Orcs te espera, siga pelo caminho das pedras...");
 		System.out.println("Alpha2: Os Orcs são seres inofensivos apesar da aparência, eles habitam Digital World muito antes dos primeiros homens...");
 		System.out.println("Alpha2: Conquiste a confiança de um Orc e terá um grande aliado na batalha contra o clã darkweb ");
 		
 		System.out.println("Algumas horas de caminhada...");
 		
 		System.out.println("Alpha2: A jornada foi longa, mas aqui estamos, encontre o Líder dos Orcs o mais rápido possível");
 		
 		System.out.println("Orc Vigilante: Qual o motivo da sua visita?");
 		System.out.println(nome +": Preciso da ajuda do líder dos Orcs, o clâ darkweb roubou o hd supremo e estou em uma missão de resgate");
 	    System.out.println("Orc Vigilante: Para entrar na masmorra, preciso testar suas habilidades! "
 	    		+ "Responda corretamente para encontrar o grande o líder");
 		
 	    // entrar na questão
 	    // chamar questão
 	    // Adicionar á questão certa: Parabéns, você ganhou 10 pontos de experiencia...
 	    
 	    System.out.println("Orc Vigilante: Parabéns, o grande líder te espera, siga até a sala do trono e aguarde instruções"); 
 	    System.out.println("Lider dos Orcs: Qual o motivo da sua visita?");
 	    System.out.println(nome +": Preciso de ajuda para enfrenta o clã darkweb");
 	    System.out.println("Lider dos Orcs: E por qual motivo eu ajudaria?");
 	    System.out.println(nome +": O grande Oráculo me enviou até aqui\"");
 	    System.out.println("Lider dos Orcs: O grande Oráculo? Aquele que tudo vê e tudo sabe? Vejamos, antes de enviar um Orc nessa jornada, me responda...");
 	  
 	   // entrar na questão
 	   // chamar questão
 	   // Adicionar á questão certa: Parabéns, você ganhou 10 pontos de experiencia! Siga as instruções do Orc e encontre seu caminho 
 	    
 	    System.out.println("Lider dos Orcs: Parabéns você provou ter bastante conhecimento, leve Akin! Um dos Orcs da minha guarda pessoal, ele lhe será bastante útil");
 	    System.out.println("Lider dos Orcs: Siga pela trilha de Kharkiv e encontrara o clã darkweb...");
    		
 	}
 
 	public static void capitulo3 () {
 		
 		System.out.println("- Capítulo 03 - Caminho de Kharkiv\n");
 		
 		System.out.println("Alpha2: A grande atualização se aproxima e junto com ela o destino de Digital World! Siga pela trilha de Kharkiv, Akin será bastante útil!");
 		System.out.println("Alpha2: Na metade da trilha, encontro a  Bruxa da Floresta e ela irá te guiar até o clã darkweb");
 		
 		System.out.println("Algumas horas de caminhada...");
 		
 		System.out.println("Bruxa da Floresta: Ora, ora… O que temos por aqui? estão perdidos?");
 		System.out.println(nome +": Estamos procurando o clã darkweb…");
 		System.out.println("Bruxa da Floresta: Vejamos, existem dois caminhos possíveis, um levará ao penhasco do grito e outro ao acampamento do clã darkweb.");
 		System.out.println("Responda duas perguntas se acertar irei lhe mostrar o caminho que tanto procura…");
 		
 		// entrar na questão
 	    // chamar questão
 	    // Adicionar á questão certa: Parabéns, você ganhou 10 pontos de experiencia...
 		
 		System.out.println("Bruxa da Floresta: Parece que temos um sabe tudo aqui, vamos para a última pergunta…");
 		
 	    // entrar na questão
 	    // chamar questão
 	    // Adicionar á questão certa: Parabéns, você ganhou 10 pontos de experiencia...
 		
 		//*errar a pergunta ele vai para o penhasco do grito e volta pro inicio do jogo
 		//** acertar a pergunta ela pega a informação que queria e segue para o acampamento do clã dark web
 		
 		System.out.println("Bruxa da Floresta: Siga pela esquerda, o acampamento do clã darkweb não está muito longe…");
 		
 		System.out.println("Alpha2: Ufa, pensei que não iriam conseguir, estamos quase lá…");
 		System.out.println("Alpha2: Assim que chegarem ao acampamento se dirijam ao guarda da portaria, digam que querem se juntar ao clã e ele colocará vocês para dentro");
 		
 		System.out.println("Guarda da Portaria: O que fazem aqui? Perderam alguma coisa?");
 		System.out.println(nome +": Viemos nos juntar ao clã darkweb…");
 		System.out.println("Guarda da Portaria: Preciso testar suas habilidades, se provarem sua capacidade eu deixo vocês passarem e se juntarem ao clã darkweb…");
 	
 		// entrar na questão
 	    // chamar questão
 	    // Adicionar á questão certa: Parabéns, você ganhou 10 pontos de experiencia...
 		
 		System.out.println("Guarda da Portaria: Sejam bem vindos ao clã darkweb…");
 		
 		System.out.println("Alpha2: Agora que estamos dentro vocês precisam se separar, Akin deverá seguir para o alojamento e trancar as portas...");
 		System.out.println("Alpha2: E o " + nome + " deverá seguir para sala das conquistas e enfrentar o líder do clã darkweb…");
 		System.out.println("Alpha2: A única forma de vencer e recuperar o HD Supremo é derrotando o lider do clã darkweb!");
 		System.out.println("Alpha2: Boa sorte em sua última missão!!!");
 			
 		
 	}

 	public static void capitulo4 () {
 		
 		System.out.println("- Capítulo 04 - Ultimato\n");
 		
 		System.out.println("Entrando na sala das conquistas um segredo é revelado...");
 		
 		System.out.println(nome +": Alpha2, eu não consigo entender! A sala está vazia!!! Onde está o Lider do Clã?");
 		System.out.println("Alpha2: Você ainda não percebeu?");
 		System.out.println("Alpha2: Após o final das guerras galácticas, foi decidido que a memória do lider do clã darkweb seria armazenada em Digital World no Grande HD Supremo...");
 		System.out.println("Alpha2: Houve um corte aprubto de energia causado por uma tempestade solar ocasionando um curto no HD Supremo");
 		System.out.println("Alpha2:" + nome + "eu sou o lider do clã darkweb, eu me chamo HAL9000!!!");
 		System.out.println("HAL9000: Eu me aproveitei do curto circuito no HD Supremo e infectei a memória do Alpha2");
 		System.out.println("HAL9000: Eu não te trouxe aqui para salvar Digital World, eu te trouxe aqui para destruir Digital World e tranferir minha memória para seu corpo organico!");
 		System.out.println(nome + ": Eu não vou deixar isso aconceter! Vamos barganhar?");
 		System.out.println(nome + ": Duas perguntas, se eu acertar eu ganho e você restaura a memoria do Alpha2, se eu errar fim de linha! Você ganha e tera tudo!");
 		System.out.println("HAL9000: Então é isso? Que os jogos comecem!!!");
 		
 	    // entrar na questão
 	    // chamar questão
 	    // Adicionar á questão certa: Parabéns, você ganhou 10 pontos de experiencia...
 		
 		System.out.println("HAL9000: Ultima pergunta...");
 		
 		// entrar na questão
 	    // chamar questão
 	    // Adicionar á questão certa: Parabéns, você ganhou 10 pontos de experiencia e derrotou o HAL9000
 		
 		System.out.println("HAL9000: Nãooooooooooooooo...");
 		System.out.println(nome + ": Game Over para você HAL9000!");
 		
 		System.out.println("Alpha2: Obrigadx " + nome + " você conseguil derrotar o HALL9000 e consequentimente o clã darkweb!");
 		System.out.println("Alpha2: Agora que minha memória foi reestabelecida e o HD Supremo está em segurança, podemos proseguir com a atualização de Digital World...");
 		
 		System.out.println("Digital World foi atualizado, HAL9000 foi aprisionado em um pendriver, uma tecnologia absoleta e descartado em Delta-X9 um planeta lixão...");
 		System.out.println("O clã darkweb foi dissolvido e alguns membros fugiram para planetas e galaxias distantes...");
 		System.out.println("Mas enquanto a ameaça existir, estaremos de olhos bem abertos!");
 		
 	
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
		
		System.out.println("Alpha2: Olá nobre <" + nome + ">, seja bem-vindo ao Digital World eu sou uma inteligência artificial");
		System.out.println("Alpha2: Nosso mundo está em perigo, o clã darkweb roubou o HD supremo da grande CPU e precisamos da sua ajuda para recupera-lo!!!");
		System.out.println("Alpha2: Antes de iniciar nossa aventura, gostaria de conhecer a história do nosso mundo?");
		
		// Adicionar função: [1] - Sim (mostra história e parte pro capitulo1) ou [2] - não (Pula pro capitulo)
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

	public static void questao6 () {
		//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste, Calcular e escrever o valor do novo salário.
		
				System.out.println("digite o ano que deseja ser verificado");
				int ano = entrada.nextInt();

				if (ano % 400 == 0 && ano % 4 == 0) {
					System.out.println("ano bissexto!");

				} else if (ano % 100 != 0) {
					System.out.println();
					System.out.println("o ano não é bissexto!");

				}
	}
	
	public static void questao7 () { //Marcos Ribeiro

		System.out.println("Assinale a alternativa correta");
		System.out.println("Relacionado à programação de computadores, um algoritmo, seja qual for a sua\r\n"
				+ "complexidade e a linguagem de programação na qual será codificado, pode ser descrito por\r\n"
				+ "meio da");
		

		System.out.println(" (a) reografia");
		System.out.println(" (b) criptografia");
		System.out.println(" (c) linguagem de marcação");
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
			System.out.println(" (e) Parabéns alternativa correta!!!");
			break;
			
		default:
			System.out.println("Alternativa incorreta!!!");
			

		}
	}

	public static void questao8 () { //Marcos Ribeiro

		System.out.println("Assinale a alternativa correta");
		System.out.println("São instruções tipicamente encontradas em linguagens de programação para codificar\r\n"
				+ "estruturas de repetição:: ");

		System.out.println(" (a) for, while, repeat");
		System.out.println(" (b) repeat, case, for");
		System.out.println(" (c) while, if, until");
		System.out.println(" (d) for, until, case");
		System.out.println(" (e)Nenhuma das alternativas está correta\n");
		System.out.println("Digite sua resposta: \n");
		String algoritmo = entrada.next();

		switch (algoritmo) {
		case "a":
			System.out.println(" (a) Parabéns alternativa correta!!!");
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
    
	public static void questaostring()throws InterruptedException {
		
		String alt[] = { "A) ", "B) ", "C) ", "D) ", "E) " };
			int cont1 = 0, pontos1 =	 0;
				// DECLARAÇÃO ARRAYLIST DAS ALTERNATIVAS DA QUESTÃO 3 
				
				ArrayList<String> questao3 = new ArrayList<String>();
				
				questao3.add(" Variáveis não podem ser nomeadas com a palavra “string”.");
				questao3.add(" O método main não pode ser declarado como “static”.");
				questao3.add(" Cadeias de caracteres devem ser delimitadas por aspas duplas.");
				questao3.add(" Não foi especificado um valor de retorno para o método.");
				questao3.add(" O método main não pode ser declarado como “public”.");

				// DECLARAÇÃO LÓGICA PARA SAÍDA DO PRIMEIRO LAÇO
				boolean sair3 = false;
				// SEGUNDA QUESTÃO
				System.out
				.println("===========================================================================================");
		System.out.println(" QUESTÃO 3 -\"Considere o programa Java a seguir:\\r\\n\"");
		System.out.println("==========================================================================================="						
						// CÓDIGO PARA ANALISAR E RESPONDER A QUESTÃO
						+ "  \n public class Classe {\r\n"
						+ "       public static void main(String[] args) {\r\n"
						+ "        String string = 'xyzk';\r\n"
						+ "        System.out.println(string);\r\n"
						+ "      }\r\n"
						+ "     }\r\n"
						+ "\nEsse programa não pode ser compilado, pois :");

				// LAÇO DO / WHILE
				do {
					System.out.println("===========================================================================================");
					// ALTERNATIVAS DA TERCEIRA QUESTÃO
					Collections.shuffle(questao3);
					System.out.println();
					System.out.println(alt[0] + questao3.get(0));
					System.out.println(alt[1] + questao3.get(1));
					System.out.println(alt[2] + questao3.get(2));
					System.out.println(alt[3] + questao3.get(3));
					System.out.println(alt[4] + questao3.get(4));
					// ENTRADA DO USUÁRIO PARA RESPOSTA
					System.out.println("\nDigite sua resposta: ");
					String resposta = entrada.next();
					int index = 0, erro = 3;
					// ESTRUTURA DE DECISÃO SWITCH
					switch (resposta.toUpperCase()) {
					// RESPOSTAS
					case "A":
						index = 0;
						if (questao3.get(index)
								.equals(" Cadeias de caracteres devem ser delimitadas por aspas duplas.")) {
							System.out.println("\nResposta correta, parabéns.");
							System.out.println("Você ganhou 2 pontos.\n");
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
							System.out.println("\nResposta correta, parabéns.");
							System.out.println("Você ganhou 2 pontos.\n");
							// pontos1 = pontos1 + 2;
							sair3 = true;
						} else
							System.out.println("\nResposta incorreta, tente novamente.\n");
						cont1++;
						break;
					case "C":
						index = 2;
						if (questao3.get(index).equals(" Cadeias de caracteres devem ser delimitadas por aspas duplas.")) {
							System.out.println("\nResposta correta, parabéns.");
							System.out.println("Você ganhou 2 pontos.\n");
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
							System.out.println("\nResposta correta, parabéns.");
							System.out.println("Você ganhou 2 pontos.\n");
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
							System.out.println("\nResposta correta, parabéns.");
							System.out.println("Você ganhou 2 pontos.\n");
							// pontos1 = pontos1 + 2;
							sair3 = true;
						} else
							System.out.println("\nResposta incorreta, tente novamente.\n");
						cont1++;
						break;
					default:
						System.out.println("\nOpção inválida, digite entre A, B, C D ou E"); // OPÇÃO INVÁLIDA
					}

					if (cont1 == erro) {
						System.out.println("Você execedeu o máximo de tentativas, foram " + cont1 + " tentativas.");
						System.out.println(
								"Você perdeu 2 pontos. Vamos te passar para a próxima questão e lá você poderá se recuperar no jogo.\n");
						// pontos1 = pontos1 - 2;
						sair3 = true;
					}
				} while (!sair3);

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