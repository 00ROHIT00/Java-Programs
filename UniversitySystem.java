// Abstract class (Abstraction)
abstract class Person {
    private String name;
    private String id;

    // Constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters (Encapsulation)
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // Abstract method (must be implemented in subclasses)
    public abstract String getRole();
}

// Student class (Inheritance)
class Student extends Person {

    public Student(String name, String id) {
        super(name, id);
    }

    // Student-specific role
    public String getRole() {
        return "Student";
    }
}
// Professor class (Inheritance)
class Professor extends Person {

    public Professor(String name, String id) {
        super(name, id);
    }

    // Professor-specific role
    public String getRole() {
        return "Professor";
    }
}
// Main class to run the program
public class UniversitySystem {
    public static void main(String[] args) {
        // Create a Student object
        Student s = new Student("Alice", "S101");

        // Create a Professor object
        Professor p = new Professor("Dr. Bob", "P202");

        // Print details
        System.out.println(s.getName() + " (" + s.getId() + ") is a " + s.getRole());
        System.out.println(p.getName() + " (" + p.getId() + ") is a " + p.getRole());
    }
}