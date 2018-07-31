package com.usher.book.entity;

import lombok.Data;
import org.springframework.beans.factory.BeanNameAware;

@Data
public class User{
    private String username;
    private String password;
}
