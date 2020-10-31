package classpackage;
 
public class Students extends Personer{
	
	public Students(String number, String name, String sex) {
		super(number, name, sex);	
	}
	public Students() {
		super(number, name, sex);
	}
	

	String classs;

	public String getClasss() {
		return classs;
	}

	public void setClasss(String classs) {
		this.classs = classs;
	}
	
}
