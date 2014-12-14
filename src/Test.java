class Test {
	public static void main(String[] args) {
		Employee[] e1 = {new Employee("Aaron", 50),
				new Employee("Betty", 60)};
		Manager m1 = new Manager(e1, "Accounting","Cindy");

		Employee[] e2 = {new Employee("Cathy", 70),
				new Employee("Dan", 80),
				new Employee("Eliz", 90)};
		Manager m2 = new Manager(m1, e2, "Production", "Roger");

		System.out.println(m2);
		Employee[] emp = m2.getEmployee();
		if (emp != null)
			for (int k = 0; k < emp.length; k++)
				System.out.println(" "+emp[k]+" Salary: €"+ emp[k].getSalary());       
		Manager m = m2.getManager();
		System.out.println(" " + m);
		m.listEmployees();

		Client c= new Client("Bob");
		m1.visit(c);
	}	
}