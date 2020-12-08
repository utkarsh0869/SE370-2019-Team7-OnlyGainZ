
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import java.util.*;

public class Dashboard extends javax.swing.JFrame {

    Quotes q = new Quotes();

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
        scaleImage();
        displayQuotes();
        addWindowListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        workoutsButton = new javax.swing.JButton();
        dashboardLabel = new javax.swing.JLabel();
        profileLabel = new javax.swing.JLabel();
        goalSetterButton = new javax.swing.JButton();
        nutritionButton = new javax.swing.JButton();
        leaderBoardButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        quoteTextArea = new javax.swing.JTextArea();
        gainzTrackerButton = new javax.swing.JButton();
        healthtipsButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        signOutJButton = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(219, 218, 216));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(792, 559));

        jPanel1.setBackground(new java.awt.Color(219, 218, 216));

        workoutsButton.setBackground(new java.awt.Color(237, 121, 68));
        workoutsButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        workoutsButton.setForeground(new java.awt.Color(231, 187, 165));
        workoutsButton.setText("WORKOUTS");
        workoutsButton.setOpaque(true);
        workoutsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        workoutsButton.setOpaque(true);
        workoutsButton.setPreferredSize(new java.awt.Dimension(207, 38));
        workoutsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workoutsButtonActionPerformed(evt);
            }
        });

        //dashboardLabel.setOpaque(true);
        dashboardLabel.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        dashboardLabel.setText("DASHBOARD");

        profileLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        profileLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileLabelMouseClicked(evt);
            }
        });

        goalSetterButton.setBackground(new java.awt.Color(237, 121, 68));
        goalSetterButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        goalSetterButton.setForeground(new java.awt.Color(231, 187, 165));
        goalSetterButton.setText("GOAL SETTER");
        goalSetterButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        goalSetterButton.setOpaque(true);
        goalSetterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goalSetterButtonActionPerformed(evt);
            }
        });

        nutritionButton.setBackground(new java.awt.Color(237, 121, 68));
        nutritionButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        nutritionButton.setForeground(new java.awt.Color(231, 187, 165));
        nutritionButton.setText("NUTRITION");
        nutritionButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        nutritionButton.setOpaque(true);
        nutritionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutritionButtonActionPerformed(evt);
            }
        });

        leaderBoardButton.setBackground(new java.awt.Color(237, 121, 68));
        leaderBoardButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        leaderBoardButton.setForeground(new java.awt.Color(231, 187, 165));
        leaderBoardButton.setText("LEADERBOARD");
        leaderBoardButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        leaderBoardButton.setOpaque(true);
        leaderBoardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderBoardButtonActionPerformed(evt);
            }
        });

        quoteTextArea.setEditable(false);
        quoteTextArea.setColumns(20);
        quoteTextArea.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        quoteTextArea.setLineWrap(true);
        quoteTextArea.setRows(5);
        quoteTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "QUOTE OF THE DAY", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        quoteTextArea.setLineWrap(true);
        quoteTextArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(quoteTextArea);
        quoteTextArea.setEditable(false);

        gainzTrackerButton.setBackground(new java.awt.Color(237, 121, 68));
        gainzTrackerButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        gainzTrackerButton.setForeground(new java.awt.Color(231, 187, 165));
        gainzTrackerButton.setText("GAINZ TRACKER");
        gainzTrackerButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        gainzTrackerButton.setOpaque(true);
        gainzTrackerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gainzTrackerButtonActionPerformed(evt);
            }
        });

        healthtipsButton.setBackground(new java.awt.Color(237, 121, 68));
        healthtipsButton.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        healthtipsButton.setForeground(new java.awt.Color(231, 187, 165));
        healthtipsButton.setText("HEALTH TIPS");
        healthtipsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        healthtipsButton.setOpaque(true);
        healthtipsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthtipsButtonActionPerformed(evt);
            }
        });

        String s = "Welcome " + OnlyGainz.userinfo[1];
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText(s);

        signOutJButton.setBackground(new java.awt.Color(237, 121, 68));
        signOutJButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        signOutJButton.setForeground(new java.awt.Color(231, 187, 165));
        signOutJButton.setText("Sign Out");
        signOutJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        signOutJButton.setOpaque(true);
        signOutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(healthtipsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(workoutsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nutritionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(gainzTrackerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(goalSetterButton, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(leaderBoardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dashboardLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(profileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(signOutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(profileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signOutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashboardLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(leaderBoardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nutritionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(workoutsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(healthtipsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gainzTrackerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goalSetterButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profileLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileLabelMouseClicked
        this.toBack();
        EditUserInfo edituserinfo= new EditUserInfo();
        edituserinfo.setVisible(true);
        edituserinfo.toFront();
        
    }//GEN-LAST:event_profileLabelMouseClicked

    private void workoutsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workoutsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workoutsButtonActionPerformed

    private void goalSetterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goalSetterButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goalSetterButtonActionPerformed

    private void nutritionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutritionButtonActionPerformed
        
        this.toBack();
        nutritionJFrame nutritiontab = new nutritionJFrame();
        nutritiontab.setVisible(true);
        nutritiontab.toFront();
                
    }//GEN-LAST:event_nutritionButtonActionPerformed

    private void leaderBoardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderBoardButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leaderBoardButtonActionPerformed

    private void gainzTrackerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gainzTrackerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gainzTrackerButtonActionPerformed

    private void healthtipsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthtipsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthtipsButtonActionPerformed

    private void signOutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutJButtonActionPerformed
        this.dispose();
        loginJFrame ljf = new loginJFrame();
        ljf.setVisible(true);
        ljf.setLocationRelativeTo(null);
    }//GEN-LAST:event_signOutJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboardLabel;
    private javax.swing.JButton gainzTrackerButton;
    private javax.swing.JButton goalSetterButton;
    private javax.swing.JButton healthtipsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton leaderBoardButton;
    private javax.swing.JButton nutritionButton;
    private javax.swing.JLabel profileLabel;
    private javax.swing.JTextArea quoteTextArea;
    private javax.swing.JButton signOutJButton;
    private javax.swing.JButton workoutsButton;
    // End of variables declaration//GEN-END:variables

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Dashboard().setVisible(true);
            }
        });
    }


    private void scaleImage() {
            ImageIcon icon = new ImageIcon("images/usericon.png");
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(profileLabel.getWidth(), profileLabel.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(imgScale);
            profileLabel.setIcon(scaledIcon);
    }
    
    private void addWindowListener() {
        
        WindowAdapter adapter = new WindowAdapter() {
            
        @Override
        public void windowLostFocus(WindowEvent e) {
            System.out.println("Focus Lost");
        }
        @Override
        public void windowClosing(WindowEvent e) {
        }
         @Override
        public void windowActivated(WindowEvent e) {
            System.out.println(OnlyGainz.userinfo[1]);
            jLabel1.setText("Welcome " + OnlyGainz.userinfo[1]);
        }
    };
     this.addWindowListener(adapter);
    }
   
    private void displayQuotes(){
        quoteTextArea.setText(q.returnRandomQuotesFromHashMap());
    }
}
