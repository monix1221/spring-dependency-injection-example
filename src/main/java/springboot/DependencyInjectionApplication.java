package springboot;

import com.example.demo.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.demo")
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        /**
         * spring by default scans the package it is in
         * looking for annotations @Component, @Service, @Controller
         * --> to fix it, we can set @ComponentScan and tell spring
         *      where it should be looking for
         */

        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        GreetingController controller = (GreetingController) ctx.getBean("greetingController");
        controller.sayHello();

        /**
         * Spring profile lets spring resolve which bean to use
         * here using controller, spring wouldn't know which bean to use
         *
         * To use profile:
         * 1. annotate implementation with @Profile("profilename")
         * 2.set active profile in application.properties
         *
         */

    }

}
