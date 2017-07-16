package webproject.app;

import javalearn.spring178.robot.Robot;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javalearn.spring178.*;
import webproject.HibernateUtil;

public class Start {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionfactory();

//        ApplicationContext aContext = new ClassPathXmlApplicationContext("allContext.xml");
//
//      Robot robot = (Robot) aContext.getBean("start") ;
//        Robot robot1 = (Robot) aContext.getBean("second");
//        System.out.println(robot1);
//
//        robot.action();
//        robot1.action1();
//        robot1.init();

    }
}
