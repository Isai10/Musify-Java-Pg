/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utility;

import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Isai
 */
public class Utility {
    public  static byte[] ChooseImage()
    {
        try{
            
           JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
            fileChooser.setFileFilter(filter);
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
              byte[] image;
              FileInputStream fis = new FileInputStream(fileChooser.getSelectedFile());
              image = new byte[fis.available()];
              fis.read(image);
              return image;
               //JOptionPane.showMessageDialog(null,urlImage);
            }
            return null;
       }
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+"SignUp.jButtonLoadImageActionPerformed()");
           return null;
       }
        
    }
}
