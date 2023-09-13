
public class EmployeeController {
	protected EmployeeModel employeeModel;
	protected EmployeeView employeeView;
	
	public EmployeeController(EmployeeModel employeeModel
			, EmployeeView employeeView) {
		this.employeeModel = employeeModel;
		this.employeeView = employeeView;
	}
	
	public String getEmployeeName() { return employeeModel.getName(); }
	public void setEmployeeName(String newName) {
		employeeModel.setName(newName);
	}
	
	public String getEmployeeID() { return employeeModel.getID(); }
	public void setEmployeeID(String newID) {
		employeeModel.setName(newID);
	}
	
	public String getEmployeeTitle() { return employeeModel.getTitle(); }
	public void setEmployeeTitle(String newTitle) {
		employeeModel.setTitle(newTitle);
	}
	
	public void updateView() {
		employeeView.printEmployeeDetails(
				getEmployeeName()
				, getEmployeeID()
				, getEmployeeTitle());
	}
	
}
