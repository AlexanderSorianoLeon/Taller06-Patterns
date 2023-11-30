package reportepersonalizado;

import reportes.Reporte;

public class FuenteDecorator extends ReporteDecorator {

    FuenteDecorator(Reporte reporteDecorado) {
        super(reporteDecorado);
    }

    @Override
    public String personalizarReporte() {
        return reporteDecorado.personalizarReporte() + "con fuentes";
    }

}
