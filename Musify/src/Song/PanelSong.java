/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Song;

import Album.Album;
import Artist.Artist;
import DB.DBController;
import Security.Validator;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Isai
 */
public class PanelSong extends javax.swing.JPanel {
    private byte[] songFile;
    /**
     * Creates new form PanelSong
     */
    public PanelSong() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFieldSongName = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jImageUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSaveSong = new javax.swing.JButton();
        jTextFieldYear = new javax.swing.JTextField();
        jComboBoxArtist = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButtonChooseFile = new javax.swing.JButton();
        jComboBoxAlbum = new javax.swing.JComboBox<>();
        jTextFieldNum = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(657, 503));

        jTextFieldSongName.setText("Song name:");

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jImageUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        jImageUser.setDoubleBuffered(true);
        jImageUser.setIconTextGap(0);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jImageUser)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jImageUser)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Add new song");

        jButtonSaveSong.setText("Save");
        jButtonSaveSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveSongActionPerformed(evt);
            }
        });

        jTextFieldYear.setText("Year:");

        jComboBoxArtist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxArtistActionPerformed(evt);
            }
        });

        jLabel2.setText("Choose File:");

        jButtonChooseFile.setText("Load");
        jButtonChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseFileActionPerformed(evt);
            }
        });

        jTextFieldNum.setText("Number:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonChooseFile))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldSongName, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonSaveSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jTextFieldYear, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                .addComponent(jComboBoxArtist, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxAlbum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldNum, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldSongName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxArtist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChooseFile)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonSaveSong))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed

    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSaveSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveSongActionPerformed
        try{
            //Validaciones de seguridad y prevencion de errores
            boolean songValid  =  Validator.validaArtista(this.jTextFieldSongName.getText());
            boolean yearValid =  Validator.validaYear(this.jTextFieldYear.getText());
            boolean validImage = Validator.validaImage(songFile);
            boolean validNumber = Validator.validaYear(this.jTextFieldNum.getText());
            
            if( songValid && yearValid && validImage && validNumber)
            {
                //Conexion con la base de datos
                DBController connect = new DBController();
                connect.SetConnection();
                Song song = new Song();
                song.setSongName(this.jTextFieldSongName.getText());
                song.setYear(Integer.parseInt(this.jTextFieldYear.getText()));
                song.setFile(songFile);
                Artist artistSelect =  connect.getArtist(this.jComboBoxArtist.getSelectedItem().toString());
                song.setArtistId(artistSelect.getId());
                Album albumSelect = connect.getAlbum(this.jComboBoxAlbum.getSelectedItem().toString());
                song.setAlbumId(albumSelect.getId());
                boolean added = connect.AddSong(song);
                if(added)
                {
                    JOptionPane.showMessageDialog(null,"¡Canción agregada exitosamente!");
                }
                else{
                    JOptionPane.showMessageDialog(null,"¡No se pudo agregar la canción !");
                }
                connect.CloseConnection();
            }
            else{
                //Genera un mensaje de los posibles errores
                JOptionPane.showMessageDialog(null,
                    "¡Datos invalidos o archivo no cargado!");
            }
        }
        catch(Exception ex)
        {
            // JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_jButtonSaveSongActionPerformed

    private void jButtonChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseFileActionPerformed
        try{
            JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("MP3 & WAV", "mp3", "wav");
            fileChooser.setFileFilter(filter);
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {

                FileInputStream fis = new FileInputStream(fileChooser.getSelectedFile());
                songFile = new byte[fis.available()];
                fis.read(songFile);
               // PreviewSound(fileChooser.getSelectedFile().getPath());
                //JOptionPane.showMessageDialog(null,urlImage);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+"SignUp.jButtonLoadImageActionPerformed()");
        }
    }//GEN-LAST:event_jButtonChooseFileActionPerformed
    private void PreviewSound(String pathfile)
    {
        try
        {
            Application.launch();
            File f = new File(pathfile);
            URL file =  this.getClass().getClassLoader().getResource(pathfile);
            final Media media = new Media(file.toString());
            final MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }
    private void jComboBoxArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxArtistActionPerformed
        SetAlbums();
    }//GEN-LAST:event_jComboBoxArtistActionPerformed
     public void SetArtists()
    {
        DBController connect = new DBController();
        connect.SetConnection();
        ArrayList<Artist> artists = connect.getArtists();
        this.jComboBoxArtist.removeAllItems();
        if(artists!=null)
        {
            Iterator it = artists.iterator();
            while(it.hasNext())
            {
                this.jComboBoxArtist.addItem(((Artist)it.next()).getArtistName());
            }
        }
        connect.CloseConnection();
    }
     public void SetAlbums()
    {
        try{
            DBController connect = new DBController();
            connect.SetConnection();
            String artist = this.jComboBoxArtist.getSelectedItem().toString();
            ArrayList<Album> albums = connect.getAlbums(connect.getArtist(artist).getId());
            this.jComboBoxAlbum.removeAllItems();
            if(albums!=null)
            {
                Iterator it = albums.iterator();
                while(it.hasNext())
                {
                    this.jComboBoxAlbum.addItem(((Album)it.next()).getAlbumName());
                }
            }
            connect.CloseConnection();
        }
        catch(Exception ex)
        {
            
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonChooseFile;
    private javax.swing.JButton jButtonSaveSong;
    private javax.swing.JComboBox<String> jComboBoxAlbum;
    private javax.swing.JComboBox<String> jComboBoxArtist;
    private javax.swing.JLabel jImageUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldSongName;
    private javax.swing.JTextField jTextFieldYear;
    // End of variables declaration//GEN-END:variables
}
