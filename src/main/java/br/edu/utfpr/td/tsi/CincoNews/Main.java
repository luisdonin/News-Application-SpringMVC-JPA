package br.edu.utfpr.td.tsi.CincoNews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource({ "file:./application.properties" })
@ImportResource({ "file:./applicationContext.xml" })
public class Main {

    public static void main(String[] args) {
        System.setProperty("server.servlet.context-path", "/cinconews");
        SpringApplication.run(Main.class, args);
    }
}
