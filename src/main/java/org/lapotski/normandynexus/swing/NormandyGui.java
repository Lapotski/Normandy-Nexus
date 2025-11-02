/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.lapotski.normandynexus.swing;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Admin
 */
public class NormandyGui extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NormandyGui.class.getName());
    
    private int mouseX, mouseY;

    public NormandyGui() {
        setUndecorated(true);
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        JLabel[] navLabels = { lblManager, lblAbout};
        for (JLabel lbl : navLabels) {
            addHoverEffect(lbl);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ButtonPanel = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblManager = new javax.swing.JLabel();
        lblAbout = new javax.swing.JLabel();
        StoreLabel1 = new javax.swing.JLabel();
        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        MinimizeButton = new javax.swing.JButton();
        MaximizeButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        tabPaneMain = new javax.swing.JTabbedPane();
        tabManager = new javax.swing.JPanel();
        srlpnlTable = new javax.swing.JScrollPane();
        tblManager = new javax.swing.JTable();
        pnlFields = new javax.swing.JPanel();
        btnAdd = new javax.swing.JToggleButton();
        btnUpdate = new javax.swing.JToggleButton();
        btnDelete = new javax.swing.JToggleButton();
        btnClear = new javax.swing.JToggleButton();
        fldName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        fldName1 = new javax.swing.JTextField();
        spnrStock = new javax.swing.JSpinner();
        lblStock = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        lblExtra = new javax.swing.JLabel();
        fldName2 = new javax.swing.JTextField();
        tabAbout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setUndecorated(true);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        ButtonPanel.setBackground(new java.awt.Color(14, 17, 22));
        ButtonPanel.setMinimumSize(new java.awt.Dimension(200, 100));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(200, 726));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/game-store-50px.png"))); // NOI18N

        lblManager.setBackground(new java.awt.Color(14, 17, 22));
        lblManager.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblManager.setForeground(new java.awt.Color(255, 255, 255));
        lblManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product-25px.png"))); // NOI18N
        lblManager.setText("Manage Products");
        lblManager.setMaximumSize(new java.awt.Dimension(162, 35));
        lblManager.setMinimumSize(new java.awt.Dimension(162, 35));
        lblManager.setOpaque(true);
        lblManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblManagerMouseClicked(evt);
            }
        });

        lblAbout.setBackground(new java.awt.Color(14, 17, 22));
        lblAbout.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblAbout.setForeground(new java.awt.Color(255, 255, 255));
        lblAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/about-25px.png"))); // NOI18N
        lblAbout.setText("About");
        lblAbout.setMaximumSize(new java.awt.Dimension(76, 35));
        lblAbout.setMinimumSize(new java.awt.Dimension(76, 35));
        lblAbout.setOpaque(true);
        lblAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAboutMouseClicked(evt);
            }
        });

        StoreLabel1.setBackground(new java.awt.Color(255, 255, 255));
        StoreLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        StoreLabel1.setForeground(new java.awt.Color(255, 255, 255));
        StoreLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StoreLabel1.setText("<html>Normandy<br>Nexus</html>");

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addComponent(lblLogo)
                        .addGap(18, 18, 18)
                        .addComponent(StoreLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblManager, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblAbout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogo)
                    .addComponent(StoreLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(202, 202, 202)
                .addComponent(lblManager, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(lblAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TitlePanel.setBackground(new java.awt.Color(55, 74, 103));
        TitlePanel.setMinimumSize(new java.awt.Dimension(100, 35));
        TitlePanel.setPreferredSize(new java.awt.Dimension(901, 35));
        TitlePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitlePanelMouseDragged(evt);
            }
        });
        TitlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitlePanelMousePressed(evt);
            }
        });

        TitleLabel.setBackground(new java.awt.Color(255, 255, 255));
        TitleLabel.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Normandy Nexus: Game Storefront Manager");

        MinimizeButton.setBackground(new java.awt.Color(97, 98, 131));
        MinimizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/minimize-25px.png"))); // NOI18N
        MinimizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizeButtonActionPerformed(evt);
            }
        });

        MaximizeButton.setBackground(new java.awt.Color(97, 98, 131));
        MaximizeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/maximize-25px.png"))); // NOI18N
        MaximizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaximizeButtonActionPerformed(evt);
            }
        });

        CloseButton.setBackground(new java.awt.Color(97, 98, 131));
        CloseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/close-25px.png"))); // NOI18N
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(TitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MinimizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MaximizeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CloseButton)
                .addContainerGap())
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitlePanelLayout.createSequentialGroup()
                .addGroup(TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TitlePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TitleLabel))
                    .addComponent(MaximizeButton)
                    .addComponent(CloseButton)
                    .addComponent(MinimizeButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabPaneMain.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tabPaneMain.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        tabManager.setMinimumSize(new java.awt.Dimension(985, 769));

        srlpnlTable.setMinimumSize(new java.awt.Dimension(456, 406));

        tblManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Price", "Stock", "Category", "Extra Info"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManager.setMinimumSize(new java.awt.Dimension(400, 80));
        srlpnlTable.setViewportView(tblManager);
        if (tblManager.getColumnModel().getColumnCount() > 0) {
            tblManager.getColumnModel().getColumn(0).setMinWidth(50);
            tblManager.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblManager.getColumnModel().getColumn(0).setMaxWidth(100);
            tblManager.getColumnModel().getColumn(3).setMinWidth(50);
            tblManager.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblManager.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        pnlFields.setMaximumSize(new java.awt.Dimension(320, 184));
        pnlFields.setMinimumSize(new java.awt.Dimension(320, 184));
        pnlFields.setPreferredSize(new java.awt.Dimension(320, 184));

        btnAdd.setBackground(new java.awt.Color(35, 46, 63));
        btnAdd.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.setMaximumSize(new java.awt.Dimension(125, 35));
        btnAdd.setMinimumSize(new java.awt.Dimension(125, 35));
        btnAdd.setPreferredSize(new java.awt.Dimension(125, 35));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(35, 46, 63));
        btnUpdate.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");
        btnUpdate.setMaximumSize(new java.awt.Dimension(125, 35));
        btnUpdate.setMinimumSize(new java.awt.Dimension(125, 35));
        btnUpdate.setPreferredSize(new java.awt.Dimension(125, 35));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(35, 46, 63));
        btnDelete.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.setMaximumSize(new java.awt.Dimension(125, 35));
        btnDelete.setMinimumSize(new java.awt.Dimension(125, 35));
        btnDelete.setPreferredSize(new java.awt.Dimension(125, 35));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(35, 46, 63));
        btnClear.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        btnClear.setMaximumSize(new java.awt.Dimension(125, 35));
        btnClear.setMinimumSize(new java.awt.Dimension(125, 35));
        btnClear.setPreferredSize(new java.awt.Dimension(125, 35));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        fldName.setBackground(new java.awt.Color(255, 255, 255));
        fldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldName.setForeground(new java.awt.Color(255, 255, 255));
        fldName.setText("jTextField1");
        fldName.setMinimumSize(new java.awt.Dimension(68, 35));
        fldName.setPreferredSize(new java.awt.Dimension(75, 35));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("NAME");
        lblName.setPreferredSize(new java.awt.Dimension(41, 35));

        lblName1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName1.setText("PRICE (₱)");
        lblName1.setPreferredSize(new java.awt.Dimension(61, 35));

        fldName1.setBackground(new java.awt.Color(255, 255, 255));
        fldName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldName1.setForeground(new java.awt.Color(255, 255, 255));
        fldName1.setText("jTextField1");
        fldName1.setMinimumSize(new java.awt.Dimension(68, 35));
        fldName1.setPreferredSize(new java.awt.Dimension(75, 35));

        spnrStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spnrStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnrStock.setPreferredSize(new java.awt.Dimension(68, 35));

        lblStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStock.setText("STOCK");
        lblStock.setPreferredSize(new java.awt.Dimension(61, 35));

        lblCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCategory.setText("CATEGORY");
        lblCategory.setPreferredSize(new java.awt.Dimension(61, 35));

        cmbCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Game", "Console", "Accessory" }));
        cmbCategory.setPreferredSize(new java.awt.Dimension(82, 35));
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });

        lblExtra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblExtra.setText("GENRE");
        lblExtra.setPreferredSize(new java.awt.Dimension(61, 35));

        fldName2.setBackground(new java.awt.Color(255, 255, 255));
        fldName2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldName2.setForeground(new java.awt.Color(255, 255, 255));
        fldName2.setText("jTextField1");
        fldName2.setMinimumSize(new java.awt.Dimension(68, 35));
        fldName2.setPreferredSize(new java.awt.Dimension(75, 35));

        javax.swing.GroupLayout pnlFieldsLayout = new javax.swing.GroupLayout(pnlFields);
        pnlFields.setLayout(pnlFieldsLayout);
        pnlFieldsLayout.setHorizontalGroup(
            pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFieldsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFieldsLayout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFieldsLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFieldsLayout.createSequentialGroup()
                        .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblExtra, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(lblCategory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fldName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFieldsLayout.createSequentialGroup()
                        .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(spnrStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fldName1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                            .addComponent(fldName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        pnlFieldsLayout.setVerticalGroup(
            pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFieldsLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnrStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 331, Short.MAX_VALUE)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout tabManagerLayout = new javax.swing.GroupLayout(tabManager);
        tabManager.setLayout(tabManagerLayout);
        tabManagerLayout.setHorizontalGroup(
            tabManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabManagerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srlpnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        tabManagerLayout.setVerticalGroup(
            tabManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManagerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(tabManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srlpnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlFields, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        tabPaneMain.addTab("MANAGER", tabManager);

        javax.swing.GroupLayout tabAboutLayout = new javax.swing.GroupLayout(tabAbout);
        tabAbout.setLayout(tabAboutLayout);
        tabAboutLayout.setHorizontalGroup(
            tabAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 985, Short.MAX_VALUE)
        );
        tabAboutLayout.setVerticalGroup(
            tabAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
        );

        tabPaneMain.addTab("ABOUT", tabAbout);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                    .addComponent(tabPaneMain)))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tabPaneMain))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        MainPanel.getAccessibleContext().setAccessibleName("MainPanel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void MaximizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaximizeButtonActionPerformed
        java.awt.Frame frame = (java.awt.Frame) this;

        int currentState = frame.getExtendedState();

        if (currentState == java.awt.Frame.MAXIMIZED_BOTH) {
            frame.setExtendedState(java.awt.Frame.NORMAL);
        } else {
            frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_MaximizeButtonActionPerformed

    private void MinimizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinimizeButtonActionPerformed
        java.awt.Frame frame = (java.awt.Frame) this;
        frame.setExtendedState(java.awt.Frame.ICONIFIED);
    }//GEN-LAST:event_MinimizeButtonActionPerformed

    private void lblManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManagerMouseClicked
        setActiveTab(lblManager, tabManager);
    }//GEN-LAST:event_lblManagerMouseClicked

    private void lblAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAboutMouseClicked
        setActiveTab(lblAbout, tabAbout);
    }//GEN-LAST:event_lblAboutMouseClicked

    private void TitlePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitlePanelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_TitlePanelMousePressed

    private void TitlePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitlePanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - mouseX, y - mouseY);
    }//GEN-LAST:event_TitlePanelMouseDragged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        try {
            Object selectedObj = cmbCategory.getSelectedItem();
            if (selectedObj == null) {
                lblExtra.setText("NONE");
                lblExtra.setForeground(Color.RED);
                return;
            }
            
            String selected = selectedObj.toString();
            
            switch (selected) {
                case "Game":
                    lblExtra.setText("GENRE");
                    break;
                    
                case "Console":
                    lblExtra.setText("BRAND");
                    break;

                case "Accessory":
                    lblExtra.setText("TYPE");
                    break;

                default:
                    lblExtra.setText("NONE");
                    break;   
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                "An unexpected error occurred while updating the label:\n" + ex.getMessage(),
                "Error",
                JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_cmbCategoryActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new NormandyGui().setVisible(true));
    }

    
    // methods for button pane 
    private void resetNavHighlights(JLabel activeLabel) {
        JLabel[] navLabels = { lblManager, lblAbout }; // example list of all nav labels
        for (JLabel lbl : navLabels) {
            if (lbl != activeLabel) {
                lbl.setOpaque(false);
                lbl.setBackground(new Color(14, 17, 22));
                lbl.setForeground(Color.WHITE);
            }
        }
    }

    private void setActiveTab(JLabel activeLabel, JPanel targetTab) {
        try {
            if (tabPaneMain != null && targetTab != null) {
                tabPaneMain.setSelectedComponent(targetTab);

                // Highlight the active label
                activeLabel.setOpaque(true);
                activeLabel.setBackground(new Color(56, 59, 88));
                activeLabel.setForeground(Color.WHITE);

                // Reset other labels
                resetNavHighlights(activeLabel);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Error: Tabbed pane or target tab not initialized properly.",
                        "Navigation Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,
                    "An unexpected error occurred while switching tabs:\n" + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    private void addHoverEffect(JLabel label) {
    label.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseEntered(java.awt.event.MouseEvent evt) {
            label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            if (!label.getBackground().equals(new Color(56, 59, 88))) {
                label.setBackground(new Color(30, 33, 40)); // slight lighten
            }
        }
        public void mouseExited(java.awt.event.MouseEvent evt) {
            if (!label.getBackground().equals(new Color(56, 59, 88))) {
                label.setBackground(new Color(14, 17, 22)); // back to normal
            }
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton CloseButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton MaximizeButton;
    private javax.swing.JButton MinimizeButton;
    private javax.swing.JLabel StoreLabel1;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JToggleButton btnAdd;
    private javax.swing.JToggleButton btnClear;
    private javax.swing.JToggleButton btnDelete;
    private javax.swing.JToggleButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JTextField fldName;
    private javax.swing.JTextField fldName1;
    private javax.swing.JTextField fldName2;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblExtra;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblStock;
    private javax.swing.JPanel pnlFields;
    private javax.swing.JSpinner spnrStock;
    private javax.swing.JScrollPane srlpnlTable;
    private javax.swing.JPanel tabAbout;
    private javax.swing.JPanel tabManager;
    private javax.swing.JTabbedPane tabPaneMain;
    private javax.swing.JTable tblManager;
    // End of variables declaration//GEN-END:variables
}
