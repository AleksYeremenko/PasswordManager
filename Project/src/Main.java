import javax.swing.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(null);
            if (option == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                System.out.println("File selected: " + file.getAbsolutePath());
                JFrame frame = new JFrame("Login");
                LoginForm loginForm = new LoginForm(file);
                frame.setContentPane(loginForm.getPanel1());
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setSize(400, 200);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            } else {
                System.out.println("File not selected, program termination.");
                System.exit(0);
            }
        });
    }
}
