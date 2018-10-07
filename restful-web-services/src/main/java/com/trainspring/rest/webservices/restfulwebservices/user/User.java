package com.trainspring.rest.webservices.restfulwebservices.user;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@ApiModel(description = "Defines the user")
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=2,message="Name should have atleast 2 characters")
    private String name;

    @Past
    @ApiModelProperty(notes="Birthdate should be >current time")
    private Date birthDate;



    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User(Integer id, String name, Date birthDate) {
        this.id = id;


        this.name = name;

        this.birthDate = birthDate;
    }

    protected User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

}
