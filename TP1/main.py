from src.etudiant import Etudiant
from src.enseignant import Enseignant

def main():
    e = Etudiant("Alice", 20, "ETU001", 15.5)
    ens = Enseignant("Dr. Martin", 45, "Informatique", 3500.0)
    
    personnes = [e, ens]
    
    for p in personnes:
        print(p.afficher_details())

if __name__ == "__main__":
    main()
