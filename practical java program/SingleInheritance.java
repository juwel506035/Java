 import java.util.Scanner;

    class Student {
        int Roll;
        String Name;
    }
     class Result extends Student {
         float Mark;

         void GetData() {
             Roll = 506035;
             Name = "Rana ahmed jim";
             Mark = 80.5f;
         }

         void Display() {
             System.out.println("Roll is:" + Roll);
             System.out.println("Name is:" + Name);
             System.out.println("Mark is:" + Mark);
         }
     }
          class Inheritance{
            public static void main(String[]args) {
             Result R = new Result();
             R.GetData();
             R.Display();

    }
}
