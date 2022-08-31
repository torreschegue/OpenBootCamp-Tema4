
public class AppTema4 {

	public static void main(String[] args) {
		Ejercicios obj = new Ejercicios();
		System.out.println(obj.evaluarNumero(1));
		
		System.out.println(obj.ciclowhile(1));
		System.out.println(obj.cicloDoWhile(3));
		System.out.println(obj.cicloFor(5));
		System.out.println(obj.sentenciaSwitch("primavera"));
		
	
	}
}

class Ejercicios{
	
	public String evaluarNumero(int a) {
		String respuesta = "";
		if (a < 0) {
			respuesta = "El numero: " + a + " Negativo"+"\n";
		}else if (a > 0){
			respuesta = "El numero: " + a + " Positivo"+"\n";
		}else {
			respuesta = "Numero Neutro"+"\n";
		}	
		return respuesta;
	}
	
	
	public String ciclowhile(int numeroWhile) {
		String mensajeWhile = "";
		while (numeroWhile < 3) {
			numeroWhile++;
			mensajeWhile += "El Valor de numeroWhile ahora vale: " + numeroWhile +"\n"; 
		}
		return mensajeWhile;
	}
	
	public String cicloDoWhile(int numeroDoWhile) {
		String mensajeDoWhile= "";
		do {
			numeroDoWhile++;
			mensajeDoWhile += "La variable numeroDoWhile ahora vale: " + numeroDoWhile+"\n";
		}while(numeroDoWhile < 3);
		
		return mensajeDoWhile;
	}

	public String cicloFor(int numeroForControlador ) {
		String mensajeFor = "";
		for (int numeroFor = 0; numeroFor < numeroForControlador; numeroFor++) {
			mensajeFor+= "La variable numeroFor ahora vale:" + numeroFor + "\n";
		}
		return mensajeFor;
	}
	
	public String sentenciaSwitch(String estacion) {
		String mensajeString = "";
		switch(estacion) {
			case "verano":
				mensajeString = "Estamos en Verano";
				break;
			case "invierno":
				mensajeString = "Estamos en Invierno";
				break;
			case "primavera":
				mensajeString = "Estamos en Primera";
				break;
			case "otoño":
				mensajeString = "Estamos en Otoño";
				break;
			default :
				mensajeString = "No es una estacion";
				break;
		}
		return mensajeString;
	}
	
}