import java.util.Observer;

public interface Notifier {
    void addObserver(Channel ch);
    void removeObserver(Channel ch);
    void notifyObserver();

}
