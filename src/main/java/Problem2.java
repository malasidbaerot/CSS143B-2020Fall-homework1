public class Problem2 {
    public static void bubbleSort(int[] data) {
        for(int index=0;index<data.length-1;index++) {
            //goes through the indices of our array data
            for (int indexj = 0; indexj < data.length - index - 1; indexj++) {
                // goes through and compares a specific index to all the other indices
                if (data[indexj] > data[indexj + 1]) {
                    //if the current index is greater than the next it will trigger the sorting
                    int temp = data[indexj];
                    //created a temporary holder for the previous index
                    data[indexj] = data[indexj + 1];
                    //assign the future index to the previous index
                    data[indexj + 1] = temp;
                    //assign the temporarily held value to the future index

                }
            }
        }
    }

}
