import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String department;
    String subject;

    Teacher(int empId, String name, double salary, String department, String subject) {
        super(empId, name, salary);  
        this.department = department;
        this.subject = subject;
    }
 
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Subject Taught: " + subject);
        System.out.println("----------------------------");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();  

        Teacher[] teachers = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i + 1));

            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Department: ");
            String department = sc.nextLine();

            System.out.print("Subject Taught: ");
            String subject = sc.nextLine();

            teachers[i] = new Teacher(empId, name, salary, department, subject);
        }

        System.out.println("\n Teacher Details\n ");
        for (int i = 0; i < n; i++) {
            teachers[i].display();
        }

        sc.close();
    }
}
