package javaCore.methods;

public class Child extends Parent{

    void test(){
        System.out.println("... from Child");
    }

    void testSup(){
        super.test();
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.test();

        Parent parent = new Parent();
        parent.test();

        System.out.println(parent.getClass());

        parent = child;
        parent.test();

        child.testSup();

        System.out.println(parent.getClass());
    }
}
