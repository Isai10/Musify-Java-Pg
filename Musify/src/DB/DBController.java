/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Album.Album;
import Artist.Artist;
import Song.Song;
import Users.User;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Isai
 */
public class DBController {
    private String user= "postgres";
    private String password="Salmo19:1";
    private String url = "jdbc:postgresql://localhost:5432/Musify";
    private Connection baseDatos;
    
    //Establece y obtiene la conexion con la base de datos
    public void SetConnection() 
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            //Obtiene la conexiona a la base de datos
            baseDatos = DriverManager.getConnection(url, user, password);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
        
    }
    /*Cierra la coneccion con la base de datos*/
    public void CloseConnection()
    {
       try
        {
            baseDatos.close();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    //Registra a un nuevo usuario
    public boolean RegisterUser(User user){
       try{
                    PreparedStatement statment = baseDatos.prepareStatement("INSERT INTO usuario (firstname,lastname,email,password,image,rol) VALUES(?,?,?,?,?,?)");
                    statment.setString(1,user.getFirstName());
                    statment.setString(2,user.getLastName());
                    statment.setString(3,user.getEmail());                    
                    statment.setString(4,user.getPassword());
                    statment.setBytes(5, user.getImage());
                    statment.setString(6,user.getRol());
                    statment.execute();
                    return true;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            return false;
        }
    }
    
    
    //Busca a un usuario por su email y su password
    public User GetUser(String email, String password)
    {
        try{
                    PreparedStatement statment = baseDatos.prepareStatement("SELECT * FROM usuario WHERE email = ? AND password = ?");
                    statment.setString(1,email);
                    statment.setString(2,password);
                    ResultSet result = statment.executeQuery();
                    result.next();
                    User user = new User();
                    user.setId(result.getInt(1));
                    user.setFirstName(result.getString(2));
                    user.setLastName(result.getString(3));
                    user.setEmail(result.getString(4));
                    user.setPassword(result.getString(5));
                    user.setImage(result.getBytes(6));
                    user.setRol(result.getString(7)); //Establece el rol del usuario como User 
                    
                    return user;
        }
        catch(Exception ex)
        {
            //JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            //return false;
            return null;
        }
    }
     public boolean ModifyArtist(Artist artist)
     {
         try{
                    PreparedStatement statment = baseDatos.prepareStatement("UPDATE artist SET artistname = ? , image = ? , description = ? WHERE id = ?");
                    statment.setString(1,artist.getArtistName());
                    statment.setBytes(2,artist.getImage());
                    statment.setString(3,artist.getDescription());                    
                    statment.setInt(4, artist.getId());
                    statment.executeUpdate();
                    return true;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            return false;
        }
     }
    public boolean RemoveArtist(int id)
    {
        try{
                    PreparedStatement statment = baseDatos.prepareStatement("DELETE FROM artist WHERE id = ?");
                    statment.setInt(1,id);
                    statment.executeUpdate();
                    return true;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"¡No se puede eliminar el artista ya que tiene canciones y albums!"); 
            return false;
        }
        
        
    }
    public boolean AddArtist(Artist artist){
       try{
                    PreparedStatement statment = baseDatos.prepareStatement("INSERT INTO artist (artistname,image,description) VALUES(?,?,?)");
                    statment.setString(1,artist.getArtistName());
                    statment.setBytes(2,artist.getImage());
                    statment.setString(3,artist.getDescription());                    
                    statment.executeUpdate();
                    return true;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            return false;
        }
    }
    public Artist getArtist(String artistName){
       try{
                    PreparedStatement statment = baseDatos.prepareStatement("SELECT * FROM artist WHERE artistname = ?");
                    statment.setString(1,artistName);
                    ResultSet result = statment.executeQuery();
                    result.next();
                    Artist artist = new Artist();
                    artist.setId(result.getInt(1));
                    artist.setArtistName(result.getString(2));
                    artist.setImage(result.getBytes(3));
                    artist.setDescription(result.getString(4));
                    artist.setNumAlbums(result.getInt(5));
                    
                    return artist;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            return null;
        }
    }
    public Artist getArtist(int id)
    {
        try{
                    PreparedStatement statment = baseDatos.prepareStatement("SELECT * FROM artist WHERE id = ?");
                    statment.setInt(1,id);
                    ResultSet result = statment.executeQuery();
                    result.next();
                    Artist artist = new Artist();
                    artist.setId(result.getInt(1));
                    artist.setArtistName(result.getString(2));
                    artist.setImage(result.getBytes(3));
                    artist.setDescription(result.getString(4));
                    artist.setNumAlbums(result.getInt(5));
                    
                    return artist;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            return null;
        }
    }
    
    public ArrayList<Artist> getArtists(){
       try{
                    PreparedStatement statment = baseDatos.prepareStatement("SELECT * FROM artist");
                    ResultSet result = statment.executeQuery();
                    ArrayList<Artist> artists = new ArrayList<Artist>();
                    while(result.next())
                    {
                        
                        Artist artist = new Artist();
                        artist.setId(result.getInt(1));
                        artist.setArtistName(result.getString(2));
                        artist.setImage(result.getBytes(3));
                        artist.setDescription(result.getString(4));
                        artist.setNumAlbums(result.getInt(5));
                        artists.add(artist);
                    }
                    return artists;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            return null;
        }
    }
    public boolean AddAlbum(Album album){
       try{
                    PreparedStatement statment = baseDatos.prepareStatement("INSERT INTO album (albumname,year,artist,image) VALUES(?,?,?,?)");
                    statment.setString(1,album.getAlbumName());
                    statment.setInt(2,album.getYear());
                    statment.setInt(3,album.getArtistId()); 
                    statment.setBytes(4,album.getImage());
                    statment.executeUpdate();
                    return true;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            return false;
        }
    }
    
    public Album getAlbum(String albumName){
       try{
                    PreparedStatement statment = baseDatos.prepareStatement("SELECT * FROM album WHERE albumname = ?");
                    statment.setString(1,albumName);
                    ResultSet result = statment.executeQuery();
                    result.next();
                    Album album = new Album();
                    album.setId(result.getInt(1));
                    album.setAlbumName(result.getString(2));
                    album.setYear(result.getInt(3));
                    album.setSongs(result.getInt(3));
                    album.setArtistId(result.getInt(3));
                    album.setImage(result.getBytes(3));
                    return album;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            return null;
        }
    }
    
    public ArrayList<Album> getAlbums(){
       try{
                    PreparedStatement statment = baseDatos.prepareStatement("SELECT * FROM album");
                    ResultSet result = statment.executeQuery();
                    ArrayList<Album> albums = new ArrayList<Album>();
                    while(result.next())
                    {
                        
                        Album album = new Album();
                        album.setId(result.getInt(1));
                        album.setAlbumName(result.getString(2));
                        album.setYear(result.getInt(3));
                        album.setSongs(result.getInt(3));
                        album.setArtistId(result.getInt(3));
                        album.setImage(result.getBytes(3));
                        albums.add(album);
                    }
                    return albums;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            return null;
        }
    }
    public ArrayList<Album> getAlbums(int idArtist){
       try{
                    PreparedStatement statment = baseDatos.prepareStatement("SELECT * FROM album WHERE artist = ?");
                    statment.setInt(1, idArtist);
                    ResultSet result = statment.executeQuery();
                    ArrayList<Album> albums = new ArrayList<Album>();
                    while(result.next())
                    {
                        
                        Album album = new Album();
                        album.setId(result.getInt(1));
                        album.setAlbumName(result.getString(2));
                        album.setYear(result.getInt(3));
                        album.setSongs(result.getInt(3));
                        album.setArtistId(result.getInt(3));
                        album.setImage(result.getBytes(3));
                        albums.add(album);
                    }
                    return albums;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            return null;
        }
    }
    
     public boolean AddSong(Song song){
       try{
                    PreparedStatement statment = baseDatos.prepareStatement("INSERT INTO song (songname,year,number,album,artist,file) VALUES(?,?,?,?,?,?)");
                    statment.setString(1,song.getSongName());
                    statment.setInt(2,song.getYear());
                    statment.setInt(3,song.getNumber());
                    statment.setInt(4,song.getAlbumId()); 
                    statment.setInt(5,song.getArtistId());
                    statment.setBytes(6,song.getFile());
                    statment.executeUpdate();
                    return true;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+ex.getLocalizedMessage());
            return false;
        }
    }
}
