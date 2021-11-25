package Proje2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class removeDuplicates {

    /*
        Given int array

        remove the duplicated values from the array

        print non-duplicated array length

        for example:

        Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

//1 2 2 2 3 3 3 4 4 4 5 5 5
        result should be 5

        NOTE: while printing the result dont use for loop
        use System.out.println(Arrays.toString(your_array_name));
     */


    /*
       Verilen int array

       duplicated(tekrarlanan) öğeleri array den kaldır

        non-duplicated(tekrarlanmayan) öğeleri print et

       Örnek:

       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

       result  [1,2,3,4,5] olmalı

       NOT: resultu print ederken for loop kullanmayın
       System.out.println(Arrays.toString(your_array_name));  kullanın
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] arr = myStr.split(" ");

        int[] useThisArray = new int[arr.length];

        for(int i = 0 ; i < useThisArray.length ; i++){

            int num = Integer.parseInt(arr[i]);

            useThisArray[i] = num;

        }

//        code start here
//        dont change anything before this line
//        your Array is useThisLine

      // Kodlamaya burdan başla.bu satırdan önceki satirlarda hicbirşeyi  degiştirme.
      //   useThisLine arrayini kullan

        int[] noDuplicate = new int[useThisArray.length];
        int j = 0;

        for (int i = 0; i < useThisArray.length - 1; i++) {
            if (useThisArray[i] != useThisArray[i+1]) {
                noDuplicate[j++] = useThisArray[i];
            }
        }
        noDuplicate[j++] = useThisArray[useThisArray.length-1];

        System.out.println();
        System.out.print(Arrays.toString(noDuplicate));


    }
}