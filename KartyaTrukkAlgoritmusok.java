package algoritmusok;

import java.util.Scanner;

public class KartyaTrukkAlgoritmusok {

    public static void main(String[] args) {
        String[] pakli = new String[22];
        
        String[] szinek = {"P","T","Z", "M"};
        String[] ertekek = {"Ász","Kir","Fel", "X", "IX", "XIII"};
     
        //feltölt
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; i < 22 && e < ertekek.length; e++) {
                pakli[i++] = szin + "_" + ertekek[e];
            }
        }
        
        //megjelenít
        for (i = 1; i < pakli.length; i++) {
            String lap = pakli[i];
            //System.out.print(lap + " ");
            System.out.printf("%-8s", lap);
            if(i % 3 == 0){
                System.out.println("");
            }
        }
        
        //bekérés:
        Scanner sc = new Scanner(System.in);
        boolean jo;
        do {
            System.out.print("oszlop(1-3): ");
            int oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
    }  
}
