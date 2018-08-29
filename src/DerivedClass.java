
public class DerivedClass extends BaseClass {

public void m1() {
	System.out.println("this is derived class method");
}
public static void main(String[] args) {
	DerivedClass dc = new DerivedClass();
	dc.m1();
	dc.m2();
}
}
