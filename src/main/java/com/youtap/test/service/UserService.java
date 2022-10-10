package com.youtap.test.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.youtap.test.FakeData;
import com.youtap.test.type.UserInterface;
import org.springframework.stereotype.Service;

@Service
public class UserService {
final FakeData fakeData=new FakeData();
    public UserInterface findById(int id ) throws JsonProcessingException {
      return    fakeData.getUserById(id);
    }

    public UserInterface findByUsername(String username ) throws JsonProcessingException {
        return    fakeData.getUserByUsername(username);
    }

}
