public class TooShortNameException extends Exception {

    public String name;

    public TooShortNameException(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
