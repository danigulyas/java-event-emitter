import java.util.List;

/**
 * @author dani
 */
public interface Subject {
    List<Observer> getObservers();
    void addObserver(Observer observer);
    void emit(Event event);
}
