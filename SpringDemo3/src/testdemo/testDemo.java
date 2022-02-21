package testdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @ClassName testDemo
 * @Description TODO
 * @Author Xinwei Lu
 * @Date 2022/2/20 21:19
 * @Version 1.0
 */
public class testDemo {

    @Test
    public void testService() {
        ApplicationContext ap = new ClassPathXmlApplicationContext("bean1.xml");
        UserService us = ap.getBean("userService", UserService.class);
        us.add();
    }

    @Test
    public void testService2() {
        System.out.println("test");
    }

    @Test
    public void testService3() {
        System.out.println("fix3");
    }

}
