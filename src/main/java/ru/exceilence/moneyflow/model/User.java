package ru.exceilence.moneyflow.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class User {
    Integer id;
    String name;
    String password;
    Date date;
    Date lastLogin;
}
