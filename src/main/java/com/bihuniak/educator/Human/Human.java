package com.bihuniak.educator.Human;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Human {
    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String LastName;
    @Enumerated(value = EnumType.STRING)
    private Sex sex;
    private Date birthday;

    public Human() {
    }


    public Human(String firstName, String lastName, Sex sex, Date birthday) {
        this.firstName = firstName;
        LastName = lastName;
        this.sex = sex;
        this.birthday = birthday;
    }
}


