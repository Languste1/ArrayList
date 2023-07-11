package Comparator;

public class Kontakt {

    private String name;
    private String nachName;

    public Kontakt(String name, String nachName) {
        this.name = name;
        this.nachName = nachName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }
}
