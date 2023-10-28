
package Pantallas;

import Entidades.Prenda;


public class PantallaAgregarEditar extends javax.swing.JFrame {

    
    ListaDeProductos padre;
    Prenda prendaSelec;
    int index;
    boolean edit = false;
    
    public PantallaAgregarEditar() {
        initComponents();
    }
    public PantallaAgregarEditar(ListaDeProductos padre) {
        initComponents();
        this.padre = padre;
    }
   public PantallaAgregarEditar(ListaDeProductos padre, Prenda prenda) {
        initComponents();
        this.padre = padre;
        prendaSelec = prenda;
        txtTipoDeRopa.setText(prendaSelec.getRopa());
        txtColor.setText(prendaSelec.getColor());
        txtMarca.setText(prendaSelec.getMarca());
        txtStock.setText(prendaSelec.getStock());
        txtPrecio.setText(prendaSelec.getPrecio());
        edit = true;
    }
    
    public PantallaAgregarEditar(ListaDeProductos padre, Prenda prenda, int index) {
        initComponents();
        this.padre = padre;
        this.index = index;
        prendaSelec = prenda;
        txtTipoDeRopa.setText(prendaSelec.getRopa());
        txtColor.setText(prendaSelec.getColor());
        txtMarca.setText(prendaSelec.getMarca());
        txtStock.setText(prendaSelec.getStock());
        txtPrecio.setText(prendaSelec.getPrecio());
        edit = true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtTipoDeRopa = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(83, 80, 237));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Producto.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(83, 80, 237));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/image 1.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Tipo de ropa.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Color.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Stock.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Marca.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Precio.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, -1));

        txtColor.setBackground(new java.awt.Color(56, 54, 169));
        txtColor.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtColor.setForeground(new java.awt.Color(255, 255, 255));
        txtColor.setBorder(null);
        jPanel2.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, 40));

        txtPrecio.setBackground(new java.awt.Color(56, 54, 169));
        txtPrecio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setBorder(null);
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 140, 40));

        txtStock.setBackground(new java.awt.Color(56, 54, 169));
        txtStock.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtStock.setForeground(new java.awt.Color(255, 255, 255));
        txtStock.setBorder(null);
        jPanel2.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 140, 40));

        txtTipoDeRopa.setBackground(new java.awt.Color(56, 54, 169));
        txtTipoDeRopa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTipoDeRopa.setForeground(new java.awt.Color(255, 255, 255));
        txtTipoDeRopa.setBorder(null);
        jPanel2.add(txtTipoDeRopa, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 140, 40));

        txtMarca.setBackground(new java.awt.Color(56, 54, 169));
        txtMarca.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMarca.setForeground(new java.awt.Color(255, 255, 255));
        txtMarca.setBorder(null);
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        jPanel2.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 150, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Rectangle 7.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Rectangle 7.png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Rectangle 7.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Rectangle 7.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Rectangle 7.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Group 6 (2).png"))); // NOI18N
        btnGuardar.setBorder(null);
        btnGuardar.setBorderPainted(false);
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Group 6 (2).png"))); // NOI18N
        btnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Group 11.png"))); // NOI18N
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Group 6 (3).png"))); // NOI18N
        btnCancelar.setToolTipText("");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Group 6 (3).png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesdeEditarAgregar/Group 10.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnGuardar)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        this.padre.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
            Prenda prenda = new Prenda();
            prenda.setRopa(txtTipoDeRopa.getText());
            prenda.setColor(txtColor.getText());
            prenda.setMarca(txtMarca.getText());
            prenda.setStock(txtStock.getText());
            prenda.setPrecio(txtPrecio.getText());
            this.padre.agregarPrenda(prenda);    
        
        this.padre.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaAgregarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaAgregarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaAgregarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaAgregarEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaAgregarEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTipoDeRopa;
    // End of variables declaration//GEN-END:variables
}
