package overloading;

class over{
    int cal(int x, int y) {
        int z;
        z= x+y;
        System.out.println("Result is: "+z);
        return 0;
    }
    float cal(float m1, float m2){
        float mark;
        mark = m1+m2;
        System.out.println("The Mark is: "+mark);
        return 0;
    }
    int cal(int x){
        System.out.println(x);
        return 0;
    }
}

public class overload {
    public static void main(String[] args) {
        over s = new over();
        s.cal(22.43f,12.78f);
        s.cal(32);
        s.cal(10,20);

    }

}
