package it.ian.scuola.gui.agenziamatrimonio;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame f1 = new JFrame("Agenzia matrimoale");

        JPanel rootPane = new JPanel();
        f1.getContentPane().add(rootPane);

        rootPane.setLayout(new BorderLayout());

        JPanel pLeft = new JPanel(new GridLayout(4,1));

        JPanel pRight = new JPanel(new GridLayout(3,1));

        JPanel pCentre = new JPanel(new GridLayout(1,1));


        JRadioButton lradiob1 = new JRadioButton("Agenzia Olanda");
        JRadioButton lradiob2 = new JRadioButton("Agenzia Italia");
        JRadioButton lradiob3 = new JRadioButton("Agenzia Germania");
        JRadioButton lradiob4 = new JRadioButton("Agenzia Norvegia");

        ButtonGroup lbuttonGroup = new ButtonGroup();
        lbuttonGroup.add(lradiob1);
        lbuttonGroup.add(lradiob2);
        lbuttonGroup.add(lradiob3);
        lbuttonGroup.add(lradiob4);

        pLeft.add(lradiob1);
        pLeft.add(lradiob2);
        pLeft.add(lradiob3);
        pLeft.add(lradiob4);

        rootPane.add(pLeft,BorderLayout.WEST);


        JLabel sesso = new JLabel("Spunta il tuo sesso");

        JRadioButton rbt_uomo = new JRadioButton("uomo");
        rbt_uomo.setIcon( new ImageIcon( "E:\\sesso maschile.png" ) );

        JRadioButton rbt_donna = new JRadioButton("donna");
        rbt_donna.setIcon( new ImageIcon( "E:\\sesso femminile.png" ) );

        ButtonGroup bgroup_UomoDonna = new ButtonGroup();
        bgroup_UomoDonna.add(rbt_uomo);
        bgroup_UomoDonna.add(rbt_donna);

        pRight.add(sesso);
        pRight.add(rbt_uomo);
        pRight.add(rbt_donna);

        rootPane.add(pRight,BorderLayout.EAST);

        JButton btnUscita = new JButton("INVIA");
        btnUscita.setBackground(Color.YELLOW);
        btnUscita.setForeground(Color.RED);

        rootPane.add(btnUscita,BorderLayout.SOUTH);

        JTextField txtTitolo = new JTextField("SCELTA FILE");
        txtTitolo.setBackground(Color.RED);
        txtTitolo.setForeground(Color.YELLOW);
        rootPane.add(txtTitolo, BorderLayout.NORTH);

        JLabel foto = new JLabel(new ImageIcon("E:\\matrimonio.jpg"));
        pCentre.add(foto);

        rootPane.add(pCentre,BorderLayout.CENTER);



        f1.pack();
        f1.setLocation(1,1);
        f1.setVisible(true);

    }
}
