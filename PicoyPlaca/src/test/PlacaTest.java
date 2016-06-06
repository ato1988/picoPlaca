package test;

import static org.junit.Assert.*;

import org.junit.Test;

import PicoyPlaca.Validacion;

public class PlacaTest {

	@Test
	public void placaValida() {

		Validacion validacion = new Validacion();

		// Ingres de una placa en formato de tres caracteres unidos seguidos de 
		//cuatro digitos seguifos
	
		boolean bandera = validacion.placaValida("HDF0178");

		assertTrue(bandera == true);

	}
	
	@Test
	public void placaNoValida1() {

		Validacion validacion = new Validacion();

		// Ingres de una placa que no tiene formato de tres caracteres unidos seguidos de 
		//cuatro digitos seguifos
	
		boolean bandera = validacion.placaValida("HDF 0178");

		assertTrue(bandera == false);

	}
	
	@Test
	public void placaNoValidaCuatroCaracteres() {

		Validacion validacion = new Validacion();

		// Ingres de una placa que no tiene formato de tres caracteres unidos seguidos de 
		//cuatro digitos seguifos. Ejemplo 
	
		boolean bandera = validacion.placaValida("HDFS0178");

		assertTrue(bandera == false);

	}
	
	@Test
	public void placaNoValidaTresDigitos() {

		Validacion validacion = new Validacion();

		// Ingres de una placa que no tiene formato de tres caracteres unidos seguidos de 
		//cuatro digitos seguidos. Ejemplo 
	
		boolean bandera = validacion.placaValida("HDS178");

		assertTrue(bandera == false);

	}
	

	@Test
	public void placaValidaMinuscula() {

		Validacion validacion = new Validacion();

		// Ingreso de una placa Correcta en minusculas 
	
		boolean bandera = validacion.placaValida("HDS1578");

		assertTrue(bandera == false);

	}
	
	@Test
	public void placaValidaMinusculaMayuscula() {

		Validacion validacion = new Validacion();

		// Ingreso de una placa Correcta en minusculas y mayuscula
	
		boolean bandera = validacion.placaValida("sqS1578");

		assertTrue(bandera == false);

	}
		

}
