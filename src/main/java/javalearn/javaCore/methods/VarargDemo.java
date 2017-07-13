package javaCore.methods;

/**
 * Created by Igor on 12.07.2017.
 */
public class VarargDemo {
    public static void main(String[] args) {
        fly(1,2,2,3,4,6,7,8,9);
    }

    public static void fly(int... ints){
        System.out.println(ints.length);
    }
}
