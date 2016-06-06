package test;

import static org.junit.Assert.*;

import org.junit.Test;

import PicoyPlaca.Validacion;

public class HoraTest {

	
	@Test
	public void formatoCorrecto() {

		Validacion validacion = new Validacion();

		// Validacion si la hora se encuentra en el frmato correcto hh:mm:ss
		boolean bandera = validacion.formatoHora("23:22:05");

		assertTrue(bandera == true);

	}
	
	@Test
	public void formatoNoCorrecto() {

		Validacion validacion = new Validacion();

		// Validacion que la hora NO se encuentra en el frmato correcto hh:mm:ss
		boolean bandera = validacion.formatoHora("22:05");

		assertTrue(bandera == false);

	}
	
	@Test
	public void formatoNoCorrectoCaracteres() {

		Validacion validacion = new Validacion();

		// Validacion que la hora NO se encuentra en el frmato correcto hh:mm:ss y que intente ingresar caracteres
		boolean bandera = validacion.formatoHora("22:05:uno");

		assertTrue(bandera == false);

	}
	
	@Test
	public void horaValida() {

		Validacion validacion = new Validacion();

		// Validacion si la hora ingresada esta correcta
		boolean bandera = validacion.formatoHora("09:22:05");

		assertTrue(bandera == true);

	}
	
	@Test
	public void horaNOValida() {

		Validacion validacion = new Validacion();

		// Validacion que la hora ingresada NO esta correcta, mayor a 24 horas
		boolean bandera = validacion.formatoHora("39:25:05");

		assertTrue(bandera == false);

	}
	
	@Test
	public void horaNOValidaCaracteres() {

		Validacion validacion = new Validacion();

		// Validacion que la hora ingresada NO esta correcta, mayor a 24 horas
		boolean bandera = validacion.formatoHora("doce:25:05");

		assertTrue(bandera == false);

	}
	
	@Test
	public void minutosValida() {

		Validacion validacion = new Validacion();

		// Validacion que los minutos ingresados no sean mayor a 60 
		boolean bandera = validacion.formatoHora("19:05:05");

		assertTrue(bandera == true);

	}
	
	@Test
	public void minutosNoValida() {

		Validacion validacion = new Validacion();

		// Validacion que los minutos ingresados  sean mayor a 60 
		boolean bandera = validacion.formatoHora("19:75:05");

		assertTrue(bandera == false);

	}
	
	@Test
	public void minutosNoValidaCaracteres() {

		Validacion validacion = new Validacion();

		// Validacion que los minutos ingresados  sean mayor a 60 
		boolean bandera = validacion.formatoHora("19:diez:05");

		assertTrue(bandera == false);

	}
	
	
	@Test
	public void segundosValida() {

		Validacion validacion = new Validacion();

		// Validacion que los minutos ingresados  no sean mayor a 60 
		boolean bandera = validacion.formatoHora("11:58:58");

		assertTrue(bandera == true);

	}
	
	@Test
	public void segundosNoValida() {

		Validacion validacion = new Validacion();

		// Validacion que los minutos ingresados   sean mayor a 60 
		boolean bandera = validacion.formatoHora("11:05:61");

		assertTrue(bandera == false);

	}
	
	@Test
	public void segundosNoValidaCaractereres() {

		Validacion validacion = new Validacion();

		// Validacion que los minutos ingresados   sean mayor a 60 
		boolean bandera = validacion.formatoHora("11:05:treinta");

		assertTrue(bandera == false);

	}

}
