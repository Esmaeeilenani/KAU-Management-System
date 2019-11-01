

import java.util.Date;

public class Student extends Person {

    private String department;
    private int semmester;
    private double gpa;
    private Teacher teacher;
    private Invigilator invigilator;
    private Course[] course;
    private Courselab[] courselab;
    private ExamVenue examVenue;
    private int enrollYear;
    private int enrollmonth;
    private int enrollDay;

    public Student(String department, int semmester, double gpa, int enrollYear, int enrollmonth, int enrollDay, int id, String Name, String nationality, int Year, int month, int Day, char gender, int phone, String address, int totCourse, int totCourseLab) {
        super(id, Name, nationality, Year, month, Day, gender, phone, address);

        this.department = department;
        this.semmester = semmester;
        this.gpa = gpa;
        this.enrollYear = enrollYear;
        this.enrollmonth = enrollmonth;
        this.enrollDay = enrollDay;
        course = new Course[totCourse];
        courselab = new Courselab[totCourseLab];
    }

    public int getTotCourseLabHrs() {

        return courselab.length;
    }

    public int getTotCourseHrs() {

        return course.length;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSemmester() {
        return semmester;
    }

    public void setSemmester(int semmester) {
        this.semmester = semmester;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Invigilator getInvigilator() {
        return invigilator;
    }

    public void setInvigilator(Invigilator invigilator) {
        this.invigilator = invigilator;
    }

    public Course getCourse(int Index) {
        return course[Index];
    }

    public void setCourse(Course course, int Index) {
        this.course[Index] = course;
    }

    public Courselab getCourselab(int Index) {
        return courselab[Index];
    }

    public void setCourselab(Courselab courselab, int Index) {
        this.courselab[Index] = courselab;
    }

    public ExamVenue getExamVenue() {
        return examVenue;
    }

    public void setExamVenue(ExamVenue examVenue) {
        this.examVenue = examVenue;
    }

    public int getEnrollYear() {
        return enrollYear;
    }

    public void setEnrollYear(int enrollYear) {
        this.enrollYear = enrollYear;
    }

    public int getEnrollmonth() {
        return enrollmonth;
    }

    public void setEnrollmonth(int enrollmonth) {
        this.enrollmonth = enrollmonth;
    }

    public int getEnrollDay() {
        return enrollDay;
    }

    public void setEnrollDay(int enrollDay) {
        this.enrollDay = enrollDay;
    }

    public double calTotalHours() {
        double total = 0;
        for (int i = 0; i < courselab.length; i++) {
            total += courselab[i].getHours();
        }
        for (int i = 0; i < course.length; i++) {
            total += course[i].getHours();
        }
        return total;
    }

    public String printStudentBasicInfo() {

        return super.toString()
                + "-------------------------------------------------------------------------------------------\r\n"
                + "Department: " + this.department + ", Semester: " + this.semmester + "\r\n"
                + "CGPA: " + this.gpa + "\r\n"
                + "Enrollment Date: " + this.enrollYear + "-" + this.enrollmonth + "-" + this.enrollDay + "\r\n"
                + "-------------------------------------------------------------------------------------------\r\n";

    }

    public String toString() {

        String INFO = "";
        INFO = "--------------- Welcome to KAU Management System ---------------\r\n"
                + "--------- Current Date :  " + new Date() + "--------\r\n"
                + "Command: Print_Report\r\n\r\n"
                + "		--- Student Detail are as Follows: ---\r\n"
                + printStudentBasicInfo()
                + "		--- Teacher Detail are as Follows: ---\r\n"
                + this.teacher.toString()
                + "-------------------------------------------------------------------------------------------\r\n"
                + "		--- Invigilator Detail are as Follows: ---\r\n"
                + this.invigilator.toString()
                + "-------------------------------------------------------------------------------------------\r\n"
                + "Course Lab Details are as follows:\r\n";
        for (int i = 0; i < courselab.length; i++) {
            INFO += courselab[i].toString() + "\r\n";

        }
        INFO += "-------------------------------------------------------------------------------------------\r\n"
                + "Course Details are as follows:\r\n";
        for (int i = 0; i < course.length; i++) {
            INFO += course[i].toString() + "\r\n";

        }
        INFO += "-------------------------------------------------------------------------------------------\r\n"
                + "Exam Venue Details are as follows:\r\n"
                + this.examVenue.toString() + "\r\n"
                + "-------------------------------------------------------------------------------------------\r\n"
                + "		Total Hours :" + calTotalHours()
                + "\r\n	-----------------------------------";

        return INFO;

    }
}
