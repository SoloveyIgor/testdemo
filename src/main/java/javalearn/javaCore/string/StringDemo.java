package javalearn.javaCore.demoString;

import java.util.Properties;

public class StringDemo {
    public static void main(String[] args) {
        String str = "0123456789stRing12345string";
        System.out.println(str);
        System.out.println("-------------");

//        System.out.println(str.substring(10));
//        System.out.println(str.substring(10,16));
//        System.out.println();

//        Properties properties = System.getProperties();
//        System.out.println(properties);
//        System.out.println();
//        String[] s = str.split("4");
//        System.out.println(s.toString());
//        System.out.println(str);



    }

    @Override
    public String toString() {
        return super.toString();
    }
    public void reverse(){
        String str = "tel";
        String srt = "";
        str.toCharArray();

        for (int i = str.length()-1; i > -1; i--){
            System.out.print(str.charAt(i));
            srt = srt +str.charAt(i);
        }
    }
}
