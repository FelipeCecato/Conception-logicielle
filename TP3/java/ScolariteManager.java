import java.util.ArrayList;
import java.util.List;

public class ScolariteManager implements Observer {
    private static ScolariteManager instance; 
    private List<Etudiant> etudiants = new ArrayList<>();

    private ScolariteManager() {} 

    public static synchronized ScolariteManager getInstance() {
        if (instance == null) instance = new ScolariteManager(); 
        return instance;
    }

    @Override
    public void update(String msg) {
        System.out.println("[NOTIF] Manager informe: " + msg); 
    }
}
