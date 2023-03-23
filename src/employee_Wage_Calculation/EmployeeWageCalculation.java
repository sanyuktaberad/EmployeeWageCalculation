package employee_Wage_Calculation;

import java.util.Scanner;

public class EmployeeWageCalculation {
	static int wagePerHour = 20;
	static int workingHoursPerDay = 8;
	static int workingHoursForPartTimerPerDay = 4;
	static int wage = (int) (wagePerHour * workingHoursPerDay);
	static int wageForPartTimer = (int) (wagePerHour * workingHoursForPartTimerPerDay);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Enter 1 if the employee is present & fulltimer; enter 2 if the employee is present & parttimer; enter 0 if the employee is absent. ");
		int presenty = sc.nextInt();

		if (presenty == 1) {
			System.out.println("Employee is Present & its daily wage is " + wage);
		} else if (presenty == 2) {
			System.out.println("Employee is Present & its daily wage is " + wageForPartTimer);
		} else {
			System.out.println("Employee is Absent & its daily wage is 0");

		}

	}
}
