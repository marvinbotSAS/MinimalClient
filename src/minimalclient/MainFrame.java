/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimalclient;

import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import mARC.Connector.Connector;

/**
 *
 * @author patrice
 */
public class MainFrame extends javax.swing.JFrame 
{

    BufferedImage ledPicture;
    JLabel picLabel;
    Connector connector;
    CopyToClipBoardActionListener copyToClipBoardActionListener;
    ArrayList<String[]> _names;
    ArrayList<String[][]> _columns;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {

        initComponents();
        connector = new Connector();
        try 
        {
            ledPicture = ImageIO.read(MainFrame.class.getResource("black-led.jpeg"));
            this.picLabel = new JLabel(new ImageIcon(ledPicture));
            this.LedjPanel.add(picLabel);
            this.picLabel.setVisible(true);
            this.LedjPanel.invalidate();
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        copyToClipBoardActionListener= new CopyToClipBoardActionListener(this.ResultjTable);
        this.ResultjTable.setToolTipText("select rows and columns and press Ctrl+C to copy to clipboard.");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainjPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        IpjTextField = new javax.swing.JTextField();
        PortjTextField = new javax.swing.JTextField();
        ConnectButton = new java.awt.Button();
        LedjPanel = new javax.swing.JPanel()
        {

            @Override protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(ledPicture, 0, 0, 20,20,null); // see javadoc for more info on the parameters
            }
        }
        ;
        jPanel1 = new javax.swing.JPanel();
        commandjTextField = new javax.swing.JTextField();
        param2jTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        param1jTextArea = new javax.swing.JTextArea();
        param3jTextField = new javax.swing.JTextField();
        param4jTextField = new javax.swing.JTextField();
        param5jTextField = new javax.swing.JTextField();
        param6jTextField = new javax.swing.JTextField();
        param7jTextField = new javax.swing.JTextField();
        SendCommandbutton = new java.awt.Button();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SentjTextArea = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ServerjTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ResultjTable = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        LineNumberjComboBox = new javax.swing.JComboBox();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ScriptjTextArea = new javax.swing.JTextArea();
        SendScriptbutton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Server"));

        IpjTextField.setText("127.0.0.1");

        PortjTextField.setText("1254");

        ConnectButton.setLabel("Connect");
        ConnectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ConnectButtonMouseReleased(evt);
            }
        });

        LedjPanel.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout LedjPanelLayout = new javax.swing.GroupLayout(LedjPanel);
        LedjPanel.setLayout(LedjPanelLayout);
        LedjPanelLayout.setHorizontalGroup(
            LedjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        LedjPanelLayout.setVerticalGroup(
            LedjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PortjTextField)
            .addComponent(IpjTextField)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(ConnectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LedjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(IpjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PortjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LedjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConnectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Command"));

        commandjTextField.setText("SERVER.GetProperties");

        param1jTextArea.setColumns(20);
        param1jTextArea.setLineWrap(true);
        param1jTextArea.setRows(5);
        param1jTextArea.setText("name;port;type;model;version;build;connection_count");
        jScrollPane1.setViewportView(param1jTextArea);

        SendCommandbutton.setLabel("Send");
        SendCommandbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SendCommandbuttonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(commandjTextField)
            .addComponent(param2jTextField)
            .addComponent(param3jTextField)
            .addComponent(param4jTextField)
            .addComponent(param5jTextField)
            .addComponent(param6jTextField)
            .addComponent(param7jTextField)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
            .addComponent(SendCommandbutton, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(commandjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(param2jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(param3jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(param4jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(param5jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(param6jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(param7jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SendCommandbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("protocol encapsulated command sent"));

        SentjTextArea.setColumns(20);
        SentjTextArea.setLineWrap(true);
        SentjTextArea.setRows(5);
        jScrollPane2.setViewportView(SentjTextArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Result from Server"));

        ServerjTextArea.setColumns(20);
        ServerjTextArea.setLineWrap(true);
        ServerjTextArea.setRows(5);
        jScrollPane3.setViewportView(ServerjTextArea);

        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel3MouseMoved(evt);
            }
        });

        jScrollPane5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jScrollPane5MouseMoved(evt);
            }
        });

        ResultjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ResultjTable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ResultjTableMouseMoved(evt);
            }
        });
        jScrollPane5.setViewportView(ResultjTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Line #"));

        LineNumberjComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LineNumberjComboBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LineNumberjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LineNumberjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Script"));

        ScriptjTextArea.setColumns(20);
        ScriptjTextArea.setLineWrap(true);
        ScriptjTextArea.setRows(5);
        jScrollPane4.setViewportView(ScriptjTextArea);

        SendScriptbutton.setLabel("Send");
        SendScriptbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                SendScriptbuttonMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
            .addComponent(SendScriptbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SendScriptbutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout MainjPanelLayout = new javax.swing.GroupLayout(MainjPanel);
        MainjPanel.setLayout(MainjPanelLayout);
        MainjPanelLayout.setHorizontalGroup(
            MainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainjPanelLayout.createSequentialGroup()
                .addGroup(MainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainjPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainjPanelLayout.setVerticalGroup(
            MainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainjPanelLayout.createSequentialGroup()
                .addGroup(MainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainjPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(MainjPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConnectButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConnectButtonMouseReleased
     
        this.ConnectButton.setEnabled(false);
        this.ConnectButton.setLabel("Connecting...");
        this.connector.setIp(this.IpjTextField.getText());
        this.connector.setPort(this.PortjTextField.getText());
        if ( !this.connector.connect() )
        {
            try 
            {
                ledPicture = ImageIO.read(MainFrame.class.getResource("redled.jpeg"));
                this.picLabel = new JLabel(new ImageIcon(ledPicture));
                this.picLabel.invalidate();
                this.LedjPanel.repaint();
                this.updateLog("Unable to connect to server. Check IP & Port. ");
                this.ConnectButton.setLabel("Connect");
            } catch (IOException ex) 
            {
                this.updateLog(ex.getMessage());
            }
            this.ConnectButton.setEnabled(true);
            return;
        }
        try 
        {
            ledPicture = ImageIO.read(MainFrame.class.getResource("greenled.jpeg"));
            this.picLabel = new JLabel(new ImageIcon(ledPicture));
            this.picLabel.invalidate();
            this.LedjPanel.repaint();
            this.updateLog("Connection successfull. ");
        } catch (IOException ex) 
        {
            this.updateLog(ex.getMessage());
        }
                
        this.ConnectButton.setLabel("Connect");       
        this.ConnectButton.setEnabled(true);
    }//GEN-LAST:event_ConnectButtonMouseReleased

    private void SendCommandbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendCommandbuttonMouseReleased

        this.SendCommandbutton.setEnabled(false);

        ExecuteCommandWorker e = new ExecuteCommandWorker();
        e._frame = this;
        e.connector = connector;
        e.params = new String[7];
        e.params[0] = this.commandjTextField.getText();
        e.params[1] = this.param1jTextArea.getText();
        e.params[2] = this.param2jTextField.getText();
        e.params[3] = this.param3jTextField.getText();
        e.params[4] = this.param4jTextField.getText();
        e.params[5] = this.param5jTextField.getText();
        e.params[6] = this.param6jTextField.getText();
        e.Action = "ExecuteCommand";
        e.execute();
        this.SendCommandbutton.setEnabled(true);
    }//GEN-LAST:event_SendCommandbuttonMouseReleased

    private void SendScriptbuttonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SendScriptbuttonMouseReleased
 
        this.SendScriptbutton.setEnabled(false);

        ExecuteCommandWorker e = new ExecuteCommandWorker();
        e._frame = this;
        e.connector = connector;
        e.script = this.ScriptjTextArea.getText();
        e.Action = "ExecuteScript";
        e.execute();
        this.SendScriptbutton.setEnabled(true);
    }//GEN-LAST:event_SendScriptbuttonMouseReleased

    private void ResultjTableMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultjTableMouseMoved
    this.ResultjTable.setToolTipText("select rows and columns and press Ctrl+C to copy to clipboard.");
    }//GEN-LAST:event_ResultjTableMouseMoved

    private void jScrollPane5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane5MouseMoved

        this.ResultjTable.setToolTipText("select rows and columns and press Ctrl+C to copy to clipboard.");
    }//GEN-LAST:event_jScrollPane5MouseMoved

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved
    
        this.ResultjTable.setToolTipText("select rows and columns and press Ctrl+C to copy to clipboard.");
    }//GEN-LAST:event_jPanel3MouseMoved

    private void LineNumberjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LineNumberjComboBoxItemStateChanged
   
        if ( evt.getStateChange() == ItemEvent.DESELECTED )
        {
            return;
        }
        String line = (String) evt.getItem();
        String[] names = _names.get(Integer.valueOf(line));
        String[][] columns = _columns.get(Integer.valueOf(line));
        
        int i = 0;
        DefaultTableModel m = (DefaultTableModel) ResultjTable.getModel();
        m.setRowCount(0);
        m.setColumnCount(0);
        for (String s : names)
        {
          m.addColumn(s, columns[i++]);
        }
    }//GEN-LAST:event_LineNumberjComboBoxItemStateChanged

    public void updateLog(String msg)
    {        if (msg == null || msg.isEmpty()) {
            return;
        }
        String c = this.ServerjTextArea.getText();
        c = msg + c+ "\n";
        this.ServerjTextArea.setText(c);
        this.ServerjTextArea.setCaretPosition(0);
    }
    
    public void updateCommandSentLog(String msg)
    {        if (msg == null || msg.isEmpty()) {
            return;
        }
        String c = this.SentjTextArea.getText();
        c = msg + c+ "\n";
        this.SentjTextArea.setText(c);
        this.SentjTextArea.setCaretPosition(0);
    }
    
    public void GetResult(ArrayList<String[]> names, ArrayList<String[][]> columns)
    {

        DefaultTableModel m = (DefaultTableModel) ResultjTable.getModel();
        m.setColumnCount(0);
        m.setRowCount(0);
        this.LineNumberjComboBox.removeAllItems();
        _names = names;
        _columns = columns;
        if (  names.isEmpty() )
        {
            return;
        }
        for (int k = 0;k < names.size();k++)
        {
            this.LineNumberjComboBox.addItem(String.valueOf(k));
        }
        this.LineNumberjComboBox.setSelectedIndex(0);

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button ConnectButton;
    private javax.swing.JTextField IpjTextField;
    private javax.swing.JPanel LedjPanel;
    private javax.swing.JComboBox LineNumberjComboBox;
    private javax.swing.JPanel MainjPanel;
    private javax.swing.JTextField PortjTextField;
    private javax.swing.JTable ResultjTable;
    private javax.swing.JTextArea ScriptjTextArea;
    private java.awt.Button SendCommandbutton;
    private java.awt.Button SendScriptbutton;
    private javax.swing.JTextArea SentjTextArea;
    private javax.swing.JTextArea ServerjTextArea;
    private javax.swing.JTextField commandjTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea param1jTextArea;
    private javax.swing.JTextField param2jTextField;
    private javax.swing.JTextField param3jTextField;
    private javax.swing.JTextField param4jTextField;
    private javax.swing.JTextField param5jTextField;
    private javax.swing.JTextField param6jTextField;
    private javax.swing.JTextField param7jTextField;
    // End of variables declaration//GEN-END:variables
}
