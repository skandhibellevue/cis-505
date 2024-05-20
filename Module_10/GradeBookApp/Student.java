
class Student {

    // private properties
    private String firstName;
    private String lastName;
    private String course;
    private String grade;


    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.course = "";
        this.grade = "";
    }

    public Student(String firstName, String lastName, String course, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.grade = grade;
    }

    // Getter and Setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    // end Accessor methods

    // toString method
    public String toString() {
        return "First Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nCourse: " + getCourse() + "\nGrade: " + getGrade();
    } // end toString
}