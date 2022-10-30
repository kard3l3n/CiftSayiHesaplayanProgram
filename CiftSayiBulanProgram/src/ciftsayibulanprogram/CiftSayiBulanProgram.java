package ciftsayibulanprogram;
import java.util.Scanner;
import java.math.*;


public class CiftSayiBulanProgram {
    public static void main(String[] args) {
        int sayi,toplam=0,adet=0;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("sayi giriniz:");
        sayi=input.nextInt();
        
        for(int i=1;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                toplam+=i;
                adet+=1;
                System.out.println(i);
                
            }
            else{
                
            }
        }
        if(adet!=0){
            System.out.println("ortalama:"+toplam/adet);
        }
        
    }
    
}
