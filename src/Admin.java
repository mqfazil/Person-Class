public class Admin extends Person {
    private String adminID;
    private myDOB hiringDate;
    Admin() {
        this.adminID = "";
        this.hiringDate = new myDOB(1, 1, 1);
    }
    Admin(String _firstName, String _lastName, myDOB _dob, myDOB _hiringDate, String _adminID) {
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.dob = new myDOB(_dob);
        this.hiringDate = new myDOB(_hiringDate);
        this.adminID = _adminID;
    }
    public void setAdminID(String _adminID) {
        this.adminID = _adminID;
    }
    public String getAdminID() {
        return this.adminID;
    }
    public void setHiringDate(myDOB _hiringDate) {
        this.hiringDate = _hiringDate;
    }
    public myDOB getHiringDate() {
        return this.hiringDate;
    }
    @Override
    public String toString() {
        return super.toString() + ", Hiring Date: " + this.hiringDate + ", Admin ID: " + this.adminID;
    }
}
