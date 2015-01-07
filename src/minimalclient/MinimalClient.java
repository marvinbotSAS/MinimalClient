/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimalclient;

import javax.swing.SwingUtilities;

/**
 *
 * @author patrice
 */
public class MinimalClient 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

            SwingUtilities.invokeLater(new Runnable() 
            {
                MainFrame frame;
                public void run() 
                {
                    frame = new MainFrame();
                    frame.setVisible(true);
                }
            });
    }
    
}
