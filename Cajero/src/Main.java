import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion;
		double saldo=0;
		do {
			mostrarMenu();//Muestra el menu principal
			opcion=elegirOpcion();//Metodo utilizado para seleccionar una opcion del menu
			switch (opcion) {
			case 1-> { //Se ha seleccionado ingresar dinero
				saldo=ingresarDinero(saldo);
			}
			case 2->{// Se ha seleccionado sacar dinero
				saldo=sacarDinero(saldo);
			}
			case 3->{// Se ha seleccionado consultar saldo
				consultarSaldo(saldo);
			}
			}
		}while(opcion!=3);//Hasta que no se seleccione la opcion 3, el programa no
		//se detendra, y por tanto se repite el bucle.

	}

	/**
	 * Metodo que muestra por pantalla el saldo actual
	 * 
	 */

	private static void consultarSaldo(double saldo555) {
		System.out.println("Su saldo actual es "+saldo555+"�");
	}

	/**
	 * 
	 * Método utilizado para ingresar saldo. Tomara como entrada
	 * el saldo que se le proporcione por teclado. Preguntará al
	 * usuario cuanto dinero quiere ingresar, y se devoovera como valor
	 * el resultado de sumar al saldo la cantidad que se quiere ingresar.
	 */
	private static double ingresarDinero(double saldo) {
		Scanner sc=new Scanner(System.in);
		double dineroIngresado;//Dinero que se desea ingresar
		double resultado;// resultado de sumar saldo +  el dinero ingresado

		System.out.println("¿Cuanto dinero desea ingresar?");
		dineroIngresado=sc.nextDouble();

		while(dineroIngresado<0) { //Validamos que el dinero no sea negativo. 
			System.out.println("Indica una cantidad positiva");
			dineroIngresado=sc.nextDouble();
		}
		resultado=dineroIngresado+saldo;
		return resultado;
	}

	/**
	 * 
	 * Método utilizado para sacar dinero. Tomara como entrada
	 * el saldo que se le proporcione por teclado. Preguntará al
	 * usuario cuanto dinero quiere retirar, y se devolvera como valor
	 * el resultado de restar al saldo la cantidad que se quiere retirar.
	 */
	private static double sacarDinero(double saldo) {
		Scanner sc=new Scanner(System.in);
		double dineroParaRetirar;//Dinero que se desea retirar
		double resultado;// resultado de sumar saldo -  el dinero para retirar

		System.out.println("¿Cuanto dinero desea retirar?");
		dineroParaRetirar=sc.nextDouble();
		resultado=saldo - dineroParaRetirar;//Calculamos el resultado al retirar el dinero

		while(dineroParaRetirar<0 || resultado<0) { //Validamos que el dinero no sea negativo. 
			System.out.println("Indica una cantidad positiva y que no deje la cuenta al descubierto");
			dineroParaRetirar=sc.nextDouble();
			resultado=saldo - dineroParaRetirar;//Calculamos el resultado al retirar el dinero de nuevo
		}

		return resultado;
	}


	/**
	 * 
	 * Metodo utilizado para elegir una opcion del menu principal.
	 * La opcion se seleccionará por teclado, y será un numero entre 1 y 3
	 * Se validará la entrada.
	 */
	private static int elegirOpcion() {
		Scanner sc=new Scanner(System.in);
		int opcion;

		opcion=sc.nextInt();//Leemos la opcion del teclado por primera vez
		while(opcion<1 || opcion>3) {//Mientras esta fuera del rango permitido
			System.out.println("Opción invalida");
			System.out.println("Por favor, seleccione una opción entre 1 y 3");
			opcion=sc.nextInt();// Volvemos a leer la opcion
		}
		return opcion; //Se devuelve la opcion seleccionada
	}

	/**
	 * Metodo que muestra el menu principal por pantalla.
	 * Las opciones que mostrará son 1 Ingresar dinero, 2 Sacar dinero, 3 Cerrar sesion
	 */
	private static void mostrarMenu() {
		System.out.println("\n¿Qué desea hacer?");
		System.out.println("1. Ingresar dinero");
		System.out.println("2. Sacar dinero");
		System.out.println("3. Consultar saldo");
		System.out.println("4. Cerrar sesión");
	}

	/**
	 * Metodo que mjuestra por pantalla subir
	 */
	public static void subir() {
		System.out.println("subirRRR");//Imprimir la palabra subir
	}
}

