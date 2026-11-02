
package bikantin;

import form.FormLogin;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class BiKantin {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName()
            );
        } catch (Exception e) {
            System.out.println(
                "Gagal mengatur tampilan aplikasi: "
                + e.getMessage()
            );
        }

        SwingUtilities.invokeLater(() -> {
            FormLogin login = new FormLogin();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
        });
    }
}
