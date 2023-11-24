import java.util.Scanner;
public class Tutorial1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //creates new array and gets the value for each index from input
        int[] jokes = new int[5];
        for(int i = 0; i < 5; i++){
            jokes[i] = scan.nextInt();
        }

        //prints array in reverse order
        for ( i = 4; i > -1; i--) {
            System.out.println(jokes[i]);
        }

        //creates new variables to track # of counts
        int larger = 0, smaller = 0, equal = 0;

        //finds out how many of the other 4 are <, > , ==
        //chooses 1 # to compare
        for (int i = 0; i < jokes.length; i++) {
            //compares #i to the others
            for (int j = 0; j < jokes.length; j++) {
                if (jokes[i] < jokes[j]) {
                    larger++;
                }
                if (jokes[i] > jokes[j]) {
                    smaller++;
                }
                if (jokes[i] == jokes[j] && i != j) {
                    equal++;
                }
            }
            //prints results for #i and resets counters
            System.out.print(jokes[i] + " - " + larger + " larger values than itself, " + smaller);
            System.out.println(" smaller values than itself, " + equal + " equals values than itself, ");
            larger = 0;
            smaller = 0;
            equal = 0;
        }
    }
}
