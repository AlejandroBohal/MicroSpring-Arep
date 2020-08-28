package edu.eci.arep.microspring;

public class ExampleController {
    @RequestMapping("/hello")
    public static String index(){
        return "Greetings from Micro Spring Boot";
    }
}