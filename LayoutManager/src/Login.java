import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    public Login() {
        super("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelGlowny = new JPanel(new GridLayout(2, 2));
        add(panelGlowny, BorderLayout.CENTER);

        panelGlowny.add(new JLabel("Użytkownik:"));
        JTextField userName = new JTextField();
        panelGlowny.add(userName);

        panelGlowny.add(new JLabel("Hasło:"));
        JPasswordField passwordField = new JPasswordField();
        panelGlowny.add(passwordField);

        JPanel panelPrzyciski = new JPanel(new FlowLayout(FlowLayout.CENTER));
        add(panelPrzyciski, BorderLayout.SOUTH);

        JButton btnLogin = new JButton("Zaloguj");
        JButton btnCancel = new JButton("Anuluj");

        panelPrzyciski.add(btnLogin);
        panelPrzyciski.add(btnCancel);

        pack();

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
