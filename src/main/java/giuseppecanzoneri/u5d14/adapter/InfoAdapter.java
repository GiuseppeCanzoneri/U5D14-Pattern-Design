package giuseppecanzoneri.u5d14.adapter;

import giuseppecanzoneri.u5d14.datasource.DataSource;
import giuseppecanzoneri.u5d14.info.Info;

public class InfoAdapter implements DataSource {
	private Info info;

	public InfoAdapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {
		// Calcola l'età a partire dalla data di nascita
		// Implementazione semplificata per il calcolo dell'età
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.setTime(info.getDataDiNascita());
		int yearOfBirth = cal.get(java.util.Calendar.YEAR);
		int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
		return currentYear - yearOfBirth;
	}
}
