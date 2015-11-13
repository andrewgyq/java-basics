import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.ServerSocket;

public class TCPBIOServer{
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(8888);

        Socket socket  = ss.accept();

        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        char c = (char)in.read();
        System.out.println("recieved:" + c);

        out.write('s');

        out.close();
        in.close();
        ss.close();
        socket.close();
    }
}