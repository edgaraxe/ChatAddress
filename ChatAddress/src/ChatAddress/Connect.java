/*
 * This work is licensed under a Creative Commons Attribution-NonCommercial-ShareAlike 3.0 Unported License. 
 * http://creativecommons.org/licenses/by-nc/3.0/
 */
package ChatAddress;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edgar, Sara, Andre
 */
public class Connect {

    public Connection connection() {
        /**
         * Connects to the database with login info.
         */
        Connection conn = null;
        String user = "root";
        String pwd = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost/logininfo?user=" + user + "&password=" + pwd);
        } catch (Exception ex) {
            Logger.getLogger(LoginMain.class.getName()).log(Level.SEVERE,
                    null, ex);
        }

        return conn;
    }
}
