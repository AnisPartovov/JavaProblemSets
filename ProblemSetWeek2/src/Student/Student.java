package Student;

public class Student {
        private String firstname;
        private String lastName;
        private String email;
        private double GPA;
        private String degree;

    public Student(String firstname, String lastName, String email, double GPA, String degree) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.GPA = GPA;
        this.degree = degree;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Student" +
                " firstname=' " + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", GPA=" + GPA +
                ", degree='" + degree + '\'';
    }
}
