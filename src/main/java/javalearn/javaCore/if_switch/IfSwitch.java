package javalearn.javaCore.if_switch;

public class IfSwitch {
    public static int i = 9;

    public static void main(String[] args) {
        switch (i) {
            case 0:
                System.out.println("0");
                break;
            case 9:
                System.out.println("2");
                break;

                default:
                    System.out.println(999999999);
        }
        if (i == 0) {
            System.out.println(22);
        }
        else System.out.println(1000000000);

    }
}
