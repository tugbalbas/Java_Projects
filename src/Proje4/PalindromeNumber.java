package Proje4;

import java.util.Arrays;

public class PalindromeNumber {

      /*
        Given a method name is returnNum
        Parameter is one int
        Return type is int

        Reverse the parameter int and return it

        Example:
        int  = 1234

        return should be 4321
     */


    public int returnNum(int number) {
        String strSayi= Integer.toString(number);
        String[] strDizi=strSayi.split("");

        String strtrsSayi="";

        for (int i = strDizi.length-1; i>=0 ; i--) {

            strtrsSayi+=strDizi[i];
        }

        int trsSayi=Integer.parseInt(strtrsSayi);
        System.out.println(trsSayi);

        return trsSayi;

    }






    /*
        Given palindromeNum method
        Parameter is one int (num1)
        Return type is one int

        Palindrome means a word or number reads the same backward as forward like "mom" , "refer" , "131" , "1221"

       Add num1 and reverse of num1, find the result.
       Check if the result is a palindrome or not.
       If the result is not a palindrome number, find the reverse of the result.
       And add the result and reverse of the result, find the new total.
       Check if the new total is a palindrome or not.
       Do the same steps until you reach a palindrome number in your result.
       After you reached the palindrome number, find the count that how many times you did the same operation to reach a palindrome number.
       Return the count

        Example:
            num1 = 349  --> 349  + 943 =1292     Note : since 1292 is not palindrome do the same step for this  // first operation
                            1292 + 2921 = 4213   Note : 4213 is not palindrome  do the same step for this // second opeartion
                            4213 + 3124 = 7337   Note : 7337 is palindrome      // third operation  you reached the palindrome so count is 3

        return should be 3
        HINT: You better use while loop for this question

     */


     /*

        Parametresi bir tane int (num1) ve return tipi int olan palindromeNum isminde method verilmi??tir.

        Palindrome, bir kelime veya say??n??n, t??pk?? ileri ile ayn?? ??ekilde geriye do??ru okudu??u anlam??na gelir.
        ??rne??in --   "mom" , "refer" , "131" , "1221"


       num1'i ve num1'in tersini ekleyin, sonucu bulun.
       Sonucun palindrom olup olmad??????n?? kontrol edin.
       Sonu?? bir palindrom numaras?? de??ilse, sonucun tersini bulun.
       Ve sonucu ve sonucun tersine ekleyin, yeni toplam?? bulun.
       Yeni toplam??n bir palindrom olup olmad??????n?? kontrol edin.
       Sonu??lar??n??zda bir palindrom numaras??na ula??ana kadar ayn?? ad??mlar?? uygulay??n.
       Palindrom numaras??na ula??t??ktan sonra, bir palindrome numaras??na ula??mak i??in ayn?? i??lemi ka?? kez yapt??????n??z?? bulun.
       Return  count olmali

        ??rnek:
            num1 = 349  --> 349  + 943 =1292     Not : 1292 palindrom olmad??????ndan bunun i??in ayn?? ad??m?? uygulay??n  // birinci i??lem
                            1292 + 2921 = 4213   Not : 4213 palindrom de??il bunun i??in ayn?? ad??m?? yap??n // ikinci i??lem
                            4213 + 3124 = 7337   Not : 7337  palindrome      // ??????nc?? i??lemde palindroma ula??t??n??z ve count 3 olur

        return  3 olmal??
        ??PUCU:  Bu soru i??in while loop kullansan??z iyi olur

     */

    public int palindromeNum(int num) {

        int toplam = num;
        int reverse = 0;
        int sayac = 0;


        while (toplam != reverse) {
            sayac++;
            reverse = returnNum(toplam);
            toplam += reverse;
            reverse = returnNum(toplam);

        }

        return sayac+1;
    }
}
