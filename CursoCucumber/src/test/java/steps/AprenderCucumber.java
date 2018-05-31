package steps;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {

	// **********///
	@Dado("^que criei o arquivo corretamente$")
	public void que_criei_o_arquivo_corretamente() throws Throwable {

	}

	@Quando("^execula-lo$")
	public void execula_lo() throws Throwable {

	}

	@Entao("^a especificacao deve finalizar com sucesso$")
	public void a_especificacao_deve_finalizar_com_sucesso() throws Throwable {

	}

	@Entao("^outro passo qualquer coisa$")
	public void outroPassoQualquerCoisa() throws Throwable {

	}

	// Cenario Contador
	private int contador = 0;

	@Dado("^que o valor do contador ? (\\d+)$")
	public void queOValorDoContador(int arg1) throws Throwable {

		contador = arg1;
	}

	@Quando("^eu incrementar em (\\d+)$")
	public void eu_incrementar_em(int arg1) throws Throwable {

		contador = contador + arg1;

	}

	@Entao("^o valor de contador ? (\\d+)$")
	public void oValorDeContador(int arg1) throws Throwable {

		Assert.assertEquals(arg1, contador);

		// throw new RuntimeException() ;
	}

	// Data de entrega

	Date entrega = new Date();

	@Dado("^que a entrega e dia (\\d+)/(\\d+)/(\\d+)$")
	public void queAEntregaEDia(int dia, int mes, int ano) throws Throwable {

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, dia);
		cal.set(Calendar.MONTH, mes - 1);
		cal.set(Calendar.YEAR, ano);
		entrega = cal.getTime();
 
	}

	@Quando("^a entrega atrasar em (\\d+)(dia|dias|mes|meses|)$")
	public void aEntregaAtrasarEmDias(int arg1, String tempo) throws Throwable {

		Calendar cal = Calendar.getInstance();
		cal.setTime(entrega);
		if (tempo.equals("dias")) {
			cal.add(Calendar.DAY_OF_MONTH, arg1);

		}

		if (tempo.equals("meses")) {
			cal.add(Calendar.MONTH, arg1);

		}

		entrega = cal.getTime();

	}

	@Entao("^a entrega sera efetuada em (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void aEntregaSeraEfetuadaEm(String data) throws Throwable {

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataFormatada = format.format(entrega);
		Assert.assertEquals(data, dataFormatada);

	}

}
