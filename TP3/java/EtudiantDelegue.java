public class EtudiantDelegue extends Etudiant {
    private Etudiant base;

    public EtudiantDelegue(Etudiant e) {
        super(e.getNom(), e.getAge(), e.getNumEtudiant(), e.getMoyenne());
        this.base = e; 
    }

    @Override
    public String afficherDetails() {
        return base.afficherDetails() + " [ROLE: DELEGUE]"; 
    }
}
