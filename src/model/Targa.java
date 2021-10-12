package model;

public class Targa {

	private String numero;
	private String omologazione;

	public Targa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Targa(String numero, String nazionalita) {
		super();
		this.numero = numero;
		this.omologazione = nazionalita;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getOmologazione() {
		return omologazione;
	}

	public void setOmologazione(String nazionalita) {
		this.omologazione = nazionalita;
	}

	public String toString() {
		return "targa [numero=" + numero + ", omologazione=" + omologazione + "]";
	}

}
