package pl.sda.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class UserDto implements Serializable {


    private Long id;
    //@NotEmpty - adnotacja ogólna do Stringa
    @Email(regexp = "^[a-zA-Z_#0-9]+@[a-zA-Z]+(\\.){1}[a-zA-Z]+$", message = "{username.size.invalid}")
    private String username;
    @Size(min = 4, max = 20, message = "{password.size.invalid}")
    private String password;
    private String confirmedPassword;
    private String name;
    private String surname;
    private String address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}







