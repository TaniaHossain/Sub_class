class Super_class {
   int age, num = 20;
   public void display() {
      System.out.println("This is the display method of SuperClass");
   }
   Super_class(int age) {
	      this.age = age; 		 
	   }
   public void getAge() {
	      System.out.println("The value of the variable named Age in Super Class is: " +age);
	   }
}
public class Sub_class extends Super_class {
   static int num = 10;
   public void display() {
      System.out.println("This is the display method of SubClass");
   }
   Sub_class(int age) {
	      super(age);
	   }
   public void my_method() {
      Sub_class sub = new Sub_class(num);
      sub.display();
      super.display();
      System.out.println("value of the variable named Num in Sub Class:"+ Sub_class.num);
      System.out.println("value of the variable named Num in Super Class:"+ super.num);
   }
   public static void main(String args[]) {
      Sub_class obj = new Sub_class(num);
      obj.my_method();
      Sub_class s = new Sub_class(24);
      s.getAge();
   }
}