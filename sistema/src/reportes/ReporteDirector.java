package reportes;
import java.time.LocalDate;

public class ReporteDirector {
    private ReporteBuilder reporteBuilder;

    public ReporteDirector(ReporteBuilder reporteBuilder) {
        this.reporteBuilder = reporteBuilder;
    }

    public void buildReporte() {
        LocalDate fechaActual = LocalDate.now();
        int mesActual = fechaActual.getMonthValue();
        int añoActual = fechaActual.getYear();
        
        this.reporteBuilder.reset();
        this.reporteBuilder.agregarTitulo("Reporte del mes " + mesActual + " - " + añoActual);
        this.reporteBuilder.agregarContenido("Contenido");
    }
}