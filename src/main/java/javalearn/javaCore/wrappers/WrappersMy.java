package javalearn.javaCore.wrappers;

public class WrappersMy {
    public static void main(String[] args) {
        String s = "100";

        try{
            int a = Integer.parseInt(s);
            int b = Integer.valueOf(s);
            int c = new Integer(s);
        }
        catch(NumberFormatException e){
            System.out.println("Wrong format" + e);
        }
        
    }
}
