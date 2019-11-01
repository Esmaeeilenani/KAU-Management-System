



public class Invigilator extends Employee {

    private int ExpYears;
    private String Skills;

    public Invigilator(int ExpYears, String Skills, String JobTitle, int officeNo, boolean onLeave, int id, String Name, String nationality, int Year, int month, int Day, char gender, int phone, String address) {
        super(JobTitle, officeNo, onLeave, id, Name, nationality, Year, month, Day, gender, phone, address);

        this.ExpYears = ExpYears;
        this.Skills = Skills;

    }

    public int getExpYears() {
        return ExpYears;
    }

    public void setExpYears(int ExpYears) {
        this.ExpYears = ExpYears;
    }

    public String getSkills() {
        return Skills;
    }

    public void setSkills(String Skills) {
        this.Skills = Skills;
    }

    public String toString() {

        return super.toString() + "Year(s) of Invigilaton Experience: " + this.ExpYears + ", Invigilaton Expertise: " + this.Skills+"\r\n";
    }

}
