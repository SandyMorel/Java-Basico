package grafico;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana {

    JFrame ventana;
    JPanel panelA, panelB, paneL1, panel2, panel3;

    JButton boton, boton1, boton2, boton3, botonp21, botonp22, botonp23;

    public void CrearpanelA() {

        panelA = new JPanel();
        boton = new JButton();
        boton1 = new JButton("5");
        boton.setText("7");
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
        panelA.add(boton);
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
        panelA.add(boton1);

    }

    public void CrearpanelB() {
        panelB = new JPanel();
        boton = new JButton();
        boton.setText("2");
        panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));
        panelB.add(boton);

    }

    public void CrearpaneL1() {

        paneL1 = new JPanel();
        boton = new JButton();
        boton.setText("3");
        paneL1.setLayout(new BoxLayout(paneL1, BoxLayout.X_AXIS));
        paneL1.add(boton);

    }

    public void Crearpanel2() {

        panel2 = new JPanel();
        boton = new JButton();
        botonp23 = new JButton("-");
        botonp22 = new JButton("6");
        botonp21 = new JButton("5");
        boton.setText("4");
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(boton);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(botonp21);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(botonp22);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(botonp23);

    }

    public void Crearpanel3() {

        panel3 = new JPanel();
        boton = new JButton();
        boton1 = new JButton("0");
        boton2 = new JButton(".");
        boton3 = new JButton("=");
        boton.setText("+");
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        panel3.add(boton);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        panel3.add(boton1);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        panel3.add(boton2);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));
        panel3.add(boton3);

    }

    public void CrearVentana() {
        ventana = new JFrame();
        ventana.setTitle("Ventana Nueva");
        ventana.setSize(338, 555);
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.add(panelA);
        ventana.add(panelB);
        ventana.add(paneL1);
        ventana.add(panel2);
        ventana.add(panel3);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);

    }

    public Ventana() {
        CrearpanelA();
        CrearpanelB();
        CrearpaneL1();
        Crearpanel2();
        Crearpanel3();
        CrearVentana();
    }

}
