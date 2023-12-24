import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter the number of employees: ");
                int numEmployees = input.nextInt();

                // Create arrays to store employee information
                int[] empId = new int[numEmployees];
                String[] empName = new String[numEmployees];
                String[] department = new String[numEmployees];
                double[] basicPay = new double[numEmployees];
                double[] hra = new double[numEmployees];
                double[] da = new double[numEmployees];
                double[] ma = new double[numEmployees];
                double[] deductions = new double[numEmployees];
                double[] grossPay = new double[numEmployees];
                double[] netPay = new double[numEmployees];

                // Get employee information from user input
                for (int i = 0; i < numEmployees; i++) {
                    System.out.println("Employee #" + (i+1));
                    System.out.print("Enter employee ID: ");
                    empId[i] = input.nextInt();
                    input.nextLine(); // consume newline character
                    System.out.print("Enter employee name: ");
                    empName[i] = input.nextLine();
                    System.out.print("Enter department: ");
                    department[i] = input.nextLine();
                    System.out.print("Enter basic pay: ");
                    basicPay[i] = input.nextDouble();
                    System.out.print("Enter HRA: ");
                    hra[i] = input.nextDouble();
                    System.out.print("Enter DA: ");
                    da[i] = input.nextDouble();
                    System.out.print("Enter MA: ");
                    ma[i] = input.nextDouble();
                    System.out.print("Enter deductions: ");
                    deductions[i] = input.nextDouble();

                    // Calculate gross pay and net pay
                    grossPay[i] = basicPay[i] + hra[i] + da[i] + ma[i];
                    netPay[i] = grossPay[i] - deductions[i];

                    System.out.println(); // blank line for spacing
                }

                // Display employee payroll information
                System.out.println("Employee Payroll Information:");
                    System.out.printf("%-10s %-20s %-15s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                        "Emp ID", "Emp Name", "Department", "BP", "HRA", "DA", "MA", "Gross Pay", "Net Pay");
                for (int i = 0; i < numEmployees; i++) {
                    System.out.printf("%-10d %-20s %-15s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f\n",
                            empId[i], empName[i], department[i], basicPay[i], hra[i], da[i], ma[i], grossPay[i], netPay[i]);
                }
            }
        }