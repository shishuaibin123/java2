# java2
java实验三

## 1.实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 2.实验要求
对象示例：
## person类
定义了一个人员，然后他有编号，姓名，性别
人员（编号、姓名、性别）
##Teacher类
教师（编号、姓名、性别、所授课程）
##Student类
学生（编号、姓名、性别、所选课程）
Course类
课程（编号、课程名称、上课地点、时间、授课教师）
## 3.实验过程
     首先创建Person类中的对象和方法，里面定义了一个人员，人员有编号，姓名，性别这些属性。
     然后创建Student类和Teacher类来继承person类中的对象和放法。
     1 Student类里面声明了编号、姓名、性别、所选课程这些属性。
     2 Teacher类里面声明了编号、姓名、性别、所授课程这些属性。
     其次创建课程的类中的方法，
     然后再定义一个课程编号，一个上课地点，一个上课时间，一个授课老师属性。
     最终初始化对象，输出相关的信息。
## 4.核心代码
```
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
```
## 5.系统运行截图
 
  https://github.com/shishuaibin123/java2/blob/main/img/bbc.png
  
## 6.编程感想
   这次的实验给我带来了很大的挑战，让我学会了如何通过继承父类中的方法来实现学生选课系统，虽然自己
   写代码中有很多的错误，但通过同学的帮助改正了，让我学会了如何利用继承的特质，来实现程序的。最终让
   我对编程有了更深的认识。相信自己可以做的的更好.
