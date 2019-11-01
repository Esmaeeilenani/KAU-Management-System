



public class ExamVenue {

    private int examVenueNo;
    private String floor;
    private int buildingNo;

    public ExamVenue(int examVenueNo, String floor, int buildingNo) {
        this.examVenueNo = examVenueNo;
        this.floor = floor;
        this.buildingNo = buildingNo;
    }

    public int getExamVenueNo() {
        return examVenueNo;
    }

    public void setExamVenueNo(int examVenueNo) {
        this.examVenueNo = examVenueNo;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public int getBuildingNo() {
        return buildingNo;
    }

    public void setBuildingNo(int buildingNo) {
        this.buildingNo = buildingNo;
    }

    public String toString() {

        return " Exam Venue No.: " + this.examVenueNo + ", Floor: " + this.floor + ", Building No.:" + this.buildingNo;
    }

}
