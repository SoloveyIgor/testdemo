package javalearn.javaCore.ternary;

public class Ternary {
    public static void main(String[] args) {
        int number ;
        String text;

        number = 10;

        text = (number % 2 == 0) ? "четное" : "нечетное";
        System.out.println("Число " + number + " - " + text + "!");

        if (number % 2 == 0){
            text = "четное";
        }
        else text = "NO";

        System.out.println(text);
    }
}
