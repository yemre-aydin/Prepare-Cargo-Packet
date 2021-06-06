public class Main {

    public static void main(String[] args) {


    	InformationMaterials infoCargo=new InformationMaterials();
    	infoCargo.informationPacket();



    	/*
	int seven_kilo_adet=3;
	int iki_kilo_adet=4;
	int seven_sayac=0;
	int iki_sayac=0;
	int hedef_kargo_kilo= 8;
	int kalan_hedefKilo=0;
	int kalan_hedefKilo2=0;

		seven_sayac=hedef_kargo_kilo/7;
		kalan_hedefKilo=hedef_kargo_kilo%7;



	if (kalan_hedefKilo==0 && seven_sayac<=seven_kilo_adet){
				System.out.println(hedef_kargo_kilo+" ulaşmak için: "+seven_sayac+" adet 7kg ve "+iki_sayac+" Adet 2 kg sabun ile "
						+hedef_kargo_kilo+"'lık paket oluşturabilirsiniz. ");


	}if (kalan_hedefKilo==0 && seven_sayac>seven_kilo_adet){

			System.out.println("7 kg ve 2 kg'lık paketlerle "+hedef_kargo_kilo+" ulaşamassınız.");

		}

	if (kalan_hedefKilo!=0){
		iki_sayac=kalan_hedefKilo/2;
		kalan_hedefKilo2=kalan_hedefKilo%2;
		if (kalan_hedefKilo2==0 && iki_sayac<=iki_kilo_adet && seven_sayac<=seven_kilo_adet){

			System.out.println(hedef_kargo_kilo+" ulaşmak için: "+seven_sayac+" adet 7kg ve "+iki_sayac+" Adet 2 kg sabun ile "
					+hedef_kargo_kilo+"'lık paket oluşturabilirsiniz. ");

		}
		if (kalan_hedefKilo2==0 && iki_sayac>iki_kilo_adet || seven_sayac>seven_kilo_adet){
			System.out.println("yeterli 7 ve 2 kilo yok "+seven_sayac+","+iki_sayac);
			System.out.println("7 kg ve 2 kg'lık paketlerle "+hedef_kargo_kilo+" ulaşamassınız.");



		}
		if (kalan_hedefKilo2!=0){
			for (int j=1;j<=seven_sayac;j++){
				seven_sayac-=j;
				kalan_hedefKilo=kalan_hedefKilo+(j*7);
				iki_sayac=kalan_hedefKilo/2;
				kalan_hedefKilo2=kalan_hedefKilo%2;
				if (kalan_hedefKilo2==0){
					System.out.println("Kullanılacak 7 kiloluk sabun adedi: "+seven_sayac);
					System.out.println("kullanılacak 2 kiloluk sabun adedi: "+iki_sayac);
					break;
				}

		}if (seven_sayac==0 && kalan_hedefKilo2!=0){
				System.out.println("düzgün kolilenemez ");
				System.out.println("7 kg ve 2 kg'lık paketlerle "+hedef_kargo_kilo+" ulaşamassınız.");

			}


	}


	//	System.out.println("Kullanılacak 7 kiloluk sabun adedi: "+seven_sayac);
//		System.out.println("kalan hedef için gereken kilo: "+kalan_hedefKilo);



		}

/*f
	System.out.println("kullanılacak 2 kiloluk sabun adedi: "+iki_sayac);
		System.out.println("kalan hedef için gereken kilo: "+kalan_hedefKilo);


		if (kalan_hedefKilo!=0){
			for (int i=1;i<=seven_sayac;i++){
				kalan_hedefKilo=hedef_kargo_kilo%7;
				seven_sayac-=i;
				kalan_hedefKilo=kalan_hedefKilo+(i*7);
				iki_sayac=kalan_hedefKilo/2;
				kalan_hedefKilo=kalan_hedefKilo%2;
				if (kalan_hedefKilo==0){
					System.out.println("kullanılacak 7:"+seven_sayac);
					System.out.println("kullanılacak iki: "+iki_sayac);
					System.out.println("kalan hedef: "+kalan_hedefKilo);
					break;
				}

				}if (seven_sayac==0 && kalan_hedefKilo%2!=0){
					System.out.println("düzgün kolilenemez ");
			}


		}


	or (int i;i<hedef_kargo_kilo;i+=7){
	    seven_sayac++;
	    seven_kilo=i;
	    System.out.println("7kilo eklendi");

    }
	System.out.println("kullanılacak 7 kiloluk sabun adedi: "+seven_sayac);*/
    }
}
