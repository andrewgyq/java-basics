import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceProxy implements InvocationHandler{

    private Object target = null;
    
    public Object bind(Object obj){
        this.target = obj;  // 保存真实主题对象
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), 
            obj.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object [] args)throws Throwable{
        this.prepare();
        Object retValue = method.invoke(this.target, args);
        this.destory();
        return retValue;
    }

    public void prepare(){
        System.out.println("****打开数据库连接****");
    }

    public void destory(){
        System.out.println("****关闭数据库连接****");
    }
}