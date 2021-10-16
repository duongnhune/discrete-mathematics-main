/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huynh Nhu
 */
public class Dijkstra extends javax.swing.JFrame {

    /**
     * Creates new form Dijkstra
     */
    private ArrayList<Vert> lt = new ArrayList<Vert>();
    
   private List<Vert> path = new ArrayList<Vert>();
   
   private PathFinder shortestPath = new PathFinder();
   private boolean td = false;
   
    private static int WIDTH = 840;
    
    public Dijkstra() {
        initComponents();
        this.setSize(WIDTH + 400, WIDTH);
// 
            Vert vA = new Vert(1,4,"A");
            Vert vB = new Vert(9,2,"B");
            Vert vC = new Vert(6,7,"C");
            Vert vD = new Vert(4,12,"D");
            Vert vE = new Vert(10,16,"E");
            Vert vF = new Vert(14,4,"F");
            Vert vG = new Vert(16,11,"G");
            Vert vM = new Vert(12,7,"M");
            // 
            lt.add(vA);            
            lt.add(vB);
            lt.add(vC);
            lt.add(vD);
            lt.add(vE);
            lt.add(vF);
            lt.add(vG);
            lt.add(vM);

// 
            vA.addNeighbour(new Edge(3, vA, vB));
            vA.addNeighbour(new Edge(5, vA, vD));
            vB.addNeighbour(new Edge(2, vB, vC));
            vC.addNeighbour(new Edge(6, vC, vF));
            vC.addNeighbour(new Edge(5, vC, vE));
            vD.addNeighbour(new Edge(4, vD, vE));
            vD.addNeighbour(new Edge(3, vD, vF));
            vF.addNeighbour(new Edge(4, vF, vG));
            vE.addNeighbour(new Edge(2, vE, vG));
            vE.addNeighbour(new Edge(8, vE, vM));

//        shortestPath.ShortestP(vA);
        
//        System.out.println("Khoảng cách tối thiểu từ:");
//        System.out.println("A đến B: " + vB.getDist());
//        System.out.println("A đến C: " + vC.getDist());
//        System.out.println("A đến D: " + vD.getDist());
//        System.out.println("A đến E: " + vE.getDist());
//        System.out.println("A đến F: " + vF.getDist());
//        System.out.println("A đến G: " + vG.getDist());
//
//        System.out.println("Đường đi ngắn nhất từ:");
//        System.out.println("A đến B: " + shortestPath.getShortestP(vB));
//        System.out.println("A đến C: " + shortestPath.getShortestP(vC));
//        System.out.println("A đến D: " + shortestPath.getShortestP(vD));
//        System.out.println("A đến E: " + shortestPath.getShortestP(vE));        
//        System.out.println("A đến F: " + shortestPath.getShortestP(vF));
//        System.out.println("A đến G: E" + shortestPath.getShortestP(vG));
    //
    jComboBox2.setSelectedIndex(6);
    
    jComboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 td = false;
                  jButton1.setText("Tìm đường đi ngắn nhất");
            }
    });
    
    jComboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                td = false;
                           jButton1.setText("Tìm đường đi ngắn nhất");
            }
    });


    jButton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                       if(td){
                           td = false;
                           jButton1.setText("Tìm đường đi ngắn nhất");
                       }
                       else{
                           
                            String start = (String) jComboBox1.getSelectedItem();
                            String end = (String) jComboBox2.getSelectedItem();

                            if(start.equals("A")){
                                  shortestPath.ShortestP(vA);//bắt đầu
                            }else if(start.equals("B")){
                                  shortestPath.ShortestP(vB);//bắt đầu
                            }else if(start.equals("C")){
                                  shortestPath.ShortestP(vC);//bắt đầu
                            }else if(start.equals("D")){
                                  shortestPath.ShortestP(vD);//bắt đầu
                            }else if(start.equals("E")){
                                  shortestPath.ShortestP(vE);//bắt đầu
                            }else if(start.equals("F")){
                                  shortestPath.ShortestP(vF);//bắt đầu
                            }else if(start.equals("G")){
                                  shortestPath.ShortestP(vG);//bắt đầu
                            }
                            else if(start.equals("M")){
                                  shortestPath.ShortestP(vM);//bắt đầu
                            }
                            
                            if(end.equals("G")){
                                path = shortestPath.getShortestP(vG);//kết thúc
                                jLabel7.setText(vG.getDist()+"");
                            }else if(end.equals("F")){
                                path = shortestPath.getShortestP(vF);//kết thúc
                                 jLabel7.setText(vG.getDist()+"");
                            }else if(end.equals("E")){
                                path = shortestPath.getShortestP(vE);//kết thúc
                                                                 jLabel7.setText(vE.getDist()+"");

                            }else if(end.equals("D")){
                                path = shortestPath.getShortestP(vD);//kết thúc
                                                                 jLabel7.setText(vD.getDist()+"");

                            }else if(end.equals("C")){
                                path = shortestPath.getShortestP(vC);//kết thúc
                                                                 jLabel7.setText(vC.getDist()+"");

                            }else if(end.equals("B")){
                                path = shortestPath.getShortestP(vB);//kết thúc
                                                                 jLabel7.setText(vB.getDist()+"");

                            }else if(end.equals("A")){
                                path = shortestPath.getShortestP(vA);//kết thúc
                                                                 jLabel7.setText(vA.getDist()+"");

                            }
                            else if(end.equals("M")){
                                path = shortestPath.getShortestP(vM);//kết thúc
                                                                 jLabel7.setText(vM.getDist()+"");

                            }
                            String pathStr = "";
                            
                            for(Vert v: path)
                                    pathStr += v.getName()+"  ";
                            
                            jLabel4.setText(pathStr);
                            
                            jButton1.setText("Xóa đường đi ngắn nhất");                           
                            td = true;
                            
                       }
                       repaint();
                       revalidate();
                }
            });
    }

    public void paint(Graphics g){
        super.paint(g);
        //vi tri
        g.translate(120, 120);
        
        //khung
        g.setColor(Color.DARK_GRAY);
        g.fillRect(0, 0, 600 , 600);
                
         for(int i = 0; i<lt.size(); i ++){
             
                int xD = lt.get(i).getX();                
                int yD = lt.get(i).getY();

             
                g.setColor(Color.BLACK);  
                g.fillRect(30*xD, 30*yD, 30, 30); //vẽ điểmvị trí - chiều dài - chiều rộng
                g.setColor(Color.white);
                g.drawString(lt.get(i).getName(), 30*xD+10, 30*yD+20); //vị trí các điểm
                // get list sẽ là Edge nằm trong Vert 
                for(int j =0; j < lt.get(i).getList().size() ;j++){
                       
                        g.setColor(Color.red);
                        int x = lt.get(i).getList().get(j).getTargetVert().getX();       //getTarge điểm kết thúc                 
                        int y = lt.get(i).getList().get(j).getTargetVert().getY(); // x, y toạ độ

                        g.drawLine(30*xD, 30*yD, 30*x, 30*y);
                }
                
         }   
         
         
         if(td)
                {
                    
                    for(int o =0; o < path.size() -1 ;o++){
//-1 vì sẽ lấy phần sau nó nhưng ko lấy tahwngf cuối
//path là đường đi
                              g.setColor(Color.white);
                              
                              int xP = path.get(o).getX();
                              int yP = path.get(o).getY();

                              int xE = path.get(o+1).getX();
                              int yE = path.get(o+1).getY();

                              g.drawLine(30*xP, 30*yP, 30*xE, 30*yE);
                      }
                 }
         
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 1, 20, 1));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bảng điều khiển");
        jPanel1.add(jLabel1);

        jPanel2.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Chọn điểm bắt đầu:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "M" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Chọn điểm kết thúc:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "M" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Tìm đường đi ngắn nhất");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Chi tiết đường đi: ");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Làm mới");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Độ dài đường đi:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(64, 64, 64))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        
        new Dijkstra().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dijkstra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dijkstra().setVisible(true);
            }
        });
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    // End of variables declaration//GEN-END:variables
}
