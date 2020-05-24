/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Artist;

import DB.DBController;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author Isai
 */
public class ArtistMain extends javax.swing.JPanel {

    int pagina=1;
    /**
     * Creates new form ArtistMain
     */
    public ArtistMain() {
        initComponents();
        HidePanelArtists();
        ViewArtists();
        JPopupMenu jppm = new JPopupMenu("Edit");
       
       // jppm.setVisible(true);
    }
    public void HidePanelArtists(){
        this.jPanelArtist1.setVisible(false);
        this.jPanelArtist2.setVisible(false);
        this.jPanelArtist3.setVisible(false);
        this.jPanelArtist4.setVisible(false);
        this.jPanelArtist5.setVisible(false);
        this.jPanelArtist6.setVisible(false);
        
    }
    public boolean IncrementPage()
    {
         DBController connect = new DBController();
         connect.SetConnection();
         ArrayList<Artist> artists = connect.getArtists();
         connect.CloseConnection();
        if(HayPagina(pagina+1,artists))
        {
                    pagina++;
                    return true;
        }
        return false;
    }
     public boolean DecrementPage()
    {
         DBController connect = new DBController();
         connect.SetConnection();
         ArrayList<Artist> artists = connect.getArtists();
         connect.CloseConnection();
         if(HayPagina(pagina-1,artists))
         {
             pagina--;
             return true;
        }
        return false;
    }
    public void ViewArtists(){
        DBController connect = new DBController();
        connect.SetConnection();
        ArrayList<Artist> artists = connect.getArtists();
        
        if(artists!=null)
        {
            
            Artist ar;
            artists = GetPagina(pagina,artists);
            if(artists!=null && artists.size()>0) //Si hay elementos en la pagina 
            {
                Iterator it = artists.iterator();
                int rx =1;
                while(it.hasNext() && rx <= 6)
                {
                    ar = (Artist)it.next();
                    switch(rx)
                    {
                        case 1:
                            PreviewImage(ar.getImage(),this.jImageArtist1);
                            this.jLabelNameArtist1.setText(ar.getArtistName());
                            this.jPanelArtist1.setVisible(true);
                            this.jImageArtist1.setName(Integer.toHexString(ar.getId()));

                        break;
                        case 2:
                            PreviewImage(ar.getImage(),this.jImageArtist2);
                            this.jLabelNameArtist2.setText(ar.getArtistName());
                            this.jPanelArtist2.setVisible(true);
                              this.jImageArtist2.setName(Integer.toHexString(ar.getId()));
                        break;
                        case 3:
                             PreviewImage(ar.getImage(),this.jImageArtist3);
                             this.jLabelNameArtist3.setText(ar.getArtistName());
                             this.jPanelArtist3.setVisible(true);
                               this.jImageArtist3.setName(Integer.toHexString(ar.getId()));
                        break;
                        case 4:
                            PreviewImage(ar.getImage(),this.jImageArtist4);
                            this.jLabelNameArtist4.setText(ar.getArtistName());
                            this.jPanelArtist4.setVisible(true);
                              this.jImageArtist4.setName(Integer.toHexString(ar.getId()));
                        break;
                        case 5:
                             PreviewImage(ar.getImage(),this.jImageArtist5);
                             this.jLabelNameArtist5.setText(ar.getArtistName());
                             this.jPanelArtist5.setVisible(true);
                               this.jImageArtist5.setName(Integer.toHexString(ar.getId()));
                        break;
                        case 6:
                             PreviewImage(ar.getImage(),this.jImageArtist6);
                             this.jLabelNameArtist6.setText(ar.getArtistName());
                             this.jPanelArtist6.setVisible(true);
                               this.jImageArtist6.setName(Integer.toHexString(ar.getId()));
                        break;
                    }
                    rx++;

                }
            }
            
        }
    }
    private ArrayList<Artist> GetPagina(int numPag,ArrayList<Artist> ar)
    {
        try{
            ArrayList<Artist> pg = null;
            if(numPag == 1)
            {
                pg = new ArrayList<Artist>();
                for(int i = 0 ; i < ar.size();i++ )
                {
                    pg.add(ar.get(i));
                }
            }
            if(numPag == 2)
            {
                pg = new ArrayList<Artist>();
                for(int i = 6 ; i < ar.size();i++ )
                {
                    pg.add(ar.get(i));
                }
            }
            if(numPag == 3)
            {
                pg = new ArrayList<Artist>();
                for(int i = 12 ; i < ar.size();i++ )
                {
                   pg.add(ar.get(i));
                }
            }
            if(numPag == 4)
            {
                pg = new ArrayList<Artist>();
                for(int i = 18 ; i < ar.size();i++ )
                {
                    pg.add(ar.get(i));
                }
            }
            if(numPag == 5)
            {
                pg = new ArrayList<Artist>();
                for(int i = 24 ; i < ar.size();i++ )
                {
                    pg.add(ar.get(i));
                }
            }
            return pg;
        }
        catch(Exception ex)
        {
            return null;
        }
        
    }
    
    private boolean HayPagina(int numPag,ArrayList<Artist>ar)
    {
        try{
            ArrayList<Artist> pg = null;
            if(numPag == 1)
            {
                pg = new ArrayList<Artist>();
                for(int i = 0 ; i < ar.size();i++ )
                {
                    return true;
                }
            }
            if(numPag == 2)
            {
                pg = new ArrayList<Artist>();
                for(int i = 6 ; i < ar.size();i++ )
                {
                    return true;
                }
            }
            if(numPag == 3)
            {
                pg = new ArrayList<Artist>();
                for(int i = 12 ; i < ar.size();i++ )
                {
                   return true;
                }
            }
            if(numPag == 4)
            {
                pg = new ArrayList<Artist>();
                for(int i = 18 ; i < ar.size();i++ )
                {
                    return true;
                }
            }
            if(numPag == 5)
            {
                pg = new ArrayList<Artist>();
                for(int i = 24 ; i < ar.size();i++ )
                {
                    return true;
                }
            }
            return false;
        }
        catch(Exception ex)
        {
            return false;
        }
        
    }
     private void PreviewImage(byte[] img, JLabel container){
        
         int width = this.jImageArtist1.getPreferredSize().width;
         int height = this.jImageArtist1.getPreferredSize().height;
        
       // ImageIcon imgIconUser = new ImageIcon(urlImage);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(width,height, Image.SCALE_DEFAULT));
        container.setIcon(imageIcon);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHeader = new javax.swing.JPanel();
        jButtonAddArtist = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jPanelContainerArtists = new javax.swing.JPanel();
        jPanelArtist1 = new javax.swing.JPanel();
        jImageArtist1 = new javax.swing.JLabel();
        jLabelNameArtist1 = new javax.swing.JLabel();
        jPanelArtist4 = new javax.swing.JPanel();
        jImageArtist4 = new javax.swing.JLabel();
        jLabelNameArtist4 = new javax.swing.JLabel();
        jPanelArtist2 = new javax.swing.JPanel();
        jImageArtist2 = new javax.swing.JLabel();
        jLabelNameArtist2 = new javax.swing.JLabel();
        jPanelArtist5 = new javax.swing.JPanel();
        jImageArtist5 = new javax.swing.JLabel();
        jLabelNameArtist5 = new javax.swing.JLabel();
        jPanelArtist6 = new javax.swing.JPanel();
        jImageArtist6 = new javax.swing.JLabel();
        jLabelNameArtist6 = new javax.swing.JLabel();
        jPanelArtist3 = new javax.swing.JPanel();
        jImageArtist3 = new javax.swing.JLabel();
        jLabelNameArtist3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(725, 536));
        setMinimumSize(new java.awt.Dimension(725, 536));
        setPreferredSize(new java.awt.Dimension(725, 536));

        jButtonAddArtist.setText("Add artist");
        jButtonAddArtist.setActionCommand("jButtonAddArtist");
        jButtonAddArtist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddArtistActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("Artists");

        javax.swing.GroupLayout jPanelHeaderLayout = new javax.swing.GroupLayout(jPanelHeader);
        jPanelHeader.setLayout(jPanelHeaderLayout);
        jPanelHeaderLayout.setHorizontalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap(341, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(217, 217, 217)
                .addComponent(jButtonAddArtist)
                .addGap(39, 39, 39))
        );
        jPanelHeaderLayout.setVerticalGroup(
            jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddArtist))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelContainerArtists.setAutoscrolls(true);
        jPanelContainerArtists.setPreferredSize(new java.awt.Dimension(745, 536));

        jPanelArtist1.setPreferredSize(new java.awt.Dimension(164, 164));

        jImageArtist1.setBackground(new java.awt.Color(204, 204, 204));
        jImageArtist1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        jImageArtist1.setMaximumSize(new java.awt.Dimension(161, 161));
        jImageArtist1.setMinimumSize(new java.awt.Dimension(161, 161));
        jImageArtist1.setPreferredSize(new java.awt.Dimension(161, 161));
        jImageArtist1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jImageArtist1MouseClicked(evt);
            }
        });

        jLabelNameArtist1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNameArtist1.setText("jLabelNameArtist1");

        javax.swing.GroupLayout jPanelArtist1Layout = new javax.swing.GroupLayout(jPanelArtist1);
        jPanelArtist1.setLayout(jPanelArtist1Layout);
        jPanelArtist1Layout.setHorizontalGroup(
            jPanelArtist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelArtist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNameArtist1)
                    .addComponent(jImageArtist1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelArtist1Layout.setVerticalGroup(
            jPanelArtist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jImageArtist1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNameArtist1)
                .addContainerGap())
        );

        jPanelArtist4.setPreferredSize(new java.awt.Dimension(164, 164));

        jImageArtist4.setBackground(new java.awt.Color(204, 204, 204));
        jImageArtist4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        jImageArtist4.setMaximumSize(new java.awt.Dimension(161, 161));
        jImageArtist4.setMinimumSize(new java.awt.Dimension(161, 161));
        jImageArtist4.setPreferredSize(new java.awt.Dimension(161, 161));

        jLabelNameArtist4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNameArtist4.setText("jLabelNameArtist1");

        javax.swing.GroupLayout jPanelArtist4Layout = new javax.swing.GroupLayout(jPanelArtist4);
        jPanelArtist4.setLayout(jPanelArtist4Layout);
        jPanelArtist4Layout.setHorizontalGroup(
            jPanelArtist4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelArtist4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNameArtist4)
                    .addComponent(jImageArtist4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelArtist4Layout.setVerticalGroup(
            jPanelArtist4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jImageArtist4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNameArtist4)
                .addContainerGap())
        );

        jPanelArtist2.setPreferredSize(new java.awt.Dimension(164, 164));

        jImageArtist2.setBackground(new java.awt.Color(204, 204, 204));
        jImageArtist2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        jImageArtist2.setMaximumSize(new java.awt.Dimension(161, 161));
        jImageArtist2.setMinimumSize(new java.awt.Dimension(161, 161));
        jImageArtist2.setPreferredSize(new java.awt.Dimension(161, 161));

        jLabelNameArtist2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNameArtist2.setText("jLabelNameArtist1");

        javax.swing.GroupLayout jPanelArtist2Layout = new javax.swing.GroupLayout(jPanelArtist2);
        jPanelArtist2.setLayout(jPanelArtist2Layout);
        jPanelArtist2Layout.setHorizontalGroup(
            jPanelArtist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelArtist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNameArtist2)
                    .addComponent(jImageArtist2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelArtist2Layout.setVerticalGroup(
            jPanelArtist2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jImageArtist2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNameArtist2)
                .addContainerGap())
        );

        jPanelArtist5.setPreferredSize(new java.awt.Dimension(164, 164));

        jImageArtist5.setBackground(new java.awt.Color(204, 204, 204));
        jImageArtist5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        jImageArtist5.setMaximumSize(new java.awt.Dimension(161, 161));
        jImageArtist5.setMinimumSize(new java.awt.Dimension(161, 161));
        jImageArtist5.setPreferredSize(new java.awt.Dimension(161, 161));

        jLabelNameArtist5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNameArtist5.setText("jLabelNameArtist1");

        javax.swing.GroupLayout jPanelArtist5Layout = new javax.swing.GroupLayout(jPanelArtist5);
        jPanelArtist5.setLayout(jPanelArtist5Layout);
        jPanelArtist5Layout.setHorizontalGroup(
            jPanelArtist5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelArtist5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNameArtist5)
                    .addComponent(jImageArtist5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelArtist5Layout.setVerticalGroup(
            jPanelArtist5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jImageArtist5, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNameArtist5)
                .addContainerGap())
        );

        jPanelArtist6.setPreferredSize(new java.awt.Dimension(164, 164));

        jImageArtist6.setBackground(new java.awt.Color(204, 204, 204));
        jImageArtist6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        jImageArtist6.setMaximumSize(new java.awt.Dimension(161, 161));
        jImageArtist6.setMinimumSize(new java.awt.Dimension(161, 161));
        jImageArtist6.setPreferredSize(new java.awt.Dimension(161, 161));

        jLabelNameArtist6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNameArtist6.setText("jLabelNameArtist1");

        javax.swing.GroupLayout jPanelArtist6Layout = new javax.swing.GroupLayout(jPanelArtist6);
        jPanelArtist6.setLayout(jPanelArtist6Layout);
        jPanelArtist6Layout.setHorizontalGroup(
            jPanelArtist6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelArtist6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNameArtist6)
                    .addComponent(jImageArtist6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelArtist6Layout.setVerticalGroup(
            jPanelArtist6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jImageArtist6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNameArtist6)
                .addContainerGap())
        );

        jPanelArtist3.setPreferredSize(new java.awt.Dimension(164, 164));

        jImageArtist3.setBackground(new java.awt.Color(204, 204, 204));
        jImageArtist3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User.png"))); // NOI18N
        jImageArtist3.setMaximumSize(new java.awt.Dimension(161, 161));
        jImageArtist3.setMinimumSize(new java.awt.Dimension(161, 161));
        jImageArtist3.setPreferredSize(new java.awt.Dimension(161, 161));

        jLabelNameArtist3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelNameArtist3.setText("jLabelNameArtist1");

        javax.swing.GroupLayout jPanelArtist3Layout = new javax.swing.GroupLayout(jPanelArtist3);
        jPanelArtist3.setLayout(jPanelArtist3Layout);
        jPanelArtist3Layout.setHorizontalGroup(
            jPanelArtist3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanelArtist3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNameArtist3)
                    .addComponent(jImageArtist3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanelArtist3Layout.setVerticalGroup(
            jPanelArtist3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelArtist3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jImageArtist3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNameArtist3)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelContainerArtistsLayout = new javax.swing.GroupLayout(jPanelContainerArtists);
        jPanelContainerArtists.setLayout(jPanelContainerArtistsLayout);
        jPanelContainerArtistsLayout.setHorizontalGroup(
            jPanelContainerArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerArtistsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelContainerArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelArtist1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelArtist4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContainerArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelContainerArtistsLayout.createSequentialGroup()
                        .addComponent(jPanelArtist2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelArtist3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanelContainerArtistsLayout.createSequentialGroup()
                        .addComponent(jPanelArtist5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelArtist6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelContainerArtistsLayout.setVerticalGroup(
            jPanelContainerArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContainerArtistsLayout.createSequentialGroup()
                .addGroup(jPanelContainerArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelArtist1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelArtist2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelArtist3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelContainerArtistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelArtist4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelArtist5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelArtist6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelContainerArtists, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelContainerArtists, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddArtistActionPerformed
        ArtistForm artistform = new ArtistForm();
        artistform.setVisible(true);
        
    }//GEN-LAST:event_jButtonAddArtistActionPerformed

    private void jImageArtist1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jImageArtist1MouseClicked
        // TODO add your handling code here:
        int clics = evt.getClickCount();
        if(clics==2)
        {
            ArtistEditForm arFormEdit = new ArtistEditForm();
            arFormEdit.setVisible(true);
            arFormEdit.SetIdCurrenArtist(Integer.parseInt(this.jImageArtist1.getName()));
            
        }
        else if(clics == 1)
        {
            
        }
    }//GEN-LAST:event_jImageArtist1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddArtist;
    private javax.swing.JLabel jImageArtist1;
    private javax.swing.JLabel jImageArtist2;
    private javax.swing.JLabel jImageArtist3;
    private javax.swing.JLabel jImageArtist4;
    private javax.swing.JLabel jImageArtist5;
    private javax.swing.JLabel jImageArtist6;
    private javax.swing.JLabel jLabelNameArtist1;
    private javax.swing.JLabel jLabelNameArtist2;
    private javax.swing.JLabel jLabelNameArtist3;
    private javax.swing.JLabel jLabelNameArtist4;
    private javax.swing.JLabel jLabelNameArtist5;
    private javax.swing.JLabel jLabelNameArtist6;
    private javax.swing.JPanel jPanelArtist1;
    private javax.swing.JPanel jPanelArtist2;
    private javax.swing.JPanel jPanelArtist3;
    private javax.swing.JPanel jPanelArtist4;
    private javax.swing.JPanel jPanelArtist5;
    private javax.swing.JPanel jPanelArtist6;
    private javax.swing.JPanel jPanelContainerArtists;
    private javax.swing.JPanel jPanelHeader;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
