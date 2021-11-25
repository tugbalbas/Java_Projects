package Proje3;

public class ThreeEvenOdd {

    /*

    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .

    for Example:

    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true

     */


    /*

   Parametre int array olan threeEvenOrOdd methodu oluşturun.
   arrayiniz 3 tane çift veya 3 tane  tek değer içeriyorsa method  true değerini döndürür.


   Örnek:

   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı

    */

    public boolean threeEvenOrOdd(int[] intArray){
        int cift=0;
        int tek=0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i]%2 == 0){
                cift++;
            }else
                tek++;

        }if (cift==3 || tek==3){
            return true;
        }else {
            return false;
        }
    }

}
