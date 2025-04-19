class FullTimeEmployee extends Employee {
    private double monthlySalary;
 
    public FullTimeEmployee(String var1, int var2, double var3) {
       super(var1, var2);
       this.monthlySalary = var3;
    }
 
    public double calculateSalary() {
       return this.monthlySalary;
    }
 }
