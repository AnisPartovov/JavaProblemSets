package Employee;

public class Employee {
        private String firstName;
        private String lastName;
        private String email;
        private String id;

        public Employee() {
            this.firstName = "Anis";
            this.lastName = "Partovov";
            this.email = "test@mail.com";
            this.id = "10";
        }

        public Employee(String firstName, String lastName, String email, String id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getEmail() {
            return email;
        }
        public String getId() {
            return id;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setId(String id) {
            this.id = id;
        }

        public String toString() {
            return "Employee.Employee{firstName='"
                    + this.firstName + "', lastName='"
                    + this.lastName + "', email='"
                    + this.email + "', id='"
                    + this.id + "'}";
        }
}
