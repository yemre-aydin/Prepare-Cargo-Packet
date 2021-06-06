import java.util.Scanner;


public class InformationMaterials {

    public void informationPacket(){
        System.out.println("Lütfen 7 kg'lik sabun adedini girin:");
        Scanner sevenKg_IN=new Scanner(System.in);
        int seven=sevenKg_IN.nextInt();
        System.out.println("Lütfen 2 kg'lik sabun adedini girin:");
        Scanner twoKg_IN=new Scanner(System.in);
        int two=twoKg_IN.nextInt();
        System.out.println("Lütfen hedef kg miktarını girin:");
        Scanner targetKg_IN=new Scanner(System.in);
        int target=targetKg_IN.nextInt();//burayı input veri için düzenlemek gerekiyor
        //program başarılı şimdilik
        //buradan soruları soracak main e sadece  çağırılacak


        CalculatorCargoPacket cargo_info=new CalculatorCargoPacket();
        cargo_info.calculatorPacket(seven,two,target);



    }
public boolean finishPro(){
        System.out.println("Finish Algorithms");
    return false;
}



}
