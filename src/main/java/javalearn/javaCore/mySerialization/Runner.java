package javalearn.javaCore.mySerialization;

import java.io.InvalidObjectException;

public class Runner {
    public static void main(String[] args) {

        Student student = new Student("Faculty X", "Bob", 123, "xxx");
        System.out.println(student + "\n-----------");

        String file = "C:\\Users\\Igor\\IdeaProjects\\testdemo\\src\\main\\java\\javalearn\\javaCore\\mySerialization\\demo.data";
        Serializator st = new Serializator();
        boolean b = st.serialization(student, file);
        System.out.println(b +"\n-----------");

        Student.faculty = "TTT";
        System.out.println(student + "\n-----------");

        Student result = null;

        try {
            result = st.deselialization(file);

            }
            catch (InvalidObjectException e){
            e.printStackTrace();
        }
        System.out.println(result + "\n-----------------");

    }
}

