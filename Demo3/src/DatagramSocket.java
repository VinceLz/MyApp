import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class DatagramSocket {

	public static void main(String[] args) throws IOException {
		
		java.net.DatagramSocket  sk=new java.net.DatagramSocket();
		//�������
		byte[] data="��ð���udpͨ��".getBytes();
		
		//���
		InetAddress address=InetAddress.getByName("loaclhost");
		DatagramPacket packed=new DatagramPacket(data, data.length, address, 80);
		sk.send(packed);
	}
	
	
	
}
