public interface MentionStrategy {
    String calculer(double moyenne); [cite: 197]
}

public class MentionExcel extends MentionStrategy {
    public String calculer(double m) { return m >= 16 ? "Tres Bien" : "Passable"; }
}
