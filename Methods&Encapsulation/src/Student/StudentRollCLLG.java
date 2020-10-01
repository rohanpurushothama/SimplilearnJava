package Student;

public class StudentRollCLLG {
	int rollno;
	String name;
	static String college="MT";
	static void change() {
		college="MIT";
	}
	
	StudentRollCLLG(int r, String n){
		rollno = r;
		name = n;
	}
	
	
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}
