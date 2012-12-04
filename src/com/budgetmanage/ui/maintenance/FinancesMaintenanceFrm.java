/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.ui.Maintenance;

import com.budgetmanage.entities.Expending;
import com.budgetmanage.entities.Finance;
import com.budgetmanage.entities.Ingress;
import com.budgetmanage.modeler.BudgetJpaController;
import com.budgetmanage.modeler.ExpendingJpaController;
import com.budgetmanage.modeler.IngressJpaController;
import com.budgetmanage.modeler.exceptions.NonexistentEntityException;
import com.budgetmanage.ui.Consulting.FinancesConsultingFrm;
import com.budgetmanage.util.Constant;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Nestor_Velasquez
 */
public class FinancesMaintenanceFrm extends javax.swing.JPanel implements Constant{

    /**
     * Creates new form FinancesMaintenanceFrm
     */
    Finance finance;
    int process;
    public FinancesMaintenanceFrm(Container n, Finance finance, int process) {
        this.c = n;
        initComponents();
        this.finance = finance;
        this.process = process;
        
        jLabel13.setText(EDIT_PANEL_TITLE);
        jComboBox1.setSelectedIndex(process);
        jTextField1.setText(finance.getName());
        
        switch(process){            
            case 2:{
                jComboBox2.setVisible(false);
                jComboBox3.setModel(new DefaultComboBoxModel(INGRESS_TYPES));
                break;
            }
        }
        
        jFormattedTextField1.setText(String.valueOf(finance.getFinanceTotal()));
        jComboBox2.setSelectedIndex(finance.getPriority());
        jComboBox3.setSelectedItem(finance.getType());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();

        setBackground(Constant.BKG);

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText("Editar Finanzas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel13)
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel2.setBackground(BKG);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leyenda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(51, 0, 51))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(99, 99, 241));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText(NAME_MSG);

        jLabel8.setForeground(new java.awt.Color(99, 99, 241));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText(TYPE_MSG);

        jLabel9.setForeground(new java.awt.Color(99, 99, 241));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(VALUE_MSG);

        jLabel10.setForeground(new java.awt.Color(99, 99, 241));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText(PRIORITY_MSG);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap(251, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(Constant.FINANCES_ADD_ARRAY));
        jComboBox1.setToolTipText(Constant.COMBOX_FINANCE_MSG);
        jComboBox1.setEnabled(false);

        jPanel1.setBackground(BKG);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Editar"));

        jLabel2.setText("Nombre");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        jLabel3.setText("Tipo");

        jLabel5.setText("Monto");

        jButton1.setMnemonic(KeyEvent.VK_ENTER);
        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton3.setText("Limpiar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel6.setText("Categoria");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Gastos Fijos", "Servicios", "Ocio y Demas" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, 115, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel12))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(this.getBackground());
        jPanel1.setBackground(this.getBackground());
        jLabel12.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        save(process);        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        clean();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
         
        switch(evt.getItem().toString().toLowerCase()){
            case "gastos fijos":{
                jComboBox3.setModel(new DefaultComboBoxModel(FIXED_EXPENSE));
                break;
            }
            case "servicios": {
                jComboBox3.setModel(new DefaultComboBoxModel(SERVICES));
                break;
            }
            case "ocio y demas": {
                jComboBox3.setModel(new DefaultComboBoxModel(LEISURE));
                break;
            }   
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged
    
    private void save(int what){
        boolean isOk = true;
        String name = jTextField1.getText().toString().toUpperCase();
        String type = jComboBox3.getSelectedItem().toString();
        int priority = jComboBox2.getSelectedIndex();
        double value = 0;
        
        try{
            value = Double.parseDouble(jFormattedTextField1.getText().trim());
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, Constant.VALUE_ERROR_MSG, "Error", JOptionPane.ERROR_MESSAGE);
            jFormattedTextField1.grabFocus();
            isOk = false;
        }
        
        if(isOk()){
            
            Date actualDate = new Date();
            Timestamp date = new Timestamp(actualDate.getTime());
        
            finance.setName(name);
            finance.setType(type);
            finance.setPriority(priority);
            finance.seFinanceTotal(value);
            finance.setUpdateDate(date);
            
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(P_UNIT);            
            
            switch(what){
                case 2:{
                    IngressJpaController ijc = new IngressJpaController(emf);
                    try{
                        ijc.edit((Ingress)finance);
                    }catch(NonexistentEntityException ne){
                        JOptionPane.showMessageDialog(this, ne.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                        isOk = false;
                    }
                    break;
                }
                case 1:{                   
                    ExpendingJpaController ejc = new ExpendingJpaController(emf);        
                    try {                    
                        ejc.edit((Expending)finance);
                    } catch (NonexistentEntityException ex) {
                         JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                         isOk = false;
                    }
                    break;
                }
            }
                
            if(isOk){
                
                BudgetJpaController bjc = new BudgetJpaController(emf);
                try {
                    bjc.generateBudget();
                    jButton1.setEnabled(false);
                    JOptionPane.showMessageDialog(this, FINANCE_SUCCEED_MSG, "Información", JOptionPane.INFORMATION_MESSAGE);
                    Thread.sleep(TimeUnit.SECONDS.toMillis(1));
                    
                    FinancesConsultingFrm fcf = new FinancesConsultingFrm(EDIT_PANEL_TITLE, c);
                    com.budgetmanage.util.Util.addPanel((JPanel)c, fcf);
                    
                } catch (HeadlessException | InterruptedException ex) {
                    Logger.getLogger(FinancesMaintenanceFrm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    private void clean(){
        jTextField1.setText("");
        jFormattedTextField1.setText("");
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
    }
    
    private boolean isOk(){
        if(jTextField1.toString().isEmpty()){
            JOptionPane.showMessageDialog(this, Constant.NAME_ERROR_MSG, "Error", JOptionPane.ERROR_MESSAGE);
            jTextField1.grabFocus();
            return false;
        }
        
        if(jComboBox3.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this, Constant.TYPE_ERROR_MSG, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(jFormattedTextField1.toString().isEmpty()){
            JOptionPane.showMessageDialog(this, Constant.VALUE_ERROR_MSG, "Error", JOptionPane.ERROR_MESSAGE);
            jFormattedTextField1.grabFocus();
            return false;
        }
        
        if(jComboBox2.getSelectedIndex() == 0){
            if(process == 2){
                JOptionPane.showMessageDialog(this, Constant.PRIORITY_ERROR_MSG, "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private Container c;
}
