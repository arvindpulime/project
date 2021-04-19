package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String Name;

    private String email;
    
    @Column(name = "result")
    private String Result;

    public User() {

    }

    public User(String Name, String email,  String Result) {
        super();
        this.Name = Name;
        this.email = email;
        this.Result = Result;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getResult() {
        return Result;
    }
    public void setResult(String Result) {
        this.Result = Result;
    }
    
}