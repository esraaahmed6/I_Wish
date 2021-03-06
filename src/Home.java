/*pl
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.google.gson.Gson;
import java.awt.Color;
import javax.swing.JPanel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xml.sax.Attributes;


/**
 *
 * @author Admin
 */
public class Home extends javax.swing.JFrame {
    Streams stream;
    int mouserpx ;
    int mouserpy ;
    /**
     * Creates new form Home
     */
    public Home(Streams stream) {
        initComponents();
        this.stream = stream;
        ////Da esm el logged in user
        jLabel1.setText(stream.myUsername);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenu1 = new javax.swing.JMenu();
        side_pane = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        homee = new javax.swing.JLabel();
        friendsrequest = new javax.swing.JLabel();
        recharge = new javax.swing.JLabel();
        mywishlist = new javax.swing.JLabel();
        myfriends1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        EXIT = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12/1/2018", "Expresso POS"},
                {"12/1/2018", "ROM Gen"}
            },
            new String [] {
                "no", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(22);
        jScrollPane1.setViewportView(jTable1);

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_pane.setBackground(new java.awt.Color(23, 35, 51));
        side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Exit_25px.png"))); // NOI18N
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        side_pane.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 100, 43));

        homee.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        homee.setForeground(new java.awt.Color(255, 255, 255));
        homee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-home-25 (2).png"))); // NOI18N
        homee.setText("Home");
        homee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeeMouseClicked(evt);
            }
        });
        side_pane.add(homee, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 130, 40));
        homee.getAccessibleContext().setAccessibleParent(homee);

        friendsrequest.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        friendsrequest.setForeground(new java.awt.Color(255, 255, 255));
        friendsrequest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-friends-25.png"))); // NOI18N
        friendsrequest.setText("Friend Requests");
        friendsrequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friendsrequestMouseClicked(evt);
            }
        });
        side_pane.add(friendsrequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, 36));

        recharge.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        recharge.setForeground(new java.awt.Color(255, 255, 255));
        recharge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-prepaid-recharge-20 (1).png"))); // NOI18N
        recharge.setText("Recharge");
        recharge.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechargeMouseClicked(evt);
            }
        });
        side_pane.add(recharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 120, 43));

        mywishlist.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mywishlist.setForeground(new java.awt.Color(255, 255, 255));
        mywishlist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-wish-list-25.png"))); // NOI18N
        mywishlist.setText("My Wish List ");
        mywishlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mywishlistMouseClicked(evt);
            }
        });
        side_pane.add(mywishlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 43));

        myfriends1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        myfriends1.setForeground(new java.awt.Color(255, 255, 255));
        myfriends1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-friends-25.png"))); // NOI18N
        myfriends1.setText("My Friends");
        myfriends1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myfriends1MouseClicked(evt);
            }
        });
        side_pane.add(myfriends1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 36));
        side_pane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N
        side_pane.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N
        side_pane.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N
        side_pane.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-hello-20.png"))); // NOI18N
        jLabel1.setText("jLabel1-");
        side_pane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 100, -1));

        getContentPane().add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 460));

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setAutoscrolls(true);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/c8852ae6-60bc-4ec0-9ee0-da5f82f03b01_2_610x400.jpg"))); // NOI18N

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(desktopPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 610, 400));
        desktopPane.getAccessibleContext().setAccessibleName("");

        jPanel2.setBackground(new java.awt.Color(23, 35, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        EXIT.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        EXIT.setForeground(new java.awt.Color(255, 255, 255));
        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_25px.png"))); // NOI18N
        EXIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EXITMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("-");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-star-15.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(105, 105, 105)
                        .addComponent(jLabel10)
                        .addGap(109, 109, 109)
                        .addComponent(jLabel8)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel6)
                        .addGap(118, 118, 118)
                        .addComponent(jLabel16)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(106, 106, 106)
                        .addComponent(jLabel9)
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel5)
                        .addGap(120, 120, 120)))
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EXIT)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(EXIT)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(13, 13, 13))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EXITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EXITMouseClicked
                  System.exit(0);          // to exit from app
    }//GEN-LAST:event_EXITMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        login  log = new login();// object from login class
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(RegisterForm.EXIT_ON_CLOSE);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

    private void friendsrequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friendsrequestMouseClicked
        friendsrequest req = new friendsrequest(stream);
        desktopPane.removeAll();
        desktopPane.add(req).setVisible(true);
        
    }//GEN-LAST:event_friendsrequestMouseClicked

    private void homeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeeMouseClicked
        homepic home = new homepic(stream);
        desktopPane.removeAll();
        desktopPane.add(home).setVisible(true);                // TODO add your handling code here:
    }//GEN-LAST:event_homeeMouseClicked

    private void rechargeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechargeMouseClicked
        uwish wish = new uwish(stream);
        desktopPane.removeAll();
        desktopPane.add(wish).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_rechargeMouseClicked

    private void mywishlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mywishlistMouseClicked
        wishlist wish = new wishlist(stream);
        desktopPane.removeAll();
        desktopPane.add(wish).setVisible(true);
        UserDTO regWishList = new UserDTO();
        //Streams stream = new Streams();
        regWishList.tag="ShowYourWishList";
        regWishList.username=Streams.myUsername;
        String data = new Gson().toJson(regWishList);
        stream.pos.println(data);      // TODO add your handling code here:
    }//GEN-LAST:event_mywishlistMouseClicked

    private void myfriends1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myfriends1MouseClicked
        myfriends friend = new myfriends(stream);
        desktopPane.removeAll();
        desktopPane.add(friend).setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_myfriends1MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int kordinatx = evt.getXOnScreen();
        int kordinaty = evt.getYOnScreen();
        this.setLocation(kordinatx-mouserpx, kordinaty-mouserpy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
           mouserpx =evt.getX();
           mouserpy =evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setState(login.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home(null).setVisible(true);
            }
        });
    }
   
    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EXIT;
    private javax.swing.JPanel desktopPane;
    private javax.swing.JLabel friendsrequest;
    private javax.swing.JLabel homee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel myfriends1;
    private javax.swing.JLabel mywishlist;
    private javax.swing.JLabel recharge;
    private javax.swing.JPanel side_pane;
    // End of variables declaration//GEN-END:variables
}
