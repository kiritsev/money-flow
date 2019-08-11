package ru.exceilence.moneyflow.web;

import org.springframework.web.bind.annotation.*;
import ru.exceilence.moneyflow.model.Account;
import ru.exceilence.moneyflow.model.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("info")
public class InfoController {

    @RequestMapping
    String showGeneralInfo() {
        return "Main page";
    }

    @RequestMapping(path = {"general", "general/{name}"})
    String showGeneralInfo(@PathVariable Optional<String> name) {
        String resultName = null;
        if ( ! name.isPresent() )
            resultName = "world";
        else
            resultName = name.get();
        return "Hello, " + resultName;
    }

    @RequestMapping("users")
    List<User> fetchUsers() {

        List<User> users = new ArrayList<User>();

        users.add( User.builder().id(1).name("Petr 1").date(new Date()).lastLogin(new Date()).password("123").build() );
        users.add( User.builder().id(2).name("Petr 2").date(new Date()).lastLogin(new Date()).password("123").build() );
        users.add( User.builder().id(3).name("Petr 3").date(new Date()).lastLogin(new Date()).password("123").build() );
        users.add( User.builder().id(4).name("Petr 4").date(new Date()).lastLogin(new Date()).password("123").build() );
        users.add( User.builder().id(5).name("Petr 5").date(new Date()).lastLogin(new Date()).password("123").build() );

        return users;
    }
}
