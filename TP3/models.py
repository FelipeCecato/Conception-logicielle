from abc import ABC, abstractmethod

class Observer(ABC):
    @abstractmethod
    def update(self, message: str):
        pass

class CalculMention(ABC):
    @abstractmethod
    def executer(self, moyenne: float) -> str:
        pass

class MentionStandard(CalculMention):
    def executer(self, moyenne: float) -> str:
        return "Admis" if moyenne >= 10 else "Ajourne"

class Personne(ABC):
    def __init__(self, nom: str, age: int):
        self.nom = nom 
        self.age = age 

    @abstractmethod
    def afficher_details(self):
        pass

class Etudiant(Personne):
    def __init__(self, nom, age, num_etudiant, moyenne):
        super().__init__(nom, age)
        self.num_etudiant = num_etudiant 
        self.moyenne = moyenne 
        self.liste_cours = [] 
        self.observateurs = []
        self.strategy = MentionStandard() 

    def ajouter_note(self, nouvelle_note):
        self.moyenne = (self.moyenne + nouvelle_note) / 2
        self.notifier(f"Note mise a jour pour {self.nom}") 

    def set_strategy(self, strategy: CalculMention):
        self.strategy = strategy 

    def notifier(self, msg):
        for obs in self.observateurs: 
            obs.update(msg)

    def afficher_details(self):
        return f"Etudiant: {self.nom}, Moyenne: {self.moyenne}, Mention: {self.strategy.executer(self.moyenne)}"
