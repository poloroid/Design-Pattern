import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Manager implements Visit {
   Manager mgr;
   Employee[] ely;
   String dept;
   String name;
   public Manager(Manager mgr,Employee[] e, String d, String name) {
       this(e, d,name);
       this.mgr = mgr;
   }
   
   public Manager(Employee[] e, String d, String name) {
       ely = e;
       dept =d;
       this.name=name;
   }
   private String getDept() {
       return dept;
   }
   Manager getManager() {
       return mgr;
   }
   Employee[] getEmployee() {
       return ely;
   }
   public void listEmployees(){
       java.util.List list = new ArrayList<Employee>(Arrays.asList(ely));
	   Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
		    Employee em = (Employee)iterator.next();
		    System.out.println(em.toString());
		}
   }
   public String toString() {
       return name + " : "+ dept + " manager";
   }

@Override
public void visit(Client c) {
	c.getVisited(this);
}
}