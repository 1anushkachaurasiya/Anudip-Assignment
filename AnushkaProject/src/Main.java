 public class Main {
	public static void main(String[] args) {
		// instance of Employee class
		Employee emp = new Employee("anushka",22,"8272568029","NOIDA",234578.6,"IT");
		// instance of Manager class
		Manager mng = new Manager("Anus",25,"7926378490","Greater Noida",473647.45,"Marketing");
		// now print the salary
		emp.printSalary();
		mng.printSalary();
	}
}