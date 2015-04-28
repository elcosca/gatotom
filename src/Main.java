public class Main {

	public static void main(String[] args) {
	
	Gato tom = new Gato (5.0);
	
	Raton jerry = new Raton (10.0, 50.0, "Jerry");
	Raton pepe = new Raton (5.0, 50.0, "Pepe");
	
	System.out.println (tom.energia);
	tom.comerRaton(jerry);
	tom.comerRaton(pepe);
	tom.comerRaton(jerry);
	tom.mostrarAMisRatones();
//	System.out.println (tom.energia);
//	System.out.println (tom.meConvieneComerA_QueEstaA (jerry));
//	tom.mostrarAMisRatones();
	tom.sacarAlRatonMasPesado();
	tom.mostrarAMisRatones();
	}
}