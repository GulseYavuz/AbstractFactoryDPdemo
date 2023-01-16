public class Main {
    public static void main(String[] args) {
        SoyutFabrikam sekilFabrika = FabrikaUretici.fabrikaUret("Sekil");
        Sekil sekil1 = sekilFabrika.sekliGetir("Cember");
        sekil1.ciz();

        SoyutFabrikam renkFabrika = FabrikaUretici.fabrikaUret("Renk");
        Renk renk1 = renkFabrika.rengiGetir("Kirmizi");
        renk1.boya();
    }
}