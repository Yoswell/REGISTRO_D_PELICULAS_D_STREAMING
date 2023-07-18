package proyecto_n2;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

public class Metodos {
    
    public void smsCampos(JLabel label) {
        label.setText("Por favor rellene todos los campos");
    }
    
    public void vaciarRows(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    
    public void mostrarPaneles(JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4) {
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(true);
    }
    
    public Object[] colasVaciasOLlenas(Pelicula[] peliculas, Object[] datos, Proveedor pro) {
        if (peliculas == null || peliculas.length == 0) {
            datos = new Object[]{pro.getIdProveedor(), pro.getDescripcion(), "Cola vacía"};
        } else if (peliculas != null || peliculas.length > 0) {
            datos = new Object[]{pro.getIdProveedor(), pro.getDescripcion(), "Cola con peliculas"};
        }
        return datos;
    }
    
    public void desabilitarRadioButton(JRadioButton button1, JRadioButton button2, JRadioButton button3) {
        if (button1.isSelected()) {
            button2.setEnabled(false);
            button3.setEnabled(false);
        } else {
            button2.setEnabled(true);
            button3.setEnabled(true);
        }
    }
    
    public void actualizarTablaPeliculas_AfterDelete(Proveedor[] proveedores, DefaultTableModel modeloT1, int proveedorSeleccionado, int continuar) {
        if (continuar >= 0) {
            Pelicula[] peliculas = proveedores[proveedorSeleccionado].getPeliculas();
            if (peliculas != null) {
                for (Pelicula viewPeliculas : peliculas) {
                    if (viewPeliculas != null) {
                        Object[] datos = {viewPeliculas.getDni(), viewPeliculas.getNombre(), viewPeliculas.getCategoria(), viewPeliculas.getAudiencia(), viewPeliculas.getFormato()};
                        Object[] x = new Object[5];
                        System.arraycopy(datos, 0, x, 0, 5);
                        modeloT1.addRow(x);
                    }
                }
            }
        }
    }
}
