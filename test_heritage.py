import pytest
from src.personne import Personne
from src.etudiant import Etudiant
from src.cours import Cours

def test_heritage_personne_etudiant():
    e = Etudiant("Alice", 20, "ETU001", 15.0)
    assert isinstance(e, Personne)
    assert e.nom == "Alice"
    assert e.numero_etudiant == "ETU001"

def test_liste_cours_etudiant():
    e = Etudiant("Bob", 21, "ETU002", 12.0)
    c = Cours("Java", "Dr. Smith")
    e.ajouter_cours(c)
    assert len(e.liste_cours) == 1
    assert e.liste_cours[0].nom_cours == "Java"
