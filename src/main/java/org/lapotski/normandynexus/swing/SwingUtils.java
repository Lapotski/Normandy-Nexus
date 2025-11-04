/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lapotski.normandynexus.swing;

/**
 *
 * @author Admin
 */

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.*;

public class SwingUtils {
    private SwingUtils() {
        throw new UnsupportedOperationException("Utility class — do not instantiate.");
    }

    // <editor-fold defaultstate="collapsed" desc="DashButton Methods">
    private static final Color DEFAULT_BG = new Color(14, 17, 22);
    private static final Color ACTIVE_BG = new Color(56, 59, 88);
    private static final Color HOVER_BG = new Color(30, 33, 40);

    public static void resetNavHighlights(JLabel activeLabel, JLabel... navLabels) {
        for (JLabel lbl : navLabels) {
            if (lbl != activeLabel) {
                lbl.setOpaque(false);
                lbl.setBackground(DEFAULT_BG);
                lbl.setForeground(Color.WHITE);
            }
        }
    }

    public static void addHoverEffect(JLabel label) {
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                if (!label.getBackground().equals(ACTIVE_BG)) {
                    label.setBackground(HOVER_BG);
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!label.getBackground().equals(ACTIVE_BG)) {
                    label.setBackground(DEFAULT_BG);
                }
            }
        });
    } // </editor-fold>

    // price renderer for .2f formating in tables
    public static void applyPriceRenderer(JTable table, int columnIndex) {
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
        TableColumn column = table.getColumnModel().getColumn(columnIndex);
        column.setCellRenderer(priceRenderer);
    }
}
