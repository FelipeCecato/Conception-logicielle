public interface MentionStrategy {
    String calculer(double moyenne); 
}

public class MentionExcel extends MentionStrategy {
    public String calculer(double m) { return m >= 16 ? "Tres Bien" : "Passable"; }
}
