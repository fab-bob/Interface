/*Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo dell'area.*/
public class Main {
    public static void main (String [] args) {
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();
        System.out.println (rettangolo.calcolaArea(6, 5));
        System.out.println (triangolo.calcolaArea(6, 5));

    }
}
