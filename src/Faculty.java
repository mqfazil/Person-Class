public class Faculty extends Person {
    private myDOB hiringDate;
    private String facultyID;
    Faculty() {
        this.hiringDate = new myDOB(1, 1, 1);
        this.facultyID = "";
    }
    Faculty(String _firstName, String _lastName, myDOB _dob, myDOB _hiringDate, String _facultyID) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        this.hiringDate = new myDOB(_hiringDate);
        this.facultyID = _facultyID;
    }
    public void setHiringDate(myDOB _hiringDate) {
        this.hiringDate = _hiringDate;
    }
    public myDOB getHiringDate() {
        return this.hiringDate;
    }
    public void setFacultyID(String _facultyID) {
        this.facultyID = _facultyID;
    }
    public String getFacultyID() {
        return this.facultyID;
    }
    @Override
    public String toString() {
        return super.toString() + ", Hiring Date: " + this.hiringDate + ", Faculty ID: " + this.facultyID;
    }
}
