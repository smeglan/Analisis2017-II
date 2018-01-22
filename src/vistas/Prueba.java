/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import sun.java2d.pipe.DrawImage;

/**
 *
 * @author JulianCamilo
 */
public class Prueba extends javax.swing.JPanel {

    /**
     * Creates new form Prueba
     */
    private int fondo;
    private Image fondo1,fondo2,fondo3,fondo4;
    
    public Prueba() {
        initComponents();
        this.fondo=0;
        try {
            BufferedImage mimagen1 = ImageIO.read(new File("src/img/black.jpg"));
            BufferedImage mimagen2 = ImageIO.read(new File("src/img/tierra.jpg"));
            BufferedImage mimagen3 = ImageIO.read(new File("src/img/gold.jpg"));
            BufferedImage mimagen4 = ImageIO.read(new File("src/img/grass.jpg"));
            fondo1= mimagen1.getScaledInstance(40, 40, 0);
            fondo2= mimagen2.getScaledInstance(40, 40, 0);
            fondo3= mimagen3.getScaledInstance(40, 40, 0);
            fondo4= mimagen4.getScaledInstance(40, 40, 0);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar la imagen");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g); //To change body of generated methods, choose Tools | Templates.
        switch (fondo) {
            case 1:
                g.drawImage(fondo2, 0, 0, null);
                break;
            case 2:
                g.drawImage(fondo3, 0, 0, null);
                break;
            case 3:
                g.drawImage(fondo4, 0, 0, null);
                break;
            default:
                g.drawImage(fondo1, 0, 0, null);
                break;
        }
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }

    public int getFondo() {
        return fondo;
    }
    
    

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
