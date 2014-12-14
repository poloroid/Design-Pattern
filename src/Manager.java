import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

class Manager implements Visit {
	private Manager mgr;
	private Employee[] ely;
	private String dept;
	private String name;
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
		System.out.println(this.getName()+"visited Client:" + c.name);

	}

	public Manager getMgr() {
		return mgr;
	}

	public void setMgr(Manager mgr) {
		this.mgr = mgr;
	}

	public Employee[] getEly() {
		return ely;
	}

	public void setEly(Employee[] ely) {
		this.ely = ely;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public void visit(Pizzeria p) {
		// TODO Auto-generated method stub
		System.out.println(this.getName()+" visited Pizzeria " + p.getName());
	}
}