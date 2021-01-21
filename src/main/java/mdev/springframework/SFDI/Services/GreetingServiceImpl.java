package mdev.springframework.SFDI.Services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{
    public static final String HELLO_MDEV = "Hello Fellows! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_MDEV;
    }
}
