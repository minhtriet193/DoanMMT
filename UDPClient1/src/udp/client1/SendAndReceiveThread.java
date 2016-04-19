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
    //boolean done;
    boolean keepGoing = false;

    @Override
    public void run() {
        String pathRoot = udp.getFolderPathRoot();
        //String s1;
        //ArrayList lines = new ArrayList();
        //int size;
        //BufferedReader br;
        //int sendPort = udp.getSendPort();
        try {
            IPAddress = InetAddress.getByName("127.0.0.1");

            //lay string lenh cua udp click button
            String s = udp.getLenh();

            String selected = "";
            //lay dong lenh ma jlist udp chon
            selected = udp.getSelectedName();
            //tach chuoi lay port cna gui lenh
            String[] selection = selected.split(" ");
            Integer port = Integer.parseInt(selection[1]);

            System.out.println("Attemping to connect to " + IPAddress
                    + ") via UDP port " + port);
            //tao soc ket tho port cua minh
            DatagramSocket socket = new DatagramSocket(udp.getReceivePort());

            //neu button update thi lenh la update address
            if (s.equals("update address")) {

                byte[] sendData = new byte[1024];
                sendData = s.getBytes();

                DatagramPacket sendPacket
                        = new DatagramPacket(sendData, sendData.length, IPAddress, port);
                socket.send(sendPacket);

                //nhan file
                byte[] receiveData = new byte[1024];
                int off = 0;

                //co the so sanh la lenh gi de tao file thich hop
                String tam = "";
                // tao file
                FileOutputStream fos = new FileOutputStream(new File("d:/listfileshare.txt"));

                while (true) {
                    socket.setSoTimeout(2000);
                    try {
                        receiveData = new byte[1024];

                        DatagramPacket dp = new DatagramPacket(receiveData, receiveData.length);

                        socket.receive(dp);

                        keepGoing = true;

                        byte[] b1 = new byte[dp.getLength()];
                        fos.write(receiveData, 0, b1.length);
                        off = off + b1.length;

                        InetAddress address = dp.getAddress();
                        int portSend = dp.getPort();

                    } catch (SocketTimeoutException ste) {
                        //xu ly xem keepGoin co = true
                        if (keepGoing == true) {
                            //co nhan file tra ve
                        } else {
                            //khong nhan file tra ve
                            udp.operationDeletedNode(pathRoot, selected);
                        }
                        break;
                    }
                }
                fos.close();
                Thread.sleep(1000);
            }

        } catch (IOException ex) {
            System.out.println(ex.toString());
        } catch (InterruptedException ex) {
            System.out.println(ex.toString());
        }
    }
}
