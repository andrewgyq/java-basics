import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPBIOClient{
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1", 8888);

        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        
        out.write('c');
        char c = (char)in.read();
        System.out.println("recieved:" + c);

        out.close();
        in.close();
        socket.close();
    }
}