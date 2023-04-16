package employee_Wage_Calculation;

import java.util.Scanner;

public class EmployeeWageCalculation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	public static String company;
	public static int empRatePerHour;
	public static int numOfWorkingDays;
	public static int maxHoursPerMonth;
	public static int totalEmpWage;
	
	public void EmpWageObjects(String company, int empRatePerHour, int numOfWorkingDays,
			int maxHoursPerMonth) {
		this.company= company;
		this.empRatePerHour = empRatePerHour;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.numOfWorkingDays = numOfWorkingDays;
		this.totalEmpWage = totalEmpWage;
		
	}

	public static void computeEmployeeWage() {
		
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
	}
	@Override
	public String toString() {
		return "Total Employee Wage for Company " + company +" is " + totalEmpWage;
	}

	public static void main(String[] args) {
		EmpWageObjects dMart = new EmpWageObjects ("DMart", 20, 2, 10);
		EmpWageObjects reliance =new EmpWageObjects("Reliance", 10, 6, 10);
		EmpWageObjects tata =new EmpWageObjects("Tata", 30, 6, 10);
		EmpWageObjects birla =new EmpWageObjects("Birla", 35, 7, 10);
		
		dMart.computeEmployeeWage();
		System.out.println(dMart);
		
		reliance.computeEmployeeWage();
		System.out.println(reliance);
		
		tata.computeEmployeeWage();
		System.out.println(tata);
		
		birla.computeEmployeeWage("Birla", 35, 7, 10);
		System.out.println(birla);
	}
}
