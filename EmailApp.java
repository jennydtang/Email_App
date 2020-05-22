//has main
public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");

        // try out methods
        // em1.setAlternateEmail("js@gmail.com");
        // System.out.println(em1.getAlternateEmail());

        System.out.println(em1.showInfo());
        ;
    }
}