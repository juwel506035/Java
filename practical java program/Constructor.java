package Constructor;
 class Student {
    int Roll;
    String Name;
    float Mark;
    public Student()//Constructor method
    {
        Roll = 506035;
        Name = "Rana ahmed jim";
        Mark = 80.58f;
    }
    void Display()
    {
        System.out.println("Roll is:"+Roll);
        System.out.println("Name is:"+Name);
        System.out.println("Mark is:"+Mark);
    }
    public static void main(String[]args){
        Student s=new Student();
        s.Display();

    }
}
