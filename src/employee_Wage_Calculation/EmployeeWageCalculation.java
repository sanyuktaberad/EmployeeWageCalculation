package employee_Wage_Calculation;

import java.util.Scanner;

public class EmployeeWageCalculation {
	static int wagePerHour = 20;
	static int workingHoursFullTimerPerDay = 8;
	static int workingHoursForPartTimerPerDay = 4;
	static int wage = (int)(wagePerHour * workingHoursFullTimerPerDay);
	static int wage2 = (int)(wagePerHour * workingHoursForPartTimerPerDay);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Enter 1 if the employee is present & fulltimer; enter 2 if the employee is present & parttimer; enter 0 if the employee is absent. ");
		int presenty = sc.nextInt();

		int wage = (int) (wagePerHour * workingHoursForPartTimerPerDay);
		int wage2 = (int) (wagePerHour * workingHoursForPartTimerPerDay);

		switch (presenty) {
		case 1:
			System.out.println("Employee is Present & Fulltimer hence its monthly wage is : " + wage + ".");
			break;

		case 2:
			System.out.println("Employee is Present &  Parttimer hence its monthly wage is : " + wage2 + ".");
			break;

		default:
			System.out.println("Employee is Absent & its daily wage is 0.");

		}
	}
}
