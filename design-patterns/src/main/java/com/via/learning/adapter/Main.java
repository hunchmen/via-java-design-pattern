package com.via.learning.adapter;

/**
 * @author va.alberto
 *
 */
public class Main {

	public static void main(String[] args) {
		/** Using Class/Two way adapter */
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();

		String card = designer.designerCard(adapter);
		System.out.println(card);

		/** Using Object adapter */
		Employee employee = new Employee();
		populateEmployeeData(employee);
		EmployeeObjectAdapter objectAdapter = new EmployeeObjectAdapter(
				employee);
		card = designer.designerCard(objectAdapter);
		System.out.println(card);
	}

	public static void populateEmployeeData(Employee employee) {
		employee.setFullName("John Doe");
		employee.setJobTitle("Application Developer");
		employee.setOfficeLocation("BGC Taguig, City");
	}
}
