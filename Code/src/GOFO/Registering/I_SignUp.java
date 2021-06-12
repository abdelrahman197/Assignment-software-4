package GOFO.Registering;

/**
 * interface contain all the method needed for for signing up
 * @author  abdelrahman ehab abdelalem
 * @author ezz eldin magdy mokhtar
 * @author ahmed kandel ahmed
 */
public interface I_SignUp {

    boolean signUp_name(String name);

    boolean signUp_ID(String ID);

    boolean signUp_Email(String Email);
    boolean signUp_password(String password);
    void create_account ();

}
