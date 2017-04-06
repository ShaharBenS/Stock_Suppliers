package ProgramLauncher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by Shahar on 06/04/17.
 */
public class ProgramLauncher
{
    public static void main(String [] args)
    {
        //TODO
        int x = 6;
        Connection conn = getConnectionAndInitDatabase("Database.db");
    }

    public static Connection getConnectionAndInitDatabase(String dataBaseName)
    {
        Connection c = null;
        Statement stmt = null;
        try {
            /*Opening Connection*/
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:"+dataBaseName);

            c.createStatement().execute("PRAGMA FOREIGN_KEYS = ON;");

            /*Creating Tables if they are NOT existed */

            //TODO


            if(stmt != null){
                stmt.close();
            }

        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }

        return c;
    }
}
