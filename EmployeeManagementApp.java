import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
	int id;
	String name;
	int age;
	String department;
	String code;
	double salaryRate;

	public Employee(int id, String name, int age, String department, String code, double salaryRate) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
		this.code = code;
		this.salaryRate = salaryRate;
	}
}

public class EmployeeManagementApp {
	static List<Employee> employees = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		employees.add(new Employee(1, "Van", 21, "63HTTT2", "2151163", 8000.0));
		employees.add(new Employee(2, "Diu", 21, "63HTTT2", "2151163", 8000.0));
		employees.add(new Employee(3, "Hieu", 21, "63HTTT2", "2151163", 8000.0));
		employees.add(new Employee(4, "Minh", 21, "63HTTT2", "2151163", 8000.0));
		employees.add(new Employee(5, "Kien", 21, "63HTTT2", "2151163", 8000.0));
		employees.add(new Employee(6, "Duc", 21, "63HTTT2", "2151163", 8000.0));
		employees.add(new Employee(7, "Son", 21, "63HTTT2", "2151163", 8000.0));
		employees.add(new Employee(8, "Phuong", 21, "63HTTT2", "2151163", 8000.0));
		employees.add(new Employee(9, "An", 21, "63HTTT2", "2151163", 8000.0));
		employees.add(new Employee(10, "Van Anh", 21, "63HTTT2", "2151163", 8000.0));

		displayEmployees();

		while (true)

		{
			System.out.println("\nChon chuc nang:");
			System.out.println("1. Them nhan vien moi");
			System.out.println("2. Xoa nhan vien");
			System.out.println("0. Thoat");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
				case 1:
					addEmployee();
					break;
				case 2:
					removeEmployee();
					break;
				case 0:
					System.out.println("Thoat chuong trinh.");
					return;
				default:
					System.out.println("Lua chon khong hop le.");
			}
		}
	}

	static void displayEmployees() {
		System.out.println("+----+---------------+-----+-------------+--------+--------------+");
		System.out.println("| ID |     Name      | Age | Department  |  Code  | Salary Rate  |");
		System.out.println("+----+---------------+-----+-------------+--------+--------------+");

		for (Employee employee : employees) {
			System.out.printf("| %-2d | %-13s | %-4d| %-11s | %-6s | %-12.2f |%n", employee.id, employee.name,
					employee.age, employee.department, employee.code, employee.salaryRate);
		}

		System.out.println("+----+---------------+-----+-------------+--------+--------------+");
	}

	static void addEmployee() {
		System.out.print("Nhap id: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		// Kiểm tra id đã tồn tại hay chưa
		boolean isDuplicate = false;
		for (Employee employee : employees) {
			if (employee.id == id) {
				isDuplicate = true;
				break;
			}
		}

		if (isDuplicate) {
			System.out.println("Id da ton tai, vui long nhap id khac.");
			return;
		}

		System.out.print("Nhap ten nhan vien: ");
		String name = scanner.nextLine();

		System.out.print("Nhap tuoi nhan vien: ");
		int age = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Nhap phong ban: ");
		String department = scanner.nextLine();

		System.out.print("Nhap ma nhan vien: ");
		String code = scanner.nextLine();

		System.out.print("Nhap muc luong: ");
		double salaryRate = scanner.nextDouble();

		Employee newEmployee = new Employee(id, name, age, department, code, salaryRate);
		employees.add(newEmployee);
		System.out.println("Them thanh cong!");
		displayEmployees();
	}

	static void removeEmployee() {
		System.out.println("Nhap id nhan vien can xoa: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		boolean found = false;
		for (Employee employee : employees) {
			if (employee.id == id) {
				employees.remove(employee);
				found = true;
				System.out.println("Xoa nhan vien thanh cong!");
				break;
			}
		}
		if (!found) {
			System.out.println("Khong tim thay nhan vien voi id: " + id);
		}
		displayEmployees();
	}
}

