package model;

public class Veicolo {

	private String marca;
	private String modello;

	public Veicolo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Veicolo(String marca, String modello) {
		super();
		this.marca = marca;
		this.modello = modello;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String toString() {
		return "veicolo [marca=" + marca + ", modello=" + modello + "]";
	}

}
