
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class ServerTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket server = new ServerSocket(9000);
			
			Random r = new Random();
			
			while(true) {
				Socket socket = server.accept();
				System.out.println("연결수락");
				OutputStream os = socket.getOutputStream();
				
				for(int i=1;i<=10;i++) {
					int n = r.nextInt(50)+1;
					os.write(n);
					
					Thread.sleep(200);
				}
				os.close();
			}
			
		}catch(Exception e) {
		 System.out.println(e.getMessage());
		}
	}

}
