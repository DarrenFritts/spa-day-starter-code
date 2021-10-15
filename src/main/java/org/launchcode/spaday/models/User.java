package org.launchcode.spaday.models;

import javax.validation.constraints.*;

public class User {
    @NotNull(message="username cannot be null")
    @NotBlank(message="username cannot be blank")
    @NotEmpty(message = "username cannot be empty")
    @Size(min = 5, max = 15, message = "username needs to be between 5-15 characters")
    private String username;

    @NotNull(message="email cannot be null")
    @Email
    private String email;

    @NotNull(message="password cannot be null")
    @Size(min = 6, message = "password must be at least 6 characters")
    private String password;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
