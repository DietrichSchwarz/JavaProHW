package hm3.task1;

public class Staff {
    private String name;
    private String surname;
    private String position;
    private String email;
    private int age;
    private String phonenumber;

    public Staff(String name, String surname, String position, String email, int age, String phonenumber) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.age = age;
        this.phonenumber = phonenumber;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}

