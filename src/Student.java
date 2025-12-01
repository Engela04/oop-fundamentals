public class Student {
    private String studentId;
    private String name;
    private String major;
    private int enrollmentYear;
    private double gpa;
    private static int totalStudents = 0;

    // Default constructor
    public Student() {
        totalStudents++;
        this.studentId = generateStudentId(totalStudents);
        this.name = "";
        this.major = "";
        this.enrollmentYear = 0;
        this.gpa = 0.0;
    }

    // Parameterized constructor
    public Student(String name, String major, int enrollmentYear) {
        totalStudents++;
        this.studentId = generateStudentId(totalStudents);
        this.name = name;
        this.major = major;
        this.enrollmentYear = enrollmentYear;
        this.gpa = 0.0;
    }

    // Method untuk generate studentId
    private String generateStudentId(int number) {
        return String.format("STD%03d", number);
    }

    // Getter dan Setter
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", enrollmentYear=" + enrollmentYear +
                ", gpa=" + gpa +
                '}';
    }
}
