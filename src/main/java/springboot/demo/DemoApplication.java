package springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println("helloword");
        SpringApplication.run(DemoApplication.class, args);

        System.out.println("hello world");
        //comment
        //comment2
    }

}
