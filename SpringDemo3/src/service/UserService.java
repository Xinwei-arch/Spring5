package service;

import dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserService
 * @Description TODO
 * @Author Xinwei Lu
 * @Date 2022/2/20 21:17
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    @Qualifier(value = "userDaoImpl1")
    private UserDao userDao;

    @Value(value = "abc")
    private String name;

    public void add() {
        System.out.println("service add....");
        System.out.println(name);
        userDao.add();
    }
}
