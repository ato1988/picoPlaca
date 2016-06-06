package PicoyPlaca;
import java.util.*;
import java.text.*;
public class Validacion
{
  
	
 
	//Valido si el Formato de la Fecha esta correcto dd/mm/yyyy
	public static boolean fechaValida(String fecha) {
		try {
			SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy",
					Locale.getDefault());
			formatoFecha.setLenient(false);
			formatoFecha.parse(fecha);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}
	
	//Valido Formato Hora hh:mm y que tenga maximo 24 horas
	public static boolean formatoHora(String hora) {

		try {
			SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss",
					Locale.getDefault());
			// formatoHora.setLenient(false);
			formatoHora.parse(hora);
		} catch (ParseException e) {
			return false;
		}
		Integer h = new Integer(hora.substring(0, 2));
		Integer m = new Integer(hora.substring(3, 5));
		Integer s = new Integer(hora.substring(6, 8));
		
		if (h >= 0 && h < 24 && m >= 0 && m < 60 && s>= 0 &&  s <60) 
		{
			
			return true;
		} 
		else 
		{
			
			return false;
		}
		
		
	}
	
	//Obtendre el día de la Semana
	public static int diaSemana(String fecha) {
		//Vuelvo a validar la fecha con al finalidad de mostrar las prubas unitarias
		if(Validacion.fechaValida(fecha))
		{
			SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaActual = null;
			try {
				fechaActual = df.parse(fecha);
			} catch (ParseException e) {
				System.err.println("Fecha no tiene el formato correcto");
				e.printStackTrace();
				return 0;
			}
			GregorianCalendar fechaCalendario = new GregorianCalendar();
			fechaCalendario.setTime(fechaActual);
			int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
			return diaSemana;
			
		}
		else
			return 0;
		
		
	}
	
		
	//VAlida Formato de la Placa que debe ser tres letras seguidas de cuatros digitos
		
		public static boolean placaValida(String placa) 
		{
				
			boolean bPlacaCorrecta;
	                  
	        bPlacaCorrecta=placa.matches("[a-zA-Z]{3}+\\d{4}");
	        
	        return bPlacaCorrecta;
	       
	}

	
	
	
  
}