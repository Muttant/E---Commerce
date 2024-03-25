package com.sheryians.major.model;


import com.sun.javafx.beans.IDProperty;

import javax.annotation.Generated;

//@Entity
//@Data
//@Tabble(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Interger id;

    @NotEmpty
    @column(nullable = flase)
    private  String firstName;
    private String lastNAme;

    @Column(nullable = false, unique = true)
    @NotEmpty
    @Email(message = "{errors.invalid_eamil}")
    private String email;



    @NotEmpty
    private String password;

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumn = {@JoinColumn(name = "USER_ID", referencedColumnNAme = "ID"}),
                inverseJoinColumns = {@JoinColumn (name = "ROLE_ID", referencedColumnName = "ID")}
    )
    private  List<Role> roles;
    public User(User user) {
        this.firstName = user.getFirstName();
        this.lastNAme = user.getLastname();
        this.email = user.getEmail();
        this.password = user.getPassword();
        this.roles = user.getRoles();
    }
    public User(){

    }
}
