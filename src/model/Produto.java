package model;

import model.tipos.TipoCalcados;
import model.tipos.TipoConsole;
import model.tipos.TipoStorage;
import model.tipos.TipoTamanho;

public class Produto {
	private String nome;
	private Double valor;
	private String marca;
	private String cor;
	private String fabricante;
	private int capacidade;
	private int numeracao;
	private TipoConsole console;
	private TipoStorage storage;
	private TipoCalcados calcado;
	private TipoTamanho tamanho;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getNumeracao() {
		return numeracao;
	}
	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}
	public TipoConsole getConsole() {
		return console;
	}
	public void setConsole(TipoConsole console) {
		this.console = console;
	}
	public TipoStorage getStorage() {
		return storage;
	}
	public void setStorage(TipoStorage storage) {
		this.storage = storage;
	}
	public TipoCalcados getCalcado() {
		return calcado;
	}
	public void setCalcado(TipoCalcados calcado) {
		this.calcado = calcado;
	}
	public TipoTamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(TipoTamanho tamanho) {
		this.tamanho = tamanho;
	}
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor=" + valor + ", marca=" + marca + ", cor=" + cor + ", fabricante="
				+ fabricante + ", capacidade=" + capacidade + ", numeracao=" + numeracao + ", console=" + console
				+ ", storage=" + storage + ", calcado=" + calcado + ", tamanho=" + tamanho + "]";
	}
	
	
}
