import pytest
from src.personne import Personne
from src.etudiant import Etudiant

def test_validation_age():
    p = Personne("Alice", 25)
    with pytest.raises(ValueError):
        p.age = -5
    with pytest.raises(ValueError):
        p.age = 105

def test_validation_moyenne():
    e = Etudiant("Bob", 20, "ETU001", 10.0)
    with pytest.raises(ValueError):
        e.moyenne = 25.0

def test_validation_nom_vide():
    with pytest.raises(ValueError):
        Personne("", 20)
