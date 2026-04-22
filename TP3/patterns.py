from .models import Observer, Etudiant, Personne

class ScolariteManager(Observer):
    _instance = None [cite: 189]
    
    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(ScolariteManager, cls).__new__(cls)
            cls._instance.etudiants = [] [cite: 189]
        return cls._instance

    def update(self, message: str):
        print(f"[OBSERVER] ScolariteManager: {message}") [cite: 199]

class PersonneFactory:
    @staticmethod
    def creer(type_p, nom, age, **kwargs):
        if type_p.lower() == "etudiant":
            return Etudiant(nom, age, kwargs.get('id'), kwargs.get('moy')) [cite: 191]
        return None

class EtudiantBoursier:
    def __init__(self, etudiant: Etudiant):
        self._etudiant = etudiant [cite: 193]

    def afficher_details(self):
        return self._etudiant.afficher_details() + " [STATUT: BOURSIER]" [cite: 193]

class CourseAdapter:
    @staticmethod
    def transformer(legacy_data: str):
        # Format "NomCours;Prof" [cite: 194]
        nom, prof = legacy_data.split(";") [cite: 195]
        return {"nom": nom, "prof": prof}
