/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package comm;
import java.net.DatagramSocket;
import java.io.IOException;
/**
 *
 * @author jonathan
 */
public class TraCI_Client {
    DatagramSocket socket;
    
    public TraCI_Client(int port){

        try{
            socket = new DatagramSocket();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
