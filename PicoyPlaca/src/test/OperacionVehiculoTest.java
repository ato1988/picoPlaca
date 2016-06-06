package test;

import static org.junit.Assert.*;

import org.junit.Test;

import PicoyPlaca.OperacionVehiculo;
import PicoyPlaca.Validacion;

public class OperacionVehiculoTest {

	/* Día de la semana
	 Domingo   -->1
	 Lunes     -->2
	 Martes    --> 3
	 Miercoles -->4
	 Jueves    -->5
	 Viernes   --> 6
	 Sabado     --> 7
	*/
	OperacionVehiculo opeVeh = new OperacionVehiculo();

	//Lunes Validacion digito 1 y 2
	@Test
	public void diaLunesPuedeAndarDigito1() {

		
		//El sisteam en este punto ya valido la hora y fecha por lo tanto 
		//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
		
		
		boolean bandera =  opeVeh.verRango("20:11:08","fjg0951",2);

		assertTrue(bandera == true);

	}
	
	@Test
	public void diaLunesPuedeAndarDigito2() {

		
		//El sisteam en este punto ya valido la hora y fecha por lo tanto 
		//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
		
		
		boolean bandera =  opeVeh.verRango("07:11:08","fjg0952",2);

		assertTrue(bandera == true);

	}
	
	@Test
	public void diaLunesNoPuedeAndarDigito1() {

		
		//El sisteam en este punto ya valido la hora y fecha por lo tanto 
		//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
		
		
		boolean bandera =  opeVeh.verRango("09:11:08","fjg0951",2);

		assertTrue(bandera == false);

	}
	
	@Test
	public void diaLunesNoPuedeAndarDigito2() {

		
		//El sisteam en este punto ya valido la hora y fecha por lo tanto 
		//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
		
		
		boolean bandera =  opeVeh.verRango("17:11:08","fjg0952",2);

		assertTrue(bandera == false);

	}
	
	//Martes Validacion digito 3 y 4
		@Test
		public void diaMartesPuedeAndarDigito3() {

			
			//El sisteam en este punto ya valido la hora y fecha por lo tanto 
			//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
			
			
			boolean bandera =  opeVeh.verRango("20:11:08","fjg0953",3);

			assertTrue(bandera == true);

		}
		
		@Test
		public void diaMartesPuedeAndarDigito4() {

			
			//El sisteam en este punto ya valido la hora y fecha por lo tanto 
			//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
			
			
			boolean bandera =  opeVeh.verRango("06:11:08","fjg0954",3);

			assertTrue(bandera == true);

		}
		
		@Test
		public void diaLunesNoPuedeAndarDigito3() {

			
			//El sisteam en este punto ya valido la hora y fecha por lo tanto 
			//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
			
			
			boolean bandera =  opeVeh.verRango("09:11:08","fjg0953",3);

			assertTrue(bandera == false);

		}
		
		@Test
		public void diaMartesNoPuedeAndarDigito4() {

			
			//El sisteam en este punto ya valido la hora y fecha por lo tanto 
			//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
			
			
			boolean bandera =  opeVeh.verRango("17:15:08","fjg0954",3);

			assertTrue(bandera == false);

		}
		

		//Miercoles Validacion digito 5y 6
		@Test
		public void diaMiercolesPuedeAndarDigito5() {

			
			//El sisteam en este punto ya valido la hora y fecha por lo tanto 
			//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
			
			
			boolean bandera =  opeVeh.verRango("20:11:08","fjg0955",4);

			assertTrue(bandera == true);

		}
		
		@Test
		public void diaMiercolesPuedeAndarDigito6() {

			
			//El sisteam en este punto ya valido la hora y fecha por lo tanto 
			//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
			
			
			boolean bandera =  opeVeh.verRango("05:11:08","fjg0956",4);

			assertTrue(bandera == true);

		}
		
		@Test
		public void diaMiercolesNoPuedeAndarDigito5() {

			
			//El sisteam en este punto ya valido la hora y fecha por lo tanto 
			//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
			
			
			boolean bandera =  opeVeh.verRango("17:11:08","fjg0955",4);

			assertTrue(bandera == false);

		}
		
		@Test
		public void diaMiercolesNoPuedeAndarDigito6() {

			
			//El sisteam en este punto ya valido la hora y fecha por lo tanto 
			//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
			
			
			boolean bandera =  opeVeh.verRango("09:11:08","fjg0956",4);

			assertTrue(bandera == false);

		}

		//Jueves Validacion digito 7 y 8
				@Test
				public void diaJuevesPuedeAndarDigito7() {

					
					//El sisteam en este punto ya valido la hora y fecha por lo tanto 
					//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
					
					
					boolean bandera =  opeVeh.verRango("20:11:08","fjg0957",5);

					assertTrue(bandera == true);

				}
				
				@Test
				public void diaJuevesPuedeAndarDigito8() {

					
					//El sisteam en este punto ya valido la hora y fecha por lo tanto 
					//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
					
					
					boolean bandera =  opeVeh.verRango("00:11:08","fjg0958",5);

					assertTrue(bandera == true);

				}
				
				@Test
				public void diaJuevesNoPuedeAndarDigito7() {

					
					//El sisteam en este punto ya valido la hora y fecha por lo tanto 
					//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
					
					
					boolean bandera =  opeVeh.verRango("16:11:08","fjg0937",5);

					assertTrue(bandera == false);

				}
				
				@Test
				public void diaJuevesNoPuedeAndarDigito8() {

					
					//El sisteam en este punto ya valido la hora y fecha por lo tanto 
					//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
					
					
					boolean bandera =  opeVeh.verRango("08:59:08","fjg0958",5);

					assertTrue(bandera == false);

				}
	
	
		//Fin de Semana 
				@Test
				public void finSemanaDigito7() {

					
					//El sisteam en este punto ya valido la hora y fecha por lo tanto 
					//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
					
					
					boolean bandera =  opeVeh.verRango("20:11:08","fjg0959",7);

					assertTrue(bandera == true);

				}
				
				@Test
				public void finSemanaDigito0() {

					
					//El sisteam en este punto ya valido la hora y fecha por lo tanto 
					//se validara si el vehiculo puede amdar por dia de semana y ultimo digito de matricula
					
					
					boolean bandera =  opeVeh.verRango("09:11:08","fjg0959",7);

					assertTrue(bandera == true);

				}
				
				
				
	
}
