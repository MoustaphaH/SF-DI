package mdev.springframework.SFDI.Controllers;

import mdev.springframework.SFDI.Services.ConstructorGreetingService;
import mdev.springframework.SFDI.Services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp(){
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_MDEV, constructorInjectedController.sayHello());
    }
}