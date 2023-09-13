
public class EmployeeModel {
	protected String employeeName;
	protected String employeeID;
	protected String employeeTitle;
	
	public EmployeeModel(String en, String ei, String et) {
		setName(en);
		setID(ei);
		setTitle(et);
	}
	
	public String getName() { return employeeName; }
	public void setName(String en) { employeeName = en; }
	public String getID() { return employeeID; }
	public void setID(String ei) { employeeID = ei; }
	public String getTitle() { return employeeTitle; }
	public void setTitle(String et) { employeeTitle = et; }
}
