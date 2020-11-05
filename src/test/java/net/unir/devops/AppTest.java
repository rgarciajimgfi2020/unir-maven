package net.unir.devops;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void intSumWorks()
    {
        assertEquals(App.sum(1, 2), 3);
    }

    @Test
    public void fractionSumWorks()
    {
        assertEquals(App.sum(1, 2, 3, 2), 2.0, 0.00001);
    }
}
