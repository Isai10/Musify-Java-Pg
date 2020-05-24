/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import DB.DBController;
import Login.LogIn;
import Security.Validator;
import Users.User;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Path;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Isai
 */
public class SignUp extends javax.swing.JFrame {

    private byte[] image = null;
    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
       //
     
      

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldConfirmPassword = new javax.swing.JTextField();
        jButtonSignIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonLoadImage = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jImageUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelLogInButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(33, 33, 33));
        setForeground(new java.awt.Color(33, 33, 33));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jTextFieldFirstName.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldFirstName.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldFirstName.setText("First Name:");
        jTextFieldFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jTextFieldFirstName.setCaretColor(new java.awt.Color(153, 153, 153));
        jTextFieldFirstName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldFirstName.setDoubleBuffered(true);
        jTextFieldFirstName.setName(""); // NOI18N

        jTextFieldLastName.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldLastName.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldLastName.setText("Last Name:");
        jTextFieldLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jTextFieldLastName.setCaretColor(new java.awt.Color(153, 153, 153));
        jTextFieldLastName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldLastName.setDoubleBuffered(true);
        jTextFieldLastName.setName(""); // NOI18N

        jTextFieldEmail.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldEmail.setText("Email:");
        jTextFieldEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jTextFieldEmail.setCaretColor(new java.awt.Color(153, 153, 153));
        jTextFieldEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldEmail.setDoubleBuffered(true);
        jTextFieldEmail.setName(""); // NOI18N

        jTextFieldPassword.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldPassword.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldPassword.setText("Password:");
        jTextFieldPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jTextFieldPassword.setCaretColor(new java.awt.Color(153, 153, 153));
        jTextFieldPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldPassword.setDoubleBuffered(true);
        jTextFieldPassword.setName(""); // NOI18N

        jTextFieldConfirmPassword.setBackground(new java.awt.Color(51, 51, 51));
        jTextFieldConfirmPassword.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldConfirmPassword.setText("Confirm password:");
        jTextFieldConfirmPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        jTextFieldConfirmPassword.setCaretColor(new java.awt.Color(153, 153, 153));
        jTextFieldConfirmPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldConfirmPassword.setDoubleBuffered(true);
        jTextFieldConfirmPassword.setName(""); // NOI18N

        jButtonSignIn.setText("Sing Up");
        jButtonSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignInActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Sign Up");

        jLabel2.setText("Load profile image");

        jButtonLoadImage.setText("Load");
        jButtonLoadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadImageActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

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
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jImageUser)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setText("Do you already have an account? ");

        jLabelLogInButton.setForeground(new java.awt.Color(0, 0, 255));
        jLabelLogInButton.setText("Log In");
        jLabelLogInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogInButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogInButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel1)
                .addGap(0, 336, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSignIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLoadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextFieldConfirmPassword)
                        .addComponent(jTextFieldPassword)
                        .addComponent(jTextFieldEmail)
                        .addComponent(jTextFieldFirstName)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldLastName))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLogInButton)
                        .addGap(29, 29, 29)))
                .addGap(190, 190, 190))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonLoadImage))
                .addGap(18, 18, 18)
                .addComponent(jButtonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelLogInButton))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignInActionPerformed
        
        try{
            //Validaciones de seguridad y prevencion de errores
            boolean fnameValido  =  Validator.validaFirstName(this.jTextFieldFirstName.getText());
            boolean lnameValido  =  Validator.validaLastName(this.jTextFieldLastName.getText());
            boolean emailValido = Validator.validaEmail(this.jTextFieldEmail.getText());
            boolean passwordsValidas = Validator.validaPasswords(this.jTextFieldPassword.getText(),
                                                                 this.jTextFieldConfirmPassword.getText());
            boolean imagenValida = Validator.validaImage(image);
            if(emailValido && passwordsValidas && imagenValida && fnameValido && lnameValido)
            {
                //Conexion con la base de datos
                DBController connect = new DBController();
                connect.SetConnection();
                //Creacion de instacia User
                User newuser = new User();
                newuser.setFirstName(this.jTextFieldFirstName.getText());
                newuser.setLastName(this.jTextFieldLastName.getText());
                newuser.setEmail(this.jTextFieldEmail.getText());
                newuser.setPassword(this.jTextFieldPassword.getText());
                newuser.setImage(image);
                newuser.setRol("User"); //Establece el rol del usuario como User 
                if (connect.RegisterUser(newuser)){
                      JOptionPane.showMessageDialog(null,"¡El usuario ha sido registrado con exito!");
                }else{
                    JOptionPane.showMessageDialog(null,"¡No se pudo registrar el usuario!");
                }
                connect.CloseConnection();
            }
            else{
                //Genera un mensaje de los posibles errores
                 JOptionPane.showMessageDialog(null,
                GeneraMsjError(fnameValido,lnameValido,emailValido,passwordsValidas,imagenValida));
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_jButtonSignInActionPerformed
    /*Generea mensaje de posibles errores en el formulario recibe como
    parametro los resultados al aplicar un validador a cada textfield*/
    private String  GeneraMsjError(boolean fname,boolean lname,boolean email,boolean passw,boolean image )
    {
        if(!fname)
        {
             return "¡Primer nombre no valido!";
        }
        else if (!lname){
            return "¡Segundo nombre no valido!";
        }
        else if (!email){
            return "¡Email no valido!";
        }
        else if (!passw){
            return "¡Password no valida o segunda password no coincide!";
        }
        else if (!image){
            return "¡Imagen de perfil no valida!";
        }
        else
        {
            return "";
        }
    }
    private void PreviewImage(String urlImage){
        
       // ImageIcon imgIconUser = new ImageIcon(urlImage);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(urlImage).getImage().getScaledInstance(128, 128, Image.SCALE_DEFAULT));
        this.jImageUser.setIcon(imageIcon);
        
    }
    //Selecciona la imagen 
    private void jButtonLoadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadImageActionPerformed
       try{
           JFileChooser fileChooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & PNG", "jpg", "png");
            fileChooser.setFileFilter(filter);
            if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
              
              FileInputStream fis = new FileInputStream(fileChooser.getSelectedFile());
              image = new byte[fis.available()];
              fis.read(image);
              PreviewImage(fileChooser.getSelectedFile().getPath());
               //JOptionPane.showMessageDialog(null,urlImage);
            }
       }
       catch(Exception ex)
       {
           JOptionPane.showMessageDialog(null,ex.getMessage()+"\n"+"SignUp.jButtonLoadImageActionPerformed()");
       }
        
    }//GEN-LAST:event_jButtonLoadImageActionPerformed

    private void jLabelLogInButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogInButtonMouseClicked
        //Cierra la ventana
        this.dispose();
        //Inicia login jframe
        LogIn login = new LogIn();
        login.setVisible(true);
       
    }//GEN-LAST:event_jLabelLogInButtonMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLoadImage;
    private javax.swing.JButton jButtonSignIn;
    private javax.swing.JLabel jImageUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLogInButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldConfirmPassword;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPassword;
    // End of variables declaration//GEN-END:variables
}
