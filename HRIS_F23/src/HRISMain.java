
public class HRISMain {

	public static void main(String[] args) {
		EmployeeController ceo = new EmployeeController(
				HRISMain.retrieveEmployee("Bartlett Bigby", "001", "CEO")
				, new EmployeeView()
				);
		
		EmployeeController snackManager = new EmployeeController(
				HRISMain.retrieveEmployee("Chad Harper", "002", "Snack Manager")
				, new EmployeeView()
				);
		
		ceo.updateView();
		snackManager.updateView();

	}
	
	public static EmployeeModel retrieveEmployee(String n, String i, String t) {
		return new EmployeeModel(n, i, t);
	}

}
