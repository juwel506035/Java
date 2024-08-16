import java.util.Scanner;
public class MultilevelInheritance {



    class Student {
        int Roll;
        String Name=new String();
        void GetData(){
            Roll = 506035;
            Name ="Rana ahmed jim";
        }
        void Display() {
            System.out.println("Inside Student class");
            System.out.println("Roll is:" + Roll);
            System.out.println("Name is:" + Name);

        }
    }
    class Exam extends Student {
        float Mark;
        @Override
        void Display() {
            System.out.println("Inside Student class");
            System.out.println("Mark is:" + Mark);
        }

        }
         class Result extends Exam {
             Student s = new Student();
             Exam e = new Exam();

             @Override
             void GetData() {
                 s.GetData();
                 e.getClass();
             }

             @Override
             void Display() {
                 s.Display();
                 e.Display();
             }
         }


