package ua.napps.scorekeeper.counters;

import org.junit.Before;
import org.junit.Test;
import ua.napps.scorekeeper.counters.CountersDao;

public class CountersDaoTest {

    Counter counter;
    Counter counter2;
    Counter counter3;

    @Before
    public void setUp(){
    counter = new Counter("Futbal", "black");
    counter2 = new Counter("Hokej", "blue");
    counter3 = new Counter("Tenis", "green");
    }

    @Test
    public void deleteAll() {

    }

    @Test
    public void deleteCounter() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void modifyColor() {
    }

    @Test
    public void modifyDefaultValue() {
    }

    @Test
    public void modifyName() {
    }

    @Test
    public void modifyStep() {
    }

    @Test
    public void modifyValue() {
    }

}