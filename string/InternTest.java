public class InternTest{
    public static void main(String[] args) {
        String a = new String("123");
        String b = a;
        String c = new String("123");;
 
        System.out.println("before intern:");
        System.out.println("a = b ? :" + (a == b));
        System.out.println("a = c ? :" + (a == c));
 
        a = a.intern();
        c = c.intern();
 
        System.out.println("after intern:");
        System.out.println("a = b ? :" + (a == b));
        System.out.println("a = c ? :" + (a == c));
    }
}