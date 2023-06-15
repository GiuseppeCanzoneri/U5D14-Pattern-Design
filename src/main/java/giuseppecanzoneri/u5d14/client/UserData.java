package giuseppecanzoneri.u5d14.client;

import giuseppecanzoneri.u5d14.datasource.DataSource;

public class UserData {
	private String nomeCompleto;
	private int eta;

	public void getData(DataSource ds) {
		nomeCompleto = ds.getNomeCompleto();
		eta = ds.getEta();
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public int getEta() {
		return eta;
	}
}
