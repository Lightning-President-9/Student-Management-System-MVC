package model;

public class MarksBean {
    private int studentId;
    private String department;
    private String course1Name;
    private double course1Marks;
    private String course2Name;
    private double course2Marks;
    private String course3Name;
    private double course3Marks;
    private double totalMarks;
    private double percentage;
    private String result;

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCourse1Name() {
        return course1Name;
    }

    public void setCourse1Name(String course1Name) {
        this.course1Name = course1Name;
    }

    public double getCourse1Marks() {
        return course1Marks;
    }

    public void setCourse1Marks(double course1Marks) {
        this.course1Marks = course1Marks;
    }

    public String getCourse2Name() {
        return course2Name;
    }

    public void setCourse2Name(String course2Name) {
        this.course2Name = course2Name;
    }

    public double getCourse2Marks() {
        return course2Marks;
    }

    public void setCourse2Marks(double course2Marks) {
        this.course2Marks = course2Marks;
    }

    public String getCourse3Name() {
        return course3Name;
    }

    public void setCourse3Name(String course3Name) {
        this.course3Name = course3Name;
    }

    public double getCourse3Marks() {
        return course3Marks;
    }

    public void setCourse3Marks(double course3Marks) {
        this.course3Marks = course3Marks;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}