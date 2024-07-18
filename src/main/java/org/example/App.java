package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
// Use Java class configuration
        //   ApplicationContext context = new  AnnotationConfigApplicationContext(AppConfig.class);
//        SpringCoreApp springCoreApp = context.getBean(SpringCoreApp.class);
//        System.out.println("with class config:");
//        springCoreApp.saySpringCoreApp();


       //  If you are using XML configuration
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        SpringCoreApp springCoreAppWithXmlConfig = applicationContext.getBean(SpringCoreApp.class);
        System.out.println("with xml config:");
        springCoreAppWithXmlConfig.saySpringCoreApp();
        System.out.println("Hello World!");


     //  Logger in spring core with class config example
//      ApplicationContext loggerExampleWithContext = new  AnnotationConfigApplicationContext(SpringLoggerExample.class);
//      SpringLoggerExample springLoggerExample = loggerExampleWithContext.getBean(SpringLoggerExample.class);
//      springLoggerExample.logMessages();







    }
}
