



public class Employee extends Person {

    private String JobTitle;
    private int officeNo;
    private boolean onLeave;

    public Employee(String JobTitle, int officeNo, boolean onLeave, int id, String Name, String nationality, int Year, int month, int Day, char gender, int phone, String address) {
        super(id, Name, nationality, Year, month, Day, gender, phone, address);

        this.JobTitle = JobTitle;
        this.officeNo = officeNo;
        this.onLeave = onLeave;

    }

    public String getJobTitle() {
        return JobTitle;
    }

    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }

    public int getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(int officeNo) {
        this.officeNo = officeNo;
    }

    public boolean isOnLeave() {
        return onLeave;
    }

    public void setOnLeave(boolean onLeave) {
        this.onLeave = onLeave;
    }

    public String toString() {

        return super.toString() + "Job Title: " + this.JobTitle + ", Office Number: " + this.officeNo + ", On Leave : " + this.onLeave + "\r\n";

    }
}
