
import Login.LogIn;
import Register.SignUp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Isai
 */
public class Program {
    public Program(){
        //Inicia formulario para registro de usuarios y lo hace visible
        SignUp signupForm = new SignUp();
        signupForm.setVisible(true);
        
      // LogIn logIn = new LogIn();
      //  logIn.setVisible(true);
    }
}
