/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.lapotski.normandynexus;

/**
 *
 * @author Admin
 */

import javax.swing.SwingUtilities;
import org.lapotski.normandynexus.swing.NormandyGui;
import com.formdev.flatlaf.FlatLightLaf;

public class Main {
    public static void main(String[] args) {
        try {
            FlatLightLaf.setup();
        } catch (Exception ex) {
            System.err.println("FlatLaf failed to load: " + ex.getMessage());
        }

        SwingUtilities.invokeLater(() -> new NormandyGui().setVisible(true));
    }
}