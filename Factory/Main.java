package Factory;

public class Main {
    public static void main(String[] args) {
        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("other");
        obj.spec();
    }
}
