import java.awt.*;

public class RenkFabrikam extends SoyutFabrikam{


    @Override
    public Sekil sekliGetir(String sekil) {
        return null;
    }

    @Override
    public Renk rengiGetir(String renk) {

        if(renk == null){
            return null;

        }
        else if(renk == "Mavi"){
            return new Mavi();
        }
        else if (renk == "Yesil") {
            return new Yesil();
        }
        else if (renk == "Kirmizi") {
            return new Kirmizi();
        }
        return null;
    }
}
