package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Employee extends Person {
    private String department;
    float payGrade;
    int employeeId;

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }


    public float getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(float payGrade) {
        this.payGrade = payGrade;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String introduceYourSelf() {
        String firstName = getFirstName();
        String lastName = getLastName();
        return "Hi! I'm " + firstName + " " + lastName + " and I work at " + department + " Nice To Meet you!";
    }

}
