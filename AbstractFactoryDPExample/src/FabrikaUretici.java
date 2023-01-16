public class FabrikaUretici {
    public static SoyutFabrikam fabrikaUret(String secim){
        if(secim == "Renk"){
           return new RenkFabrikam();
        }
        else if (secim == "Sekil"){
            return new SekilFabrikam();

        }
        return  null;

    }
}

