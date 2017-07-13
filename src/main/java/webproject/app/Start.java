package webproject.app;

import javalearn.spring178.robot.Robot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javalearn.spring178.*;

public class Start {
    public static void main(String[] args) {

        ApplicationContext aContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        Robot robot = (Robot) aContext.getBean("1") ;

        robot.action();
    }
}
