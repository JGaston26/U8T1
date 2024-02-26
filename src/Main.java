public class Main {
    public static void main(String[] args) {
        /*
        String[][] seatingChart  =
                {
                        {"Abby","Don","George","Kim"},
                        {"Brain","Elenor","Harry","Lenny"},
                        {"Cathy","Fred","Jill","Matt"}
                };
        //setting changing Harry to Paul
        seatingChart [1][2] = "Paul";

        //Swapping Matt and Abby
        String temp1 = seatingChart [0][0];
        seatingChart [0][0] = seatingChart [2][3];
        seatingChart [2][3] = temp1;

        //Swapping rows 0 and 1
        String[] temp2 = seatingChart [0];
        seatingChart [0] = seatingChart [1];
        seatingChart [1] = temp2;

        //Printing out 2D Array
        for(String[] list: seatingChart ){
            for(String words: list){
                System.out.print(words + " ");
            }
            System.out.println();
        }
        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

         */
        int[][] arr1 = new int[2][3];
        String[][] arr2 = new String[4][2];
        //Individually assigning each element of arr1
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        //Printing out array
        for(int[] list: arr1 ){
            for(int words: list){
                System.out.print(words + " ");
            }
            System.out.println();
        }

        //Individually assigning each element of arr1
        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";
        arr2[3][0] = "g";
        arr2[3][1] = "h";

        //Printing out arr2
        for(String[] list: arr2 ){
            for(String words: list){
                System.out.print(words + " ");
            }
            System.out.println();
        }
    }
}
