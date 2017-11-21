package exercises;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);

    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
       gpa = (courseCredits * grade) / (courseCredits);
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
    }

    public static int getNextStudentId() {
        return nextStudentId;

    }


    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;

    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;

    }

    public double getGpa() {
        return gpa;

    }


}