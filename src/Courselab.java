


public class Courselab {

    private int labID;
    private String LabName;
    private double hours;

    public Courselab(int labID, String LabName, double hours) {
        this.labID = labID;
        this.LabName = LabName;
        this.hours = hours;
    }

    public int getLabID() {
        return labID;
    }

    public void setLabID(int labID) {
        this.labID = labID;
    }

    public String getLabName() {
        return LabName;
    }

    public void setLabName(String LabName) {
        this.LabName = LabName;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String toString() {

        return " Labe Code: " + this.labID + ", Lab Name: " + this.LabName + ", Credit Hour :" + this.hours;
    }
}
