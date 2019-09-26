package ew.demo.dao;

import ew.demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
       User selByName(String name);
}
