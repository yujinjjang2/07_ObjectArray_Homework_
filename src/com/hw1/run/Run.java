package com.hw1.run;


import com.hw1.model.vo.Employee;

public class Run {
	
	public static void main(String[] args) {
		
		Employee[] employee = new Employee[3];
		
		employee[0] = new Employee();
		employee[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실");
		employee[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(int i = 0; i < employee.length; i++) {
			System.out.println("emp["+i+"] : " + employee[i].information());
		}
//		System.out.println("emp[0] : " + employee[0].information());
//		
//		System.out.println("emp[1] : " + employee[1].information());
//		
//		System.out.println("emp[2] : " + employee[2].information());
		
		System.out.println("====================================================================");
		
		employee[0].setEmpName("김말똥");
		employee[0].setDept("영업부");
		employee[0].setJob("팀장");
		employee[0].setAge(30);
		employee[0].setGender('M');
		employee[0].setSalary(3000000);
		employee[0].setBonusPoint(0.2);
		employee[0].setPhone("01055559999");
		employee[0].setAddress("전라도 광주");
		
		employee[1].setDept("기획부");
		employee[1].setJob("부장");
		employee[1].setSalary(4000000);
		employee[1].setBonusPoint(0.3);
		
		System.out.println("emp[0] : " + employee[0].information());

		System.out.println("emp[1] : " + employee[1].information());
		
		System.out.println("====================================================================");
		
		int totalSalary = 0;
		
		for(int i = 0; i < employee.length; i++) {
			int salary = (int)((employee[i].getSalary() + (employee[i].getSalary() * employee[i].getBonusPoint())) * 12);
			totalSalary += salary; 
			System.out.printf("%s의 연봉 : %d원\n", employee[i].getEmpName(), salary);
		}
//		int salary = (int)((employee[0].getSalary() + (employee[0].getSalary() * employee[0].getBonusPoint())) * 12);
//		int salary2 = (int)((employee[1].getSalary() + (employee[1].getSalary() * employee[1].getBonusPoint())) * 12);
//		int salary3 = (int)((employee[2].getSalary() + (employee[2].getSalary() * employee[2].getBonusPoint())) * 12);
		
//		System.out.printf("%s의 연봉 : %d원\n", employee[0].getEmpName(), salary);
//		System.out.printf("%s의 연봉 : %d원\n", employee[1].getEmpName(), salary2);
//		System.out.printf("%s의 연봉 : %d원\n", employee[2].getEmpName(), salary3);
		
		System.out.println("====================================================================");
		
//		int totalSalary = salary + salary2 + salary3;
		int avgSalary = totalSalary / 3;
		
		System.out.printf("직원들의 연봉의 평균 : %d원\n", avgSalary);
	}

}
