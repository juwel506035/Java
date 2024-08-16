public class Student {
    private int Roll;
    private String Name;
    private float Mark;
    private void GetData() {
        Roll = 506035;
        Name = "Rana ahmed jim";
        Mark = 85.25f;
    }
    void Display() {
        GetData();
        System.out.println("Roll is:" + Roll);
        System.out.println("Name is:" + Name);
        System.out.println("Mark is:" + Mark);
    }
    public static void main(String[]args){
        Student s=new Student();
        s.Display();

    }
}
