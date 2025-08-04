public class Employee {

    private String employeeName;
    private int employeeSalary;
    private String employeeDesignation;
    private int employeeAge;
    private String employeeAddress;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(int employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    public void setEmployeeAge(int employeeAge) {
        if (employeeAge > 100) {
            System.out.println("Invalid Age");
        } else {
            this.employeeAge = employeeAge;
        }
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void displayEmployeeDetails(){
        System.out.println("Employee details: \nEmployee name: " + getEmployeeName() + "\nEmployee salary: " + getEmployeeSalary() + "\nEmployee designation: " + getEmployeeDesignation() + "\nEmployee Age: " + getEmployeeAge() + "\nEmployee address: " + getEmployeeAddress());
    }

    public void printEmployeeName(int i){
        int n=1;
        while(n<=i){
            System.out.println(employeeName);
            n++;
        }
    }

    public void printEmployeeDesignationForLoop(int i){

        for(int n =1;n<=i;n++){
            System.out.println(employeeDesignation);
        }
    }

    public void printEmpAgeDoWhile(int i){

        int n=1;

        do {
            System.out.println(employeeAge);
            n++;
        } while (n<=i);


    }
}
