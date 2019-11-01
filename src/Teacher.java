


public class Teacher extends Employee {

    private String degree;
    private String department;
    private double teachingHours;

    public Teacher(String degree, String department, double teachingHours, String JobTitle, int officeNo, boolean onLeave, int id, String Name, String nationality, int Year, int month, int Day, char gender, int phone, String address) {
        super(JobTitle, officeNo, onLeave, id, Name, nationality, Year, month, Day, gender, phone, address);
        this.degree = degree;
        this.department = department;
        this.teachingHours = teachingHours;

    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(double teachingHours) {
        this.teachingHours = teachingHours;
    }

    public String toString() {

        return super.toString()+", Degree: " + this.degree + ", Department: " + this.department + ", Teaching Hours :" + this.teachingHours+"\r\n";

    }

}
