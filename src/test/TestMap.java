package test;

import java.util.HashMap;
import java.util.Map;

import model.Targa;
import model.Veicolo;

public class TestMap {

	public static void main(String[] args) {

		Map<Veicolo, Targa> veicoloTarga = new HashMap<Veicolo, Targa>();

		// istanzazione degli ogetti
		veicoloTarga.put(new Veicolo("audi", "a1"), new Targa("vv2345gg", "italiana"));
		veicoloTarga.put(new Veicolo("vw", "polo"), new Targa("rrs2bs23s", "francese"));

		Veicolo nuovoVeicolo = new Veicolo("merceds", "classe a");
		Targa nuovaTarga = new Targa("suzuki", "swift");

		veicoloTarga.put(nuovoVeicolo, nuovaTarga);

		System.out.println(veicoloTarga.containsKey(nuovoVeicolo));

		for (Map.Entry<Veicolo, Targa> mapItem : veicoloTarga.entrySet()) {
			System.out.println(mapItem);
		}

		System.out.println("stampa key" + veicoloTarga.keySet());

	}
}
