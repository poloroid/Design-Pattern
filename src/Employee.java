class Employee {
   String name;
   double salary;
   Employee(String n, double s){
       name = n;
       salary = s;
   }
   String getName() {
      return name;
   }
   double getSalary() {
      return salary;
   }
   public String toString() {
       return "Employee " + name +"salary:"+salary+"€";
   }
}


