package Proje3;

public class UpdateRange {

    /*

    Update a method uRange

    parameters are int array and two ints

    if the int array has a number between the two int change it to -1

    for Example
    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    result should be 1,6,-1,-1,22,-1,30,-1

     */


    /*

    method URange update edin

    parametreler int array ve iki int olmalı

    Eğer int arrayde,  parametre olarak secilen iki int degeri arasında bir sayı veya sayılar  varsa,  sayı veya sayıları  -1 olarak değiştirin


    Örnek:

    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.

     */

    public int[] uRange(int[] arr1, int enk, int enb) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > enk && arr1[i] < enb) {
                arr1[i] = (-1);
            }
        }
            return arr1;
        }

    }

