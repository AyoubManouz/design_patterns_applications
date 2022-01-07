package application;

public class Adresse {
    private int street;
    private String city;

    public Adresse(int street, String city) {
        this.street = street;
        this.city = city;
    }

    public int getStreet() {
        return street;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
