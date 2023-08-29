import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        setTitle("Student Registration System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
