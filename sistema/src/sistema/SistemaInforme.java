package sistema;

import reportes.Reporte;
import reportes.ReporteBuilder;
import reportes.ReporteDirector;

public class SistemaInforme {
    
    private static SistemaInforme instance;

    private SistemaInforme(){

    }

    public static SistemaInforme getInstance(){
        if(instance == null){
            new SistemaInforme();
        }
        return instance;
    }

    public void generarReporte(ReporteDirector reporteDirector, ReporteBuilder reporteBuilder){

        //Logic
    }
    public Reporte visualizarReporte(){

        return null;
    }
}
