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
        self.nom = nom [cite: 185]
        self.age = age [cite: 185]

    @abstractmethod
    def afficher_details(self):
        pass

class Etudiant(Personne):
    def __init__(self, nom, age, num_etudiant, moyenne):
        super().__init__(nom, age)
        self.num_etudiant = num_etudiant [cite: 186]
        self.moyenne = moyenne [cite: 186]
        self.liste_cours = [] [cite: 186]
        self.observateurs = []
        self.strategy = MentionStandard() [cite: 197]

    def ajouter_note(self, nouvelle_note):
        self.moyenne = (self.moyenne + nouvelle_note) / 2
        self.notifier(f"Note mise a jour pour {self.nom}") [cite: 199]

    def set_strategy(self, strategy: CalculMention):
        self.strategy = strategy [cite: 198]

    def notifier(self, msg):
        for obs in self.observateurs: [cite: 199]
            obs.update(msg)

    def afficher_details(self):
        return f"Etudiant: {self.nom}, Moyenne: {self.moyenne}, Mention: {self.strategy.executer(self.moyenne)}"
