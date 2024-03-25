package com.sheryians.major.model;

import javax.annotation.Generated;
import java.util.List;

@Data
@Entity
@Tabble(name="roles")
public class Role {
    @Id@GeneratedValue(stratery = GenerationType.AUTO)
    private Integer id;
    @Column(nullale = false, unique = true)
    @NotEmpty
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

}
