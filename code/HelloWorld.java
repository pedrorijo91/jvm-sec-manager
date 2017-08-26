import java.io.File;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");

        String filename = "../allow/allow.txt";

        File file = new File(filename);

        System.out.println("exists? " + file.exists());
        System.out.println("isDir? " + file.isDirectory());
        System.out.println("isFile? " + file.isFile());

        String filename2 = "../deny/deny.txt";

        File file2 = new File(filename2);

        System.out.println("exists? " + file2.exists());
        System.out.println("isDir? " + file2.isDirectory());
        System.out.println("isFile? " + file2.isFile());

    }
}
