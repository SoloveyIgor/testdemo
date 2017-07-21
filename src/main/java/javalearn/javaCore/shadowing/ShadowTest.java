package javalearn.javaCore.shadowing;

public class ShadowingDemo {
    public int x = 0;

    class FirstLevel{
        int x = 10;
        void firstmethod(int x){
            System.out.println(x);
            System.out.println();
        }
    }
}
