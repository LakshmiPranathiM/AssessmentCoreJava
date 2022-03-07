package OopsConcepts;

public class Manager extends Employee{
	private int Salary;
	private String grade;
	
	@Override
	public void setSalary(int Salary) {
		// TODO Auto-generated method stub
		this.Salary=Salary;
		
	}
	@Override
	public int getSalary() {
		// TODO Auto-generated method stub
		int sal = Salary;
		return sal;
	}
	@Override
	public void setGrade(String grade) {
		// TODO Auto-generated method stub
		this.grade=grade;
		
	}
	@Override
	public String getGrade() {
		// TODO Auto-generated method stub
		String grd=grade;
		return grd;
	}
	void label(){
		System.out.println("Employee's data: ");
		System.out.println("GRADE : " +grade);
		System.out.println("SALARY : " +Salary);
	}

}
