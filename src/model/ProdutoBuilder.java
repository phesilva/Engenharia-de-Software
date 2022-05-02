package model;

import model.tipos.TipoCalcados;
import model.tipos.TipoConsole;
import model.tipos.TipoStorage;
import model.tipos.TipoTamanho;

public class ProdutoBuilder {
	private Produto produto;
	
	public ProdutoBuilder() {
		this.produto = new Produto();
	}
	public static ProdutoBuilder builder() {
		return new ProdutoBuilder();
	}
	public ProdutoBuilder addNome(String nome) {
		produto.setNome(nome);
		return this;
	}
	public ProdutoBuilder addValor(Double valor) {
		produto.setValor(valor);
		return this;
	}
	public ProdutoBuilder addMarca(String marca) {
		produto.setMarca(marca);
		return this;
	}
	public ProdutoBuilder addCor(String cor) {
		produto.setCor(cor);
		return this;
	}
	public ProdutoBuilder addFabricante(String Fabricante) {
		produto.setFabricante(Fabricante);
		return this;
	}
	public ProdutoBuilder addCapacidade(int Capacidade) {
		produto.setCapacidade(Capacidade);
		return this;
	}
	public ProdutoBuilder addTamanho(TipoTamanho tamanho) {
		produto.setTamanho(tamanho);
		return this;
	}
	public ProdutoBuilder addTipoCalcados(TipoCalcados tipo) {
		produto.setCalcado(tipo);
		return this;
	}
	public ProdutoBuilder addNumeracao(int numeracao) {
		produto.setNumeracao(numeracao);
		return this;
	}
	public ProdutoBuilder addConsole(TipoConsole console) {
		produto.setConsole(console);
		return this;
	}
	public ProdutoBuilder addTipoStorage(TipoStorage storage) {
		produto.setStorage(storage);
		return this;
	}
	public Produto get() {
		return produto;
	}
}
