package PicoyPlaca;

import java.util.*;
import java.text.*;

public class PicoPlaca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sPlaca, sFecha, sHora;

		OperacionVehiculo ope = new OperacionVehiculo();
		Validacion val = new Validacion();

		do {
			System.out
					.print("Ingrese Placa Vehiculo (7 caracteres Ejemplo GJK0143):");
			sPlaca = sc.nextLine();

		} while (!val.placaValida(sPlaca));

		do {
			System.out.print("Ingrese Fecha (Formato dd/mm/yyyy):");
			sFecha = sc.nextLine();

		} while (!val.fechaValida(sFecha));

		int i = val.diaSemana(sFecha);

		do {
			System.out.print("Ingrese Hora en Formato 24 Horas(HH:MM:SS): ");
			sHora = sc.nextLine();

		} while (!val.formatoHora(sHora));

		if (ope.verRango(sHora, sPlaca, i)) {
			System.out.println("VEHICULO PUEDE ANDAR ");
		} else {
			System.out.println("VEHICULO NO PUEDE ANDAR ");
		}

	}
}