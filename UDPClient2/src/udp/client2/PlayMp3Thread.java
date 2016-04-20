/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp.client2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javazoom.jl.player.advanced.AdvancedPlayer;

/**
 *
 * @author Administrator
 */
public class PlayMp3Thread extends Thread {
    // Code trong hàm run() sẽ được thực thi khi
    // thread được chạy (start)

    Udp_Client2 udp = new Udp_Client2();
    public PlayMp3Thread() {

    }

    public PlayMp3Thread(Udp_Client2 udp) {
        this.udp = udp;
    }

    @Override
    public void run() {
        String fileName = udp.getSelectedName();
        String filePath = udp.getFolderPathDownload() + fileName;
        try {
            //InputStream in = getClass().getResourceAsStream("../playmp3/a.mp3"); // lấy InputStream của file nhạc
            //InputStream in = getClass().getResourceAsStream("d:/node1download/a.mp3"); // lấy InputStream của file nhạc
            InputStream in = null;
            File file = new File(filePath);
            //this.setFilePath(filePath);
            in = new FileInputStream(file);
            AdvancedPlayer play = new AdvancedPlayer(in); // tạo ra 1 đối tượng AdvancedPlay với tham số truyền vào là một InputStream
            play.play(); // bắt đầu chơi nhạc
            // Ngủ 1030 milli giây.
            Thread.sleep(1000);
        
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
