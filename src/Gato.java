import java.util.ArrayList;
import java.util.List;

public class Gato {

	
	Double energia;
	List<Raton> misRatones;
    	
	
	public Gato (Double unaEnergia) {
		
		this.energia = unaEnergia;	
		this.misRatones = new ArrayList<Raton>();
		
	}
	
	public void comerRaton (Raton raton) {
		if (this.misRatones.contains(raton)){
			System.out.println("Ya me lo comi");
		}
		else{
			this.energia = this.energia + 12 + raton.peso;
			this.correr (raton);
			this.misRatones.add(raton);
		}
	}
	
	public void mostrarAMisRatones(){
		for(Raton raton : this.misRatones){
			System.out.println(raton.nombre);
		}
	}
	
	public void correr (Raton Raton) {
		
		this.energia = this.energia - 0.5 * Raton.distancia;
	}
		
	
	public boolean meConvieneComerA_QueEstaA (Raton Raton) {
		
		return this.energia >= 0.5 * Raton.distancia;
		
	}
	
	public void sacarAlRatonMasPesado (){
		Raton ratonMasPesado = new Raton(0.0,0.0,"ejemplo");
	 
		for(Raton raton : this.misRatones){
			if(raton.peso > ratonMasPesado.peso){
				ratonMasPesado = raton;
			}
		}
		System.out.println("Devolvi a el raton");
		System.out.println(ratonMasPesado.nombre);
		this.misRatones.remove(ratonMasPesado);
	}
	
}