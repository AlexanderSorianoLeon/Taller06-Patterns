package reportes;

public class ReporteExcel implements ReporteBuilder {
    private Reporte reporteFinal;

    public ReporteExcel() {
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