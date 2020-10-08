import org.junit.Test;
//import the proper test
import static org.junit.Assert.*;
//importing the Assert library
public class Problem1Test {

    @Test
    // activates the test
    public void testBinarySearch() {
        int [][]inputs = {
                {},
                {3},
                {3},
                {1,3},
                {1,3},
                {4,6,8},
                {4,6,8},
                {4,6,8},
                {3,5,7,9,20},
                {3,5,7,9,20},
                // multiple inputs to plug into binarySearch
        };
        int [] targets = {9, 1, 3, 1, 3, 4, 6, 8, 3, 9};
        // targets for each input array
        int [] answer = {-1, -1, 0, 0, 1, 0, 1, 2, 0, 3};
        // the index of each target in our input arrays
        assertEquals(inputs.length, targets.length);
        assertEquals(inputs.length, answer.length);

        for (int i=0; i<inputs.length; i++) {
            //loop goes through each our input arrays and the targets to determine
            int actual = Problem1.binarySearch(inputs[i], targets[i]);
            int expected = answer[i];
            // goes through our answer array
            assertEquals(expected, actual);
            // checks to see if our expected and actual ints are equal

        }
    }
}
