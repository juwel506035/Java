package construct;

class Student{
    int Roll;
    String Name;
    float Mark;
    public Student(){
        Roll = 609002;
        Name = "Tajmirul";
        Mark = 99.9f;
        System.out.println("Roll is :"+Roll);
        System.out.println("Name is: "+Name);
        System.out.println("Mark is: "+Mark);

    }
}

public class construct {
    public static void main(String[] args) {
        Student student = new Student();
    }
}
