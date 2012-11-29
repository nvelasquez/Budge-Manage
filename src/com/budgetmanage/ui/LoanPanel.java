/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.*;

/**
 *
 * @author Alexateam
 */
public class LoanPanel extends javax.swing.JPanel {

    /** Size(555,355);
     * Creates new form LoanPanel
     */
    
    
    Map<String, Double> mapaBancos = new HashMap<String, Double>();
    
    public LoanPanel() {

        initComponents();
        mapaBancos.put("BHD", 14.15);
        mapaBancos.put("APAP", 11.4);
        mapaBancos.put("ASOCION CIBAO", 9.5);
        mapaBancos.put("ALNAP", 10.00);


        mapaBancos.put("SCOTIABANK", 10.95);
        mapaBancos.put("VIMENCA", 15.95);
        
        mapaBancos.put("BANCO POPULAR", 10.95);
        mapaBancos.put("Banco Leon", 15.75);
        mapaBancos.put("Santa Cruz", 15.00);
        
        mapaBancos.put("BANRESERVAS", 11.5);
        
        
    Set<String> setBancos = mapaBancos.keySet();
    
    cboxBancos.setModel(new DefaultComboBoxModel(setBancos.toArray()));
        //Loan f = new LoanPanel();
       // this.add(f, BorderLayout.CENTER);
        //this.pack();
        this.setSize(555,355);
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * 
     * 
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        txtShares = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        lblResultado = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        cboxBancos = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Amount");
        jLabel1.setMaximumSize(new java.awt.Dimension(40, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(40, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(40, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Shares");

        btnSend.setBackground(new java.awt.Color(204, 204, 204));
        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lblResultado.setText("Result");

        cboxBancos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "BHD", "Banreservas", "Asociacion Cibao", "APAP", "Banco Pupular", "Banco Leon", "Santa Cruz", "Vimenca" }));
        cboxBancos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxBancosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator5)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtShares, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboxBancos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboxBancos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtShares, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSend, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResultado))
                .addGap(43, 43, 43)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    public boolean validarFormularios()
    {
       if(txtAmount.getText().equals("") || txtShares.getText().equals(""))
        {
            
            return false;
            
            
        }
    
           return true;
    
    
    
    
    }
    
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // Formula para calcular interes Ic= cant_inicial * (1+tasa/100)^periodos

        
        if(validarFormularios())
        {
            
            try{
            double amount = 0;
            
         amount = Double.parseDouble(txtAmount.getText());
            
       // double interest = Double.parseDouble(txtInterest.getText
                int shares = Integer.parseInt(txtShares.getText());
//******************************* FORMULA**************************************************
        String banco = (String)cboxBancos.getSelectedItem();
double interesBruto = mapaBancos.get(banco);
double interesCalculado = (amount*interesBruto) /12;

double total = (amount/shares) + interesCalculado;
 //******************************** FIN FORMULA**************************************************               
        //double result = (amount*interesBruto) / 100;
        //double total = result*12;
        lblResultado.setText("El Resultado es " +total+"%");
            }catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null,"Ingrese datos validos", "Datos en blacno",
                    JOptionPane.ERROR_MESSAGE);
            }
        } else
        {
            JOptionPane.showMessageDialog(null,"Debe de llenar todos los campos", "Datos en blacno",
                    JOptionPane.ERROR_MESSAGE);
        
        }
        
        
    }//GEN-LAST:event_btnSendActionPerformed

    private void cboxBancosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxBancosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxBancosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox cboxBancos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtShares;
    // End of variables declaration//GEN-END:variables
}