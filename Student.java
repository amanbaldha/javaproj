class Student {
    private String name;

    // No-parameter constructor
    public Student() {
        this.name = "Unknown";
    }

    // Parameterized constructor
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("John");

        System.out.println("Student 1 name: " + student1.getName());
        System.out.println("Student 2 name: " + student2.getName());
    }
}
