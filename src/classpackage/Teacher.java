package classpackage;

class Teacher extends Personer{
	public Teacher(String number, String name, String sex) {
		super(number, name, sex);
	}
	public Teacher() {
		super(number, name, sex);
	}
	String  instruction;

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
}