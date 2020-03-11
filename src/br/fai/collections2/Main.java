package br.fai.collections2;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private Map<String, String> mapa = new HashMap<String, String>();

	private void start() {
		adicionarItensMapa();
		exibirValorDoMapaPelaChave("SRS");
		iterarMapa();
	}

	private void adicionarItensMapa() {
		
		try {
			mapa.put("SRS", "Santa Rita do Sapucaí");
			mapa.put("PA", "Pouso Alegre");
			mapa.put("ITA", "Itajuba");
			mapa.put("ZORO", "Conceicao dos Ouros");
			mapa.put("CAXU", "Cachoeira de Minas");
		}
		catch(Exception e) {
			System.out.println("Ocorreu excessao!");
		}finally{
			System.out.println("Cheguei no finally.");
		}
	}

	private void exibirValorDoMapaPelaChave(String chave) {

		String valorDoItemDoMapa = mapa.get(chave);
		if (valorDoItemDoMapa == null || valorDoItemDoMapa.isEmpty()) {
			System.out.println("Esta chave nao esta presente no mapa: " + chave);
		} else {
			System.out.println("O valor dessa chave e: " + mapa.get(chave));
		}
	}

	private void iterarMapa() {
		System.out.println("-------");
		for (String chave : mapa.keySet()) {
			System.out.println("Chave: " + chave + " | Valor: " + mapa.get(chave));
		}
	}

}
