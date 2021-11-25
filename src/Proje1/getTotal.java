import java.util.Scanner;

public class getTotal {


      /*

        Given three Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */


     /*
     3 tane String verildiğinde
     sayısal olmayan tüm karakterleri kaldırın.
     Stringleri int e çevirin
     ve total print edin

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        NOT : Eğer output 0 dan küçük ise outputu -1 e cevir





    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use String num1 , num2 , num3

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        // String num1,num2,num3 kullanın



        String a = num1.replaceAll("[$]", "");
        String b = num2.replaceAll("[$]", "");
        String c = num3.replaceAll("[$]", "");

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);

        int sum = x+y+z;

        if (sum<0){
            System.out.println("-1");
        }else
            System.out.println(sum);

    }
}
