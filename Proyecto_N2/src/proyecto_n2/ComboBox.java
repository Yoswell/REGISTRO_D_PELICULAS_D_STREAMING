package proyecto_n2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicComboBoxUI;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.basic.ComboPopup;

public class ComboBox extends BasicComboBoxUI {

    public static ComboBoxUI createUI(JComponent com) {
        return new ComboBox();
    }
    
    @Override
    protected JButton createArrowButton() {
        JButton btn = new JButton();
        btn.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        btn.setIcon(new ImageIcon(getClass().getResource("/imagenes/3.png")));
        btn.setBackground(Color.WHITE);
        Rectangle aRect = null;
        btn.scrollRectToVisible(aRect);
        btn.setContentAreaFilled(false);
        return btn;
    }
    
    @Override
    public void paintCurrentValueBackground(Graphics g, Rectangle bounds, boolean hasFocus) {
        g.setColor(Color.WHITE);
        g.fill3DRect(0, 0, 0, 0, hasFocus);
    }
    
    @Override
    protected ListCellRenderer createRenderer() {    
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus) {
                super.getListCellRendererComponent(list, value, index, isSelected, hasFocus);
                list.setSelectionBackground(Color.WHITE);
                list.setBorder(BorderFactory.createLineBorder(Color.WHITE));
                return this;
            }
        };
    }
    
    @Override
    protected ComboPopup createPopup() {
        BasicComboPopup popup = (BasicComboPopup) super.createPopup();
        popup.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        
        JScrollPane scrollPane = (JScrollPane) popup.getComponent(0);
        JScrollBar scrollBar = scrollPane.getVerticalScrollBar();

        scrollBar.setUI(new BasicScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                thumbColor = new Color(176,95,103);
                trackColor = new Color(176,95,103);
            }
            
            @Override
            protected JButton createDecreaseButton(int orientation) {
                JButton button = super.createDecreaseButton(orientation);
                button.setBackground(new Color(127,63,69)); // Color de fondo del botón de disminuir
                button.setBorder(BorderFactory.createLineBorder(new Color(127,63,69))); // Color del borde del botón de disminuir
                return button;
            }
            
            @Override
            protected JButton createIncreaseButton(int orientation) {
                JButton button = super.createIncreaseButton(orientation);
                button.setBackground(new Color(127,63,69)); // Color de fondo del botón de aumentar
                button.setBorder(BorderFactory.createLineBorder(new Color(127,63,69))); // Color del borde del botón de aumentar
                return button;
            }
        });
        
        return popup;
    }
}