public class ClassObject {
    int roll = 10;
    String name = "jim";

    void Show() {
        System.out.print(roll + "\n" + name);
    }
}
     class Test{
         public static void main(String[]args){
            ClassObject s=new ClassObject();
            s.Show();
    }
}
