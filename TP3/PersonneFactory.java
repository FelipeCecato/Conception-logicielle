public class PersonneFactory {
    public static Personne creer(String type, String nom, int age, String id, double moy) {
        if (type.equalsIgnoreCase("ETUDIANT")) {
            return new Etudiant(nom, age, id, moy); 
        }
        return null;
    }
}
