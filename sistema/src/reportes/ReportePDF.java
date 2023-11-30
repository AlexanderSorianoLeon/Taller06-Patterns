package reportes;

public class ReportePDF implements ReporteBuilder {
    private Reporte reporteFinal;

    public ReportePDF() {
        reset();
    }

    public void reset() {
        this.reporteFinal = new Reporte("", "");
    }

    public void agregarTitulo(String titulo) {
        this.reporteFinal.setTitulo(titulo);
    }

    public void agregarContenido(String contenido) {
        this.reporteFinal.setContenido(contenido);
    }

    public Reporte getReporte() {
        return this.reporteFinal;
    }
}