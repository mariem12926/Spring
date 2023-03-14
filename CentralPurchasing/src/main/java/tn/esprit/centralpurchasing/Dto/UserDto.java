package tn.esprit.centralpurchasing.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import tn.esprit.centralpurchasing.Entities.Sexe;

import javax.persistence.Lob;
import javax.validation.constraints.NotEmpty;

@Data @Getter @Setter
public class UserDto {

    @NotEmpty
    private String email;
    @NotEmpty
    private String password;


    @JsonIgnore
    String firstname;
    @JsonIgnore
    String lastname;
    @Lob @JsonIgnore
    String photo;
    @JsonIgnore
    String phoneNumber;
    @JsonIgnore
    Sexe sexe;
    // reset password
    @JsonIgnore
    String codeTel;
    @JsonIgnore
    String resetToken;


    // setings of account
    @JsonIgnore
    Boolean isAccountNonLocked=true;
    @JsonIgnore
    Boolean isAccountNonExpired=true;
    @JsonIgnore
    Boolean isCredentialsNonExpired=true;
    @JsonIgnore
    Boolean isEnabled=false;
    @JsonIgnore
    String activateCode;
}
