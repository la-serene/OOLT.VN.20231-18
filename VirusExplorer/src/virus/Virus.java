package virus;

abstract public class Virus {
    public String name;
    public final String ILLUSTRATION_PATH;
    public final String description = "";
    public final String INFECTION_MECHANISM_PATH;
    public Virus(String name, String ILLUSTRATION_PATH, String INFECTION_MECHANISM_PATH) {
        this.name = name;
        this.ILLUSTRATION_PATH = ILLUSTRATION_PATH;
        this.INFECTION_MECHANISM_PATH = INFECTION_MECHANISM_PATH;
    }
}
