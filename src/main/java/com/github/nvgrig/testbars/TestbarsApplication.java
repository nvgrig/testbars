package com.github.nvgrig.testbars;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestbarsApplication {

    public static void main(String[] args) {
        //SpringApplication.run(TestbarsApplication.class, args);
        Application.launch(JavaFxApplication.class, args);
    }
}
