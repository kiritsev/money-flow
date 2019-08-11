package ru.exceilence.moneyflow.web;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("xxx")
public class InfoRawController {

    @RequestMapping
    List<String> showGeneralInfo() {
        return new ArrayList<String>(Arrays.asList("1","2","3"));
    }

}
