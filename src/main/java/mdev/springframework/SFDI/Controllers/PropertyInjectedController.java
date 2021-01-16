package mdev.springframework.SFDI.Controllers;


import mdev.springframework.SFDI.Services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
