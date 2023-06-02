import java.util.Scanner;

public class Horoskop {
    public static void main(String[] args) {
        int month,day;
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğduğunuz günü giriniz: ");
        day = inp.nextInt();
        System.out.print("Doğduğunuz ayı giriniz: ");
        month = inp.nextInt();

       if((month == 3 && day>=21 ) || (month == 4 && day<=20)){
           System.out.println("koç burcu");
       }
       if((month == 4 && day>=21) || (month == 5 && day<20)){
           System.out.println("Boga burcu");
       }
       if((month == 5 && day>=21) || (month == 6 && day<20)){
            System.out.println("ikizler burcu");
        }
       if((month == 6 && day>=21)|| (month == 7 && day<=23)){
           System.out.println("yengeç burcu");
       }
       if((month == 7 && day>=24) ||(month == 8 && day<=22)){
            System.out.println("aslan burcu");
       }
       if((month == 8 && day>=23)||(month == 9 && day<=22)){
           System.out.println("başak burcu");
       }
       if((month == 9 && day>=23)||(month == 10 && day<=22)){
           System.out.println("terazi burcu");
       }
       if((month == 10 && day>=23)||(month == 11 && day<=21)){
           System.out.println("akrep burcu");
       }
       if((month == 11 && day>=22)|| (month == 12 && day<=22)){
           System.out.println("yay burcu");
       }
       if((month == 12 && day>=23)||(month == 1 && day<=21)){
           System.out.println("oğlak burcu");
       }
       if((month == 1 && day>=22)||(month == 2 && day<= 19)){
           System.out.println("kova burcu");
       }
       if((month == 2 && day>=20)||(month == 3 && day<=20)){
           System.out.println("balık burcu");
        }
    }
}


