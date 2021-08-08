public class EmployeeMain {

    public static void main(String [] args) {

        // Create the objects
        EmployeeManager manager = new EmployeeManager(25);
        EmployeeStaff   staff1  = new EmployeeStaff("Michele");

        // Load data into the objects using the Person class's method
        manager.setData("Michele", "Sales", "03-03-1975", 70000);
        staff1.setData ("Bob",     "Sales", "02-02-1980", 50000);

        // Print the objects
        manager.printInfo();
        System.out.println("Annual bonus: " + manager.getAnnualBonus());
        staff1.printInfo();
        System.out.println("Annual bonus: " + staff1.getAnnualBonus());

        return;
    }
}