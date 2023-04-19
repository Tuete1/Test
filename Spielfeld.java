public class Spielfeld {

    public void spielfeldErstellen (){
        String[][] spielfeld = new String[4][4];

        for (int i = 0; i < spielfeld.length; i++) {
            for (int i1 = 0; i1 < spielfeld.length; i1++) {
                spielfeld [i][i1] = "*";
                spielfeld[0][1] = "a";
                spielfeld[0][2] = "b";
                spielfeld[0][3] = "c";
                spielfeld[1][0] = "1";
                spielfeld[2][0] = "2";
                spielfeld[3][0] = "3";
                System.out.print(spielfeld[i][i1] + "\t");
            }
            System.out.println();
        }
    }
}
