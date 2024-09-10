
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class FoodOptions extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apple;
    private javax.swing.JButton bacon;
    private javax.swing.JButton banana;
    private javax.swing.JButton cabbage;
    private javax.swing.JButton cart;
    private javax.swing.JButton chickenBreast;
    private javax.swing.JButton cucumber;
    private javax.swing.JButton doritos;
    private javax.swing.JButton fishFillet;
    private javax.swing.JButton flour;
    private javax.swing.JButton groundBeef;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel l;
    private javax.swing.JButton milk;
    private javax.swing.JButton orange;
    private javax.swing.JButton pizza;
    private javax.swing.JButton pizzaPop;
    private javax.swing.JButton priceMatch;
    private javax.swing.JButton spam;

    /**
     * Creates new form FoodOptions
     */
        
    public FoodOptions() {
        initComponents();
    }
    
    public static ArrayList <String> foods = new ArrayList<>(); 
    public static double subtotal = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoodOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoodOptions().setVisible(true);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        apple = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        orange = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        banana = new javax.swing.JButton();
        cart = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cabbage = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cucumber = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        groundBeef = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        bacon = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        spam = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        chickenBreast = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        fishFillet = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pizza = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        pizzaPop = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        milk = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        l = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        doritos = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        flour = new javax.swing.JButton();
        priceMatch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        apple.setText("Bag of Apples: $6.99 ");
        apple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appleActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.jpeg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Al Nile", 3, 18)); // NOI18N
        jLabel2.setText("Produce:");

        jLabel4.setFont(new java.awt.Font("Al Nile", 3, 18)); // NOI18N
        jLabel4.setText("J's Grocery Store ");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orange.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        orange.setText("Orange: $0.50");
        orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banana.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");

        banana.setText("Banana: $0.25");
        banana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bananaActionPerformed(evt);
            }
        });

        cart.setText("Shopping Cart");
        cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cabbage.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");

        cabbage.setText("Cabbage: $0.60");
        cabbage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabbageActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cucumber.jpeg"))); // NOI18N
        jLabel7.setText("jLabel7");

        cucumber.setText("Cucumber: $0.90");
        cucumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cucumberActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Al Nile", 3, 18)); // NOI18N
        jLabel8.setText("Meat and Seafood:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groundbeef.jpeg"))); // NOI18N
        jLabel9.setText("jLabel9");

        groundBeef.setText("Ground Beef Lean: $8.00");
        groundBeef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groundBeefActionPerformed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bacon.jpeg"))); // NOI18N
        jLabel10.setText("jLabel10");

        bacon.setText("Bacon: $6.50");
        bacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baconActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spam.jpeg"))); // NOI18N
        jLabel11.setText("jLabel11");

        spam.setText("Spam: $4.00");
        spam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spamActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chickenbreast.png"))); // NOI18N
        jLabel12.setText("jLabel12");

        chickenBreast.setText("Chicken Breast: $7.97");
        chickenBreast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chickenBreastActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fishfillet (1).jpg"))); // NOI18N
        jLabel13.setText("jLabel13");

        fishFillet.setText("Fried Cod: $19.00");
        fishFillet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fishFilletActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Al Nile", 3, 18)); // NOI18N
        jLabel14.setText("Cold/Frozen:");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pepperoniPizza.jpeg"))); // NOI18N
        jLabel15.setText("jLabel15");

        pizza.setText("Pepperoni Pizza: $7.25");
        pizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizzaActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaPop.jpeg"))); // NOI18N
        jLabel16.setText("jLabel16");

        pizzaPop.setText("Pizza Pop: $5.25");
        pizzaPop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pizzaPopActionPerformed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/milk.jpg"))); // NOI18N
        jLabel17.setText("jLabel17");

        milk.setText("Milk: $8.00");
        milk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                milkActionPerformed(evt);
            }
        });

        jLabel18.setText("Some Items are limited quantity/Max. $300 spending");

        l.setFont(new java.awt.Font("Al Nile", 3, 18)); // NOI18N
        l.setText("Pantry:");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/doritos.png"))); // NOI18N
        jLabel19.setText("jLabel19");

        doritos.setText("Doritos: $4.29");
        doritos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doritosActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flour.jpeg"))); // NOI18N
        jLabel20.setText("jLabel20");

        flour.setText("Flour: $19.97");
        flour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flourActionPerformed(evt);
            }
        });

        priceMatch.setText("Price Match");
        priceMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceMatchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(344, 344, 344))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(573, 573, 573)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cabbage))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cucumber)
                                    .addComponent(fishFillet)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cart)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(flour)
                                    .addComponent(priceMatch))))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apple))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(orange)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(groundBeef)
                                            .addGap(18, 18, 18)
                                            .addComponent(bacon)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pizza)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pizzaPop))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l)
                                .addGap(334, 334, 334))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(milk)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spam)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(chickenBreast)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(doritos)
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(165, 165, 165)))
                                        .addGap(53, 53, 53))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(banana))))
                .addGap(404, 404, 404))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(cart)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apple)
                    .addComponent(orange)
                    .addComponent(banana)
                    .addComponent(cabbage)
                    .addComponent(cucumber))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(groundBeef)
                    .addComponent(bacon)
                    .addComponent(spam)
                    .addComponent(chickenBreast)
                    .addComponent(fishFillet))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(l))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pizza)
                    .addComponent(pizzaPop)
                    .addComponent(milk)
                    .addComponent(doritos)
                    .addComponent(flour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(priceMatch)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    int count = 1; int chickenCount = 1; int fishCount = 1;
    private void appleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appleActionPerformed
        // TODO add your handling code here:
        if (count == 5){
            apple.setEnabled(false);
        }
        count++;
        Items a = new Items("Bag of Apples: $", "6.99"); 
        foods.add(a.getName() + a.getPrice());
        double temp = Double.parseDouble(a.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_appleActionPerformed

    private void cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartActionPerformed
        // TODO add your handling code here:
        shoppingCart s = new shoppingCart();
        s.setVisible(true);
    }//GEN-LAST:event_cartActionPerformed

    private void orangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeActionPerformed
        // TODO add your handling code here:
        Items o = new Items ("Orange: $", "0.50");
        foods.add(o.getName() + o.getPrice());
        double temp = Double.parseDouble(o.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_orangeActionPerformed

    private void bananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bananaActionPerformed
        // TODO add your handling code here:
        Items b = new Items("Banana: $", "0.25");
        foods.add(b.getName() + b.getPrice());
        double temp = Double.parseDouble(b.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_bananaActionPerformed

    private void cabbageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabbageActionPerformed
        // TODO add your handling code here:
        Items c = new Items ("Cabbage: $", "0.60");
        foods.add(c.getName() + c.getPrice());
        double temp = Double.parseDouble(c.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_cabbageActionPerformed

    private void groundBeefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groundBeefActionPerformed
        // TODO add your handling code here:
        Items g = new Items ("Ground Beef Lean: $", "8.00");
        foods.add(g.getName() + g.getPrice());
        double temp = Double.parseDouble(g.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_groundBeefActionPerformed

    private void baconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baconActionPerformed
        // TODO add your handling code here:
        Items b = new Items ("Bacon: $", "6.50");
        foods.add(b.getName() + b.getPrice());
        double temp = Double.parseDouble(b.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_baconActionPerformed

    private void spamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spamActionPerformed
        // TODO add your handling code here:
        Items c = new Items ("Spam: $", "4.00");
        foods.add(c.getName() + c.getPrice());
        double temp = Double.parseDouble(c.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_spamActionPerformed

    private void chickenBreastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chickenBreastActionPerformed
        // TODO add your handling code here:
        if (chickenCount == 5){
            chickenBreast.setEnabled(false);
        }
        chickenCount++;
        Items c = new Items ("Chicken Breast: $", "7.97");
        foods.add(c.getName() + c.getPrice());
        double temp = Double.parseDouble(c.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_chickenBreastActionPerformed

    private void pizzaPopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizzaPopActionPerformed
        // TODO add your handling code here:
        Items c = new Items ("Pizza Pop: $", "5.25");
        foods.add(c.getName() + c.getPrice());
        double temp = Double.parseDouble(c.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_pizzaPopActionPerformed

    private void milkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_milkActionPerformed
        // TODO add your handling code here:
        Items c = new Items ("Milk: $", "8.00");
        foods.add(c.getName() + c.getPrice());
        double temp = Double.parseDouble(c.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_milkActionPerformed

    private void fishFilletActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishFilletActionPerformed
        // TODO add your handling code here:
        if (fishCount == 5){
            fishFillet.setEnabled(false);
        }
        fishCount++;
        Items c = new Items ("Fried Cod: $", "19.00");
        foods.add(c.getName() + c.getPrice());
        double temp = Double.parseDouble(c.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_fishFilletActionPerformed

    private void cucumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cucumberActionPerformed
        // TODO add your handling code here:
        Items c = new Items ("Cucumber: $", "0.90");
        foods.add(c.getName() + c.getPrice());
        double temp = Double.parseDouble(c.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_cucumberActionPerformed

    private void pizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pizzaActionPerformed
        // TODO add your handling code here:
        Items c = new Items ("Pepperoni Pizza: $", "7.25");
        foods.add(c.getName() + c.getPrice());
        double temp = Double.parseDouble(c.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_pizzaActionPerformed

    private void flourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flourActionPerformed
        // TODO add your handling code here:
        Items c = new Items ("Flour: $", "19.97");
        foods.add(c.getName() + c.getPrice());
        double temp = Double.parseDouble(c.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_flourActionPerformed

    private void doritosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doritosActionPerformed
        // TODO add your handling code here:
        Items c = new Items ("Doritos: $", "4.29");
        foods.add(c.getName() + c.getPrice());
        double temp = Double.parseDouble(c.getPrice());
        subtotal = subtotal + temp;
    }//GEN-LAST:event_doritosActionPerformed

    //api
    private static final String API_URL = "https://axesso-walmart-data-service.p.rapidapi.com/wlm/walmart-search-by-keyword?keyword=milk&page=1";
    private static final String API_KEY = "eefa7445d7msha1a5e2832541448p174e29jsnd8c7e3c78135";

    private void priceMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceMatchActionPerformed
        //PriceAndProductCompare p = new PriceAndProductCompare();
        //p.setVisible(true);
        WalmartMatch wal = new WalmartMatch();
        wal.setVisible(true);

        // You might want to start a new thread to handle the API call to avoid blocking the GUI
        new Thread(() -> {
            OkHttpClient client = new OkHttpClient();

            // Create PrintWriter to write to a file
            try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\test\\OneDrive\\Desktop\\Grocery Store\\output.txt"))) {
                // Build the request
                Request request = new Request.Builder()
                        .url(API_URL)
                        .get()
                        .addHeader("X-RapidAPI-Host", "axesso-walmart-data-service.p.rapidapi.com")
                        .addHeader("X-RapidAPI-Key", API_KEY)
                        .build();

                // Log the request URL and headers
                writer.println("Request URL: " + API_URL);
                writer.println("Headers: " + request.headers());

                // Execute the request and handle the response
                try (Response response = client.newCall(request).execute()) {
                    if (response.isSuccessful()) {
                        // Convert the response body to a string
                        String responseData = response.body().string();

                        // Print the full JSON response for inspection
                        writer.println("Full JSON Response: " + responseData);

                        // Parse JSON data
                        JsonObject json = JsonParser.parseString(responseData).getAsJsonObject();

                        // Print all keys and values for inspection
                        printJson(json, 0, writer);

                        // Attempt to find the 'items' array
                        JsonArray items = findProductsArray(json);

                        // Check if the items array is null or empty
                        if (items != null) {
                            writer.println("Number of items found: " + items.size());

                            if (items.size() > 0) {
                                writer.println("\nFiltered Product List (containing 'milk' in the name):");

                                // Loop through each item and print its name and price if it contains "milk"
                                for (int i = 0; i < items.size(); i++) {
                                    JsonObject product = items.get(i).getAsJsonObject();

                                    String productName = product.has("name") ? product.get("name").getAsString() : "";
                                    String productPrice = product.has("priceInfo") && product.getAsJsonObject("priceInfo").has("linePrice")
                                            ? product.getAsJsonObject("priceInfo").get("linePrice").getAsString()
                                            : "No price available";

                                    // Check if the product name contains "milk"
                                    if (productName.toLowerCase().contains("milk")) {
                                        // Output the product information
                                        writer.println((i + 1) + ". Product: " + productName);
                                        writer.println("Price: " + productPrice);
                                    }
                                }
                            } else {
                                writer.println("No items found in the 'items' array.");
                            }
                        } else {
                            writer.println("'items' array is null.");
                        }
                    } else {
                        writer.println("API Request Failed: " + response.code() + " " + response.message());
                        writer.println("Response Body: " + response.body().string());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    writer.println("An error occurred: " + e.getMessage());
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error opening file for writing: " + e.getMessage());
            }
        }).start();
    }

    // Recursive method to print all keys and values in the JSON object
    private static void printJson(JsonObject json, int indent, PrintWriter writer) {
        String indentStr = " ".repeat(indent);
        for (String key : json.keySet()) {
            Object value = json.get(key);
            if (value instanceof JsonObject) {
                writer.println(indentStr + key + ":");
                printJson((JsonObject) value, indent + 2, writer);
            } else if (value instanceof JsonArray) {
                writer.println(indentStr + key + ": [");
                JsonArray array = (JsonArray) value;
                for (int i = 0; i < array.size(); i++) {
                    Object item = array.get(i);
                    if (item instanceof JsonObject) {
                        printJson((JsonObject) item, indent + 2, writer);
                    } else {
                        writer.println(indentStr + "  " + item);
                    }
                }
                writer.println(indentStr + "]");
            } else {
                writer.println(indentStr + key + ": " + value);
            }
        }
    }

    // Helper method to find the 'items' array in the JSON response
    private static JsonArray findProductsArray(JsonObject json) {
        JsonArray items = null;

        // Check common fields where 'items' might be located
        if (json.has("items")) {
            items = json.getAsJsonArray("items");
        }

        // Check nested fields if 'items' is not found at the top level
        if (items == null && json.has("searchResult")) {
            JsonObject searchResult = json.getAsJsonObject("searchResult");
            if (searchResult.has("items")) {
                items = searchResult.getAsJsonArray("items");
            }
        }

        // Check other potential fields
        if (items == null && json.has("data")) {
            JsonObject data = json.getAsJsonObject("data");
            if (data.has("items")) {
                items = data.getAsJsonArray("items");
            }
        }

        // Add additional checks here if needed based on the actual JSON structure
        return items;
    }
    }//GEN-LAST:event_priceMatchActionPerformed

// End of variables declaration//GEN-END:variables

