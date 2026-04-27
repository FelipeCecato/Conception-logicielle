from abc import ABC, abstractmethod
from .models import Etudiant

class IReportGenerator(ABC):
    @abstractmethod
    def generate(self, etudiant: Etudiant):
        pass

class ConsoleReport(IReportGenerator):
    def generate(self, etudiant: Etudiant):
        print(f"[CONSOLE] ID: {etudiant.num_etudiant} | Nom: {etudiant.nom}")

class JsonReport(IReportGenerator):
    def generate(self, etudiant: Etudiant):
        import json
        data = {"id": etudiant.num_etudiant, "nom": etudiant.nom}
        print(f"[JSON] {json.dumps(data)}")
