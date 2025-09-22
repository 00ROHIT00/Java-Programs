import java.io.File;

public class FileClassDemo {
    public static void main(String[] args) {
        File file = new File("sample.txt");
/*This does NOT create a file on your computer.
It simply creates a Java object that refers to a file named "sample.txt" in your current working directory.*/
        System.out.println("File name: " + file.getName());
        System.out.println("File exists: " + file.exists());
        System.out.println("Absolute path: " + file.getAbsolutePath());
    }
}
