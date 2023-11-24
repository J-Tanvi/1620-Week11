public class LabTutorial {
    public static void main(String[] args) {
        //creates array
        int[] a = {33, 44, 11 ,22};

        //prints out array unsorted
        System.out.print("Unsorted: ");
        for(int w = 0; w < a.length; w++){
            System.out.print(" " + a[w]);
        }

        //provides gap
        System.out.println(" ");

        //bubble sort
        for(int i = 0; i < a.length-1;i++){
            for (int j = 0; j < a.length-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[i];
                    a[j] = a[i];
                    a[i] = temp;
                    //prints current sort
                    System.out.print("\nIteration " + i + " Output is: ");
                    for(int w = 0; w < a.length; w++){
                        System.out.print(" " + a[w]);
                    }
                }
            }
        }

        //prints gap
        System.out.println("\n");

        //prints fully sorted array
        System.out.print("Sorted: ");
        for(int w = 0; w < a.length; w++){
            System.out.print(" " + a[w]);
        }
    }
}
