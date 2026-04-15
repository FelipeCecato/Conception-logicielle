import pytest
from src.etudiant import Etudiant
from src.enseignant import Enseignant

def test_polymorphisme_affichage():
    e = Etudiant("Alice", 20, "ETU001", 15.0)
    ens = Enseignant("Dr. Martin", 45, "Maths", 3000.0)
    
    liste = [e, ens]
    for p in liste:
        details = p.afficher_details()
        assert isinstance(details, str)
        assert p.nom in details
