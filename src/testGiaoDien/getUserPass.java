/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testGiaoDien;


/**
 *
 * @author vn
 */
public class getUserPass {
    private String username;
    private String password;

    public getUserPass() {

    }

    public getUserPass(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(String user, String pass){
        return user +" "+pass;
    }

}
