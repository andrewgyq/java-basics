import java.io.InputStream;
import java.io.FileInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;

class MyLoader extends ClassLoader{
    
    public Class<?> getClass (String name) throws ClassNotFoundException{
        byte [] data = null;
        try{
            data = this.loadClassFile(name);
        } catch (Exception e){}
        return super.defineClass(name, data, 0, data.length);
    }

    public byte [] loadClassFile(String name) throws Exception{
        String filePath = "D:\\workspace\\java-basics\\classloader\\book.class";
        System.out.println(filePath);
        File file = new File(filePath);
        InputStream input = new FileInputStream(file);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte data [] = new byte [1024];
        int len = 0;
        while((len = input.read(data)) != -1){
            baos.write(data, 0, len);
        }
        input.close();
        baos.close();
        return baos.toByteArray();
    }
} 


public class TestLoader{
    public static void main(String[] args) throws Exception{
        System.out.println(new TestLoader().getClass().getClassLoader());
        System.out.println(new TestLoader().getClass().getClassLoader().getParent());
        MyLoader load = new MyLoader();
        Class<?> cls = load.getClass("Book");
        System.out.println(cls.newInstance());
    }
}