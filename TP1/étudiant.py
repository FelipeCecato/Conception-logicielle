from .personne import Personne

class Etudiant(Personne):
    def __init__(self, nom: str, age: int, numero_etudiant: str, moyenne: float):
        super().__init__(nom, age)
        self._numero_etudiant = numero_etudiant
        self.moyenne = moyenne
        self.liste_cours = []

    @property
    def numero_etudiant(self):
        return self._numero_etudiant

    @property
    def moyenne(self):
        return self._moyenne

    @moyenne.setter
    def moyenne(self, value):
        if not (0.0 <= value <= 20.0):
            raise ValueError("Moyenne invalide")
        self._moyenne = value

    def ajouter_cours(self, cours):
        self.liste_cours.append(cours)

    def afficher_details(self) -> str:
        base = super().afficher_details()
        return f"{base} (Etudiant ID: {self.numero_etudiant}, Moyenne: {self.moyenne})"
