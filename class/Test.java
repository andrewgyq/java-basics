public class Test{
    public static void main(String[] args) {
        Test test = new Test();
        //Class c = test.class;
        Class c = Test.class;
        Class c1 = test.getClass();
        //Class c2 = Class.forName("com.Test");
        System.out.println(c);
        System.out.println(c1);
    }
}