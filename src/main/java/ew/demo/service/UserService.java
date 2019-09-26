package ew.demo.service;
import ew.demo.dao.UserMapper;
import ew.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
    private UserMapper userMapper;
public User selByName(String name){
    return userMapper.selByName(name);
}
}
