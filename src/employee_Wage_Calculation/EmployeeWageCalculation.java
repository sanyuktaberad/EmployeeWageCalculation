package employee_Wage_Calculation;

import java.util.Scanner;

public class EmployeeWageCalculation {
	public static final int MAX_HOURS_IN_MONTH = 100;
	public static final int NUMBER_OF_WORKING_DAYS = 20;
	static int wagePerHour = 0;
	static int totalWorkingHours = 0;
	
	public void computeEmployeeWage() {
		int workingHours = 0;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;
		int Tata =1;
		int Birla =2 ;
		int infosys = 3;

		while (totalWorkingHours <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUMBER_OF_WORKING_DAYS) {
			totalWorkingDays++;

			int employeeStatus = (int) (Math.floor(Math.random() * 10) % 3);

			switch (employeeStatus) {
			case 1:
				System.out.println("Employee is Present & Fulltimer.");
				workingHours = 8;
				break;

			case 2:
				System.out.println("Employee is Present &  Parttimer.");
				workingHours = 4;
				break;

			default:
				System.out.println("Employee is Absent.");
				workingHours = 0;

			}
			System.out.println("Enter the company code => ");
			Scanner sc = new Scanner(System.in);
			int companyName = sc.nextInt();

			if (companyName == 1) {
				wagePerHour = 30;
			} 
			else if (companyName == 2) {
				wagePerHour = 35;
			} 
			else if (companyName == 3) {
				wagePerHour = 25;
			} 
			else {
				System.out.println("Invalid Input...... ");
			}
			
			totalWorkingHours = totalWorkingHours + workingHours;
			System.out.println("Total working days = " + totalWorkingDays);
			System.out.println("Total working hours = " + workingHours);
		}

		
	}

	public static void main(String[] args) {
		EmployeeWageCalculation employeeWage = new EmployeeWageCalculation();
		employeeWage.computeEmployeeWage();
		
		
		int totalEmployeeWage = totalWorkingHours * wagePerHour;
		System.out.println("Total employee wage = " + totalEmployeeWage);
		return;

	}
}
