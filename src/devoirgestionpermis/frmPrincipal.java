/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoirgestionpermis;

import ClassesMetier.Eleve;
import ClassesMetier.GstAutoEcole;
import ClassesMetier.Test;
import java.awt.Event;
import java.awt.event.ItemEvent;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class frmPrincipal extends javax.swing.JFrame {

    // Le gestionnaire
    GstAutoEcole gst;
    // Pour la JLISTE des élèves
    DefaultListModel dlmEleves;
    // Pour la JLISTE des tests
    DefaultListModel dlmTests;
    // Pour le JTABLE des élèves
    DefaultTableModel dtmTests;
    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEleves = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstTests = new javax.swing.JList<>();
        btnInscription = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cboElevesInscrits = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTests = new javax.swing.JTable();
        btnModification = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        sldNbFautes = new javax.swing.JSlider();
        chkTermine = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GestionPermis");

        jLabel2.setText("Liste de tous les élèves");

        jScrollPane1.setViewportView(lstEleves);

        jLabel3.setText("Liste de tous les tests");

        jScrollPane2.setViewportView(lstTests);

        btnInscription.setText("Inscription");
        btnInscription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscriptionActionPerformed(evt);
            }
        });

        jLabel4.setText("Les élèves inscrits");

        cboElevesInscrits.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboElevesInscritsItemStateChanged(evt);
            }
        });

        tblTests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom du test", "Nombre de fautes", "Terminé ?"
            }
        ));
        jScrollPane3.setViewportView(tblTests);

        btnModification.setText("Modification");
        btnModification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificationActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre de fautes");

        sldNbFautes.setMaximum(5);

        chkTermine.setText("Test terminé ?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnInscription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(40, 40, 40)
                        .addComponent(cboElevesInscrits, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(sldNbFautes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chkTermine)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnModification, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnInscription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboElevesInscrits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(sldNbFautes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(chkTermine)
                        .addGap(18, 18, 18)
                        .addComponent(btnModification, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        dtmTests = (DefaultTableModel)tblTests.getModel();
        dlmEleves = new DefaultListModel();
        dlmTests = new DefaultListModel();
        // Notre gestionnaire
        gst = new GstAutoEcole();

        // Les objets ELEVES
        Eleve eleve1 = new Eleve(1,"Ganier");
        Eleve eleve2 = new Eleve(2,"Alison");
        Eleve eleve3 = new Eleve(3,"Girard");
        Eleve eleve4 = new Eleve(4,"Rinaldi");
        Eleve eleve5 = new Eleve(5,"Segura");
        // Les objets TESTS
        Test test1 = new Test(1,"Test n°1", 0, false);
        Test test2 = new Test(2,"Test n°2", 0, false);
        Test test3 = new Test(3,"Test n°3", 0, false);
        Test test4 = new Test(4,"Test n°4", 0, false);
        Test test5 = new Test(5,"Test n°5", 0, false);
        
        // Ajouter les élèves au gestionnaire
        
        
        // Ajouter les tests au gestionnaire
        
        
        // Remplir la liste de tous les élèves
        for(Eleve eleve : gst.getTousLesEleves()){
            dlmEleves.addElement(eleve.getNomEleve());
        }
        // Le contrôle graphique lstEleves
        // prend comme modèle le dlmEleves
        lstEleves.setModel(dlmEleves);

        // Remplir la liste de tous les tests
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void btnInscriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscriptionActionPerformed
        // TODO add your handling code here:

        // A vous de jouer
        
        
        
        
        
    }//GEN-LAST:event_btnInscriptionActionPerformed

    private void btnModificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificationActionPerformed
        // TODO add your handling code here:
        
        // A vous de jouer
        
        
        
    }//GEN-LAST:event_btnModificationActionPerformed

    private void cboElevesInscritsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboElevesInscritsItemStateChanged
        // TODO add your handling code here:
        
        // A vous de jouer
        
        
        
    }//GEN-LAST:event_cboElevesInscritsItemStateChanged

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscription;
    private javax.swing.JButton btnModification;
    private javax.swing.JComboBox<String> cboElevesInscrits;
    private javax.swing.JCheckBox chkTermine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lstEleves;
    private javax.swing.JList<String> lstTests;
    private javax.swing.JSlider sldNbFautes;
    private javax.swing.JTable tblTests;
    // End of variables declaration//GEN-END:variables
}
