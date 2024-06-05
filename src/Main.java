import java.util.HashSet;
import java.util.Iterator;

//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato

public class Main {
    public static void main(String[] args) {
        HashSet<String> ortaggi = setOrtaggi();
        //creo un nuovo oggetto dello stesso tipo del Hashset
        String ortaggio1 = "peperone";
        //aggiungo ortaggio1 al HashSet
        ortaggi.add(ortaggio1);
        //stampo lista aggiornata
        System.out.println(ortaggi);
        //creo un iteratore per fare si che durante il ciclo ortaggio1 venga riconosciuto
        Iterator<String> iterator = ortaggi.iterator();
        //tramite ciclo while, hasNext, e next vado a individure e prendere l'elemento da rimuovere
        while (iterator.hasNext()) {
            String elemento = iterator.next();
            //utilizzo .contains() per individuare se l'elemento è all'interno del HasSet
            if (ortaggi.contains(ortaggio1)) {
                //elimino l'elemento tramite .remove()
                iterator.remove();
            }
        }
        //Stampo la lista aggiornata
        System.out.println(ortaggi);
        //ripulisco tutta la lista tramite il comando .clear()
        ortaggi.clear();
        //per avere conferma di aver pulito la lista mi rivolgo al comando .isEmpty() che mi restituirà un valore booleano.
        System.out.println("l'HasSet è vuoto? " + ortaggi.isEmpty());
    }
    //creo una funzione che mi restituisce un HasSet riempito;
    private static HashSet<String> setOrtaggi() {
        HashSet<String> ortaggi = new HashSet<String>();
        ortaggi.add("lattuga");
        ortaggi.add("carota");
        ortaggi.add("melanzana");
        ortaggi.add("zucchine");
        return ortaggi;
    }
}