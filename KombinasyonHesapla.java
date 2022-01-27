import java.util.Scanner;

public class KombinasyonHesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,dif,nfak=1,rfak=1,diffak=1,sonuc;

        System.out.print("N sayisini girin:");
        n=input.nextInt();

        System.out.print("R sayisini girin:");
        r=input.nextInt();

        dif = n-r;

       // formul: fact(n) / (fact(r) * fact(n - r));

        for(int i=1;i<=n;i++)
        {
            nfak=nfak*i;
        }

        for(int i=1;i<=r;i++)
        {
            rfak=rfak*i;
        }

        for(int i=1;i<=dif;i++)
        {
            diffak=diffak*i;
        }

        sonuc = nfak / (rfak * diffak);

        System.out.print("Sonuc: " + sonuc);
    }
}
