package javaCore.methods;

import java.io.IOException;

public class SuperCL {

    protected void drive(){}    // сужать мод. доступа в дочерних классах нельзя

    public void swim() throws Exception{}

    public void swim2() throws IOException {}

    public void swim3(){}

    String getStr() {return  "";}

    Number getNum(){return 1;}

    private void go(){}

    static void stat(){
        System.out.println("1");
    }
}
