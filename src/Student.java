public class Student {

    private String firstName;
    private String lastName;
    private int studentNumber;

    /**
     * A Consturcter with all appropriate arguments
     */
    public Student(String firstName, String lastName, int studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    /**
     * A setter and getter for each field that simply sets and gets the field value.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getstudentNumber() {
        return studentNumber;
    }
}