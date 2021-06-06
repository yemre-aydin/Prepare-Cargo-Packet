

public class PrepareCargoPacket {



    public void prepareResult(int calculator_resul,int target_number,int seven_number,int two_number){

        if (calculator_resul==2){

            System.out.println(calculator_resul);
           System.out.println("Başarılı: "+target_number+" ulaşmak için: "+seven_number+" adet 7kg ve "
                   +two_number+" Adet 2 kg sabun ile "+target_number+"'lık paket oluşturabilirsiniz. ");


        }
        if (calculator_resul==-1){
            System.out.println(calculator_resul);
            System.out.println("Başarısız:"+"7 kg ve 2 kg'lık paketlerle "+ target_number + " ulaşamassınız.");
        }




    }


}
