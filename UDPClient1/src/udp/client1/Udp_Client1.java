/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp.client1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import javazoom.jl.player.advanced.AdvancedPlayer;

/**
 *
 * @author Administrator
 */
public class Udp_Client1 extends javax.swing.JFrame {

    private final int INSERT = 1;
    private String nodeName = "Node1";
    private String folderPath = "../UDPClient1/Node1FileShare/";
    private String folderPathDownload = "../UDPClient1/Node1Download/";
    private String filePathShareHeThong = "../UDPClient1/node1_listfileshare.txt";
    private String SelectedName = "";
    public PlayMp3Thread play = null;

    /**
     * Creates new form Udp_Client1
     */
    public String getNodeName() {
        return this.nodeName;
    }

    public String getfilePathShareHeThong() {
        return this.filePathShareHeThong;
    }

    public void setFolderPath(String folderLink) {
        this.folderPath = folderLink;
    }

    public String getFolderPath() {
        return this.folderPath;
    }

    public void setFolderPathDownload(String folderLink) {
        this.folderPathDownload = folderLink;
    }

    public String getFolderPathDownload() {
        return this.folderPathDownload;
    }

    public String getSelectedName() {
        return this.SelectedName;
    }

    public void setSelectedName(String name) {
        this.SelectedName = name;
    }

    public Udp_Client1() {
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

        jPaneMain = new javax.swing.JPanel();
        jPanelTop = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        jPanelMid = new javax.swing.JPanel();
        lbAddressOnline = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAddress = new javax.swing.JList<>();
        lbFileName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListFileName = new javax.swing.JList<>();
        btnUpdate = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanelBottom = new javax.swing.JPanel();
        lbFileHeThong = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListFileShareTrenHeThong = new javax.swing.JList<>();
        lbFileDaTai = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListFileDaTai = new javax.swing.JList<>();
        btnDownload = new javax.swing.JButton();
        btnPlay = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        lbNameSearch = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitle.setFont(new java.awt.Font("VNI-Ariston", 3, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 0, 51));
        lbTitle.setText("Peer To Peer");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitle)
                .addGap(222, 222, 222))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        lbAddressOnline.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbAddressOnline.setForeground(new java.awt.Color(0, 102, 102));
        lbAddressOnline.setText("IP Address Online");

        jListAddress.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(jListAddress);

        lbFileName.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbFileName.setForeground(new java.awt.Color(0, 102, 102));
        lbFileName.setText("Danh Sách File Đang Chia Sẻ");

        jListFileName.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(jListFileName);

        btnUpdate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMidLayout = new javax.swing.GroupLayout(jPanelMid);
        jPanelMid.setLayout(jPanelMidLayout);
        jPanelMidLayout.setHorizontalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAddressOnline)
                    .addGroup(jPanelMidLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFileName)
                    .addGroup(jPanelMidLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanelMidLayout.setVerticalGroup(
            jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMidLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAddressOnline)
                    .addComponent(lbFileName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate)
                    .addGroup(jPanelMidLayout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        lbFileHeThong.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbFileHeThong.setForeground(new java.awt.Color(0, 102, 102));
        lbFileHeThong.setText("Danh Sách File Trên Hệ Thống");

        jListFileShareTrenHeThong.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(jListFileShareTrenHeThong);

        lbFileDaTai.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbFileDaTai.setForeground(new java.awt.Color(0, 102, 102));
        lbFileDaTai.setText("Danh Sách File Đã Tải Về");

        jListFileDaTai.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(jListFileDaTai);

        btnDownload.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDownload.setText("Download");

        btnPlay.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnPlay.setText("Play");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        tfSearch.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        lbNameSearch.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        lbNameSearch.setForeground(new java.awt.Color(0, 102, 102));
        lbNameSearch.setText("Tìm Kiếm Nhạc");

        javax.swing.GroupLayout jPanelBottomLayout = new javax.swing.GroupLayout(jPanelBottom);
        jPanelBottom.setLayout(jPanelBottomLayout);
        jPanelBottomLayout.setHorizontalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBottomLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFileHeThong, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBottomLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDownload))
                    .addGroup(jPanelBottomLayout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbNameSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBottomLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPlay, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(btnStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbFileDaTai)))
        );
        jPanelBottomLayout.setVerticalGroup(
            jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBottomLayout.createSequentialGroup()
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFileHeThong)
                    .addComponent(lbFileDaTai))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDownload)
                    .addGroup(jPanelBottomLayout.createSequentialGroup()
                        .addComponent(btnPlay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnStop))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lbNameSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPaneMainLayout = new javax.swing.GroupLayout(jPaneMain);
        jPaneMain.setLayout(jPaneMainLayout);
        jPaneMainLayout.setHorizontalGroup(
            jPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPaneMainLayout.createSequentialGroup()
                        .addGroup(jPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPaneMainLayout.setVerticalGroup(
            jPaneMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updateAddress();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        operationInsert("Open afile", 1);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        operationDeleted();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        try {
            // TODO add your handling code here:
            operationPlay();
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnPlayActionPerformed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        operationSearch();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        try {
            // TODO add your handling code here:
            operationStop();
        } catch (InterruptedException ex) {
            System.err.println(ex.toString());
        }
    }//GEN-LAST:event_btnStopActionPerformed

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
            java.util.logging.Logger.getLogger(Udp_Client1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Udp_Client1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Udp_Client1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Udp_Client1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Udp_Client1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Udp_Client1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Udp_Client1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Udp_Client1.class.getName()).log(Level.SEVERE, null, ex);
                }

                Udp_Client1 udp = new Udp_Client1();
                udp.setVisible(true);
                udp.setTitle("Peer To Peer");
                //load_listAddress
                udp.loadAddress("../UDPClient1/node.txt");
                //load_listFileChiaSe
                udp.loadFile(udp.getFolderPath(), udp.jListFileName);
                //load_listFileDownload
                udp.loadFileDownload(udp.getFolderPathDownload(), udp.jListFileDaTai);
                //load_listFileChiaSeTrenHeThong
                udp.loadFileShareHeThong(udp.getfilePathShareHeThong());

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDownload;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStop;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JList<String> jListAddress;
    private javax.swing.JList<String> jListFileDaTai;
    private javax.swing.JList<String> jListFileName;
    private javax.swing.JList<String> jListFileShareTrenHeThong;
    private javax.swing.JPanel jPaneMain;
    private javax.swing.JPanel jPanelBottom;
    private javax.swing.JPanel jPanelMid;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbAddressOnline;
    private javax.swing.JLabel lbFileDaTai;
    private javax.swing.JLabel lbFileHeThong;
    private javax.swing.JLabel lbFileName;
    private javax.swing.JLabel lbNameSearch;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

    private void updateAddress() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String x = jListAddress.getSelectedValue();
        System.out.println(x);
        ListModel a = jListAddress.getModel();

        for (int i = 0; i < a.getSize(); i++) {
            System.out.println(a.getElementAt(i));
        }
    }

    public void loadAddress(String file) {
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            DefaultListModel model = new DefaultListModel();
            String title = "NODE Port";
            model.addElement(title);
            String line = "";
            while ((line = br.readLine()) != null) {
                model.addElement(line);
            }
            jListAddress.setModel(model);
            fr.close();
            br.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void loadFile(String folderPath, JList jListName) {
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        ArrayList<String> results = new ArrayList<String>();
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                //System.out.println("File " + listOfFiles[i].getName());
                results.add(listOfFiles[i].getName());
                model.addElement(listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                //System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
        jListName.setModel(model);
        //ghi ket qua lai file note1_listfileshare
        try {
            File file = new File(this.getfilePathShareHeThong());

            if (file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < results.size(); i++) {

                String s = this.getNodeName() + " " + results.get(i) + "\r\n";
                bw.write(s);

            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            System.out.print(e.toString());
        }
    }

    public void loadFileShareHeThong(String filePath) {

        //ArrayList<String> results = new ArrayList<String>();
        DefaultListModel model = new DefaultListModel();
        File file = new File(filePath);
        file.canRead();
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                model.addElement(line);
            }
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        jListFileShareTrenHeThong.setModel(model);
    }

    public void loadFileDownload(String folderPath, JList jListName) {
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        //ArrayList<String> results = new ArrayList<String>();
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                //System.out.println("File " + listOfFiles[i].getName());
                //results.add(listOfFiles[i].getName());
                model.addElement(listOfFiles[i].getName());
            } else if (listOfFiles[i].isDirectory()) {
                //System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
        jListName.setModel(model);
    }

    public void operationInsert(String title, int type) {
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle(title);
        int choose = 0;
        switch (type) {
            case INSERT:
                choose = chooser.showOpenDialog(null);
                break;
        }
        if (choose == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            switch (type) {
                case INSERT:
                    insertFile(file, folderPath);
                    break;
            }
        }
    }

    private void insertFile(File file, String folderPath) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        InputStream is = null;
        OutputStream os = null;
        try {
            //File aFile = new File("AFile.txt");
            String fileName = file.getName();
            String filePath = folderPath + fileName;
            //System.out.println(filePath);

            File bFile = new File(filePath);

            is = new FileInputStream(file);
            os = new FileOutputStream(bFile);

            byte[] buffer = new byte[1024];
            int length;
            // copy the file content in bytes
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }

            is.close();
            os.close();
            loadFile(folderPath, jListFileName);
            loadFileShareHeThong(this.getfilePathShareHeThong());
            //System.out.println("Fileopied successfull!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void operationDeleted() {
        String fileName = jListFileName.getSelectedValue();
        File file = new File(folderPath + fileName);
        file.delete();
        loadFile(folderPath, jListFileName);
        loadFileShareHeThong(this.getfilePathShareHeThong());
    }

    public void operationPlay() throws InterruptedException {
        this.setSelectedName(jListFileDaTai.getSelectedValue());
        Thread.sleep(1000);
        play = new PlayMp3Thread(this);
        play.start();
    }

    public void operationStop() throws InterruptedException {
        play.stop();
    }

    public void operationSearch() {
        String fileName = tfSearch.getText();

    }
}
