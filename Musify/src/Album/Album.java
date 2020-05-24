/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Album;

import javax.swing.JOptionPane;

/**
 *
 * @author Isai
 */
public class Album {
    //Atributos de  la clase 
        private int id;
        private String albumName;
        private int year;
        private int songs;
        private int artist;
        private byte[] image;
   
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
        public String getAlbumName()
        {
            return albumName;
        }
        public void setAlbumName(String albumName)
        {
           this.albumName = albumName;
        }
        public int getSongs()
        {
            return songs;
        }
        public void setSongs(int songs)
        {
           this.songs = songs;
        }
        
        //lastName
         public int getYear()
        {
            return year;
        }
        public void setYear(int year)
        {
           this.year = year;
        }
        //email
         public int getArtistId()
        {
            return artist;
        }
        public void setArtistId(int artist)
        {
           this.artist = artist;
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
