
package Components;

import Swings.model_menu;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;


public class panel_package extends javax.swing.JPanel {

    /**
     * @return the data
     */
    public model_menu getData() {
        return data;
    }

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

    private boolean select;
    
    public panel_package() {
        initComponents();
    }

    private model_menu data;
    
    private void getData(model_menu data){
        this.data = data;
        stringy1.setText(data.getDescrip());
        stringy2.setText(data.getName());
        picture.setImage(data.getImage());
        DecimalFormat df = new DecimalFormat("N#,##0.00");
        dubly.setText(df.format(data.getAmount()));
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        stringy1 = new javax.swing.JLabel();
        dubly = new javax.swing.JLabel();
        picture = new Swings.PictureBox();
        inty = new javax.swing.JLabel();
        stringy2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        stringy1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stringy1.setText("Numb:");

        dubly.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dubly.setText("N0:00");

        picture.setImage(new javax.swing.ImageIcon(getClass().getResource("/image/pics/shirt.png"))); // NOI18N

        inty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inty.setForeground(new java.awt.Color(102, 102, 102));
        inty.setText("0:00");

        stringy2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stringy2.setText("TYPE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stringy1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inty))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(stringy2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(dubly, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inty)
                    .addComponent(stringy1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dubly)
                    .addComponent(stringy2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
         g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(150,222,100));
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        if (select) {
            g2.setColor(Color.red);
            g2.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
        }
        g2.dispose();    
        super.paint(g); 
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dubly;
    private javax.swing.JLabel inty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private Swings.PictureBox picture;
    private javax.swing.JLabel stringy1;
    private javax.swing.JLabel stringy2;
    // End of variables declaration//GEN-END:variables
}
