package org.lapotski.normandynexus.users;

/**
 *
 * @author Kyla Dessirei Dequito
 * @version 2.0
 *
 */

public abstract class User {
    private String username;
    private String password;

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);
    }

    // getters and setters
    public String getUsername() { return username; }
    public void setUsername(String username) {
        if (username == null || username.trim().isEmpty())
            throw new IllegalArgumentException("Username cannot be empty");
        this.username = username;
    }

    public String getPassword() { return password; }
    public void setPassword(String password) {
        if (password == null || password.trim().isEmpty())
            throw new IllegalArgumentException("Password cannot be empty");
        this.password = password;
    }

    // Abstract method: force subclasses to define how they login
    public abstract boolean login(String username, String password);
}
