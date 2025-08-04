//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee obj = new Employee();
        obj.setEmployeeName("Dipesh");
        obj.setEmployeeAddress("123, 123 road, Abcd");
        obj.setEmployeeDesignation("GET");
        obj.setEmployeeAge(22);
        obj.setEmployeeSalary(9999999);

        obj.displayEmployeeDetails();

        obj.printEmployeeName(2);

        obj.printEmployeeDesignationForLoop(4);

        obj.printEmpAgeDoWhile(3);
    }
}