public class testeQuestao {


	public static String resposta (String opcao)  {

		  if (opcao.equals("a") || opcao.equals("b") || opcao.equals("c")
				|| opcao.equals("d") || opcao.equals("e") || opcao.equals("A") || opcao.equals("B") || opcao.equals("C")
				|| opcao.equals("D") || opcao.equals("E")) {
			System.out.println("OK! Passou do teste.");
		} else {
			System.out.println("Oops! Deu um resultado não esperado: " + opcao);
	}
	
	return opcao;
	}
	
}
