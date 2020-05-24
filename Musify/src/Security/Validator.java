/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Security;

import java.io.FileInputStream;

/**
 *
 * @author Isai
 */
public class Validator {
    //Valida primer  y segundo nombre
    public static boolean validaFirstName(String firstName)
    {
        if(firstName.length()>1)
        {
            return true;
        }
        else return false;
    }
     public static boolean validaLastName(String lastName)
    {
        if(lastName.length()>1)
        {
            return true;
        }
        else return false;
    }
    //Valida que el email este sintacticamente y semanticamente correcto
    public static boolean validaEmail(String email)
    //Valida las contraseñas
    {
        if(email.length()>5)
        {
            if(email.contains("@"))
            {
                String[] split = email.split("\\@");
                if(split.length >1 && split[0].length()>= 1 && split[1].length()>= 3)
                {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
    public static boolean validaPasswords(String password, String confirmPassword)
    {
        if(password.length()>1)
        {
            if(password.equals(confirmPassword))
            {
                return true;
            }
            return false;
        }
        return false;
    }
    public static boolean validaImage(byte[] image)
    {
        if(image != null)
        {
            return true;
        }
        return false;
    }
    public static boolean validaDescrp(String descrp)
    {
        if(descrp.length()>10)
        {
            return true;
        }
        return false;
    }
    public static boolean validaArtista(String artista)
    {
        if(artista.length()>1)
        {
            return true;
        }
        return false;
    }
    public static boolean validaYear(String year)
    {
        try
        {
            int yr = Integer.parseInt(year);
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
}
