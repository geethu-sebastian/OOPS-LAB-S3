import java.io.*;
import java.util.*;
class Employee {
	String name;
	int age;
	long phone;
	String address;
	double salary;
	public Employee(String name, int age, long phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

	void printSalary(double salary) {
		System.out.println("Salary: " + salary);
	}
}

class Officer extends Employee {
	String specialization;
	public Officer(String name, int age, long phone,
                    String address, double salary, String specialization) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }
	
	
}

class Manager extends Employee {
	String department;
	public Manager(String name, int age, long phone,
                    String address, double salary, String department) {
        super(name, age, phone, address, salary);
        this.department = department;
    }
}

class Employee2 {
	public static void main(String args[]) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter Officer Name : ");
		String nameo=sc.next();
		System.out.println("Enter Age : " );
		int ageo=sc.nextInt();
		System.out.println("Enter Phone number: " );
		long phoneo=sc.nextLong();
		System.out.println("Enter Address: " );
		String addresso=sc.next();
		System.out.println("Enter Salary: " );
		double salaryo=sc.nextDouble();
		System.out.println("Enter Specialization: " );
		String specialization=sc.next();
	    Officer off1 = new Officer(nameo,ageo,phoneo,addresso,salaryo,specialization);
	    off1.printSalary(salaryo);
	    System.out.println("Enter Manager Name : ");
		String namem=sc.next();
		System.out.println("Enter Age : " );
		int agem=sc.nextInt();
		System.out.println("Enter Phone number: " );
		long phonem=sc.nextLong();
		System.out.println("Enter Address: " );
		String addressm=sc.next();
		System.out.println("Enter Salary: " );
		double salarym=sc.nextDouble();
		System.out.println("Enter Department: " );
		String department=sc.next();
		Manager man1 = new Manager(namem,agem,phonem,addressm,salarym,department);
		man1.printSalary(salarym);
	}
}