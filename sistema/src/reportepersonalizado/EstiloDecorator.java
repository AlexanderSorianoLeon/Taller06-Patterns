package reportepersonalizado;

import reportes.Reporte;

public class EstiloDecorator extends ReporteDecorator {

    EstiloDecorator(Reporte reporteDecorado) {
        super(reporteDecorado);
    }

    @Override
    public String personalizarReporte() {
       return reporteDecorado.personalizarReporte() + "con estilos";
    }

    

}
