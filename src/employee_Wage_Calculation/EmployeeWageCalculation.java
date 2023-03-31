package employee_Wage_Calculation;

import java.util.Scanner;

public class EmployeeWageCalculation {
	public static final int WAGE_PER_HOUR = 20;
	public static final int MAX_HOURS_IN_MONTH = 100;
	public static final int NUMBER_OF_WORKING_DAYS = 20;
	
	public int computeEmployeeWage() {
		int workingHours=0;
		int totalWorkingHours = 0;
		int totalWorkingDays = 0;
		
		while (totalWorkingHours <= MAX_HOURS_IN_MONTH && totalWorkingDays < NUMBER_OF_WORKING_DAYS) {
			totalWorkingDays++;
		
			int employeeStatus = (int) (Math.floor(Math.random() * 10 ) % 3);
			
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
			totalWorkingHours = totalWorkingHours + workingHours;
			System.out.println ("Total working days = "+ totalWorkingDays);
			System.out.println ("Total working hours = "+ workingHours);
		}
		int totalEmployeeWage = totalWorkingHours * WAGE_PER_HOUR;
		System.out.println ("Total employee wage = "+ totalEmployeeWage );
		return totalEmployeeWage;
		
		}
	public static void main(String[] args) {
		EmployeeWageCalculation employeeWage = new EmployeeWageCalculation();
		employeeWage.computeEmployeeWage();
		}
	}
	