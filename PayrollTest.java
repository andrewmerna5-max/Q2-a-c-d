public class PayrollTest {
    public static void main(String[] args) {
        Payable salariedEmployee = new SalariedEmployee("E001", "Emmanuella", 1500000.00);
        Payable hourlyEmployee = new HourlyEmployee("E002", "Dalia", 160, 2500.00);

        Payable[] employees = {salariedEmployee, hourlyEmployee};
        double totalPayroll = 0;

        for (Payable employee : employees) {
            double payment = employee.getPaymentAmount();
            if (employee == salariedEmployee) {
                System.out.println("Employee: E001 - Emmanuella");
            } else {
                System.out.println("Employee: E002 - Dalia");
            }
            System.out.printf("Payment amount: UGX %,.2f%n%n", payment);
            totalPayroll += payment;
        }

        System.out.printf("Total payroll: UGX %,.2f%n", totalPayroll);
    }
}