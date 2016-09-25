package user;

import java.util.Date;

/**
 * Created by bubal on 24.09.2016.
 */
public class User{

    private Date lastlogin;
    private String login;

    public User(){}

    public User(String login){
        setLogin(login);
    }

    public User(String login, Date date){
        setLastlogin(date);
        setLogin(login);
    }

    public Date getLastlogin(){
        return lastlogin;
    }

    public void setLastlogin(Date date){
        lastlogin = date;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
