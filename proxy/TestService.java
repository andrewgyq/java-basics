
public class TestService{
    public static void main(String[] args) throws Exception{
       IDeptService service = ServiceFactory.getIDeptServiceInstance(); 
       service.insert();
    }
}