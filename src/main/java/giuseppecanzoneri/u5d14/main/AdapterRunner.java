package giuseppecanzoneri.u5d14.main;

import java.util.Calendar;
import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import giuseppecanzoneri.u5d14.adapter.InfoAdapter;
import giuseppecanzoneri.u5d14.client.UserData;
import giuseppecanzoneri.u5d14.info.Info;

@Component
public class AdapterRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		// Creazione di un oggetto Info
		Info info = new Info();
		info.setNome("Giuseppe");
		info.setCognome("Canzoneri");

		Calendar calendar = Calendar.getInstance();
		calendar.set(2001, Calendar.JULY, 18);
		Date dataDiNascita = calendar.getTime();
		info.setDataDiNascita(dataDiNascita);

		// Creazione di un oggetto Adapter
		InfoAdapter adapter = new InfoAdapter(info);

		// Creazione di un oggetto UserData e recupero dei dati tramite l'Adapter
		UserData userData = new UserData();
		userData.getData(adapter);

		// Stampare i dati recuperati
		System.out.println("Nome completo: " + userData.getNomeCompleto());
		System.out.println("Età: " + userData.getEta());
	}
}
