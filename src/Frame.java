import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;


public class Frame extends JFrame {
    Boolean visible = true;
    int sizeX = 200;
    int sizeY = 200;
    String title = "Goodbye World";
    MouseListenerClass mistener = new MouseListenerClass();
    ButtonListenerClass bistener = new ButtonListenerClass();
    JButton jutton = new JButton("Maus");
    public Graph g = new Graph();


    public void initFrame() {
        JFrame myF = new JFrame(title);
        myF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myF.setSize(sizeX, sizeY);
        JMenuBar bar = new JMenuBar();
        JMenu menu = new JMenu("Datei");
        myF.add(new JLabel("Hello world"));
        menu.add(new JMenuItem("Neu"));
        menu.add(new JMenuItem("Speichern"));
        menu.add(new JMenuItem("Speichern unter"));
        menu.add(new JMenuItem("Exportieren"));
        menu.add(new JMenuItem("Load input file"));
        JMenu menu1 = new JMenu("Einstellungen");
        menu1.add(new JMenuItem("stay safe"));
        menu1.add(new JMenuItem("to prevent"));
        menu1.add(new JMenuItem("leathal contamination"));
        menu1.add(new JMenuItem("with social practices"));
        bar.add(menu);
        bar.add(menu1);
        myF.setJMenuBar(bar);
        JToolBar tar = new JToolBar();
        tar.setSize(250, 50);
        jutton.addActionListener(bistener);
        tar.add(jutton);
        tar.add(new JButton("node"));
        tar.add(new JButton("Zustandsänderung"));
        myF.add(tar);
        myF.add(g);
        g.addMouseListener(mistener);

        //myF.add(new JPanel());


        myF.addMouseListener(mistener);
        myF.setVisible(visible);



    }




}


