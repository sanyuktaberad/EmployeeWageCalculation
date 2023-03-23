package employee_Wage_Calculation;

public class EmployeeWageCalculation {
	public static void main(String[] args) {
		
		double number = Math.floor(Math.random() * 10) % 2;
		
		if (number == 1) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

}
