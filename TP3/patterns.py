from .models import Observer, Etudiant, Personne

class ScolariteManager(Observer):
    _instance = None 
    
    def __new__(cls):
        if cls._instance is None:
            cls._instance = super(ScolariteManager, cls).__new__(cls)
            cls._instance.etudiants = [] 
        return cls._instance

    def update(self, message: str):
        print(f"[OBSERVER] ScolariteManager: {message}") 

class PersonneFactory:
    @staticmethod
    def creer(type_p, nom, age, **kwargs):
        if type_p.lower() == "etudiant":
            return Etudiant(nom, age, kwargs.get('id'), kwargs.get('moy')) 
        return None

class EtudiantBoursier:
    def __init__(self, etudiant: Etudiant):
        self._etudiant = etudiant 

    def afficher_details(self):
        return self._etudiant.afficher_details() + " [STATUT: BOURSIER]"

class CourseAdapter:
    @staticmethod
    def transformer(legacy_data: str):
        # Format "NomCours;Prof" 
        nom, prof = legacy_data.split(";") 
        return {"nom": nom, "prof": prof}
