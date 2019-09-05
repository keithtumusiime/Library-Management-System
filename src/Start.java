
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Keith
 */
public class Start {
    public static void main(String[] args){
        PreparedStatement pst;
        ResultSet rs;
        Connection con;
        SplashScreen sp = new SplashScreen();
        sp.setVisible(true);
        int s = 0;
            try{
            for(int i = 1; i <= 200; i++){
                Thread.sleep(90);
                sp.jProgressBar1.setValue(i);
                if(i==20){
                    sp.jLabel1.setText("Reading Configuration files...");
                }
                if(i==50){
                    sp.jLabel1.setText("Configuring Database...");
                } 
                if(i==80){
                    sp.jLabel1.setText("Almost there...");
                }
                if(i==100){
                    sp.setVisible(false);
                    Login ln = new Login();
                    ln.setVisible(true);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e, "Failed", 1);
        }
    }
}
