package ua.napps.scorekeeper.counters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    Counter counter;
    Counter counter2;
    @Before
    public void set() {
    counter = new Counter("Futbal","black");
    counter2 = new Counter("Tenis", "white");
    counter.setValue(10);
    }

    @Test
    public void getRightColor() {
        assertEquals(counter.getColor(), "black");
        assertEquals(counter2.getColor(), "white");
    }

    @Test
    public void getWrongColor() {
        assertNotEquals(counter.getColor(), "white");
        assertNotEquals(counter2.getColor(), "black");
    }

    @Test
    public void getRightName() {
        assertEquals(counter.getName(), "Futbal");
        assertEquals(counter2.getName(), "Tenis");
    }

    @Test
    public void getWrongName() {
        assertNotEquals(counter.getName(), "Tenis");
        assertNotEquals(counter2.getName(), "Futbal");
    }

    @Test
    public void getValue() {
        assertEquals(counter.getValue(), 10);
        assertEquals(counter2.getValue(), 0);
    }
}