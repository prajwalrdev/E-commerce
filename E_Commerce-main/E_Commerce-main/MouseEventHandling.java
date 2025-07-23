import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventHandling extends JFrame {
    private JLabel statusLabel;

    public MouseEventHandling() {
        setTitle("Mouse Events Demo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        statusLabel = new JLabel("Move the mouse over the window");
        add(statusLabel, BorderLayout.SOUTH);

        addMouseListener(new CustomMouseListener());

        setVisible(true);
    }

    private class CustomMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            statusLabel.setText("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusLabel.setText("Mouse Entered at: (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusLabel.setText("Mouse Exited at: (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // You can handle mouse pressed event if needed
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // You can handle mouse released event if needed
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseEventHandling());
    }
}
