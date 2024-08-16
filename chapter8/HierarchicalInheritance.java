public class HierarchicalInheritance {
    class A {
        public void method() {
            System.out.println("metho of Class A");
        }
    }
    class B extends A {
        public void methodB() {
            System.out.println("method of ClassB");
        }
    }
    class C extends A {
        public void methodC() {
            System.out.println("method of ClassC");
        }
    }
    class D extends A  {
        public void methodD() {
            System.out.println("method of ClassD");
        }
    }
    public HierarchicalInheritance {
        public static void main (String[]args){
            B obj1 = new B();
            C obj2 = new C();
            D obj3 = new D();
            // All clasess can access the method of class A
            obj1.methodA();
            obj2.methodA();
            obj3.methodA();
        }
    }




