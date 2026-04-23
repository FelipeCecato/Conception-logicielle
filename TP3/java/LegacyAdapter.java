public class LegacyAdapter {
    public static Cours adapt(String legacyFormat) {
        // legacyFormat: "Nom;Prof" [cite: 194]
        String[] parts = legacyFormat.split(";"); 
        return new Cours(parts[0], parts[1]); 
    }
}
