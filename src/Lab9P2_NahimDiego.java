
import Clases.Dba;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Diego Vasquez
 */
public class Lab9P2_NahimDiego extends javax.swing.JFrame {

    /**
     * Creates new form Lab9P2_NahimDiego
     */
    public Lab9P2_NahimDiego() {
        
        
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

        jp_Fondo = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jl_OrderId = new javax.swing.JLabel();
        jt_OrderId = new javax.swing.JTextField();
        jl_OrderDate = new javax.swing.JLabel();
        jt_OrderDate = new javax.swing.JTextField();
        jl_OrderId2 = new javax.swing.JLabel();
        jt_ShipDate = new javax.swing.JTextField();
        jl_OrderId3 = new javax.swing.JLabel();
        jt_ShipMode = new javax.swing.JTextField();
        jl_OrderId4 = new javax.swing.JLabel();
        jt_CostumerId = new javax.swing.JTextField();
        jl_OrderId5 = new javax.swing.JLabel();
        jt_CostumerName = new javax.swing.JTextField();
        jl_OrderId6 = new javax.swing.JLabel();
        jt_State = new javax.swing.JTextField();
        jl_OrderId7 = new javax.swing.JLabel();
        jt_PostalCode = new javax.swing.JTextField();
        jl_OrderId8 = new javax.swing.JLabel();
        jt_Region = new javax.swing.JTextField();
        jl_OrderId9 = new javax.swing.JLabel();
        jt_Segment = new javax.swing.JTextField();
        jl_Country = new javax.swing.JLabel();
        jt_Country = new javax.swing.JTextField();
        jl_OrderId11 = new javax.swing.JLabel();
        jt_City = new javax.swing.JTextField();
        jl_OrderId12 = new javax.swing.JLabel();
        jt_ProductId = new javax.swing.JTextField();
        jl_OrderId13 = new javax.swing.JLabel();
        jt_Category = new javax.swing.JTextField();
        jl_OrderId14 = new javax.swing.JLabel();
        jt_SubCategory = new javax.swing.JTextField();
        jl_OrderId15 = new javax.swing.JLabel();
        jt_ProductName = new javax.swing.JTextField();
        jl_OrderId16 = new javax.swing.JLabel();
        jt_Sales = new javax.swing.JTextField();
        jl_OrderId17 = new javax.swing.JLabel();
        jt_Quantity = new javax.swing.JTextField();
        jt_Profit = new javax.swing.JTextField();
        jl_OrderId18 = new javax.swing.JLabel();
        jt_Discount = new javax.swing.JTextField();
        jl_OrderId19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jp_Fondo.setBackground(new java.awt.Color(255, 255, 255));
        jp_Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jl_OrderId.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId.setText("Order ID:");

        jl_OrderDate.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderDate.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderDate.setText("Order Date:");

        jl_OrderId2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId2.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId2.setText("Ship Date:");

        jl_OrderId3.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId3.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId3.setText("Ship Mode:");

        jl_OrderId4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId4.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId4.setText("Costumer ID:");

        jl_OrderId5.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId5.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId5.setText("Costumer Name:");

        jl_OrderId6.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId6.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId6.setText("State:");

        jl_OrderId7.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId7.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId7.setText("Postal Code:");

        jl_OrderId8.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId8.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId8.setText("Region:");

        jl_OrderId9.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId9.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId9.setText("Segment:");

        jl_Country.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_Country.setForeground(new java.awt.Color(0, 0, 0));
        jl_Country.setText("Country:");

        jl_OrderId11.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId11.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId11.setText("City:");

        jl_OrderId12.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId12.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId12.setText("Product ID:");

        jl_OrderId13.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId13.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId13.setText("Category:");

        jl_OrderId14.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId14.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId14.setText("Sub-Category:");

        jl_OrderId15.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId15.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId15.setText("Product Name:");

        jl_OrderId16.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId16.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId16.setText("Sales:");

        jl_OrderId17.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId17.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId17.setText("Quantity:");

        jl_OrderId18.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId18.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId18.setText("Discount:");

        jl_OrderId19.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jl_OrderId19.setForeground(new java.awt.Color(0, 0, 0));
        jl_OrderId19.setText("Profit:");

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setText("Agregar Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_OrderId16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_Sales, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jl_OrderId17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jl_OrderId18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_Discount, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_OrderId19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_Profit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_OrderId15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jt_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_OrderId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jl_OrderDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_OrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jl_OrderId2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_OrderId3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_ShipMode, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(jl_OrderId4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_CostumerId, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jl_OrderId5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_ShipDate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_CostumerName, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_OrderId9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_Segment, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jl_Country)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_OrderId6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_State, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jl_OrderId7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_OrderId11)
                            .addComponent(jl_OrderId8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jt_City, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jt_Region, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jl_OrderId12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_ProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jl_OrderId13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jt_Category))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(327, 327, 327)
                                .addComponent(jt_PostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jl_OrderId14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jt_SubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_OrderId)
                    .addComponent(jt_OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderDate)
                    .addComponent(jt_OrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderId2)
                    .addComponent(jt_ShipDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_OrderId3)
                    .addComponent(jt_ShipMode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderId4)
                    .addComponent(jt_CostumerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderId5)
                    .addComponent(jt_CostumerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_OrderId9)
                    .addComponent(jt_Segment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_Country)
                    .addComponent(jt_Country, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderId11)
                    .addComponent(jt_City, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_OrderId6)
                    .addComponent(jt_State, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderId7)
                    .addComponent(jt_PostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderId8)
                    .addComponent(jt_Region, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_OrderId12)
                    .addComponent(jt_ProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderId13)
                    .addComponent(jt_Category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderId14)
                    .addComponent(jt_SubCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_OrderId15)
                    .addComponent(jt_ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_OrderId16)
                    .addComponent(jt_Sales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderId17)
                    .addComponent(jt_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderId18)
                    .addComponent(jt_Discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_OrderId19)
                    .addComponent(jt_Profit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Agregar Registro", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Listar Registro", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Eliminar Registro", jPanel3);

        jp_Fondo.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        database.conectar();
        try {
            database.query.executeUpdate("insert into TenRecord (\""+jt_OrderId.getText()+"\",\""+jt_OrderDate.getText()+"\",\""+jt_ShipDate.getText()+"\",\""+jt_ShipMode.getText()+"\",\""+jt_CostumerId.getText()+"\",\""+jt_CostumerName.getText()+
                    "\",\""+jt_Segment.getText()+"\",\""+jt_Country.getText()+"\",\""+jt_City.getText()+"\",\""+jt_State.getText()+"\",\""+jt_PostalCode.getText()+"\",\""+jt_Region.getText()+"\",\""+jt_ProductId.getText()+"\",\""+jt_Category.getText()+
                    "\",\""+jt_SubCategory.getText()+"\",\""+jt_ProductName.getText()+"\",\""+jt_Sales.getText()+"\",\""+jt_Quantity.getText()+"\",\""+jt_Discount.getText()+"\",\""+jt_Profit.getText()+"\")");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        database.desconectar();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Lab9P2_NahimDiego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lab9P2_NahimDiego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lab9P2_NahimDiego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lab9P2_NahimDiego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lab9P2_NahimDiego().setVisible(true);
            }
        });
    }
    Dba database= new Dba("./TENRECORD1.mdb");
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel jl_Country;
    private javax.swing.JLabel jl_OrderDate;
    private javax.swing.JLabel jl_OrderId;
    private javax.swing.JLabel jl_OrderId11;
    private javax.swing.JLabel jl_OrderId12;
    private javax.swing.JLabel jl_OrderId13;
    private javax.swing.JLabel jl_OrderId14;
    private javax.swing.JLabel jl_OrderId15;
    private javax.swing.JLabel jl_OrderId16;
    private javax.swing.JLabel jl_OrderId17;
    private javax.swing.JLabel jl_OrderId18;
    private javax.swing.JLabel jl_OrderId19;
    private javax.swing.JLabel jl_OrderId2;
    private javax.swing.JLabel jl_OrderId3;
    private javax.swing.JLabel jl_OrderId4;
    private javax.swing.JLabel jl_OrderId5;
    private javax.swing.JLabel jl_OrderId6;
    private javax.swing.JLabel jl_OrderId7;
    private javax.swing.JLabel jl_OrderId8;
    private javax.swing.JLabel jl_OrderId9;
    private javax.swing.JPanel jp_Fondo;
    private javax.swing.JTextField jt_Category;
    private javax.swing.JTextField jt_City;
    private javax.swing.JTextField jt_CostumerId;
    private javax.swing.JTextField jt_CostumerName;
    private javax.swing.JTextField jt_Country;
    private javax.swing.JTextField jt_Discount;
    private javax.swing.JTextField jt_OrderDate;
    private javax.swing.JTextField jt_OrderId;
    private javax.swing.JTextField jt_PostalCode;
    private javax.swing.JTextField jt_ProductId;
    private javax.swing.JTextField jt_ProductName;
    private javax.swing.JTextField jt_Profit;
    private javax.swing.JTextField jt_Quantity;
    private javax.swing.JTextField jt_Region;
    private javax.swing.JTextField jt_Sales;
    private javax.swing.JTextField jt_Segment;
    private javax.swing.JTextField jt_ShipDate;
    private javax.swing.JTextField jt_ShipMode;
    private javax.swing.JTextField jt_State;
    private javax.swing.JTextField jt_SubCategory;
    // End of variables declaration//GEN-END:variables
}
