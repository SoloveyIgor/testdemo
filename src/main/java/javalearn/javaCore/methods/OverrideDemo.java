package javaCore.methods;
import java.io.IOException;

public class OverrideDemo extends SuperCL {

    public void drive(){
        System.out.println("...");
    }   // сужать мод. доступа в дочерних классах нельзя
//    void drive(){}       сужение с protected до default ОШИБКА
//    private void drive(){}    сужение с protected до PRIVATE ОШИБКА

    public void swim() throws IOException{} //расширять исключения нельзя
//    public void swim() throws Throwable{} расширение исключения ОШИБКА

    public void swim2(){}   //сужнение исключений (без)

//    public void swim2() throws Exception{}

//    public void swim3() throws Exception{}

    String getStr(){return "HELLO";} // простой override
//    Integer getStr(){return null;} менять возвращаемый тип нельзя

    Double getNum(){return 11.1;} //double является наследником number

    public void go(){} //расширять мод доступа можно

    static void stat(){
        System.out.println("st");
    }

//     void stat(){System.out.println("st");}  менять со статика нельзя

}
