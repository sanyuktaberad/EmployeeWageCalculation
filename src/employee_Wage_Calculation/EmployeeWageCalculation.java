package employee_Wage_Calculation;

import java.util.Scanner;

public class EmployeeWageCalculation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static int computeEmployeeWage(String company, int empRatePerHour, int numOfWorkingDays,
			int maxHoursPerMonth) {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;

			int employeeStatus = (int) (Math.floor(Math.random() * 10) % 3);

			switch (employeeStatus) {
			case IS_PART_TIME:
				System.out.println("Employee is Present & Fulltimer.");
				empHrs = 4;
				break;

			case IS_FULL_TIME:
				System.out.println("Employee is Present &  Parttimer.");
				empHrs = 8;
				break;

			default:
				System.out.println("Employee is Absent.");
				empHrs = 0;

			}

			totalEmpHrs = totalEmpHrs + empHrs;
			System.out.println("Total working days = " + totalWorkingDays);
			System.out.println("Total working hours = " + empHrs);
		}
		int totalEmpWage = totalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage for company " + company + " is " + totalEmpWage);
		return totalEmpWage;

	}

	public static void main(String[] args) {
		computeEmployeeWage("DMart", 20, 2, 10);
		computeEmployeeWage("Reliance", 10, 6, 10);
		computeEmployeeWage("Tata", 30, 6, 10);
		computeEmployeeWage("Birla", 35, 7, 10);
	}
}
