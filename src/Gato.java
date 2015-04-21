import java.util.ArrayList;
import java.util.List;

public class Gato {

	
	Double energia;
	List<Raton> misRatones;
	String jerry;
    	
	
	public Gato (Double unaEnergia, String unajerry) {
		
		this.energia = unaEnergia;	
		this.jerry = unajerry;
		this.misRatones = new ArrayList<Raton>();
		
	}
	
	
	
	public void comerRaton (Raton raton) {
		
		this.energia = this.energia + 12 + raton.peso;
		this.correr (raton);
		this.misRatones.add(raton);
	}
	
	public void mostrarAMisRatones(){
		for(Raton raton : this.misRatones){
			System.out.println(raton.jerry);
		}
	}
	
	public void correr (Raton Raton) {
		
		this.energia = this.energia - 0.5 * Raton.distancia;
	}
		
	
	public boolean meConvieneComerA_QueEstaA (Raton Raton) {
		
		return this.energia >= 0.5 * Raton.distancia;
	}
		
	
    
		
}