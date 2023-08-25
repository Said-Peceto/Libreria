package libreria;

public class Main {
    public static void main(String[] args) {
        
        LibreriaG libro1 = new LibreriaG ("El viento conoce mi nombre", "ISABEL ALLENDE");
        LibreriaG libro2 = new LibreriaG ("Hábitos atómicos", "JAMES CLEAR");
        LibreriaG libro3 = new LibreriaG ("Un cuento perfecto", "BELÍSABET ENAVENT");

        
        Biblioteca biblioteca = new Biblioteca();

        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        
        biblioteca.imprimirCatalogo();

      
        biblioteca.retirarLibro(libro2);

       
        biblioteca.imprimirCatalogo();
    }
}

