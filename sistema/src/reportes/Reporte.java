package reportes;

import reportepersonalizado.PersonalizarReporte;

public class Reporte implements PersonalizarReporte {
    private String titulo;
    private String contenido;

    public Reporte(String titulo, String contenido) {
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getContenido() {
        return this.contenido;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String personalizarReporte() {
        // logig
        return "reporte decorado";
    }

}