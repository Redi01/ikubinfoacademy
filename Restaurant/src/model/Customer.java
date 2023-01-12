package model;

import java.time.LocalDate;

public class Customer {
    private static int ID = 0;
    private int id;
    private String name;
    private String lastName;
    private LocalDate createdOn;
    private String email;
    private LocalDate birthday;

    public Customer(String name, String lastName, LocalDate createdOn, String email, LocalDate birthday) {
        ID++;
        this.id = ID;
        this.name = name;
        this.lastName = lastName;
        this.createdOn = createdOn;
        this.email = email;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", createdOn=" + createdOn +
                ", email='" + email + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
