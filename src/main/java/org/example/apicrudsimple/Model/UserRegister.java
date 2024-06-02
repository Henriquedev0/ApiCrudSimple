package org.example.apicrudsimple.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegister {
    private String userId;
    private String userName;
    private String userAddress;
    private String userPhoneNumber;
}
