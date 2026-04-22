import java.util.ArrayList;
import java.util.List;

public class ScolariteManager implements Observer {
    private static ScolariteManager instance; [cite: 189]
    private List<Etudiant> etudiants = new ArrayList<>();

    private ScolariteManager() {} [cite: 190]

    public static synchronized ScolariteManager getInstance() {
        if (instance == null) instance = new ScolariteManager(); [cite: 190]
        return instance;
    }

    @Override
    public void update(String msg) {
        System.out.println("[NOTIF] Manager informe: " + msg); [cite: 199]
    }
}
