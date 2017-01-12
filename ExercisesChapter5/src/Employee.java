
public class Employee {
	String employeeType;
	int yearsWorked;
	
	public Employee(String typeOfEmployee, int nbYearsWorked){
		employeeType = typeOfEmployee;
		yearsWorked = nbYearsWorked;
	}
	
	public double calculateWage(){
		double baseWage = 0;
		switch(this.employeeType){
		case "clerk" : baseWage = 1000; break; 
		case "midlevelmanager" : baseWage = 2000; break;
		case "CIO":
		case "CFO":
			baseWage = 3000; break;
		case "CEO": baseWage = 5000; break;
		default: System.out.println("Employee type unrecognized.");
			
		}
		return baseWage*(this.yearsWorked*0.1);
	}

	public static void main(String[] args) {
		Employee firstEmployee = new Employee("CIO", 12);
		
		System.out.println("The wage of a " + firstEmployee.employeeType + " who has worked at the company for " + firstEmployee.yearsWorked + " years, is " + firstEmployee.calculateWage());

	}

}
