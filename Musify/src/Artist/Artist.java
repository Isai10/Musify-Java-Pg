/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artist;

import javax.swing.JOptionPane;

/**
 *
 * @author Isai
 */
public class Artist {
    //Atributos de  la clase 
        private int id;
        private String artistName;
        private byte[] image;
        private String descripcion;
        private int albumsNum;
   
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
        public String getArtistName()
        {
            return artistName;
        }
        public void setArtistName(String artistName)
        {
           this.artistName = artistName;
        }
        //lastName
         public String getDescription()
        {
            return descripcion;
        }
        public void setDescription(String description)
        {
           this.descripcion = description;
        }
        //email
         public int getNumAlbums()
        {
            return albumsNum;
        }
        public void setNumAlbums(int numAlbums)
        {
           this.albumsNum = numAlbums;
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
     
}
