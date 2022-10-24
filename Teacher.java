public class Teacher {
    private String lastName;
    private String firstName;
    private String phone;
    private String email;
    private String dateOfRecruitment;
    private String staffNumber;

    public String getDateOfRecruitment() {
        return dateOfRecruitment;
    }
    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }   
    public String getPhone() {
        return phone;
    }
    public String getStaffNumber() {
        return staffNumber;
    }
    public Teacher() {
    }
    public Teacher(String lastName, String firstName, String phone, String email, String dateOfRecruitment,
            String staffNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.email = email;
        this.dateOfRecruitment = dateOfRecruitment;
        this.staffNumber = staffNumber;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDateOfRecruitment(String dateOfRecruitment) {
        this.dateOfRecruitment = dateOfRecruitment;
    }
    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }
    @Override
    public String toString() {
        return "Teacher [lastName=" + lastName + ", firstName=" + firstName + ", phone=" + phone + ", email=" + email
                + ", dateOfRecruitment=" + dateOfRecruitment + ", staffNumber=" + staffNumber + "]";
    }
    

}

