package ranaahmed.jim;
public interface Student {
    static final int Roll=506035;
    static final String Name="Rana ahmed jim";
    void Display();
}
class Result implements Student {
    public void Display() {
        System.out.println("Roll is:" + Roll);
        System.out.println("Name is:" + Name);
    }
     public void Getmark(){
        Mark=80.52f;

    }
public void ShowMark(){
   System.out.println("Mark is:"+Mark);
    }
    }
    public class inter{
        public static void main(String[]args){
            Result R=new Result();
            R.Display();
            R.Getmark();
            R.ShowMark();
    }



    }