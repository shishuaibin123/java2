package classpackage;
class Personer{
	static String number;
	static String name;
	static String sex;
	public Personer(String number,String name,String sex) {
		this.number=number;
		this.name=name;
		this.sex=sex;
		
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}