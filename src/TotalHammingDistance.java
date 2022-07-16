public class TotalHammingDistance {


    public static int totalHammingDistance(int[] arr){
        // get a sum to return the count at the end
        int sum = 0;

        // integer cannot have more than 32 bits
        for(int i=0; i<32; i++){
            // count the 1 bits, of every element at particular ith index
            int count =0;
            for(int j=0; j<arr.length; j++){
                if(((arr[j]) & (1<<i)) >0){
                   count ++;
                }
                // after getting the count, multiply it will the remaining 0th bit elements to count the pairs
                // and repeat it with the other ith indexes of same elements of the array
            }sum += count*(arr.length-count);
        }// return the sum at the end
        return sum;
    }


    public static void main(String[] args) {

    }
}
