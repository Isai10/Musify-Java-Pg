/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author Isai
 */
public class User {
        //Atributos de  la clase 
        private int id;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private byte[] image;
        private String rol;
        
        //Metodos de  acceso y modificacion
        public int getId()
        {
            return id;
        }
        public void setId(int id)
        {
           this.id = id;
        }
        //firstName
        public String getFirstName()
        {
            return firstName;
        }
        public void setFirstName(String firstName)
        {
           this.firstName = firstName;
        }
        //lastName
         public String getLastName()
        {
            return lastName;
        }
        public void setLastName(String lastName)
        {
           this.lastName = lastName;
        }
        //email
         public String getEmail()
        {
            return email;
        }
        public void setEmail(String email)
        {
           this.email = email;
        }
        //password
        public String getPassword()
        {
            return password;
        }
        public void setPassword(String password)
        {
           this.password = password;
        }
        //image
         public byte[] getImage()
        {
            
            return image;
        }
        public void setImage(byte[] image) 
        {
            try{
              this.image = image;
            }
           catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+"Exception: User.setImage()");
            }
           //this.password = urlImage;
        }
        //rol
        public String getRol()
        {
            return rol;
        }
        public void setRol(String rol)
        {
           this.rol = rol;
        }
}
