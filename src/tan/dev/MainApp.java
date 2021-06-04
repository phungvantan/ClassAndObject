package tan.dev;

import java.util.Scanner;

public class MainApp {
	static void input(Student[]Students) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < Students.length; i++) {
			System.out.println("Sinh Vien Thu" + (i+1));
			Students [i] = new Student();
			
			System.out.println("Name");
			Students [i].name = sc.next();
			
			System.out.println("age");
			Students [i].age = sc.nextInt();
			
			System.out.println("address");
			Students [i].address = sc.next();
			
			System.out.println("phone");
			Students [i].phone = sc.next();
			
			System.out.println("diemtrungBinh");
			Students [i].diemTrungBinh = sc.nextDouble();

		}

	}
	static void print (Student[] Students) {
		for (int i = 0; i < Students.length; i++) {
			System.out.println(Students[i].name + ":" + Students[i].age + ":" + Students[i].address 
					+ ":" + Students[i].phone + ":" + Students[i].diemTrungBinh);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] Students = new Student [10];
		input (Students);
		print (Students);
		
	}
		
}


