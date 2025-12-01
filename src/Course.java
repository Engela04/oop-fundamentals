public class Course {
    public class Grade {

        private String studentId;
        private String courseCode;
        private double score;
        private char letterGrade;
        private static int totalGrades = 0;

        // Constructor
        public Grade(String studentId, String courseCode, double score) {
            setStudentId(studentId);
            setCourseCode(courseCode);
            setScore(score);
            this.letterGrade = calculateLetterGrade();
            totalGrades++;
        }

        // Display method
        public void displayGradeInfo() {
            System.out.println("Student ID : " + studentId);
            System.out.println("Course Code: " + courseCode);
            System.out.println("Score      : " + score);
            System.out.println("Letter     : " + letterGrade);
        }

        // Calculate Letter Grade
        public char calculateLetterGrade() {
            if (score >= 85) return 'A';
            else if (score >= 70) return 'B';
            else if (score >= 55) return 'C';
            else if (score >= 40) return 'D';
            else return 'E';
        }

        // Static getter
        public static int getTotalGrades() {
            return totalGrades;
        }

        // Getters & Setters
        public String getStudentId() {
            return studentId;
        }

        public void setStudentId(String studentId) {
            if (studentId == null || studentId.isEmpty())
                throw new IllegalArgumentException("Student ID cannot be empty.");
            this.studentId = studentId;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public void setCourseCode(String courseCode) {
            if (courseCode == null || courseCode.isEmpty())
                throw new IllegalArgumentException("Course code cannot be empty.");
            this.courseCode = courseCode.toUpperCase();
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            if (score < 0 || score > 100)
                throw new IllegalArgumentException("Score must be between 0 and 100.");
            this.score = score;
            this.letterGrade = calculateLetterGrade(); // update automatically
        }

        public char getLetterGrade() {
            return letterGrade;
        }
    }

}
