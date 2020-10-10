package pl.sda.model;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(unique = true)
    private String username;

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private String address;

    @Column
    private boolean enabled;

    @Column
    @Enumerated(EnumType.STRING)
    private UserRoleType role;

    public User(){

    }
    public User(String username, String password, String name, String surname, String address) {
        this.username = username;
        this.password = password;
        this.enabled = true;
        this.role = UserRoleType.USER;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }
}
