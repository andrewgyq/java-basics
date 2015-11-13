public class ClassLoaderDemo{
    public static void main(String[] args) {
        System.out.println(ClassLoaderDemo.class.getClassLoader());
        System.out.println(ClassLoaderDemo.class.getClassLoader().getParent());
        System.out.println(ClassLoaderDemo.class.getClassLoader().getParent().getParent());
    }
}