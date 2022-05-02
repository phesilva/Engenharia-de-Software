package view;

import java.util.ArrayList;

import model.Produto;
import model.ProdutoBuilder;
import model.tipos.TipoCalcados;
import model.tipos.TipoConsole;
import model.tipos.TipoStorage;
import model.tipos.TipoTamanho;

public class Principal {

	public static void main(String[] args) {
		Produto calcado = ProdutoBuilder.builder().addNumeracao(33)
												   .addCor("Azul")
												   .addTipoCalcados(TipoCalcados.TENIS)
												   .addValor(35.2).get();
		Produto calcado2 = ProdutoBuilder.builder().addNumeracao(44)
				   .addCor("Preto")
				   .addTipoCalcados(TipoCalcados.SOCIAL)
				   .addValor(154.2).get();
		Produto calcado3 = ProdutoBuilder.builder().addNumeracao(40)
				   .addCor("Branco")
				   .addTipoCalcados(TipoCalcados.TENIS)
				   .addValor(358.2).get();
		
		Produto camisetas = ProdutoBuilder.builder().addTamanho(TipoTamanho.GG)
													.addCor("Azul")
													.addMarca("Nike")
													.addValor(154.2).get();
		Produto camisetas2 = ProdutoBuilder.builder().addTamanho(TipoTamanho.P)
				.addCor("Preta")
				.addMarca("Adidas")
				.addValor(157.0).get();
		Produto camisetas3 = ProdutoBuilder.builder().addTamanho(TipoTamanho.M)
				.addCor("LILAS")
				.addMarca("NY")
				.addValor(128.4).get();
		Produto games = ProdutoBuilder.builder().addNome( "ESCAPE FROM TARKOV")
												.addConsole(TipoConsole.PLAYSTATION)
												.addValor(1545.54).get();
		Produto games2 = ProdutoBuilder.builder().addNome( "SPIDER MAN")
				.addConsole(TipoConsole.PLAYSTATION)
				.addValor(877.54).get();
		Produto games3 = ProdutoBuilder.builder().addNome( "FIFA 23")
				.addConsole(TipoConsole.XBOX)
				.addValor(250.0).get();
		Produto storage = ProdutoBuilder.builder().addTipoStorage(TipoStorage.HDD).addCapacidade(12)
												 .addFabricante("SMART")
												 .addValor(125.45).get();
		Produto storage2 = ProdutoBuilder.builder().addTipoStorage(TipoStorage.SSD).addCapacidade(150)
				 .addFabricante("KINGSTON")
				 .addValor(458.45).get();
		Produto storage3 = ProdutoBuilder.builder().addTipoStorage(TipoStorage.MSNVMe).addCapacidade(182)
				 .addFabricante("SMART")
				 .addValor(652.3).get();
		
		ArrayList<Produto> produtos = new ArrayList<>();
		
		produtos.add(calcado);
		produtos.add(calcado2);
		produtos.add(calcado3);
		produtos.add(camisetas);
		produtos.add(camisetas2);
		produtos.add(camisetas3);
		produtos.add(games);
		produtos.add(games2);
		produtos.add(games3);
		produtos.add(storage);
		produtos.add(storage2);
		produtos.add(storage3);
		
		System.out.println(produtos);
	}

}
