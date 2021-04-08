/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searcher;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author manuel-aircury
 */


public class ButtonPanel extends javax.swing.JInternalFrame {

    private JDesktopPane desktopPane;
    
    private List<String> documentNames;
    
    private List<String> documentRoutes;

    /**
     * Creates new form ButtonPanel
     */
    public ButtonPanel(String labelName, List<String> documentNames1, List<String> documentRoutes1, JDesktopPane desktopPane1) {
        initComponents();
        jLabel11.setText(labelName);
        desktopPane = desktopPane1;
        documentNames = documentNames1;
        documentRoutes = documentRoutes1;
        
        if(null != documentNames.get(0)){
            jButton1.setText(documentNames.get(0));
        }
        
        if(null != documentNames.get(1)){
            jButton2.setText(documentNames.get(1));
        }
        
        if(null != documentNames.get(2)){
            jButton3.setText(documentNames.get(2));
        }
        
        if(null != documentNames.get(3)){
            jButton4.setText(documentNames.get(3));
        }
        
        if(null != documentNames.get(4)){
            jButton5.setText(documentNames.get(4));
        }
        
        if(null != documentNames.get(5)){
            jButton6.setText(documentNames.get(5));
        }
        
        if(null != documentNames.get(6)){
            jButton7.setText(documentNames.get(6));
        }
        
        if(null != documentNames.get(7)){
            jButton8.setText(documentNames.get(7));
        }
        
        if(null != documentNames.get(8)){
            jButton9.setText(documentNames.get(8));
        }
        
        if(null != documentNames.get(9)){
            jButton10.setText(documentNames.get(9));
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setMaximumSize(new java.awt.Dimension(90, 31));
        jButton10.setMinimumSize(new java.awt.Dimension(90, 31));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel1.setText("1");

        jLabel2.setText("2");

        jLabel3.setText("3");

        jLabel4.setText("4");

        jLabel5.setText("5");

        jLabel6.setText("6");

        jLabel7.setText("7");

        jLabel8.setText("8");

        jLabel9.setText("9");

        jLabel10.setText("10");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel8))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel9)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String text = "";
        
        try {
            File myObj = new File(documentRoutes.get(0));
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              text = text + data + "\n";
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        Reader v = new Reader(documentNames.get(0), text);
        // Damos permisos de redimencionar, Maximizar, Minimizar, Cerrar
        v.setResizable(true);
        v.setMaximizable(true);
        v.setIconifiable(true);
        v.setVisible(true);
        v.setClosable(true);
        // Agregamos nuestro formulario a nuestro contenedor
        desktopPane.add(v);
        // Hacemos que nuestro formulario se coloque al frente
        v.toFront();
        // Hacemos que nuestro formulario tenga el foco
        v.requestFocus();
        // Hacemos que nuestro formulario se renderice
        v.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String text = "";
        
        try {
            File myObj = new File(documentRoutes.get(3));
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              text = text + data + "\n";
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        Reader v = new Reader(documentNames.get(3), text);
        // Damos permisos de redimencionar, Maximizar, Minimizar, Cerrar
        v.setResizable(true);
        v.setMaximizable(true);
        v.setIconifiable(true);
        v.setVisible(true);
        v.setClosable(true);
        // Agregamos nuestro formulario a nuestro contenedor
        desktopPane.add(v);
        // Hacemos que nuestro formulario se coloque al frente
        v.toFront();
        // Hacemos que nuestro formulario tenga el foco
        v.requestFocus();
        // Hacemos que nuestro formulario se renderice
        v.repaint(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String text = "";
        
        try {
            File myObj = new File(documentRoutes.get(7));
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              text = text + data + "\n";
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        Reader v = new Reader(documentNames.get(7), text);
        // Damos permisos de redimencionar, Maximizar, Minimizar, Cerrar
        v.setResizable(true);
        v.setMaximizable(true);
        v.setIconifiable(true);
        v.setVisible(true);
        v.setClosable(true);
        // Agregamos nuestro formulario a nuestro contenedor
        desktopPane.add(v);
        // Hacemos que nuestro formulario se coloque al frente
        v.toFront();
        // Hacemos que nuestro formulario tenga el foco
        v.requestFocus();
        // Hacemos que nuestro formulario se renderice
        v.repaint(); 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String text = "";
        
        try {
            File myObj = new File(documentRoutes.get(1));
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              text = text + data + "\n";
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        Reader v = new Reader(documentNames.get(1), text);
        // Damos permisos de redimencionar, Maximizar, Minimizar, Cerrar
        v.setResizable(true);
        v.setMaximizable(true);
        v.setIconifiable(true);
        v.setVisible(true);
        v.setClosable(true);
        // Agregamos nuestro formulario a nuestro contenedor
        desktopPane.add(v);
        // Hacemos que nuestro formulario se coloque al frente
        v.toFront();
        // Hacemos que nuestro formulario tenga el foco
        v.requestFocus();
        // Hacemos que nuestro formulario se renderice
        v.repaint();      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String text = "";
        
        try {
            File myObj = new File(documentRoutes.get(2));
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              text = text + data + "\n";
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        Reader v = new Reader(documentNames.get(2), text);
        // Damos permisos de redimencionar, Maximizar, Minimizar, Cerrar
        v.setResizable(true);
        v.setMaximizable(true);
        v.setIconifiable(true);
        v.setVisible(true);
        v.setClosable(true);
        // Agregamos nuestro formulario a nuestro contenedor
        desktopPane.add(v);
        // Hacemos que nuestro formulario se coloque al frente
        v.toFront();
        // Hacemos que nuestro formulario tenga el foco
        v.requestFocus();
        // Hacemos que nuestro formulario se renderice
        v.repaint(); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String text = "";
        
        try {
            File myObj = new File(documentRoutes.get(4));
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              text = text + data + "\n";
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        Reader v = new Reader(documentNames.get(4), text);
        // Damos permisos de redimencionar, Maximizar, Minimizar, Cerrar
        v.setResizable(true);
        v.setMaximizable(true);
        v.setIconifiable(true);
        v.setVisible(true);
        v.setClosable(true);
        // Agregamos nuestro formulario a nuestro contenedor
        desktopPane.add(v);
        // Hacemos que nuestro formulario se coloque al frente
        v.toFront();
        // Hacemos que nuestro formulario tenga el foco
        v.requestFocus();
        // Hacemos que nuestro formulario se renderice
        v.repaint(); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String text = "";
        
        try {
            File myObj = new File(documentRoutes.get(5));
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              text = text + data + "\n";
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        Reader v = new Reader(documentNames.get(5), text);
        // Damos permisos de redimencionar, Maximizar, Minimizar, Cerrar
        v.setResizable(true);
        v.setMaximizable(true);
        v.setIconifiable(true);
        v.setVisible(true);
        v.setClosable(true);
        // Agregamos nuestro formulario a nuestro contenedor
        desktopPane.add(v);
        // Hacemos que nuestro formulario se coloque al frente
        v.toFront();
        // Hacemos que nuestro formulario tenga el foco
        v.requestFocus();
        // Hacemos que nuestro formulario se renderice
        v.repaint(); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String text = "";
        
        try {
            File myObj = new File(documentRoutes.get(6));
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              text = text + data + "\n";
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        Reader v = new Reader(documentNames.get(6), text);
        // Damos permisos de redimencionar, Maximizar, Minimizar, Cerrar
        v.setResizable(true);
        v.setMaximizable(true);
        v.setIconifiable(true);
        v.setVisible(true);
        v.setClosable(true);
        // Agregamos nuestro formulario a nuestro contenedor
        desktopPane.add(v);
        // Hacemos que nuestro formulario se coloque al frente
        v.toFront();
        // Hacemos que nuestro formulario tenga el foco
        v.requestFocus();
        // Hacemos que nuestro formulario se renderice
        v.repaint(); 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String text = "";
        
        try {
            File myObj = new File(documentRoutes.get(8));
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              text = text + data + "\n";
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        Reader v = new Reader(documentNames.get(8), text);
        // Damos permisos de redimencionar, Maximizar, Minimizar, Cerrar
        v.setResizable(true);
        v.setMaximizable(true);
        v.setIconifiable(true);
        v.setVisible(true);
        v.setClosable(true);
        // Agregamos nuestro formulario a nuestro contenedor
        desktopPane.add(v);
        // Hacemos que nuestro formulario se coloque al frente
        v.toFront();
        // Hacemos que nuestro formulario tenga el foco
        v.requestFocus();
        // Hacemos que nuestro formulario se renderice
        v.repaint(); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String text = "";
        
        try {
            File myObj = new File(documentRoutes.get(9));
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              text = text + data + "\n";
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        
        Reader v = new Reader(documentNames.get(9), text);
        // Damos permisos de redimencionar, Maximizar, Minimizar, Cerrar
        v.setResizable(true);
        v.setMaximizable(true);
        v.setIconifiable(true);
        v.setVisible(true);
        v.setClosable(true);
        // Agregamos nuestro formulario a nuestro contenedor
        desktopPane.add(v);
        // Hacemos que nuestro formulario se coloque al frente
        v.toFront();
        // Hacemos que nuestro formulario tenga el foco
        v.requestFocus();
        // Hacemos que nuestro formulario se renderice
        v.repaint(); 
    }//GEN-LAST:event_jButton10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
