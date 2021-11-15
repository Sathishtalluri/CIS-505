package TalluriGradeBookApp.src;

import com.opencsv.bean.CsvBindByName;

public class Student {
    @CsvBindByName(column = "First Name")
    private String firstName;
    @CsvBindByName(column = "Last Name")
    private String lastName;
    @CsvBindByName(column = "Course")
    private String course;
    @CsvBindByName(column = "Grade")
    private String grade;

    public Student( String firstName, String lastName, String course,String grade) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.grade = grade;
    }
    public Student() {
    }
    /*
    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return String return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return String return the grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

       @Override
    public String toString() {
        return "Student [firstName=" + firstName
                + ", lastName=" + lastName + ", course=" + course + ", grade="
                + grade + "]";
    }

}
