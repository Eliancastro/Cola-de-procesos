import java.util.Comparator;

public class Proceso implements Comparator<Proceso>, Comparable <Proceso>{
	
	String proceso;
	Integer tArribo;
	Integer tEjecucion;
	Integer prioridad;
	private Estado status;
	public enum Estado {
		LISTO, FINALIZADO
	};
	public Proceso(String proceso,int tArribo , int tEjecucion, int prioridad) {
		this.proceso = proceso;
		this.tArribo = tArribo;
		this.tEjecucion = tEjecucion;
		this.prioridad = prioridad;
        this.status = Proceso.Estado.LISTO;
	}
	
	protected Integer getT_arribo() {
		return tArribo;
	}
	
	protected Integer getT_prioridad() {
		return prioridad;
	}
	public Integer getT_ejecucion() {
		
		return tEjecucion;
	}
	
	public Estado getStatus() {
		return status;
	}
	public void setStatus(Estado estado) {
		status = estado;
		
	}
	
    @Override
    public int compare(Proceso o1, Proceso o2) {
    	 int salida ;
 		
 		if(o1.prioridad < o2.prioridad) {
 			salida = -1;
 		}else if(o1.prioridad > o2.prioridad) {
 			salida = 1;
 		}else
            salida = Integer.compare(o1.tArribo, o2.tArribo);	
 		

 		
 		return salida;
 	}

	
	@Override
	public String toString() {
		return "Proceso [" + proceso + "]";
	}

	@Override
	public int compareTo(Proceso otroProceso) {
         int salida ;
		
		   if(this.prioridad < otroProceso.prioridad) {
			  salida = -1;
		     }else if(this.prioridad > otroProceso.prioridad) {
			   salida = 1;
		     }else
                 salida = Integer.compare(this.tArribo, otroProceso.tArribo);	

		
		      return salida;
	}
}
