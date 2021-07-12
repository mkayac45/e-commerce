package com.mkayacdev.ecommerce.user.dto.converter;

import com.mkayacdev.ecommerce.user.dto.UserDto;
import com.mkayacdev.ecommerce.user.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter {

    public static UserDto convert(User from){
        return new UserDto(from.getMail(),from.getFirstName(),from.getSurname(),from.getMiddleName());
    }
}
