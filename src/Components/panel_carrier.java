
package Components;

import Swings.Model_menu;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;


public class panel_carrier extends javax.swing.JPanel {

    /**
     * @return the select
     */
    public boolean isSelect() {
        return select;
    }

    /**
     * @param select the select to set
     */
    public void setSelect(boolean select) {
        this.select = select;
    }

  private boolean  select;
  
    public panel_carrier() {
        initComponents();
        setOpaque(false);
    }
    private Model_menu menu;
    
    private void data(Model_menu menu){
        this.menu = menu;
        string.setText(menu.getName());
        desc.setText(menu.getDescription());
        pictureBox1.setImage(menu.getImgage());
        DecimalFormat fr = new DecimalFormat("N#,##0.##");
         dubly.setText(fr.format(menu.getAmount()));
         DecimalFormat fk = new DecimalFormat("#");
         inty.setText(fk.format(menu.getNumber()));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        inty = new javax.swing.JLabel();
        pictureBox1 = new Swings.PictureBox();
        desc = new javax.swing.JLabel();
        dubly = new javax.swing.JLabel();
        string = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        inty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inty.setText("01");

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/pics/shirt.png"))); // NOI18N

        desc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        desc.setForeground(new java.awt.Color(153, 153, 153));
        desc.setText("Description");

        dubly.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dubly.setText("N0:00");

        string.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        string.setText("Item 1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(string, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inty, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dubly)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(string, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inty, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dubly, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics g) {
         Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 22, 22);
        g2.dispose(); super.paint(g); 
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel desc;
    private javax.swing.JLabel dubly;
    private javax.swing.JLabel inty;
    private javax.swing.JLabel jLabel1;
    private Swings.PictureBox pictureBox1;
    private javax.swing.JLabel string;
    // End of variables declaration//GEN-END:variables
}
