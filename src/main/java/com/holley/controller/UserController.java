package com.holley.controller;

import com.holley.Util.Logger;
import com.holley.enums.Level;
import com.holley.model.User;
import com.holley.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by Administrator on 2017/10/23.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    static Map<Long,User> users = Collections.synchronizedMap(new HashMap<Long,User>());

    @RequestMapping(value="/getuserlist", method = RequestMethod.GET)
    public List<User> getUserList(){

        User u = new User();
        u.setId(0);
        u.setName("digga");
        u.setAge(11);
        users.put(u.getId(),u);

        u = new User();
        u.setId(1);
        u.setName("digga");
        u.setAge(11);
        users.put(u.getId(),u);


        List<User> list = new ArrayList<User>(users.values());

        return list;
    }

    @RequestMapping(value = "/postuser", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user){
        users.put(user.getId(),user);
        return "create user " + user.getId() + " successful!";
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.PUT)
    public User getUser(@PathVariable Long id){
        return users.get(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public String putUser(@PathVariable Long id,@ModelAttribute User user){
        User u = users.get(id);
        u.setName(user.getName());
        u.setAge(user.getAge());
        users.put(id,u);
        return "update user " + id + " successful!";
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable Long id){
        users.remove(id);
        return "delete user" + id + " successful!";
    }


    @RequestMapping(value = "/add",method = RequestMethod.PUT)
    public String add(@ModelAttribute User user){
        logger.log(Level.INFO,"log info");
        return String.valueOf(userService.add(user));
    }

}
