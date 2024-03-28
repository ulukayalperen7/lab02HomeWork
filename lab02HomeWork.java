import java.util.Date;

public class lab02HomeWork {
    public static void main(String[] args) {

    }
}

class Ticket {

    private City from;
    private City to;
    private java.util.Date date;
    private int seat;

    public Ticket(City from, City to, Date date, int seat) {

        setDate(date);
        setSeat(seat);
        this.from = from;
        this.to = to;
    }

    public Ticket(City from, City to, int seat) {

        this.from = from;
        this.to = to;
        setSeat(seat);
        this.date = new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000);
    }

    public City getFrom() {
        return from;
    }

    public City getTo() {
        return to;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}

class City {

    private String postalCode;
    private String name;

    public City(String postalCode, String name) {
        this.name = name;
        this.postalCode = postalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getName() {
        return name;
    }
}

class Person {

    private String name;
    private String surname;
    private String phoneNumber;

    public Person(String name, String surname, String phoneNumber) {

        this.name = name;
        this.surname = surname;
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}