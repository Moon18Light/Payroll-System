class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;
 
    public PartTimeEmployee(String var1, int var2, int var3, double var4) {
       super(var1, var2);
       this.hoursWorked = var3;
       this.hourlyRate = var4;
    }
 
    public double calculateSalary() {
       return (double)this.hoursWorked * this.hourlyRate;
    }
 }
