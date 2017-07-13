package javalearn.spring178.robot;

/**
 * Created by Igor on 12.07.2017.
 */
public class Robot {

    private Head head;
    private Body body;

    public Robot(Head head, Body body){
        this.head = head;
        this.body = body;
    }

    public void action(){
        head.think();
        body.live();
        System.out.println("hello from robo");
    }
}
