package javalearn.spring178.robot;

/**
 * Created by Igor on 12.07.2017.
 */
public class Robot {

    private Head head;
    private Body body;
    private String name;

    public Robot() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public Robot(Head head, Body body){
        this.head = head;
        this.body = body;

    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void action(){
        head.think();
        body.live();
        System.out.println("hello from robo");
    }

    public void action1(){
        System.out.println("action1");
    }

    public void init(){
        System.out.println("init");
    }
}
