package confirm_dialogue;


import javax.swing.JFrame;


public class Message extends javax.swing.JDialog {

   private JFrame fram;
    public Message(JFrame fram) {
        super(fram, true); 
        this.fram = fram;
        initComponents();   
        init();
    }
    
private void init(){
    
}
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messagebox1 = new confirm_dialogue.Messagebox();

        setUndecorated(true);

        javax.swing.GroupLayout messagebox1Layout = new javax.swing.GroupLayout(messagebox1);
        messagebox1.setLayout(messagebox1Layout);
        messagebox1Layout.setHorizontalGroup(
            messagebox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
        );
        messagebox1Layout.setVerticalGroup(
            messagebox1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 347, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messagebox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messagebox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 593, 347);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private confirm_dialogue.Messagebox messagebox1;
    // End of variables declaration//GEN-END:variables
}
