public interface MentionStrategy {
    String calculer(double moyenne); 
}

class MentionExcel implements MentionStrategy {
    public String calculer(double m) { return m >= 16 ? "Tres Bien" : "Passable"; }
}
