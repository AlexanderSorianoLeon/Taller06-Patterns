package reportepersonalizado;

import reportes.Reporte;

public abstract class ReporteDecorator implements PersonalizarReporte {
    Reporte reporteDecorado;
    ReporteDecorator(Reporte reporteDecorado){
        this.reporteDecorado = reporteDecorado;
    }

    public String  personalizarInforme(){
        return reporteDecorado.personalizarReporte();
    }
}
