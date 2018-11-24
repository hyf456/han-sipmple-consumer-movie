package com.han.cloud.entity;





import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @ClassName User
 * @Description TODO
 * @Author hanyf
 * @Date 2018\11\4 0004 19:13
 * @Version 1.0
 **/
@Data
@ToString
public class User implements Serializable {
    private Long id;
    private String username;
    private String name;
    private Short age;
    private BigDecimal balance;
}
