import java.io.*;
class ThrowsDemo{
 void method()throws IOException{
 System.out.println("Throws Exception")
 }
}


public class Testthrows2{
   public static void main(String args[]){
    try{
          ThrowsDemo m=new ThrowsDemo();
          m.method();

    }catch(Exception e){System.out.println("exception handled");}   

    System.out.println("normal flow...");
  }
}