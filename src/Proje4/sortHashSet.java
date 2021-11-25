package Proje4;

import java.util.*;

public class sortHashSet {

    /*
        Given allNumbers Integer Hashset

        Sort the allNumbers hashset

        Change the result to ArrayList

        Return the ArrayList

        NOTE : DO NOT USE COLLECTION CLASS WHILE SOLVING THE QUESTION USE FOR LOOP OR DIFFERENT SET TYPES

     */


    /*
         allNumbers Integer Hashset  verildiğinde

         allNumbers hashset'i sort et

        Sonucu ArrayList olarak değiştir

        Return  ArrayList

        NOT : SORUYU ÇÖZERKEN COLLECTİON CLASS KULLANMA , FOR LOOP VEYA FARKLI SET TİPLERINI KULLANIN


     */
    public ArrayList<Integer> sort(HashSet<Integer> allNumbers){

        ArrayList<Integer> result = new ArrayList<>();

        Set<Integer> tset = new TreeSet<>();

        for (Integer s : allNumbers) {

            tset.add(s);
        }
        for (Integer a : tset) {
            result.add(a);

        }
        return result;
    }
}

