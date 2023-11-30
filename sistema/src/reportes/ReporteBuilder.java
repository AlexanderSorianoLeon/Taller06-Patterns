package reportes;

public interface ReporteBuilder {
    void reset();
    void agregarTitulo(String titulo);
    void agregarContenido(String contenido);
}