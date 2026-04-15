class Personne:
    def __init__(self, nom: str, age: int):
        self.nom = nom
        self.age = age

    @property
    def nom(self):
        return self._nom

    @nom.setter
    def nom(self, value):
        if not value or not value.strip():
            raise ValueError("Nom invalide")
        self._nom = value

    @property
    def age(self):
        return self._age

    @age.setter
    def age(self, value):
        if not (0 <= value <= 100):
            raise ValueError("Age hors limites")
        self._age = value

    def afficher_details(self) -> str:
        return f"{self.nom}, {self.age} ans"

    def __str__(self):
        return self.afficher_details()
