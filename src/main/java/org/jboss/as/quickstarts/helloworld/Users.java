package org.jboss.as.quickstarts.helloworld;

import org.hibernate.annotations.Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

//@Entity
@Table(name = "user1")
public class Users extends God implements Serializable{

    private Long id;
    private String name;
    private String surname;
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    //@Column(name = "name")
    public void setName(String Name) {
        this.name = Name;
    }
    public String getName() {
        return name;
    }

    //@Column(name = "surname")
    public void setSurname(String Surname) {
        this.surname = Surname;
    }
    public String getSurname() {
        return surname;
    }

    //@Column(name = "email")
    public void setEmail(String Email) {
        this.email = Email;
    }
    public String getEmail() {
        return email;
    }
}
