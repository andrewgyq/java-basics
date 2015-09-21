public class ServiceFactory{
    public static IDeptService getIDeptServiceInstance(){
        return (IDeptService) new ServiceProxy().bind(new IDeptServiceImpl());
    }
}