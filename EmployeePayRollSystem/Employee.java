abstract class Employee {
    private String name;
    private int id;
 
    public Employee(String var1, int var2) {
       this.name = var1;
       this.id = var2;
    }
 
    public String getName() {
       return this.name;
    }
 
    public int getId() {
       return this.id;
    }
 
    public abstract double calculateSalary();
 
    public String toString() {
       String var10000 = this.name;
       return "Employee [name=" + var10000 + ", id=" + this.id + ", salary=" + this.calculateSalary() + "]";
    }
}     
