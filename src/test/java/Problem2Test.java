import org.junit.Test;
//importing junit test
import static org.junit.Assert.*;
//importing assert library
public class Problem2Test {
    @Test
    public void testBubbleSort() {
        int[] [] data= {{1,3,2,4,5},{1,3,2},{2,1},{1}};
        // an array holding multiple arrays that are unsorted
        int [] [] actual= {{1,2,3,4,5},{1,2,3},{1,2},{1}};
        //an array of the previous arrays but sorted
        assertEquals(data.length,actual.length);
        //checks to see if the lengths of the arrays are the same
        for (int i=0;i<data.length;i++) {
            //for loop goes through each multiple array
            Problem2.bubbleSort(data[i]);
            //takes the value of our data array and puts it through the bubble sort function
            assertArrayEquals(actual[i],data[i]);
            //checks to see if the new data arrays are the same as the manually (actual) sorted array
        }
    }
}
