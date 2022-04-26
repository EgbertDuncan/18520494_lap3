package uit.projectfinal.a18520494_lap3;


public class User {
    private String name;
    private String hometown;

    public User(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}