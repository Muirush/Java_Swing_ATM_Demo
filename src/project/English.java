/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import project.Language;
import java.util.Date;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class English extends javax.swing.JFrame {
int account;
    /**
     * Creates new form English
     */
    public English() {
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
        deposit = new javax.swing.JButton();
        withdraw = new javax.swing.JButton();
        balance = new javax.swing.JButton();
        miniStatement = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        confirmDeposit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        screen = new javax.swing.JTextArea();
        print = new javax.swing.JButton();
        confirmWithdraw = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1350, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME TO SMARTCASH ATM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CHOOSE THE TRANSACTION YOU WANT TO CARRY OUT");

        deposit.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        deposit.setText("DEPOSIT");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });

        withdraw.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        withdraw.setText("WITHDRAW");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        balance.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        balance.setText("BALANCE");
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });

        miniStatement.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        miniStatement.setText("MINI STATEMENT");
        miniStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miniStatementActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("AMOUNT");

        amount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        amount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        confirmDeposit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmDeposit.setText("CONFIRM DEPOSIT");
        confirmDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmDepositActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("<-BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        screen.setColumns(20);
        screen.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        screen.setRows(5);
        screen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setViewportView(screen);

        print.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        print.setText("PRINT RECEIPT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        confirmWithdraw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        confirmWithdraw.setText("CONFIRM WITHDRAW");
        confirmWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmWithdrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(398, 398, 398)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 425, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deposit)
                                .addGap(91, 91, 91)
                                .addComponent(withdraw))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(confirmDeposit)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(confirmWithdraw))
                                    .addComponent(amount))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(back)
                                .addGap(54, 54, 54)
                                .addComponent(exit)
                                .addGap(107, 107, 107))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(clear)
                                .addGap(182, 182, 182)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(reset)
                        .addGap(172, 172, 172)
                        .addComponent(print)
                        .addGap(274, 274, 274))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addComponent(balance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(miniStatement)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(miniStatement, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(balance, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deposit)
                        .addComponent(withdraw)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmDeposit)
                            .addComponent(confirmWithdraw))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exit)
                            .addComponent(back))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reset)
                            .addComponent(print))
                        .addContainerGap(79, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        amount.setEnabled(true);
        screen.setEnabled(false);
        deposit.setEnabled(false);
        balance.setEnabled(false);
        miniStatement.setEnabled(false);
        clear.setEnabled(true);
        confirmWithdraw.setEnabled(true);
        confirmDeposit.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawActionPerformed

    private void balanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceActionPerformed
        screen.setText("************************************************************\n");
        screen.setText(screen.getText()+"  \t          $   SMARTCASH ATM   $\n");
        screen.setText(screen.getText()+"************************************************************\n");
        Date obj = new Date();
        String date = obj.toString();
        
        screen.setText(screen.getText()+"\n   "+date+"\n");
        screen.setText(screen.getText()+"\n  Current balance is: "+getCurrentBalance(PinAtm1.account)+"\n\n");
        screen.setText(screen.getText()+" \n   Account number: "+PinAtm1.account+"\n");
        screen.setText(screen.getText()+"\t\tOfficial Signature \n ");
        amount.setEnabled(false);
        screen.setEnabled(true);
        clear.setEnabled(false);
        confirmDeposit.setEnabled(false);
        confirmWithdraw.setEnabled(false);
        print.setEnabled(true);
        reset.setEnabled(true);
        deposit.setEnabled(false);
        balance.setEnabled(false);
        miniStatement.setEnabled(false);
         withdraw.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceActionPerformed

    private void miniStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miniStatementActionPerformed
        screen.setText("*******************************************************\n");
        screen.setText(screen.getText()+"  \t $   SMARTCASH ATM   $\n");
        screen.setText(screen.getText()+"*******************************************************\n");
        Date obj = new Date();
        String date = obj.toString();
        
        screen.setText(screen.getText()+"\n"+date+"\n");
        screen.setText(screen.getText()+"You have Carried the following transactions : \n");
        screen.setEnabled(true);
        print.setEnabled(true);
        reset.setEnabled(true);
        confirmDeposit.setEnabled(false);
        confirmWithdraw.setEnabled(false);
        amount.setEnabled(false);
        clear.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_miniStatementActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        amount.setText(null);
        withdraw.setEnabled(true);
        balance.setEnabled(true);
        miniStatement.setEnabled(true);
        deposit.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void confirmDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmDepositActionPerformed
        int amountDeposit = Integer.parseInt(amount.getText());
//       System.out.println(amountDeposit);
       int x = getCurrentBalance(PinAtm1.account);
//       System.out.println(x);
       int y;
       y = x + amountDeposit;
//       System.out.println(y);
       updateBalance( y, PinAtm1.account);
       if(amountDeposit <= 0 && amount.getText() == null ){
          JOptionPane.showMessageDialog(null, "NOT ALLOWED ","Invalid transaction", JOptionPane.ERROR_MESSAGE);
          
       }
//       else if (amountDeposit >= 1000000){
//       
//           JOptionPane.showMessageDialog(null, "Amount too big, go to the cashier", "Invalid transaction", JOptionPane.ERROR_MESSAGE);
//       }
       else{
        screen.setText("************************************************************\n");
        screen.setText(screen.getText()+"  \t          $  SMARTCASH ATM   $\n");
        screen.setText(screen.getText()+"************************************************************\n");
        Date obj = new Date();
        String date = obj.toString();
        
        screen.setText(screen.getText()+"\n   "+date+"\n");
        screen.setText(screen.getText()+" \n   You have successefully deposited "+amountDeposit+" \n   in your account"+"\n");
        screen.setText(screen.getText()+" \n   Account number: "+PinAtm1.account+"\n");
        screen.setText(screen.getText()+" \n   To check current balance press BALANCE above\n");
        screen.setText(screen.getText()+"\t\t Official Stamp");
        
        
        amount.setEnabled(false);
        screen.setEnabled(true);
        withdraw.setEnabled(true);
        balance.setEnabled(true);
        miniStatement.setEnabled(true);
        print.setEnabled(true);
        reset.setEnabled(true);
        deposit.setEnabled(true);
         clear.setEnabled(false);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmDepositActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        amount.setEnabled(false);
        screen.setEnabled(false);
        clear.setEnabled(false);
        confirmDeposit.setEnabled(false);
        confirmWithdraw.setEnabled(false);
        print.setEnabled(false);
        reset.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositActionPerformed
        amount.setEnabled(true);
        screen.setEnabled(false);
        withdraw.setEnabled(false);
        balance.setEnabled(false);
        miniStatement.setEnabled(false);
        clear.setEnabled(true);
        confirmDeposit.setEnabled(true);
        confirmWithdraw.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_depositActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        amount.setText(null);
        screen.setText(null);
        amount.setEnabled(true);
        screen.setEnabled(true);
        clear.setEnabled(true);
        confirmDeposit.setEnabled(true);
        print.setEnabled(true);
        reset.setEnabled(true);
        deposit.setEnabled(true);
        balance.setEnabled(true);
        miniStatement.setEnabled(true);
         withdraw.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
         try
         {
             screen.print();
         }
         catch(Exception ex)
         {
             
         }

           
       
        amount.setEnabled(true);
        screen.setEnabled(true);
        clear.setEnabled(true);
        confirmDeposit.setEnabled(true);
        print.setEnabled(true);
        reset.setEnabled(true);
        deposit.setEnabled(true);
        balance.setEnabled(true);
        miniStatement.setEnabled(true);
         withdraw.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Language English = new Language();
        English.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void confirmWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmWithdrawActionPerformed
      
        
        
         amount.setEnabled(false);
        screen.setEnabled(true);
        withdraw.setEnabled(true);
        balance.setEnabled(true);
        miniStatement.setEnabled(true);
        print.setEnabled(true);
        reset.setEnabled(true);
        deposit.setEnabled(true);
         clear.setEnabled(false);
         
         
         
          int amountWithdraw = Integer.parseInt(amount.getText());
//       System.out.println(amountDeposit);
       int x = getCurrentBalance(PinAtm1.account);
//       System.out.println(x);
       int z;
       z = x - amountWithdraw;
//       System.out.println(y);
       updateBalance( z, PinAtm1.account);
       if(amountWithdraw <= 0){
          JOptionPane.showMessageDialog(null, "NOT ALLOWED! ","Invalid transaction", JOptionPane.ERROR_MESSAGE);
       }
       else if(amountWithdraw > x){
           JOptionPane.showMessageDialog(null, "The amount you want to withdraw is greater than current balance, Take a loan" ,"LOAN Notification", JOptionPane.INFORMATION_MESSAGE);
          
       }
       else{
           
      
       screen.setText("************************************************************\n");
        screen.setText(screen.getText()+"  \t        $   SMARTCASH ATM   $\n");
        screen.setText(screen.getText()+"************************************************************\n");
        Date obj = new Date();
        String date = obj.toString();
        
        screen.setText(screen.getText()+"\n   "+date+"\n");
        screen.setText(screen.getText()+" \n You have successefully withdrawn: "+amountWithdraw+" from your account"+"\n");
        screen.setText(screen.getText()+" \n Account number: "+PinAtm1.account+"\n");
        screen.setText(screen.getText()+" \n To check current balance press BALANCE above\n");
        screen.setText(screen.getText()+"\t\t Official Stamp");
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmWithdrawActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
 
    }//GEN-LAST:event_amountActionPerformed
public void updateBalance(int newBalance, int acc){
       
        Connection con = PinAtm1.con;               
        try {           
            
            PreparedStatement ps;
            ps = con.prepareStatement("UPDATE users SET balance = ? WHERE accountNo = ?");
            ps.setInt(1, newBalance);
            ps.setInt(2, acc);
            
          ps.execute();
            
        } catch (SQLException ex) {
            Logger.getLogger(PinAtm1.class.getName()).log(Level.SEVERE, null, ex);

        }
        
        
    }
    public int getCurrentBalance(int acc){
        try {
            PinAtm1 atm = new PinAtm1();
            Connection con = atm.getConnection();
            
            PreparedStatement ps;
            ps = con.prepareStatement("SELECT * FROM users WHERE accountNo = ? ");
            ps.setInt(1, acc);
            
           System.out.println("Hellow world");
           System.out.println(acc);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                return result.getInt("balance");
            }
            return 0;
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(English.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(English.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(English.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(English.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(English.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new English().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton back;
    private javax.swing.JButton balance;
    private javax.swing.JButton clear;
    private javax.swing.JButton confirmDeposit;
    private javax.swing.JButton confirmWithdraw;
    private javax.swing.JButton deposit;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton miniStatement;
    private javax.swing.JButton print;
    private javax.swing.JButton reset;
    private javax.swing.JTextArea screen;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}