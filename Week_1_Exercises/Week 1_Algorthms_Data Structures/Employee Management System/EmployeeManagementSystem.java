public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    // Method to search for an employee by ID
    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Method to traverse and print all employees
    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Method to delete an employee by ID
    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                // Shift elements to the left to fill the gap
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Main method for testing
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem(10);

        // Adding employees
        system.addEmployee(new Employee(1, "John Doe", "Developer", 60000));
        system.addEmployee(new Employee(2, "Jane Smith", "Manager", 80000));

        // Traversing employees
        System.out.println("Employee List:");
        system.traverseEmployees();

        // Searching for an employee
        System.out.println("Search for Employee with ID 1:");
        Employee employee = system.searchEmployee(1);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Deleting an employee
        System.out.println("Deleting Employee with ID 1:");
        system.deleteEmployee(1);
        system.traverseEmployees();
    }
}
