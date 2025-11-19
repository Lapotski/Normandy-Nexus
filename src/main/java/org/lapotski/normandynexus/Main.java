package org.lapotski.normandynexus;

/**
 *
 * @author Kyla Dessirei Dequito
 * @version 2.1
 *
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
