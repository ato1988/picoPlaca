package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import PicoyPlaca.Validacion;

public class DiaSemanaTest {
	
	@Test
	public void formatoCorrectodiaSemanaCorrecto() {

		Validacion validacion = new Validacion();

		/* Ingreso de una fecha correcta para que devuekva el día de la semana
		 Domingo   -->1
		 Lunes     -->2
		 Martes    --> 3
		 Miercoles -->4
		 Jueves    -->5
		 Viernes   --> 6
		 Sabado     --> 7
		*/
		
		boolean bandera = validacion.fechaValida("12/12/1988");

		assertTrue(bandera == true);

	}
	
	@Test
	public void formatoNoCorrectodiaSemanaCorrecto() {

		Validacion validacion = new Validacion();

		//Ingreso de una fecha con mes en caracteres, el formato a ingresar el dd/mm/aaaa		
		int i = validacion.diaSemana("12/diciembre/1988");

		assertTrue(i == 0);

	}
	
	@Test
	public void diaNoExite() {

		Validacion validacion = new Validacion();

		//Ingreso de una fecha que no existe
		int i = validacion.diaSemana("30/02/1988");

		assertTrue(i==0);

	}


}
