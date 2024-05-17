import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;



public class Splash extends JFrame {

    private AppliInfo info;
    private JTextArea infoLbl;

    public static void main(String[] args) throws Exception {
        
        new Splash();
    }

    public Splash(){

        info = new AppliInfo("Splash Screen", "1.0.0", "Luljn", "Une petite application pour débuter(ou se remettre à) Java");
        creerInterface();
    }

    private void creerInterface(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout());

        infoLbl = new JTextArea();
        infoLbl.setText(info.getDescription());
        infoLbl.setEditable(false);
        this.getContentPane().add(infoLbl, BorderLayout.CENTER);

        this.pack();
        this.setVisible(true);
    }
}
