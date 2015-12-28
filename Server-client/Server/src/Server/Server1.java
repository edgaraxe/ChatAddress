/*
 * This work is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License. 
 * http://creativecommons.org/licenses/by-nc/3.0/
 */
package Server;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Edgar, Sara, Andre
 */
public class Server1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //ServerUpdate p = new ServerUpdate();
        //p.prepare();
        //p.setVisible(true);

        final ServerUpdate c;
        // Local host connection can be stored on a dedicated server.
        c = new ServerUpdate();
        c.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        c.pack();

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                c.setVisible(true);
            }
        });
        c.prepare();

    }

}
