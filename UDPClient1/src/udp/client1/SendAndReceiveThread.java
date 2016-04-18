package udp.client1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.player.advanced.AdvancedPlayer;

/**
 *
 * @author Administrator
 */
public class SendAndReceiveThread extends Thread {
    // Code trong hàm run() sẽ được thực thi khi
    // thread được chạy (start)

    Udp_Client1 udp = new Udp_Client1();
    public SendAndReceiveThread() {

    }

    public SendAndReceiveThread(Udp_Client1 udp) {
        this.udp = udp;
    }

    private InetAddress IPAddress;
    boolean done;
    boolean keepGoing;

    @Override
    public void run() {
        //String s1;
        ArrayList lines = new ArrayList();
        int size;
        BufferedReader br;

        try {
            IPAddress = InetAddress.getByName("127.0.0.1");
            System.out.println("Attemping to connect to " + IPAddress
                    + ") via UDP port 4001");

            String s = udp.getLenh();
            String selected = "";
            if(s.equals("update address")) {
                //lay lua chon tren jlist
                selected = udp.getSelectedName();
            }
            String selection[] = selected.split(" ");
            
            
            byte[] sendData = new byte[1024];
            sendData = s.getBytes();
            //tao socket co port theo node
            DatagramSocket socket = new DatagramSocket(4002);
            DatagramPacket sendPacket
                    = new DatagramPacket(sendData, sendData.length, IPAddress, 4001);
            socket.send(sendPacket);

            //nhan file
            byte[] receiveData = new byte[1024];
            int off = 0;

            //co the so sanh la lenh gi de tao file thich hop
            String tam = "";

            FileOutputStream fos = new FileOutputStream(new File("d:/listfileshare.txt"));

            while (true) {
                socket.setSoTimeout(5000);
                try {
                    receiveData = new byte[1024];

                    DatagramPacket dp = new DatagramPacket(receiveData, receiveData.length);

                    socket.receive(dp);
                    byte[] b1 = new byte[dp.getLength()];
                    fos.write(receiveData, 0, b1.length);
                    off = off + b1.length;

                    InetAddress address = dp.getAddress();
                    int port = dp.getPort();
                } catch (SocketTimeoutException ste) {
                    break;
                }
            }
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(SendAndReceiveThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
