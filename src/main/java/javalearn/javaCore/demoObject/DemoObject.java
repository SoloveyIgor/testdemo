package javalearn.javaCore.demoObject;

public class DemoObject {
    public String name = "W";

//    public String getName() {
//        return name;
//    }


    @Override
    public String toString() {
        return "DemoObject{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        return name == name;
    }

    @Override
    public int hashCode() {

        return name.hashCode();
    }
}
