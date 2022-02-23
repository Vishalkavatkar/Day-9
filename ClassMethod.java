package classMethod;

public class ClassMethod {
	private static final int IS_FULL_TIME = 1;
	private static final int IS_PART_TIME = 2;

	// method to compute employee wage
	public static int EmpWageForCompany(String company, int empRate, int numOFDays, int maxHours) {

		System.out.println("\n Employee Wage Computation!");
		int empHrs = 0, empWagePerMonth = 0, totalWorkingdays = 0, totalEmpHours = 0;
		
		// condition

		while (totalEmpHours <= maxHours && totalWorkingdays < numOFDays) { 
			//checking if employee is full time or part time
			
			totalWorkingdays++;
			int empType = (int) Math.floor(Math.random() * 10) % 3; 

			switch (empType) {
			case IS_FULL_TIME:
				empHrs = 8;
				System.out.println("Employee Worked Full Time");
				break;
			case IS_PART_TIME:
				empHrs = 4;
				System.out.println("Employee Worked Part Time");
				break;
			default:
				empHrs = 0;
				System.out.println("Employee Absent");
			}
			// to calculate the employee wage
			totalEmpHours += empHrs;
			int empWagePerDay = empHrs * empRate;
			empWagePerMonth += empWagePerDay;
			System.out.println("Emp Wage Per Day : " + empWagePerDay);
		}

		System.out.println("Emp Wage Per Month for Company " + company + " is Rs." + empWagePerMonth);
		return empWagePerMonth; // to return the wage
	}

	public static void main(String[] args) {
		// calling the method with parameter input
		EmpWageForCompany("ABC", 20, 3, 50);
		EmpWageForCompany("XYZ", 20, 4, 50);
		EmpWageForCompany("PQR", 30, 5, 60);

	}

}
