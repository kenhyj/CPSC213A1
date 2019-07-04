package arch.sm213.machine.student;


import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class MainMemoryTest {


    // since it's std to use 4 bytes, we'll test it for size 4 for memory alignment
    private MainMemory memory;

    @Before
    public void runBefore() {
        memory = new MainMemory(4);
    }

    @Test
    public void testisAccessAligned0() {
        // since it's std to use 4 bytes, we'll test it for size 4 for memory alignment
        // since 4 is very small, we'll test 0,1,2,3,4... the rest is redundant so
        assertTrue(memory.isAccessAligned(0, 4)); // base case
        assertFalse(memory.isAccessAligned(1, 4)); // base case
        assertFalse(memory.isAccessAligned(2, 4)); // base case
        assertFalse(memory.isAccessAligned(3, 4)); // base case
        assertTrue(memory.isAccessAligned(4, 4)); //just in case multiples of fours fail after base case.
    }


    @Test
    public void testbytesToInteger(){
        //TODO
    }

}
