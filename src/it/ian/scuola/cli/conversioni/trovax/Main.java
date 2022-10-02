package it.ian.scuola.cli.conversioni.trovax;

class Main {
    public static void main(String[] args) {
        final int x = 15;
        final int N = 5;
        int[] a = new int[] {1,3,5,10,11};
        int i=0;
        int j=N-1;
        int somma;

        while (i<j) {
            somma=a[i]+a[j];
            if (somma == x) {
                System.out.println("coppia trovata, numeri in posizione: " + i + "  " + j);
                break;
            }
            else if (somma < x)
                i++;
            else
                j--;
        }
    }
}