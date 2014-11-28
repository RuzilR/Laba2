package mypackage;

public class Komnata {
    private Stul stul = new Stul();
    private Dver dver = new Dver();

    public void DobavitStul() {
        int k = stul.getKolvo();
        k++;
        stul.setKolvo(k);
    }

    public void DobavitDver() {
        int k = dver.getKolvo();
        k++;
        dver.setKolvo(k);
    }

    public void UbratStul() {
        int k = stul.getKolvo();
        k--;
        if(k<0) {
            k = 0;
        }
        stul.setKolvo(k);
    }

    public void UbratDver() {
        int k = dver.getKolvo();
        k--;
        if(k<0) {
            k = 0;
        }
        dver.setKolvo(k);
    }

    public void PokazatVse() {
        System.out.print("Кол-во стульев: ");
        System.out.println(stul.getKolvo());
        System.out.print("Кол-во дверей: ");
        System.out.println(dver.getKolvo());
    }
}
