public class Tutorial3 {
    public static void main(String[] args) {
        //create an empty array holding 50 ints
        int[] random = new int[50];

        //assign a random number to each index and add to sum
        int sum = 0;
        for(int i = 0; i < 50; i++){
            random[i] = (int)(Math.random() * 101);
            sum += random[i];
            //System.out.println(random[i]);
        }
        //calculate mean
        double mean = sum/50.0;

        //compare each number to find the largest
        int largest = 0;
        for(int i = 0; i < 50; i++){
            if(random[i] > largest){
                largest = random[i];
            }
        }
        //print the relevant values
        System.out.println("The largest random number is: " + largest);
        System.out.println("The mean of the 50 numbers is: " + mean);
    }
}
