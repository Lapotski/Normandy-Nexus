/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.lapotski.normandynexus.swing;

import com.formdev.flatlaf.FlatLightLaf;
import org.lapotski.normandynexus.*;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kyla Dessirei Dequito
 * @version 0.1
 */
public class NormandyGui extends JFrame {
    // generate logs
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(NormandyGui.class.getName());

    // for window moving
    private int mouseX, mouseY;

    private ProductManager manager = new ProductManager();
    private int editingId = -1;

    public NormandyGui() {
        super("Normandy Nexus");
        setUndecorated(true);

        initComponents();
        this.setLocationRelativeTo(null);
        seedSampleData();
        
        JLabel[] navLabels = { lblManager, lblAbout};
        for (JLabel lbl : navLabels) {
            addHoverEffect(lbl);
        }
        
        ((JSpinner.NumberEditor) spnrPrice.getEditor()).getFormat().applyPattern("0.00");
        spnrPrice.setValue(0.00);

        DefaultTableCellRenderer priceRenderer = new DefaultTableCellRenderer() {
            @Override
            protected void setValue(Object value) {
                if (value instanceof Number) {
                    setText(String.format("%.2f", ((Number) value).doubleValue()));
                } else {
                    super.setValue(value);
                }
            }
        };
        priceRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        tblManager.getColumnModel().getColumn(2).setCellRenderer(priceRenderer);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrInputs = new javax.swing.ButtonGroup();
        MainPanel = new javax.swing.JPanel();
        ButtonPanel = new javax.swing.JPanel();
        lblManager = new javax.swing.JLabel();
        lblAbout = new javax.swing.JLabel();
        lblLogo1 = new javax.swing.JLabel();
        TitlePanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        MinimizeButton = new javax.swing.JButton();
        MaximizeButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        tabPaneMain = new javax.swing.JTabbedPane();
        tabDashboard = new javax.swing.JPanel();
        lblSubHeading = new javax.swing.JLabel();
        lblAboutHeader1 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblDesc = new javax.swing.JLabel();
        lblTech = new javax.swing.JLabel();
        tabManager = new javax.swing.JPanel();
        srlpnlTable = new javax.swing.JScrollPane();
        tblManager = new javax.swing.JTable();
        pnlFields = new javax.swing.JPanel();
        lblId = new javax.swing.JLabel();
        fldId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        fldName = new javax.swing.JTextField();
        lblPrice = new javax.swing.JLabel();
        spnrPrice = new javax.swing.JSpinner();
        lblStock = new javax.swing.JLabel();
        spnrStock = new javax.swing.JSpinner();
        lblCategory = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        lblExtra = new javax.swing.JLabel();
        fldExtra = new javax.swing.JTextField();
        btnAdd = new javax.swing.JToggleButton();
        btnUpdate = new javax.swing.JToggleButton();
        btnDelete = new javax.swing.JToggleButton();
        btnClear = new javax.swing.JToggleButton();
        btnRefresh = new javax.swing.JToggleButton();
        tabAbout = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 720));
        setUndecorated(true);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        ButtonPanel.setBackground(new java.awt.Color(14, 17, 22));
        ButtonPanel.setMinimumSize(new java.awt.Dimension(201, 100));
        ButtonPanel.setPreferredSize(new java.awt.Dimension(201, 726));

        lblManager.setBackground(new java.awt.Color(14, 17, 22));
        lblManager.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblManager.setForeground(new java.awt.Color(255, 255, 255));
        lblManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/product-25px.png"))); // NOI18N
        lblManager.setText("Manage Products");
        lblManager.setIconTextGap(7);
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
        lblAbout.setIconTextGap(7);
        lblAbout.setMaximumSize(new java.awt.Dimension(76, 35));
        lblAbout.setMinimumSize(new java.awt.Dimension(76, 35));
        lblAbout.setOpaque(true);
        lblAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAboutMouseClicked(evt);
            }
        });

        lblLogo1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/game-store-75px.png"))); // NOI18N

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblManager, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                    .addContainerGap(73, Short.MAX_VALUE)
                    .addComponent(lblLogo1)
                    .addGap(53, 53, 53)))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(lblManager, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addComponent(lblAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ButtonPanelLayout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(lblLogo1)
                    .addContainerGap(717, Short.MAX_VALUE)))
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

        lblSubHeading.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        lblSubHeading.setText("Game Storefront Manager");

        lblAboutHeader1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblAboutHeader1.setText("Normandy Nexus");

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/game-store-50px.png"))); // NOI18N

        lblDesc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDesc.setText("<html>\n     <div>\n          Normandy Nexus is a lightweight inventory management system built in Java Swing. <br>\n          Easily manage products, view stock levels, and keep your operations running smoothly.\n     </div>\n</html>");

        lblTech.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTech.setText("<html>       <div>            <b> Developed by:</b> Kyla Dessirei Dequito<br>            <b> Version:</b> 1.0.0<br>            <b> Built with:</b> Java 21 + Swing + Flatlaf <br>      </div>  </html>");

        javax.swing.GroupLayout tabDashboardLayout = new javax.swing.GroupLayout(tabDashboard);
        tabDashboard.setLayout(tabDashboardLayout);
        tabDashboardLayout.setHorizontalGroup(
            tabDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDashboardLayout.createSequentialGroup()
                .addGroup(tabDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabDashboardLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(tabDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSubHeading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAboutHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTech, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabDashboardLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(lblLogo)))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        tabDashboardLayout.setVerticalGroup(
            tabDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDashboardLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(lblLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAboutHeader1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubHeading)
                .addGap(40, 40, 40)
                .addComponent(lblDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(lblTech, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );

        tabPaneMain.addTab("DASHBOARD", tabDashboard);

        tabManager.setMinimumSize(new java.awt.Dimension(985, 769));

        srlpnlTable.setMinimumSize(new java.awt.Dimension(605, 770));
        srlpnlTable.setPreferredSize(new java.awt.Dimension(605, 770));

        tblManager.setAutoCreateRowSorter(true);
        tblManager.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Stock", "Category", "Extra Info"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblManager.setColumnSelectionAllowed(true);
        tblManager.setMinimumSize(new java.awt.Dimension(400, 80));
        tblManager.setShowGrid(true);
        tblManager.getTableHeader().setReorderingAllowed(false);
        tblManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblManagerMouseClicked(evt);
            }
        });
        srlpnlTable.setViewportView(tblManager);
        tblManager.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblManager.getColumnModel().getColumnCount() > 0) {
            tblManager.getColumnModel().getColumn(0).setMinWidth(50);
            tblManager.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblManager.getColumnModel().getColumn(0).setMaxWidth(100);
            tblManager.getColumnModel().getColumn(1).setMinWidth(150);
            tblManager.getColumnModel().getColumn(2).setMinWidth(100);
            tblManager.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblManager.getColumnModel().getColumn(3).setMinWidth(50);
            tblManager.getColumnModel().getColumn(3).setPreferredWidth(50);
            tblManager.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        pnlFields.setToolTipText("");
        pnlFields.setMinimumSize(new java.awt.Dimension(370, 770));
        pnlFields.setPreferredSize(new java.awt.Dimension(370, 770));

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblId.setText("ID");
        lblId.setPreferredSize(new java.awt.Dimension(41, 35));

        fldId.setEditable(false);
        fldId.setBackground(new java.awt.Color(240, 226, 250));
        fldId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldId.setForeground(new java.awt.Color(0, 0, 0));
        fldId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fldId.setFocusable(false);
        fldId.setMinimumSize(new java.awt.Dimension(68, 35));
        fldId.setPreferredSize(new java.awt.Dimension(75, 35));
        fldId.setSelectionColor(new java.awt.Color(158, 123, 155));
        fldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldIdActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblName.setText("NAME");
        lblName.setPreferredSize(new java.awt.Dimension(41, 35));

        fldName.setBackground(new java.awt.Color(255, 255, 255));
        fldName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldName.setForeground(new java.awt.Color(0, 0, 0));
        fldName.setMinimumSize(new java.awt.Dimension(68, 35));
        fldName.setPreferredSize(new java.awt.Dimension(75, 35));
        fldName.setSelectionColor(new java.awt.Color(158, 123, 155));

        lblPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrice.setText("PRICE (₱)");
        lblPrice.setPreferredSize(new java.awt.Dimension(61, 35));

        spnrPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spnrPrice.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        spnrPrice.setPreferredSize(new java.awt.Dimension(68, 35));

        lblStock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStock.setText("STOCK");
        lblStock.setPreferredSize(new java.awt.Dimension(61, 35));

        spnrStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spnrStock.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spnrStock.setPreferredSize(new java.awt.Dimension(68, 35));

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

        fldExtra.setBackground(new java.awt.Color(255, 255, 255));
        fldExtra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fldExtra.setForeground(new java.awt.Color(0, 0, 0));
        fldExtra.setMinimumSize(new java.awt.Dimension(68, 35));
        fldExtra.setPreferredSize(new java.awt.Dimension(75, 35));
        fldExtra.setSelectionColor(new java.awt.Color(158, 123, 155));
        fldExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldExtraActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(35, 46, 63));
        btnGrInputs.add(btnAdd);
        btnAdd.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add-25px.png"))); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setToolTipText("");
        btnAdd.setIconTextGap(10);
        btnAdd.setMaximumSize(new java.awt.Dimension(145, 35));
        btnAdd.setMinimumSize(new java.awt.Dimension(125, 35));
        btnAdd.setPreferredSize(new java.awt.Dimension(145, 35));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(35, 46, 63));
        btnGrInputs.add(btnUpdate);
        btnUpdate.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update-25px.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setIconTextGap(10);
        btnUpdate.setMaximumSize(new java.awt.Dimension(145, 35));
        btnUpdate.setMinimumSize(new java.awt.Dimension(125, 35));
        btnUpdate.setPreferredSize(new java.awt.Dimension(145, 35));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(35, 46, 63));
        btnGrInputs.add(btnDelete);
        btnDelete.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete-25px.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setIconTextGap(10);
        btnDelete.setMaximumSize(new java.awt.Dimension(145, 35));
        btnDelete.setMinimumSize(new java.awt.Dimension(125, 35));
        btnDelete.setPreferredSize(new java.awt.Dimension(145, 35));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(35, 46, 63));
        btnGrInputs.add(btnClear);
        btnClear.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear-25px.png"))); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.setIconTextGap(10);
        btnClear.setMaximumSize(new java.awt.Dimension(145, 35));
        btnClear.setMinimumSize(new java.awt.Dimension(125, 35));
        btnClear.setPreferredSize(new java.awt.Dimension(145, 35));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(35, 46, 63));
        btnGrInputs.add(btnRefresh);
        btnRefresh.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh-25px.png"))); // NOI18N
        btnRefresh.setText("REFRESH TABLE");
        btnRefresh.setToolTipText("");
        btnRefresh.setIconTextGap(10);
        btnRefresh.setMaximumSize(new java.awt.Dimension(145, 35));
        btnRefresh.setMinimumSize(new java.awt.Dimension(125, 35));
        btnRefresh.setPreferredSize(new java.awt.Dimension(145, 35));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFieldsLayout = new javax.swing.GroupLayout(pnlFields);
        pnlFields.setLayout(pnlFieldsLayout);
        pnlFieldsLayout.setHorizontalGroup(
            pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFieldsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFieldsLayout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFieldsLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFieldsLayout.createSequentialGroup()
                        .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(lblId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFieldsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(fldId, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFieldsLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFieldsLayout.createSequentialGroup()
                        .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnrStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fldName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(fldExtra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnrPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(6, 6, 6))
        );
        pnlFieldsLayout.setVerticalGroup(
            pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFieldsLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnrPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnrStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fldExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFieldsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        spnrPrice.setEditor(new JSpinner.NumberEditor(spnrPrice, "0.00"));

        javax.swing.GroupLayout tabManagerLayout = new javax.swing.GroupLayout(tabManager);
        tabManager.setLayout(tabManagerLayout);
        tabManagerLayout.setHorizontalGroup(
            tabManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFields, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(srlpnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        tabManagerLayout.setVerticalGroup(
            tabManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabManagerLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(tabManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlFields, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                    .addComponent(srlpnlTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        tabPaneMain.addTab("MANAGER", tabManager);

        javax.swing.GroupLayout tabAboutLayout = new javax.swing.GroupLayout(tabAbout);
        tabAbout.setLayout(tabAboutLayout);
        tabAboutLayout.setHorizontalGroup(
            tabAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        tabAboutLayout.setVerticalGroup(
            tabAboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 782, Short.MAX_VALUE)
        );

        tabPaneMain.addTab("ABOUT", tabAbout);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 987, Short.MAX_VALUE)
                    .addComponent(tabPaneMain)))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
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

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        refreshTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        resetFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblManager.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this,
                "Please select a product to delete.",
                "No Selection",
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this,
            "Are you sure you want to delete this product?",
            "Confirm Deletion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE);

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            int modelRow = tblManager.convertRowIndexToModel(selectedRow);
            DefaultTableModel model = (DefaultTableModel) tblManager.getModel();

            int id = (Integer) model.getValueAt(modelRow, 0);

            manager.removeProduct(id);
            model.removeRow(modelRow);
            resetFields();

            logger.info("Deleted product with ID: " +id);

            JOptionPane.showMessageDialog(this,
                "Product deleted successfully!",
                "Deleted",
                JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception ex) {
            logger.severe("Error deleting product: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error deleting product: " + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
            if (editingId == -1) {
                JOptionPane.showMessageDialog(this, "Please select a product to update.",
                    "No Selection", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Product updatedProduct = createProduct(false);
            manager.updateProduct(editingId, updatedProduct);
            refreshTable();
            resetFields();
            editingId = -1;

            JOptionPane.showMessageDialog(this, "Product updated successfully!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            Product newProduct = createProduct(true);
            manager.addProduct(newProduct);
            refreshTable();
            resetFields();
            JOptionPane.showMessageDialog(this, "Product added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void fldExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldExtraActionPerformed

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

    private void fldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldIdActionPerformed

    private void tblManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblManagerMouseClicked
        int selectedRow = tblManager.getSelectedRow();
        if (selectedRow == -1) return;

        try {
            int modelRow = tblManager.convertRowIndexToModel(selectedRow);
            DefaultTableModel model = (DefaultTableModel) tblManager.getModel();

            Object idObj = model.getValueAt(modelRow, 0);
            Object nameObj = model.getValueAt(modelRow, 1);
            Object priceObj = model.getValueAt(modelRow, 2);
            Object stockObj = model.getValueAt(modelRow, 3);
            Object categoryObj = model.getValueAt(modelRow, 4);
            Object extraObj = model.getValueAt(modelRow, 5);

            if (idObj == null || nameObj == null || priceObj == null ||stockObj == null || categoryObj == null || extraObj == null) {
                JOptionPane.showMessageDialog(this,
                    "One or more product fields are missing.\nPlease check the selected row.",
                    "Missing Data",
                    JOptionPane.WARNING_MESSAGE);
                return;
            }

            editingId = (int) idObj;
            fldId.setText(idObj.toString());
            fldName.setText(nameObj.toString());
            spnrPrice.setValue(Double.valueOf(priceObj.toString()));
            spnrStock.setValue(Integer.valueOf(stockObj.toString()));
            cmbCategory.setSelectedItem(categoryObj.toString());
            fldExtra.setText(extraObj.toString());

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error loading selected product: " + ex.getMessage(),
                "Selection Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_tblManagerMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            FlatLightLaf.setup();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(
                    null, // Parent component (null for a central screen position)
                    "The FlatLaf theme could not be loaded. Running with default theme.\nError: " + ex.getMessage(),
                    "Configuration Error",
                    JOptionPane.ERROR_MESSAGE // Specifies the icon to use (a red 'X')
            );
            ex.printStackTrace();
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

    private void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) tblManager.getModel();
        model.setRowCount(0);

        for (Product p : manager.getAllProducts()) {
            model.addRow(new Object[] {
                    p.getId(),
                    p.getName(),
                    p.getPrice(),
                    p.getStock(),
                    p.getCategory(),
                    p.getExtraInfo()
            });
        }
    }

    private Product createProduct(boolean isNew) throws Exception {
        String name = fldName.getText().trim();
        String category = (String) cmbCategory.getSelectedItem();
        double price = (Double) spnrPrice.getValue();
        int stock = (Integer) spnrStock.getValue();
        String extra = fldExtra.getText().trim();

        if (name.isEmpty() || category == null || category.isEmpty() || extra.isEmpty()) {
            throw new Exception("Please fill out all fields before saving the product.");
        }

        if (price < 0 || stock < 0) {
            throw new Exception("Price and stock must be non-negative values.");
        }

        int id = isNew ? manager.getNextId() : editingId;
        Product newProduct;

        switch (category) {
            case "Game":
                newProduct = new Game(id, name, price, stock, extra);
                break;
            case "Console":
                newProduct = new Console(id, name, price, stock, extra);
                break;
            case "Accessory":
                newProduct = new Accessory(id, name, price, stock, extra);
                break;
            default:
                throw new Exception("Unknown category selected.");
        }

        return newProduct;
    }

    private void seedSampleData() {
        // optional sample products
        manager.addProduct(new Game(manager.getNextId(), "Mass Effect Legendary Edition", 2599, 72, "RPG"));
        manager.addProduct(new Console(manager.getNextId(), "Playstation 5", 30790, 36, "Sony"));
        manager.addProduct(new Accessory(manager.getNextId(), "Quest 3", 27895, 20, "VR Headset"));

        DefaultTableModel model = (DefaultTableModel) tblManager.getModel();

        model.setRowCount(0);

        for (Product product : manager.getAllProducts()) {
            Object[] rowData = new Object[] {
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getStock(),
                product.getCategory(),
                product.getExtraInfo()
            };

            model.addRow(rowData);
        }
    }

    private void resetFields() {
        fldId.setText("");
        fldName.setText("");
        fldExtra.setText("");
        spnrPrice.setValue(0.00);
        spnrStock.setValue(0);
        cmbCategory.setSelectedIndex(0);
        editingId = -1;
    }


    // <editor-fold defaultstate="collapsed" desc="Components Generated Code">   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JButton CloseButton;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton MaximizeButton;
    private javax.swing.JButton MinimizeButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JToggleButton btnAdd;
    private javax.swing.JToggleButton btnClear;
    private javax.swing.JToggleButton btnDelete;
    private javax.swing.ButtonGroup btnGrInputs;
    private javax.swing.JToggleButton btnRefresh;
    private javax.swing.JToggleButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JTextField fldExtra;
    private javax.swing.JTextField fldId;
    private javax.swing.JTextField fldName;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblAboutHeader1;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblDesc;
    private javax.swing.JLabel lblExtra;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblManager;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblSubHeading;
    private javax.swing.JLabel lblTech;
    private javax.swing.JPanel pnlFields;
    private javax.swing.JSpinner spnrPrice;
    private javax.swing.JSpinner spnrStock;
    private javax.swing.JScrollPane srlpnlTable;
    private javax.swing.JPanel tabAbout;
    private javax.swing.JPanel tabDashboard;
    private javax.swing.JPanel tabManager;
    private javax.swing.JTabbedPane tabPaneMain;
    private javax.swing.JTable tblManager;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
