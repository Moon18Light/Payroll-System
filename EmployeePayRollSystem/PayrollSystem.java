import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PayrollSystem {
   private List<Employee> employeeList = new ArrayList();

   public PayrollSystem() {
   }

   public void addEmployee(Employee var1) {
      this.employeeList.add(var1);
   }

   public void removeEmployee(int var1) {
      Employee var2 = null;
      Iterator var3 = this.employeeList.iterator();

      while(var3.hasNext()) {
         Employee var4 = (Employee)var3.next();
         if (var4.getId() == var1) {
            var2 = var4;
            break;
         }
      }

      if (var2 != null) {
         this.employeeList.remove(var2);
      }

   }

   public void displayEmployees() {
      Iterator var1 = this.employeeList.iterator();

      while(var1.hasNext()) {
         Employee var2 = (Employee)var1.next();
         System.out.println(var2);
      }

   }
}

