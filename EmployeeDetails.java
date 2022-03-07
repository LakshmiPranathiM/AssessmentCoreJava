package OopsConcepts;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case0:
		System.out.println("Case 0:");
		Engineer e = new Engineer();
		e.setSalary(50000);
		e.setGrade("B");
		Manager m = new Manager();
		m.setSalary(70000);
		m.setGrade("A");
		e.label();
		m.label();
		
		System.out.println("Case 1:");
		//case1:
		Engineer e1 = new Engineer();
		e1.setSalary(50000);
		e1.setGrade("B");
		Manager m1 = new Manager();
		m1.setSalary(70000);
		m1.setGrade("A");
		Manager m2 = new Manager();
		m2.setSalary(90000);
		m2.setGrade("A");
		e1.label();
		m1.label();
		m2.label();
	}

}
