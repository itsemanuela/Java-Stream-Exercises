import entities.Prodotto;
import entities.Cliente;
import entities.Ordine;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Creo la lista, quindi il catalogo dei prodotti (libri)
        Prodotto libro1= new Prodotto(12345L,  "Harry Potter", "fantasy", 12.50);
Prodotto libro2= new Prodotto(1232123L, "Il Signore degli Anelli premium", "fantasy", 120.0);
Prodotto libro3= new Prodotto(345678L, "Le cronache di Narnia", "fantasy", 45.0);
Prodotto libro4= new Prodotto(456789L, "Java Programming", "Informatica", 150.50);
Prodotto libro5= new Prodotto (3456789L, "React Advanced", "Informatica", 115.50);



// Catalogo baby

        Prodotto baby1= new Prodotto(344583L, "Pannolini", "baby", 11.00);
        Prodotto baby2= new Prodotto(239485L, "Omogeneizzato", "Cibo", 3.80);
        Prodotto baby3= new Prodotto(458396L, "Triciclo", "Giocattolo", 268.60);



        //Catalogo boy
        Prodotto boy1=new Prodotto(24484L, "Fumetto", "Adolescenza" , 14.50);
        Prodotto boy2= new Prodotto(23456345L, "Profumo", "Accessori", 150.70);
        Prodotto boy3=new Prodotto(23456L, "Giacca Denim", "Abbigliamento", 128.80);


//Creazione dei clienti

        Cliente cliente1= new Cliente(121294L, "Emanuela", 2);
        Cliente cliente2= new Cliente(124294L, "Gianluca", 4);
        Cliente cliente3 =new Cliente(248467L, "Anna", 2);
        Cliente cliente4= new Cliente(26848L, "Sara", 7);
        Cliente cliente5=new Cliente(24828L, "Giorgia", 2);

        // Creazione ordini
        Ordine ordine1= new Ordine(765403L, "SPEDITO", LocalDate.of(2026, 05, 15), LocalDate.of(2026, 05, 17), List.of(libro2, libro1, baby3), cliente3);
        System.out.println(ordine1 );

        Ordine ordine2= new Ordine(763948L, "ORDINATO", LocalDate.of(2026, 3, 12), LocalDate.of(2026, 1, 3), List.of(libro2, libro5, boy3,baby1), cliente5);
        System.out.println(ordine2 );


   }
}