package com.itlowry;

import com.itlowry.dto.UserRequest;
import com.itlowry.dto.UserResponse;
import com.itlowry.services.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class UserConsumer {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:user-consumer.xml");
        context.start();
        IUserService userService = context.getBean("userService", IUserService.class);

        UserRequest request = new UserRequest();
        request.setUid("123456");
        UserResponse userResponse = userService.getUser(request);

        System.out.println("========================================");
        System.out.println(userResponse);
        System.out.println("========================================");

        System.in.read();
    }

}
