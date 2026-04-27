public class ConsoleReport implements IReportGenerator {
    @Override
    public void generate(Etudiant e) {
        System.out.println("Rapport Console - Etudiant: " + e.getNom());
    }
}
