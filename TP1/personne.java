public class Personne {
    protected String nom;
    protected int age;

    public Personne(String nom, int age) {
        setNom(nom);
        setAge(age);
    }

    public String getNom() { return nom; }
    public void setNom(String nom) {
        if (nom == null || nom.isEmpty()) throw new IllegalArgumentException();
        this.nom = nom;
    }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age < 0 || age > 100) throw new IllegalArgumentException();
        this.age = age;
    }

    public String afficherDetails() {
        return nom + ", " + age + " ans";
    }
}
