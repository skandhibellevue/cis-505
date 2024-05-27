import javafx.beans.property.SimpleStringProperty;

class Student {

    // private properties
    private final SimpleStringProperty firstName;
    private final SimpleStringProperty lastName;
    private final SimpleStringProperty course;
    private final SimpleStringProperty grade;

    public Student() {
        this.firstName = new SimpleStringProperty("");
        this.lastName = new SimpleStringProperty("");
        this.course = new SimpleStringProperty("");
        this.grade = new SimpleStringProperty("");
    }

    public Student(String firstName, String lastName, String course, String grade) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.course = new SimpleStringProperty(course);
        this.grade = new SimpleStringProperty(grade);
    }

    // Getter and Setter methods
    public SimpleStringProperty getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public SimpleStringProperty getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public SimpleStringProperty getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course.set(course);
    }

    public SimpleStringProperty getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade.set(grade);
    }
    // end Accessor methods

    // toString method
    public String toString() {
        return "First Name: " + getFirstName() + "\nLast Name: " + getLastName() + "\nCourse: " + getCourse() + "\nGrade: " + getGrade();
    } // end toString
}