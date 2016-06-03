package PicoyPlaca;

import java.util.*;
import java.text.*;

public class OperacionVehiculo {

	// Verificar si Vehiculo Puede andar por Rango de Hora
	public static boolean verRango(String hora, String placa, int dia) {

		Date dDate1 = null, dDate2 = null, dDate3 = null, dDate4 = null, dDate = null;
		String sRango1 = "07:00:00", sRango2 = "09:30:00", sRango3 = "16:00:00", sRango4 = "19:30:00";
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
		//String sPlaca = placa;
		//int idia = dia;
		char[] cPlaca = placa.toCharArray();

		try {

			dDate1 = dateFormat.parse(sRango1);
			dDate2 = dateFormat.parse(sRango2);
			dDate3 = dateFormat.parse(sRango3);
			dDate4 = dateFormat.parse(sRango4);
			dDate = dateFormat.parse(hora);

		} catch (ParseException parseException) {
			parseException.printStackTrace();

		}

		if ((dia == 2
				&& (cPlaca[6] == '1' || cPlaca[6] == '2')
				&& ((dDate1.compareTo(dDate) <= 0) && (dDate2.compareTo(dDate) >= 0)) || ((dDate3
				.compareTo(dDate) <= 0) && (dDate4.compareTo(dDate) >= 0))))

			return false;

		else if ((dia == 3
				&& (cPlaca[6] == '3' || cPlaca[6] == '4')
				&& ((dDate1.compareTo(dDate) <= 0) && (dDate2.compareTo(dDate) >= 0)) || ((dDate3
				.compareTo(dDate) <= 0) && (dDate4.compareTo(dDate) >= 0))))

			return false;

		else if ((dia == 4
				&& (cPlaca[6] == '5' || cPlaca[6] == '6')
				&& ((dDate1.compareTo(dDate) <= 0) && (dDate2.compareTo(dDate) >= 0)) || ((dDate3
				.compareTo(dDate) <= 0) && (dDate4.compareTo(dDate) >= 0))))

			return false;

		else if ((dia == 5
				&& (cPlaca[6] == '7' || cPlaca[6] == '8')
				&& ((dDate1.compareTo(dDate) <= 0) && (dDate2.compareTo(dDate) >= 0)) || ((dDate3
				.compareTo(dDate) <= 0) && (dDate4.compareTo(dDate) >= 0))))

			return false;

		else if ((dia == 6
				&& (cPlaca[6] == '9' || cPlaca[6] == '0')
				&& ((dDate1.compareTo(dDate) <= 0) && (dDate2.compareTo(dDate) >= 0)) || ((dDate3
				.compareTo(dDate) <= 0) && (dDate4.compareTo(dDate) >= 0))))

			return false;

		else if (dia == 1 || dia == 7)

			return true;

		else
			return true;

	}

}
