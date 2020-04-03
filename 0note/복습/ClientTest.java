import java.io.InputStream;
import java.net.Socket;

public class ClientTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "192.168.0.21";
		int port = 9000;
		try {
			Socket socket = new Socket(host, port);
			InputStream is = socket.getInputStream();
			
			for(int i=1;i<=10;i++) {
				int n= is.read();
				System.out.println("수신된 번호: "+i+" 번째"+n);
			}
			is.close();
			socket.close();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
