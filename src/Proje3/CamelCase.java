package Proje3;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       For Example:

            my family live in united states

      Result should be

            My Family Live In United States

     */

    /*
           camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
           büyük harfe çevirip geri döndüren metodun yazınız.

           Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel

     */
    public static String  camelcase(String str){

//        String[] array = str.split(" ");
//
//        for (int i = 0; i < array.length; i++) {
//            array[i]= array[i].substring(0,1).toUpperCase()+array[i].substring(1);
//        }
//
//        str ="";
//        for (String a:array) {
//            str+= a+" ";
//        }
//
//        str.trim();
//        return str;

        String[] kelimeler = str.split(" ");
        String mesaj = "";

        for (int i = 0; i < kelimeler.length; i++) {
            kelimeler[i] = kelimeler[i].substring(0, 1).toUpperCase() + kelimeler[i].substring(1);
        }

        for (int i = 0; i < kelimeler.length; i++) {
            mesaj += kelimeler[i];

            if (i < kelimeler.length - 1)
                mesaj += " ";
        }
        return mesaj;
    }

}
