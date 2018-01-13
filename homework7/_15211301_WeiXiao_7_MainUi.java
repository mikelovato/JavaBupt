package homework7;

import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.Dimension;

public class _15211301_WeiXiao_7_MainUi extends javax.swing.JFrame
{
    /* The controller "pointer" */
    _15211301_WeiXiao_7_Controll controller = _15211301_WeiXiao_7_Controll.getInstance();
    private static int init = 0;

    /**
     * Creates new form StrategiesUI
     */
    public _15211301_WeiXiao_7_MainUi() {

        initComponents();
        setVisible(true);
        String welcomeInfo = "完成书籍信息与优惠信息的初始化。";
        if (init == 0){
            JOptionPane.showMessageDialog(null, welcomeInfo, "初始化", JOptionPane.INFORMATION_MESSAGE);
            init = 1;
        }


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        bStrategy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bBook = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        bBuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(500, 520));
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(size.width / 2 - 300, size.height / 2 - 300);

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("书店");

        bStrategy.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        bStrategy.setText("策略管理");
        bStrategy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bStrategyActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Handwriting", 1, 14)); // NOI18N
        jLabel1.setText("Create by WeiXiao");

        bBook.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        bBook.setText("添加书籍");
        bBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBookActionPerformed(evt);
            }
        });

        bExit.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        bExit.setText("退出");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bBuy.setFont(new java.awt.Font("Microsoft Tai Le", 1, 14)); // NOI18N
        bBuy.setText("我要买书");
        bBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(200, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel1)))
                                                .addGap(189, 189, 189))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(bBook, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bStrategy, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(244, 244, 244))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(46, 46, 46)
                                .addComponent(bBook, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bStrategy, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuyActionPerformed
        new _15211301_WeiXiao_7_AddBookUI().setVisible(true);
        dispose();
    }

    private void bStrategyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuyActionPerformed
        new _15211301_WeiXiao_7_StrategiesUI().setVisible(true);
        dispose();
    }

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        JOptionPane.showMessageDialog(null, "这个程序将运行结束", "退出", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_bExitActionPerformed

    private void bBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuyActionPerformed
        new _15211301_WeiXiao_7_BuyUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_bBuyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(_15211301_WeiXiao_7_MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(_15211301_WeiXiao_7_MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(_15211301_WeiXiao_7_MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(_15211301_WeiXiao_7_MainUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _15211301_WeiXiao_7_MainUi();

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBook;
    private javax.swing.JButton bBuy;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bStrategy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
