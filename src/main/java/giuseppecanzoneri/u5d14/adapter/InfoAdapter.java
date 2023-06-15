package giuseppecanzoneri.u5d14.adapter;

import java.util.Calendar;

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

		Calendar cal = Calendar.getInstance();
		cal.setTime(info.getDataDiNascita());
		int yearOfBirth = cal.get(Calendar.YEAR);
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		return currentYear - yearOfBirth;
	}
}
