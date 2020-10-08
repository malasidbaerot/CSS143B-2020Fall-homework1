public class Problem1 {
    public static int binarySearch(int[] data, int target) {
        int end = data.length - 1;
        //the last indices of the array
        int start = 0;
        //the first indices of the array
        while (end >= start) {
            //condition applies while the last indices is greater or equal to the first
            int middle = (end + start) / 2;
            //sets the middle as half the sum of the end and start
            if (data[middle] == target) {
                //if the data at the middle indices is equal to our target we return the indices middle
                return middle;
            } else if (data[middle] < target) {
                //if the data at the indices is less than target then we move the start to one over the middle
                start = middle + 1;
            } else if (data[middle] > target) {
                // if the data at the indices is more than target then we move the end to one less than the middle
                end = middle - 1;
            }
        }
        return -1;
        // if we go through the while loop without guessing the target we will return -1
    }
}
