package javalearn.spring178.robot;

public class RobotConstructor {


    public static void main(String[] args) {




        HeadAsus headAsus = new HeadAsus();
        BodySony bodySony = new BodySony();

        Robot robot = new Robot(headAsus, bodySony);

        robot.action();

    }


}
