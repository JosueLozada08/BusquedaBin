import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater (new Runnable() {
            @Override
            public void run() {
            Interfaz principalForm = new Interfaz();
            principalForm.setDefaultCloseOperation(principalForm.EXIT_ON_CLOSE);
            principalForm.setBounds(200, 200, 800, 500);
            principalForm.setContentPane(principalForm.getMainPanel());
            principalForm.setVisible(true);
                                    }
                                }
        );

    }
}