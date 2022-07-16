public class TotalHammingDistance {


    public static int totalHammingDistance(int[] arr){

        int sum = 0;
        for(int i=0; i<32; i++){
            int count =0;
            for(int j=0; j<arr.length; j++){
                if(((arr[j]) & (1<<i)) >0){
                   count ++;
                }
            }sum += count*(arr.length-count);
        }return sum;
    }


    public static void main(String[] args) {

    }
}
