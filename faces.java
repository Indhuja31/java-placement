interface Calling {
    void call();
}
interface Camera {
    void takePhoto();
}
class phone implements Calling, Camera {

    public void call() {
        System.out.println("Calling someone...");
    }

    public void takePhoto() {
        System.out.println("Taking a photo...");
    }
}
public class faces {
    public static void main(String[] args) {
        phone p = new phone();
        p.call();
        p.takePhoto();
    }
}