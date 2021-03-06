
import java.awt.Image;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utkarshgerrard
 */
public class dinnerJFrame extends javax.swing.JFrame {

    Dinner dinner = new Dinner();
    /**
     * Creates new form dinnerJFrame
     */
    public dinnerJFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        scaleImages();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sampleD1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sampleDTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        sampleD2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sampleDTextArea2 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        sampleD3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sampleDTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        // setBackground();
        getContentPane().setBackground(new java.awt.Color(219, 218, 216));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(219, 218, 216));

        sampleDTextArea1.setEditable(false);
        sampleDTextArea1.setColumns(20);
        sampleDTextArea1.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        sampleDTextArea1.setLineWrap(true);
        sampleDTextArea1.setWrapStyleWord(true);
        sampleDTextArea1.setRows(5);
        jScrollPane1.setViewportView(sampleDTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sampleD1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
            .addComponent(sampleD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(237, 121, 68));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(231, 187, 165));
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("                                 SAMPLE DINNER DISHES FOR YOU TO TRY");

        jPanel2.setBackground(new java.awt.Color(219, 218, 216));

        sampleDTextArea2.setEditable(false);
        sampleDTextArea2.setColumns(20);
        sampleDTextArea2.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        sampleDTextArea2.setLineWrap(true);
        sampleDTextArea2.setWrapStyleWord(true);
        sampleDTextArea2.setRows(5);
        jScrollPane2.setViewportView(sampleDTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sampleD2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sampleD2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(219, 218, 216));

        sampleDTextArea3.setEditable(false);
        sampleDTextArea3.setColumns(20);
        sampleDTextArea3.setFont(new java.awt.Font("Lucida Grande", 2, 18)); // NOI18N
        sampleDTextArea3.setLineWrap(true);
        sampleDTextArea3.setWrapStyleWord(true);
        sampleDTextArea3.setRows(5);
        jScrollPane3.setViewportView(sampleDTextArea3);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sampleD3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(sampleD3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
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
            java.util.logging.Logger.getLogger(dinnerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dinnerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dinnerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dinnerJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dinnerJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel sampleD1;
    private javax.swing.JLabel sampleD2;
    private javax.swing.JLabel sampleD3;
    private javax.swing.JTextArea sampleDTextArea1;
    private javax.swing.JTextArea sampleDTextArea2;
    private javax.swing.JTextArea sampleDTextArea3;
    // End of variables declaration//GEN-END:variables

    private void scaleImages() {
            Random r = new Random();
        //if the user is above 6'5 and weighs more than 197 lbs
        if(Integer.parseInt(OnlyGainz.userinfo[7]) >= 195 && Integer.parseInt(OnlyGainz.userinfo[8]) >= 197){
            
            int [] arr = new int[3];
            int j = 0;
            
            Set<Integer>set = new LinkedHashSet<Integer>();
            
            //generates non repeating random numbers and adds it to the set
            while (set.size() < 3) {
                set.add(r.nextInt(15)+1);
            }
            
            Iterator<Integer> i = set.iterator(); 
            
            while (i.hasNext()) {
                arr[j] = i.next();
                j++;
            }
            
            String s = Integer.toString(arr[0]);
            String ss = "dinner_images/" + s + ".png";
            
            ImageIcon icon = new ImageIcon(ss);
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(sampleD1.getWidth(), sampleD1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(imgScale);
            sampleD1.setIcon(scaledIcon);
            sampleDTextArea1.setText(dinner.returnRandomFoodDescriptionFromHashMap(arr[0]));
            
            s = Integer.toString(arr[1]);
            ss = "dinner_images/" + s + ".png";
            
            ImageIcon icon2 = new ImageIcon(ss);
            Image img2 = icon2.getImage();
            Image imgScale2 = img2.getScaledInstance(sampleD2.getWidth(), sampleD2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
            sampleD2.setIcon(scaledIcon2);  
            sampleDTextArea2.setText(dinner.returnRandomFoodDescriptionFromHashMap(arr[1]));
            
            s = Integer.toString(arr[2]);
            ss = "dinner_images/" + s + ".png";
            
            ImageIcon icon3 = new ImageIcon(ss);
            Image img3 = icon3.getImage();
            Image imgScale3 = img3.getScaledInstance(sampleD3.getWidth(), sampleD3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
            sampleD3.setIcon(scaledIcon3); 
            sampleDTextArea3.setText(dinner.returnRandomFoodDescriptionFromHashMap(arr[2]));

        }
        //if the person is smaller than 6'5 and taller than 5'5 and weighs in between 144 and 197 lbs
        else if( ( (Integer.parseInt(OnlyGainz.userinfo[7]) < 195) && (Integer.parseInt(OnlyGainz.userinfo[7]) >= 165) ) 
               && ( (Integer.parseInt(OnlyGainz.userinfo[8]) < 197) && (Integer.parseInt(OnlyGainz.userinfo[8]) >= 144) ) ){
      
            int [] arr = new int[3];
            int j = 0;
            
            Set<Integer>set = new LinkedHashSet<Integer>();
            
            //generates non repeating random numbers and adds it to the set
            while (set.size() < 3) {
                set.add(r.nextInt(20)+1);
            }
            
            Iterator<Integer> i = set.iterator(); 
            
            while (i.hasNext()) {
                arr[j] = i.next();
                j++;
            }
            
            String s = Integer.toString(arr[0]);
            String ss = "dinner_images/" + s + ".png";
            
            ImageIcon icon = new ImageIcon(ss);
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(sampleD1.getWidth(), sampleD1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(imgScale);
            sampleD1.setIcon(scaledIcon);
            sampleDTextArea1.setText(dinner.returnRandomFoodDescriptionFromHashMap(arr[0]));
            
            s = Integer.toString(arr[1]);
            ss = "dinner_images/" + s + ".png";
            
            ImageIcon icon2 = new ImageIcon(ss);
            Image img2 = icon2.getImage();
            Image imgScale2 = img2.getScaledInstance(sampleD2.getWidth(), sampleD2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
            sampleD2.setIcon(scaledIcon2);  
            sampleDTextArea2.setText(dinner.returnRandomFoodDescriptionFromHashMap(arr[1]));
            
            s = Integer.toString(arr[2]);
            ss = "dinner_images/" + s + ".png";
            
            ImageIcon icon3 = new ImageIcon(ss);
            Image img3 = icon3.getImage();
            Image imgScale3 = img3.getScaledInstance(sampleD3.getWidth(), sampleD3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
            sampleD3.setIcon(scaledIcon3); 
            sampleDTextArea3.setText(dinner.returnRandomFoodDescriptionFromHashMap(arr[2]));            
            
        }
        else //any other type of person with weight and heigh below
        {
            int [] arr = new int[3];
            int j = 0;
            
            Set<Integer>set = new LinkedHashSet<Integer>();
            
            //generates non repeating random numbers and adds it to the set
            while (set.size() < 3) {
                set.add(r.nextInt(30)+1);
            }
            
            Iterator<Integer> i = set.iterator(); 
            
            while (i.hasNext()) {
                arr[j] = i.next();
                j++;
            }
            
            String s = Integer.toString(arr[0]);
            String ss = "dinner_images/" + s + ".png";
            
            ImageIcon icon = new ImageIcon(ss);
            Image img = icon.getImage();
            Image imgScale = img.getScaledInstance(sampleD1.getWidth(), sampleD1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(imgScale);
            sampleD1.setIcon(scaledIcon);
            sampleDTextArea1.setText(dinner.returnRandomFoodDescriptionFromHashMap(arr[0]));
            
            s = Integer.toString(arr[1]);
            ss = "dinner_images/" + s + ".png";
            
            ImageIcon icon2 = new ImageIcon(ss);
            Image img2 = icon2.getImage();
            Image imgScale2 = img2.getScaledInstance(sampleD2.getWidth(), sampleD2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
            sampleD2.setIcon(scaledIcon2);  
            sampleDTextArea2.setText(dinner.returnRandomFoodDescriptionFromHashMap(arr[1]));
            
            s = Integer.toString(arr[2]);
            ss = "dinner_images/" + s + ".png";
            
            ImageIcon icon3 = new ImageIcon(ss);
            Image img3 = icon3.getImage();
            Image imgScale3 = img3.getScaledInstance(sampleD3.getWidth(), sampleD3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledIcon3 = new ImageIcon(imgScale3);
            sampleD3.setIcon(scaledIcon3); 
            sampleDTextArea3.setText(dinner.returnRandomFoodDescriptionFromHashMap(arr[2]));
            
        }
    }
}
