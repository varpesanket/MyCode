package accessSpecifier2;

 class CheckingSpecifier {
	 private int a= 100;
	 protected void m1() {
		 a=200;
		 System.out.println("This is default access specifier"+a);
	 }
	 static void m2() {
		 System.out.println("this is static method using for default access specifier");
	 }
	public static void main(String[] args) {
		CheckingSpecifier obj1 = new CheckingSpecifier();
		obj1.m1();
		m2();
		
		
	}
}
