public class SekilFabrikam extends SoyutFabrikam{
    @Override
    public Sekil sekliGetir(String sekil) {

        if (sekil == null){
            return null;
        }
        else if (sekil == "Cember"){
            return new Cember();
        } else if (sekil == "Kare") {
            return new Kare();
        } else if (sekil == "Dikdortgen") {
            return new Dikdortgen();
        }
        return null;
    }

    @Override
    public Renk rengiGetir(String renk) {
        return null;
    }
}
