package mdev.springframework.SFDI.Controllers;

import mdev.springframework.SFDI.Services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GetterInjectedController {
    private GreetingService greetingService;
    public String sayHello(){
        return greetingService.sayGreeting();
    }
    @Autowired
    public void setGreetingService(@Qualifier("getterGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
