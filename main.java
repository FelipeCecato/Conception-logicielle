public class Main {
    public static void main(String[] args) {
        // Instanciation 
        Etudiant alice = new Etudiant("Alice", 20, "ETU001");
        
        // Assignation de cours 
        alice.ajouterCours(new Cours("UML", "Prof. Martin"));
        alice.ajouterCours(new Cours("Java", "Prof. Durand"));

        // Pilotage par abstraction (DIP) 
        IReportGenerator reporter = new ConsoleReport();
        reporter.generate(alice);
    }
}
