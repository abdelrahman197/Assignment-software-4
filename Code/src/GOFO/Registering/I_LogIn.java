package GOFO.Registering;

import GOFO.Users.User;

/**
 * interface contain all the method needed for for Logging in
 *@author  abdelrahman ehab abdelalem
 * @author ezz eldin magdy mokhtar
 * @author ahmed kandel ahmed
 */
public interface I_LogIn {
    boolean checkInfo(String ID,String password);
   User logIn();

}
