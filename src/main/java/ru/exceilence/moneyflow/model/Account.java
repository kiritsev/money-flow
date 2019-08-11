package ru.exceilence.moneyflow.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
public class Account {

    Integer id;
    String bank;
    String number;
    String user_id;

}
