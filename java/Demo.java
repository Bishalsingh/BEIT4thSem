public class Demo{
   public void getAge() {
      int age = 0;
      age = age + 7;
      System.out.println("Getting Demo age as value : " + age);
   }

   public static void main(String args[]) {
      Demo demo = new Demo();  //object declaration
      demo.getAge();
   }
}