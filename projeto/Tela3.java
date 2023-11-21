/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static projeto.Projeto.contador;
import static projeto.Projeto.contadorCarro;
import static projeto.Projeto.contadorCelulares;
import static projeto.Projeto.contadorCelulares2;
import static projeto.Projeto.contadorEletrodomesticos;
import static projeto.Projeto.contadorEletrodomesticos2;
import static projeto.Projeto.contadorNotebooks;
import static projeto.Projeto.contadorNotebooks2;
import static projeto.Tela1.xusuario;
import static projeto.Tela2.xcarros;

/**
 *
 * @author bielc
 */
public class Tela3 extends javax.swing.JFrame {

    /**
     * Creates new form Tela3
     */
    public Tela3() {
        initComponents();
    }
    
        public static ArrayList<Celulares> xcelulares = new ArrayList<Celulares>();
        public static ArrayList<Eletrodomesticos> xeletrodomesticos = new ArrayList<Eletrodomesticos>();
        public static ArrayList<Notebooks> xnotebooks = new ArrayList<Notebooks>();
        
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(694, 419));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CATEGORIA B");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 546, -1));

        jLabel2.setText("MODELO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 270, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 180, -1));

        jLabel3.setText("PREÇO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 180, -1));

        jLabel4.setText("COR:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 180, -1));

        jLabel5.setText("NOTA FISCAL:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 180, -1));

        jLabel6.setText("ID:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 180, -1));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("CELULAR");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("ELETRODOMESTICO");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("NOTEBOOK");
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        Tela5 tela5 = new Tela5();
        setVisible(false);
        
        if(jRadioButton1.isSelected()){   
            contadorCelulares2++;
            xcelulares.add(new Celulares());
            xcelulares.get(Projeto.contadorCelulares2).setModelo(jTextField1.getText());
            xcelulares.get(Projeto.contadorCelulares2).setPreco(jTextField2.getText());
            xcelulares.get(Projeto.contadorCelulares2).setCor(jTextField3.getText());
            xcelulares.get(Projeto.contadorCelulares2).setNf(jTextField4.getText());
            xcelulares.get(Projeto.contadorCelulares2).setId(jTextField5.getText());
            setVisible(false);
            tela5.setVisible(true);
            contadorCelulares=contador;
            xcelulares.get(Projeto.contadorCelulares2).setPkx(contadorCelulares);
            xusuario.get(contador).setPk(4);

        } else if(jRadioButton2.isSelected()){
            contadorEletrodomesticos2++;
            xeletrodomesticos.add(new Eletrodomesticos());
            xeletrodomesticos.get(Projeto.contadorEletrodomesticos2).setModelo(jTextField1.getText());
            xeletrodomesticos.get(Projeto.contadorEletrodomesticos2).setPreco(jTextField2.getText());
            xeletrodomesticos.get(Projeto.contadorEletrodomesticos2).setCor(jTextField3.getText());
            xeletrodomesticos.get(Projeto.contadorEletrodomesticos2).setNf(jTextField4.getText());
            xeletrodomesticos.get(Projeto.contadorEletrodomesticos2).setId(jTextField5.getText());
            setVisible(false);
            tela5.setVisible(true);
            contadorEletrodomesticos=contador;
            xeletrodomesticos.get(Projeto.contadorEletrodomesticos2).setPkx(contadorEletrodomesticos);
            xusuario.get(contador).setPk(5);

        } else if(jRadioButton3.isSelected()){
            contadorNotebooks2++;
            xnotebooks.add(new Notebooks());
            xnotebooks.get(Projeto.contadorNotebooks2).setModelo(jTextField1.getText());
            xnotebooks.get(Projeto.contadorNotebooks2).setPreco(jTextField2.getText());
            xnotebooks.get(Projeto.contadorNotebooks2).setCor(jTextField3.getText());
            xnotebooks.get(Projeto.contadorNotebooks2).setNf(jTextField4.getText());
            xnotebooks.get(Projeto.contadorNotebooks2).setId(jTextField5.getText());
            setVisible(false);
            tela5.setVisible(true);
            contadorNotebooks=contador;
            xnotebooks.get(Projeto.contadorNotebooks2).setPkx(contadorNotebooks);
            xusuario.get(contador).setPk(6);

        } else {
            JOptionPane.showMessageDialog(null, "ERRO! REVISE SUAS RESPOSTAS.", "Título do alerta", JOptionPane.WARNING_MESSAGE);
            setVisible(true);
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
