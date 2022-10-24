public class Department {
    private double grade;

    public String printStudent(String studentNumber) {
        return studentNumber;
    }

    public String printTeacher(String staffNumber) {
        return staffNumber;
    }

    public Department(double grade) {
        this.grade = grade;
    }

    public Department() {
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;

    }

    @Override
    public String toString() {
        return "Department [grade=" + grade + "]";
    }
}
