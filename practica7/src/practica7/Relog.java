package practica7;

public class Relog extends javax.swing.JFrame {
    
    ListaCD Meses =new ListaCD();
    ListaCD Dias =new ListaCD();
    ListaCD Horas =new ListaCD();
    ListaCD Minutos =new ListaCD();
    int conMeses=1,conDias=1,conHoras=1,conMinutos=0;
    
    public Relog() {
        initComponents();
        Meses.insertar("Ene");Meses.insertar("Feb");Meses.insertar("Mar");Meses.insertar("Abr");Meses.insertar("May");Meses.insertar("Jun");
        Meses.insertar("Jul");Meses.insertar("Ago");Meses.insertar("Sep");Meses.insertar("Oct");Meses.insertar("Nov");Meses.insertar("Dic");
        for(int i=0;i<31;i++){
            Dias.insertar(i+1);
        }
        for(int i=0;i<24;i++){
            Horas.insertar(i+1);
        }
        for(int i=0;i<60;i++){
            Minutos.insertar(i+1);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        LabelMes = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LabelDia = new javax.swing.JLabel();
        BotonBajarDia = new javax.swing.JButton();
        BotonSubirDia = new javax.swing.JButton();
        BotonBajarMes = new javax.swing.JButton();
        BotonSubirMes = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        LabelHora = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LabelMinutos = new javax.swing.JLabel();
        BotonBajarMinutos = new javax.swing.JButton();
        BotonSubirMinutos = new javax.swing.JButton();
        BotonBajarHora = new javax.swing.JButton();
        BotonSubirHora = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        LabelMes.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LabelMes.setText("Ene");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText(":");

        LabelDia.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LabelDia.setText("1");

        BotonBajarDia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BotonBajarDia.setText("↑");
        BotonBajarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBajarDiaActionPerformed(evt);
            }
        });

        BotonSubirDia.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BotonSubirDia.setText("↓");
        BotonSubirDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSubirDiaActionPerformed(evt);
            }
        });

        BotonBajarMes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BotonBajarMes.setText("↑");
        BotonBajarMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBajarMesActionPerformed(evt);
            }
        });

        BotonSubirMes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BotonSubirMes.setText("↓");
        BotonSubirMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSubirMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonBajarMes)
                    .addComponent(BotonSubirMes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelMes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonBajarDia)
                    .addComponent(BotonSubirDia))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelMes)
                            .addComponent(jLabel2)
                            .addComponent(LabelDia)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(BotonBajarMes)
                        .addGap(18, 18, 18)
                        .addComponent(BotonSubirMes))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(BotonBajarDia)
                        .addGap(18, 18, 18)
                        .addComponent(BotonSubirDia)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("MES", jPanel4);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        LabelHora.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LabelHora.setText("0");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText(":");

        LabelMinutos.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LabelMinutos.setText("0");

        BotonBajarMinutos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BotonBajarMinutos.setText("↑");
        BotonBajarMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBajarMinutosActionPerformed(evt);
            }
        });

        BotonSubirMinutos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BotonSubirMinutos.setText("↓");
        BotonSubirMinutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSubirMinutosActionPerformed(evt);
            }
        });

        BotonBajarHora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BotonBajarHora.setText("↑");
        BotonBajarHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBajarHoraActionPerformed(evt);
            }
        });

        BotonSubirHora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BotonSubirHora.setText("↓");
        BotonSubirHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSubirHoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonBajarHora)
                    .addComponent(BotonSubirHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelMinutos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonSubirMinutos)
                    .addComponent(BotonBajarMinutos))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelHora)
                            .addComponent(jLabel5)
                            .addComponent(LabelMinutos)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonBajarHora)
                        .addGap(18, 18, 18)
                        .addComponent(BotonSubirHora))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonBajarMinutos)
                        .addGap(18, 18, 18)
                        .addComponent(BotonSubirMinutos)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("HORA", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBajarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBajarDiaActionPerformed
        conDias--;
        if(conDias<1){conDias=31;}
        Comparable bus=Dias.buscar(conDias);
        LabelDia.setText(String.valueOf(bus));
    }//GEN-LAST:event_BotonBajarDiaActionPerformed

    private void BotonSubirMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSubirMesActionPerformed
        conMeses++;
        if(conMeses>12){conMeses=1;}
        String m="";
        if(conMeses==1){m="Ene";}if(conMeses==2){m="Feb";}if(conMeses==3){m="Mar";}if(conMeses==4){m="Abr";}if(conMeses==5){m="May";}if(conMeses==6){m="Jun";}
        if(conMeses==7){m="Jul";}if(conMeses==8){m="Ago";}if(conMeses==9){m="Sep";}if(conMeses==10){m="Oct";}if(conMeses==11){m="Nov";}if(conMeses==12){m="Dic";}
        Comparable bus=Meses.buscar(m);
        LabelMes.setText(String.valueOf(bus));
    }//GEN-LAST:event_BotonSubirMesActionPerformed

    private void BotonSubirDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSubirDiaActionPerformed
        conDias++;
        if(conDias>31){conDias=1;}
        Comparable bus=Dias.buscar(conDias);
        LabelDia.setText(String.valueOf(bus));
    }//GEN-LAST:event_BotonSubirDiaActionPerformed

    private void BotonBajarMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBajarMesActionPerformed
        conMeses--;
        if(conMeses<1){conMeses=12;}
        String m="";
        if(conMeses==1){m="Ene";}if(conMeses==2){m="Feb";}if(conMeses==3){m="Mar";}if(conMeses==4){m="Abr";}if(conMeses==5){m="May";}if(conMeses==6){m="Jun";}
        if(conMeses==7){m="Jul";}if(conMeses==8){m="Ago";}if(conMeses==9){m="Sep";}if(conMeses==10){m="Oct";}if(conMeses==11){m="Nov";}if(conMeses==12){m="Dic";}
        Comparable bus=Meses.buscar(m);
        LabelMes.setText(String.valueOf(bus));
    }//GEN-LAST:event_BotonBajarMesActionPerformed

    private void BotonBajarHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBajarHoraActionPerformed
        conHoras--;
        if(conHoras<1){conHoras=24;}
        Comparable bus=Horas.buscar(conHoras);
        LabelHora.setText(String.valueOf(bus));
    }//GEN-LAST:event_BotonBajarHoraActionPerformed

    private void BotonSubirHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSubirHoraActionPerformed
        conHoras++;
        if(conHoras>24){conHoras=1;}
        Comparable bus=Horas.buscar(conHoras);
        LabelHora.setText(String.valueOf(bus));
    }//GEN-LAST:event_BotonSubirHoraActionPerformed

    private void BotonBajarMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBajarMinutosActionPerformed
        conMinutos--;
        if(conMinutos<1){conMinutos=59;}
        Comparable bus=Minutos.buscar(conMinutos);
        LabelMinutos.setText(String.valueOf(bus));
    }//GEN-LAST:event_BotonBajarMinutosActionPerformed

    private void BotonSubirMinutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSubirMinutosActionPerformed
        conMinutos++;
        if(conMinutos>59){conMinutos=1;}
        Comparable bus=Minutos.buscar(conMinutos);
        LabelMinutos.setText(String.valueOf(bus));
    }//GEN-LAST:event_BotonSubirMinutosActionPerformed

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
            java.util.logging.Logger.getLogger(Relog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBajarDia;
    private javax.swing.JButton BotonBajarHora;
    private javax.swing.JButton BotonBajarMes;
    private javax.swing.JButton BotonBajarMinutos;
    private javax.swing.JButton BotonSubirDia;
    private javax.swing.JButton BotonSubirHora;
    private javax.swing.JButton BotonSubirMes;
    private javax.swing.JButton BotonSubirMinutos;
    private javax.swing.JLabel LabelDia;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelMes;
    private javax.swing.JLabel LabelMinutos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
