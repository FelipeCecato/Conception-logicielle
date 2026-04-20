class Cours:
    def __init__(self, nom_cours: str, professeur: str):
        self.nom_cours = nom_cours
        self.professeur = professeur

    def __str__(self):
        return f"Cours: {self.nom_cours} par {self.professeur}"
