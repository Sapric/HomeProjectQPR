package pl.luxoft.qpr.bilykov.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ChangePasswordRequestToken {

       private String email;
       private Date expirationTime;

}
