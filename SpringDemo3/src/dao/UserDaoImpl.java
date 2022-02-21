package dao;

import org.springframework.stereotype.Repository;

/**
 * @ClassName UserDaoImpl
 * @Description TODO
 * @Author Xinwei Lu
 * @Date 2022/2/20 21:14
 * @Version 1.0
 */

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("DAO add....");
    }
}
