/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udp.client3;

/**
 *
 * @author Administrator
 */
public class UpdateThread extends Thread{
    Udp_Client3 udp = new Udp_Client3();

    public Udp_Client3 getUdp() {
        return udp;
    }

    public void setUdp(Udp_Client3 udp) {
        this.udp = udp;
    }
            
    @Override
    public void run() {
        try {
                long start = System.currentTimeMillis();
		long end = 0;
		while (true) {

			end = System.currentTimeMillis();
			if ((end - start) == 30000) {
				start = end;
				udp.updateThongTin();
				System.out.println("Đang update thông tin");
			}
		}
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }    
}
