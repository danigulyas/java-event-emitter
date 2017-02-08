import lombok.Getter;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author dani
 */
public class SubjectImpl implements Subject {
    @Getter private List<Observer> observers;

    public SubjectImpl() {
        observers = new CopyOnWriteArrayList();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void emit(Event event) {
        this.observers.forEach((observer) -> observer.onEvent(event));
    }
}
