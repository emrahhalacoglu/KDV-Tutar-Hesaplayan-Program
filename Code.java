import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        double Tutar, kdvDahilTutar, kdvTutari, kdvOrani;
        Scanner input=new Scanner(System.in);
        System.out.print("Tutari giriniz :");
        Tutar=input.nextDouble();
        if(Tutar<=1000){kdvOrani=0.18;}else{kdvOrani=0.08;};
        kdvTutari=Tutar*kdvOrani;
        kdvDahilTutar=Tutar + kdvTutari;
        System.out.println("KDV Tutari :"+kdvTutari); 
        System.out.println("KDV Dahil Tutar :"+ kdvDahilTutar);
        
        

    }
    
}
