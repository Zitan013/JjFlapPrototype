import javax.swing.*;
import java.awt.event.*;

public class MouseListenerClass implements MouseListener {

    public void mouseClicked(MouseEvent e){
        System.out.println("he");
        Graph g = (Graph) e.getSource();
        g.coords[1] = 100;
        g.repaint();

    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }
}
