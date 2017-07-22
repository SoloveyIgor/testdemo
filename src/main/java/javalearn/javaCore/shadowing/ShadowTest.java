package javalearn.javaCore.shadowing;

public class ShadowTest {
    public int x = 0;

    class FirstLevel{
        int x = 1;
        void firstmethod(int x){
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(ShadowTest.this.x);
        }
        void doSmth(){
              final int x = 10;
                class MemberLocal{
                    MemberLocal(){
                        System.out.println(x);
                    }
            }
        }
    }

    public static void main(String[] args) {
        ShadowTest shadowTest = new ShadowTest();
        FirstLevel firstLevel = shadowTest.new FirstLevel();
        firstLevel.doSmth();
    }
}
