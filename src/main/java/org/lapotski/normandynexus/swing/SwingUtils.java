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

public class SwingUtils {

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
