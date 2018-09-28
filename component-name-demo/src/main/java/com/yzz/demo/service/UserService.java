package com.yzz.demo.service;

import com.yzz.demo.model.UserEntity;
import com.yzz.demo.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * test print
     */
    public void testPrint() {

        /*UserEntity entity = new UserEntity();
        entity.setId(UUID.randomUUID().toString());
        entity.setName("yzz");

        this.userRepository.save(entity);*/

        List<UserEntity> entities = this.userRepository.findAll();

        for (UserEntity entity : entities) {
            System.out.println(entity.getId() + "," + entity.getName());
        }

        System.out.println("test print in service...........");
    }

}
