import java.io.File;

public class CreateNewFile {
    public static void main(String[] args) {
        File f = new File("hello.txt");

        try{
            f.createNewFile();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}