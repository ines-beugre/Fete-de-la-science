package mm.ccn2.istic.fr.fetedelamusique.models;

public class Event {

    private String title;
    private String thematic;
    private String city;
    private String description;

    public Event() {
    }

    public Event(String title, String thematic, String city, String description) {
        this.title = title;
        this.thematic = thematic;
        this.city = city;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThematic() {
        return thematic;
    }

    public void setThematic(String thematic) {
        this.thematic = thematic;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
