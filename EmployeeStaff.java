public class EmployeeStaff extends EmployeePerson {
    private String managerName;

    // ***********************************************************************

    // Default constructor
    public EmployeeStaff() {
        managerName = "";
    }

    // ***********************************************************************

    // Constructor with parameters
    public EmployeeStaff(String reportsTo) {
        managerName = reportsTo;
    }

    // ***********************************************************************

    // Get the name of the manager

    public String getManagerName() {
        return managerName;
    }

    // ***********************************************************************

    @Override
    public void printInfo() {
        System.out.println("Name: " + fullName + ", Department: " +
                departmentCode + ", Birthday: " + birthday +
                ", Salary: " + annualSalary +
                ", Manager: " + getManagerName());
    }

    // ***********************************************************************

    // The annual bonus for a staff member is 7.5% of the annual salary.
    @Override
    public int getAnnualBonus() {
        return (int)(annualSalary * 0.075);
    }
}