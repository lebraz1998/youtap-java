package com.youtap.test.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.youtap.test.service.UserService;
import com.youtap.test.type.UserInterface;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getusercontacts")
public class UserController {
    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/{args}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Object findOne(@PathVariable Object args) throws JsonProcessingException {

        try {
            var result = this.userService.findById(Integer.parseInt(args.toString()));
            return result == null ? new JSONObject().put("id", -1).toString() : result;

        } catch (Exception e) {
            var result = this.userService.findByUsername((String) args);

            return result == null ? new JSONObject().put("id", -1).toString() : result;

        }


    }


}
