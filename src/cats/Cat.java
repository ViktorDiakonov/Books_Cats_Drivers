package cats;

public class Cat {
    public String city;
    public String colour;
    public String name;

    public Cat(String city, String colour, String name) {
        this.city = city;
        this.colour = colour;
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "city = " + city +
                ", colour = " + colour +
                ", name = " + name + "\n";
    }
}