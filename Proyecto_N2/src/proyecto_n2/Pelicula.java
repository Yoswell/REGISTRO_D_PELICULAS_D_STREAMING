package proyecto_n2;

public class Pelicula {
    private String dni;
    private String nombre;
    private String categoria;
    private String audiencia;
    private String formato;

    public void Pelicula(String Dni, String Nombre, String Categoria, String Audiencia, String Formato) {
        dni = Dni;
        nombre = Nombre;
        categoria = Categoria;
        audiencia = Audiencia;
        formato = Formato;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getAudiencia() {
        return audiencia;
    }

    public String getFormato() {
        return formato;
    }
}
