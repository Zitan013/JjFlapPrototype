import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListenerClass implements ActionListener {
    Boolean inPlaceMode = false;
    Boolean inConnectMode = false;
    public void actionPerformed(ActionEvent e) {
        JButton jutton = (JButton) e.getSource();
        jutton.setText("sout=shout");
        System.out.println("AAAAAARRRRRGGGHHHHH");
    }

    public Boolean getInConnectMode() {
        return inConnectMode;
    }

    public Boolean getInPlaceMode() {
        return inPlaceMode;
    }
}
