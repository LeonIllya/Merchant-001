package app;

// Модель объекта Продавца.
public class Merchant {

    private final String name;
    private final String surname;
    private final String phone;

    public Merchant(String name, String phone, String surname) {
        this.name = name;
        this.phone = phone;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurname(){return surname;}
}
