/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Song;

import javax.swing.JOptionPane;

/**
 *
 * @author Isai
 */
public class PlayList {
     private int id;
       
        private int userId;
        private int songId;
       
   
        //Metodos de  acceso y modificacion
        public int getId()
        {
            return id;
        }
        public void setId(int id)
        {
           this.id = id;
        }
        
        //lastName
         public int getUserId()
        {
            return userId;
        }
        public void setUserId(int userId)
        {
           this.userId = userId;
        }
         public int getSongId()
        {
            return songId;
        }
        public void setSongId(int songId)
        {
           this.songId = songId;
        }
         
}
