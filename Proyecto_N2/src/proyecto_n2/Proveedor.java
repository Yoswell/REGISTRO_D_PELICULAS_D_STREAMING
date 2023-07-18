package proyecto_n2;

import javax.swing.table.DefaultTableModel;

public class Proveedor {
    private int idProveedor;
    private String descripcion;
    private Pelicula[] peliculas;
    private int top;

    public void Proveedor(int IDProveedor, String Descripcion) {
        idProveedor = IDProveedor;
        descripcion = Descripcion;
        peliculas = null;
        top = -1;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }
    
    public void agregarPelicula(Pelicula pelicula) {
        if (peliculas == null) {
            peliculas = new Pelicula[1];
            peliculas[0] = pelicula;
        } else {
            Pelicula[] nuevasPeliculas = new Pelicula[peliculas.length + 1];
            System.arraycopy(peliculas, 0, nuevasPeliculas, 0, peliculas.length);
            nuevasPeliculas[peliculas.length] = pelicula;
            peliculas = nuevasPeliculas;
        }
    }

    public Proveedor eliminarPrimeraPelicula(Proveedor proveedor) {
        Pelicula[] peliculas = proveedor.getPeliculas();
        int contador = -1;
        
        for (Pelicula pel : peliculas) {
            if (pel != null) {
                contador++;
            }
        }
        
        if (contador == 0) {
            proveedor.setPeliculas(null);
        } else {
            if (peliculas != null && peliculas.length > 0) {
                if (peliculas.length == 1) {
                    proveedor.setPeliculas(null);
                } else {
                    Pelicula[] nuevasPeliculas = new Pelicula[peliculas.length - 1];

                    for (int i = 1; i < peliculas.length; i++) {
                        nuevasPeliculas[i - 1] = peliculas[i];
                    }
                    proveedor.setPeliculas(nuevasPeliculas);
                }
            } else {
                proveedor.setPeliculas(null);
            }
        }
        return proveedor;
    }

    public Proveedor[] eliminarUltimoProveedor(Proveedor[] proveedores) {
        int indiceUltimoProveedorSinPeliculas = -1;
        int ultimoProveedor = -1;
        Proveedor[] vacio = new Proveedor[0];
        
        for (Proveedor pro : proveedores) {
            if (pro != null) {
                ultimoProveedor++;
            }
        }
        
        if (proveedores[ultimoProveedor].getPeliculas() == null) {
            for (int i = proveedores.length - 1; i >= 0; i--) {
                Proveedor pro = proveedores[i];
                if (pro != null) {
                    Pelicula[] peliculass = pro.getPeliculas();
                    if (peliculass == null || peliculass.length == 0) {
                        indiceUltimoProveedorSinPeliculas = i;
                        break;
                    }
                }
            }

            if (indiceUltimoProveedorSinPeliculas >= 0) {
                Proveedor[] nuevosProveedores = new Proveedor[proveedores.length - 1];
                int j = 0;
                for (int i = 0; i < proveedores.length; i++) {
                    if (i != indiceUltimoProveedorSinPeliculas) {
                        nuevosProveedores[j] = proveedores[i];
                        j++;
                    }
                }
                proveedores = nuevosProveedores;
            }
        } else if (proveedores[ultimoProveedor].getPeliculas() != null) {
            return null;
        }
        return proveedores;
    }
    
    public void mostrarProveedores(Proveedor[] proveedores, DefaultTableModel modelo) {
        for (Proveedor pro : proveedores) {
            if (pro != null) {
                Pelicula[] peliculas = pro.getPeliculas();
                Object[] datos = {};
                if (peliculas == null || peliculas.length == 0) {
                    datos = new Object[]{pro.getIdProveedor(), pro.getDescripcion(), "Cola vacía"};
                } else if (peliculas != null || peliculas.length > 0) {
                    datos = new Object[]{pro.getIdProveedor(), pro.getDescripcion(), "Cola con peliculas"};
                }
                Object[] x = new Object[3];
                System.arraycopy(datos, 0, x, 0, 3);
                modelo.addRow(x);
            }
        }
    }
}