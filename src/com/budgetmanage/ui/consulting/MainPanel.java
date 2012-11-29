/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.ui.consulting;

import com.budgetmanage.entities.Budget;
import com.budgetmanage.entities.Finance;
import com.budgetmanage.modeler.BudgetJpaController;
import com.budgetmanage.modeler.ExpendingJpaController;
import com.budgetmanage.modeler.IngressJpaController;
import com.budgetmanage.modeler.exceptions.NonexistentEntityException;
import com.budgetmanage.util.Constant;
import com.budgetmanage.util.PieChart;
import com.budgetmanage.util.PieSlice;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author Nestor_Velasquez
 */
public class MainPanel extends javax.swing.JPanel implements Constant{

    /**
     * Creates new form MainPanel
     */
    EntityManagerFactory emf;
    BudgetJpaController bjc;
    
    public MainPanel() {
        initComponents();
        jLabel13.setText(MAIN_PANEL_TITLE);
        
        emf = Persistence.createEntityManagerFactory(PU);
        bjc = new BudgetJpaController(emf);
        
        loadWindow();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        BudgeManagePUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("BudgeManagePU").createEntityManager();
        budgetQuery = java.beans.Beans.isDesignTime() ? null : BudgeManagePUEntityManager.createQuery("SELECT b FROM Budget b");
        budgetList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : budgetQuery.getResultList();
        budgetQuery1 = java.beans.Beans.isDesignTime() ? null : BudgeManagePUEntityManager.createQuery("SELECT b FROM Budget b");
        budgetList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : budgetQuery1.getResultList();
        accountQuery = java.beans.Beans.isDesignTime() ? null : BudgeManagePUEntityManager.createQuery("SELECT a FROM Account a");
        accountList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : accountQuery.getResultList();
        budgetQuery2 = java.beans.Beans.isDesignTime() ? null : BudgeManagePUEntityManager.createQuery("SELECT b FROM Budget b");
        budgetList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : budgetQuery2.getResultList();
        resumeBuPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resumeTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        generatePanel = new javax.swing.JPanel();
        nameTextField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        flowPanel = new javax.swing.JPanel();
        resumeExPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(Constant.BKG);

        resumeBuPanel.setBackground(Constant.BKG);
        resumeBuPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resumen del Presupuesto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10), new java.awt.Color(0, 0, 0))); // NOI18N

        resumeTable.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 255, 255)));
        resumeTable.setGridColor(new java.awt.Color(204, 255, 204));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, budgetList2, resumeTable, "");
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${ingressTotal}"));
        columnBinding.setColumnName("Ingress Total");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${expendingTotal}"));
        columnBinding.setColumnName("Expending Total");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${generateDate}"));
        columnBinding.setColumnName("Generate Date");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(resumeTable);

        javax.swing.GroupLayout resumeBuPanelLayout = new javax.swing.GroupLayout(resumeBuPanel);
        resumeBuPanel.setLayout(resumeBuPanelLayout);
        resumeBuPanelLayout.setHorizontalGroup(
            resumeBuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resumeBuPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        resumeBuPanelLayout.setVerticalGroup(
            resumeBuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resumeBuPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Consultar Finanzas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel13)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        generatePanel.setBackground(Constant.BKG);
        generatePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        generatePanel.setToolTipText("Generar presupuesto");

        nameTextField.setToolTipText("Nombre Del Presupuesto");

        generateButton.setText("Generar");
        generateButton.setToolTipText("Generar presupuesto");
        generateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateButtonMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("No tiene Presupuestos generados");

        javax.swing.GroupLayout generatePanelLayout = new javax.swing.GroupLayout(generatePanel);
        generatePanel.setLayout(generatePanelLayout);
        generatePanelLayout.setHorizontalGroup(
            generatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(generatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(generateButton)
                    .addGroup(generatePanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        generatePanelLayout.setVerticalGroup(
            generatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, generatePanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(generatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTextField))
                .addGap(18, 18, 18)
                .addComponent(generateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setVisible(false);

        flowPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Flujo Del Gasto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10), java.awt.Color.black)); // NOI18N

        javax.swing.GroupLayout flowPanelLayout = new javax.swing.GroupLayout(flowPanel);
        flowPanel.setLayout(flowPanelLayout);
        flowPanelLayout.setHorizontalGroup(
            flowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        flowPanelLayout.setVerticalGroup(
            flowPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 79, Short.MAX_VALUE)
        );

        resumeExPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resumen de Gastos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 10))); // NOI18N
        resumeExPanel.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Presupuesto Sobregirado!");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(resumeBuPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(flowPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(generatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(resumeExPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generatePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resumeBuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(flowPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resumeExPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );

        resumeBuPanel.setVisible(false);
        generatePanel.setVisible(false);
        flowPanel.setVisible(false);
        flowPanel.setBackground(Constant.BKG);
        resumeExPanel.setVisible(false);
        resumeExPanel.setBackground(Constant.BKG);
        jLabel3.setVisible(false);

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateButtonMouseClicked
        String name = nameTextField.getText().trim();
        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "Coloque un nombre para el presupuesto", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }else{
            //Generate the budgets
            generateBudget(name);

        }        
    }//GEN-LAST:event_generateButtonMouseClicked
    private void generateBudget(String name){
        //Defining attiributes for the budgets.
            boolean isOk = true;
            double expendigTotal = 0;
            double ingressTotal = 0;
            Date actualDate = new Date();
            String date = new SimpleDateFormat(FORMAT_DATE).format(actualDate);
            List<Finance> finances;
            ExpendingJpaController ejc = new ExpendingJpaController(emf);
            IngressJpaController ijc = new IngressJpaController(emf);

            finances = ejc.findExpendingEntities();
            if(finances.isEmpty()){
                JOptionPane.showMessageDialog(this, "No tiene gastos registrados", "Error", JOptionPane.ERROR_MESSAGE);
                isOk = false;
            }
            //Get the total expendings
            for (Finance expending: finances){
                expendigTotal = (expendigTotal+expending.getFinanceTotal());
            }

            finances.clear();
            finances = ijc.findIngressEntities();
            if(finances.isEmpty()){
                JOptionPane.showMessageDialog(this, "No tiene ingresos registrados", "Error", JOptionPane.ERROR_MESSAGE);
                isOk = false;
            }
            //Get the total ingresses
            for(Finance ingresses: finances){
                ingressTotal = (ingressTotal + ingresses.getFinanceTotal());
            }
            //Clearing the list
            finances.clear();
            
            if(isOk){
                //Creating and persisting the budgets.
                Budget budget = new Budget(name);
                budget.setExpendingTotal(expendigTotal);
                budget.setIngressTotal(ingressTotal);
                budget.setStatus("A");
                budget.setGenerateDate(date);
                bjc.create(budget);
                jLabel1.setText("El Presupuesto se genero correctamente");
            }
            nameTextField.setText("");            
            loadWindow();
    }
    
    private void loadWindow(){
        List<Budget> budgets;
        budgets = bjc.findBudgetEntities();
        
        if(budgets.isEmpty()){
            jLabel1.setVisible(true);
            generatePanel.setVisible(true);
        }
        else{
            Budget budget = null;
            try {
                budget = bjc.getActual();
            } catch (NonexistentEntityException ex) {
                Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(budget.getExpendingTotal() > budget.getIngressTotal()){
                jLabel3.setVisible(true);
            }
            resumeBuPanel.setVisible(true);
            flowPanel.setVisible(true);
            resumeExPanel.setVisible(true);
            generatePanel.setVisible(false); 
            fillExpendingChart();
        }
    }
    
       private void fillExpendingChart(){
        ExpendingJpaController ejc = new ExpendingJpaController(emf);
        List<PieSlice> slices = new ArrayList<>();
        
        double fixedExpendingTotal = ejc.getExpendigsTotal(1);
        double servicesExpendingTotal = ejc.getExpendigsTotal(2);
        double leisureExpendingTotal = ejc.getExpendigsTotal(3);
        
        slices.add(new PieSlice(FIXED_EXPENSE_COLOR, fixedExpendingTotal, "Total de gastos fijos"));
        slices.add(new PieSlice(SERVICES_COLOR, servicesExpendingTotal, "Total de gastos pro servicios"));
        slices.add(new PieSlice(LEISURE_COLOR, leisureExpendingTotal, "Total de gastos por ocio y demas"));
        
        PieChart pieChart = new PieChart(slices);
        resumeExPanel.add(pieChart, BorderLayout.CENTER);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager BudgeManagePUEntityManager;
    private java.util.List<com.budgetmanage.entities.Account> accountList;
    private javax.persistence.Query accountQuery;
    private java.util.List<com.budgetmanage.entities.Budget> budgetList;
    private java.util.List<com.budgetmanage.entities.Budget> budgetList1;
    private java.util.List<com.budgetmanage.entities.Budget> budgetList2;
    private javax.persistence.Query budgetQuery;
    private javax.persistence.Query budgetQuery1;
    private javax.persistence.Query budgetQuery2;
    private javax.swing.JPanel flowPanel;
    private javax.swing.JButton generateButton;
    private javax.swing.JPanel generatePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JPanel resumeBuPanel;
    private javax.swing.JPanel resumeExPanel;
    private javax.swing.JTable resumeTable;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
