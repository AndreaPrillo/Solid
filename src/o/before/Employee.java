package o.before;

public class Employee {
    protected String firstName;
    protected String lastName;
    protected String email;
    protected boolean isManager = false;
    protected boolean isExecutive = false;


    public String getFirstName(){
        return  firstName;
    }
    public String getLastName(){
        return  lastName;
    }
    public String getEmail(){
        return  email;
    }

    public boolean getIsManager(){
        return isManager;
    }

    public boolean getIsExecutive(){
        return isExecutive;
    }

}
