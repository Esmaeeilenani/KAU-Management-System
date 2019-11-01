



public class Course {

    private int CourseCode;
    private String CourseTitle;
    private double hours;

    public Course(int CourseCode, String CourseTitle, double hours) {
        this.CourseCode = CourseCode;
        this.CourseTitle = CourseTitle;
        this.hours = hours;
    }

    public int getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(int CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setCourseTitle(String CourseTitle) {
        this.CourseTitle = CourseTitle;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String toString() {
        return " Course Code: " + this.CourseCode + ", Course Title: " + this.CourseTitle + ", Credit Hours :" + this.hours;
    }
}
