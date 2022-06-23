package o.before;

public class Applicant {
    protected String firstName;
    protected String lastName;
    protected EmployeeType typeOfEmployee;


    public Applicant(String firstName, String lastName, EmployeeType typeOfEmployee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.typeOfEmployee = typeOfEmployee;
    }

    public String getFirstName(){
        return  firstName;
    }
    public String getLastName(){
        return  lastName;
    }
    public EmployeeType getTypeOfEmployee(){
        return  typeOfEmployee;
    }
}
