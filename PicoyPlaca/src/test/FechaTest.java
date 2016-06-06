package test;

import static org.junit.Assert.*;
import org.junit.*;
import PicoyPlaca.*;

import org.junit.Test;

public class FechaTest {
	public FechaTest fechaTest;

	
	
	@Test
	public void formatoNoCorrectoCaracteres() {

		Validacion validacion = new Validacion();

		// Ingreso de una fecha en caracteres ("veinte diciembre de 1988")
		boolean bandera = validacion.fechaValida("20/12/1988");

		assertTrue(bandera == true);

	}
	
	@Test
	public void diaValido() {

		Validacion validacion = new Validacion();

		// Ingreso de una fecha correcta en formato mm/dd/yyyy
		boolean bandera = validacion.fechaValida("20/12/2000");

		assertTrue(bandera == true);

	}

	@Test
	public void mesValido() {

		Validacion validacion = new Validacion();

		// Ingreso de una fecha correcta en formato mm/dd/yyyy
		boolean bandera = validacion.fechaValida("21/10/2010");

		assertTrue(bandera == true);

	}

	@Test
	public void formatoNoCorrecto() {

		Validacion validacion = new Validacion();

		// Se ingresa campo que no sea fecha
		boolean bandera = validacion.fechaValida("yykjk1188");

		assertTrue(bandera == false);

	}

	@Test
	public void diaNoValido() {

		Validacion validacion = new Validacion();

		// Ingreso de un dia Que no existe
		boolean bandera = validacion.fechaValida("33/12/2000");

		assertTrue(bandera == false);

	}
	
	@Test
	public void diaNoValidoCaracteres() {

		Validacion validacion = new Validacion();

		// Ingreso de un dia en caracteres
		boolean bandera = validacion.fechaValida("veinte/12/2000");

		assertTrue(bandera == false);

	}

	@Test
	public void mesNoValido() {

		Validacion validacion = new Validacion();

		// Ingreso de un mes que no existe
		boolean bandera = validacion.fechaValida("21/15/2010");

		assertTrue(bandera == false);

	}
	
	@Test
	public void mesNoValidoCaracteres() {

		Validacion validacion = new Validacion();

		// Ingreso de un mes en caracteres
		boolean bandera = validacion.fechaValida("21/octubre/2010");

		assertTrue(bandera == false);

	}
	
	@Test
	public void diaBisiesto() {

		Validacion validacion = new Validacion();

		// Validacion de dia 29 en año bisiesto
		boolean bandera = validacion.fechaValida("29/02/2016");

		assertTrue(bandera == true);

	}
	
	@Test
	public void anoNoValidoCaracteres() {

		Validacion validacion = new Validacion();

		// Validacion de dia 29 en año bisiesto
		boolean bandera = validacion.fechaValida("29/02/dos mil");

		assertTrue(bandera == false);

	}
	
	
	@Test
	public void diaNoBisiesto() {

		Validacion validacion = new Validacion();

		// Validacion de dia 29 en año No bisiesto
		boolean bandera = validacion.fechaValida("29/02/2015");

		assertTrue(bandera == false);

	}

}
