import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

/**
 * @author dani
 */
public class SubjectImplTest {

    private List<Observer> observers;
    private SubjectImpl subject;
    private Observer observer;

    @Before
    public void instantiate() {
        subject = new SubjectImpl();
        observers = subject.getObservers();
        observer = new ExampleObserver();
    }

    @Test
    public void testAdd() {
        subject.addObserver(observer);

        assertEquals(observers.size(), 1);
        assertEquals(observers.get(0), observer);
    }

    @Test
    public void testEmit() {
        Event event = new ExampleEvent("it was all a dream");
        Observer spy = spy(observer);
        subject.addObserver(spy);

        subject.emit(event);
        verify(spy).onEvent(event);
    }
}
