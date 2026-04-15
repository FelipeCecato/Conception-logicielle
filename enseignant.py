from .personne import Personne

class Enseignant(Personne):
    def __init__(self, nom: str, age: int, matiere: str, salaire: float):
        super().__init__(nom, age)
        self.matiere = matiere
        self.salaire = salaire

    def afficher_details(self) -> str:
        base = super().afficher_details()
        return f"{base} (Enseignant de {self.matiere}, Salaire: {self.salaire}€)"
      
