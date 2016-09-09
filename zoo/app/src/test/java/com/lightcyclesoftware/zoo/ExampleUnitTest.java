package com.lightcyclesoftware.zoo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void species_count_isCorrect() throws Exception {
        Tiger tiger1 = new Tiger();
        assert (tiger1.speciesCount == 1);
        Tiger tiger2 = new Tiger();
        assert (tiger1.speciesCount == 2);
        assert (tiger2.speciesCount == 2);
        Monkey monkey1 = new Monkey();
        assert (tiger1.speciesCount == 2);
        assert (tiger2.speciesCount == 2);
        assert (monkey1.speciesCount == 1);
    }
    @Test
    public void only_monkey_canPlay() throws Exception {
        Monkey monkey = new Monkey();
        Tiger tiger = new Tiger();
        Snake snake = new Snake();

        assert(monkey.canPlay);
        assert(!tiger.canPlay);
        assert(!snake.canPlay);

        monkey.play();
        monkey.sleep();
        monkey.play();

    }
}