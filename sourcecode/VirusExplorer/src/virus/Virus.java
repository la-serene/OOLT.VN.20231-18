package virus;

abstract public class Virus {
    private String name;
    private final String ILLUSTRATION_PATH;
    private final String INFECTION_MECHANISM_PATH;

    public Virus(String name, String ILLUSTRATION_PATH, String INFECTION_MECHANISM_PATH) {
        this.name = name;
        this.ILLUSTRATION_PATH = ILLUSTRATION_PATH;
        this.INFECTION_MECHANISM_PATH = INFECTION_MECHANISM_PATH;
    }

    public String getName() {
        return name;
    }

    public String getIllustrationPath() {
        return ILLUSTRATION_PATH;
    }

    public String getInfectionMechanismPath() {
        return INFECTION_MECHANISM_PATH;
    }