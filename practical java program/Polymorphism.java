 package Inheritance;
 class Polymorphism {
     void demo (int a) {
         System.out.println("a:" + a);
     }
     void demo (int a,int b) {
         System.out.println("a and b:" + a + "," + b);
     }
      double demo(double a) {
          System.out.println("double a:" + a);
          return a * a;
      }
      public static void main(String[]args){
         Polymorphism Obj=new Polymorphism();
         double result;
         Obj.demo(10);
          Obj.demo(10,20);
          result=Obj.demo(5.5);
          System.out.println("O/P:"+result);

      }

}
