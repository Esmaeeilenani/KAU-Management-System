


public class Person {

    private int id;
    private String Name;
    private String nationality;
    private int Year;
    private int month;
    private int Day;
    private char gender;
    private int phone;
    private String address;

    public Person(int id, String Name, String nationality, int Year, int month, int Day, char gender, int phone, String address) {
        this.id = id;
        this.Name = Name;
        this.nationality = nationality;
        this.Year = Year;
        this.month = month;
        this.Day = Day;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {

        return "ID: " + this.id + ", Name: " + this.Name + ", Nationality :" + this.nationality + ", Date of Birth :"
                + this.Year + "-" + this.month+ "-" + this.Day+ ", Gender: " + this.gender+ ", Phone: " + this.phone+ ", Address: " + this.address+ "\r\n";

    }
}
