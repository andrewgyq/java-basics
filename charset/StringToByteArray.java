import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class StringToByteArray {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String name = "顾雨青";
		byte[] array = name.getBytes("UTF-8");
		for(byte b : array){
			System.out.print(String.format("%02x", b) + " ");
		}
		System.out.println();
		System.out.println(new String(array, Charset.forName("UTF-8")));
		System.out.println(new String(array, Charset.forName("GBK")));
	}

}
