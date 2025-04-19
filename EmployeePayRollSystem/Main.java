public class Main {
    public Main() {
    }
 
    public static void main(String[] args) {
       PayrollSystem var1 = new PayrollSystem();
       FullTimeEmployee var2 = new FullTimeEmployee("John Doe", 101, 5000.0);
       PartTimeEmployee var3 = new PartTimeEmployee("Jane Smith", 102, 30, 15.0);
       FullTimeEmployee var4 = new FullTimeEmployee("Nikhil", 103, 4000.0);
       var1.addEmployee(var2);
       var1.addEmployee(var3);
       var1.addEmployee(var4);
       System.out.println("Initial Employee Details:");
       var1.displayEmployees();
       System.out.println("\nRemoving Employee...");
       var1.removeEmployee(101);
       System.out.println("\nRemaining Employee Details:");
       var1.displayEmployees();
    }
}
