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
public class Song {
     //Atributos de  la clase 
        private int id;
        private String songName;
        private int year;
        private int number;
        private int album;
        private int artist;
        private byte[] file;
   
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
        public String getSongName()
        {
            return songName;
        }
        public void setSongName(String songName)
        {
           this.songName = songName;
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
         public int getNumber()
        {
            return number;
        }
        public void setNumber(int number)
        {
           this.number = number;
        }
         public int getAlbumId()
        {
            return album;
        }
        public void setAlbumId(int album)
        {
           this.album = album;
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
         public byte[] getFile()
        {
            
            return file;
        }
        public void setFile(byte[] file) 
        {
            try{
              this.file = file;
            }
           catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+"Exception: User.setImage()");
            }
           //this.password = urlImage;
        }
}
