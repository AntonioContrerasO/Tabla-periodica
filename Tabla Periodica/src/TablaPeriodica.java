import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablaPeriodica implements ActionListener {

    private JFrame panel;
    Fondo fondo;
    private int width = 1250;
    private int heigth = 850;
    private int subir = 75;
    private int centrar = -20;

    private int cuadraW =60;
    private int cuadraH =68;

    JLabel tiposElementos;
    JButton[] metalesAlcalinos;
    JButton[] metalesAlcalinoterreos;
    JButton[][] metalesPesados;
    JButton[][] metalesYGases;
    JButton[] gasesNobles;
    JButton[] lactanidosYactinidos;

    ImageIcon[] imagenes = new ImageIcon[120];
    ImageIcon extra = new ImageIcon("src/Imagenes/E.png");

    Elementos[] elementos = new Elementos[120];

    public TablaPeriodica() {

        panel = new JFrame("Tabla Periodica");
        fondo = new Fondo("Fondo");
        fondo.setBounds(0,0,width,heigth);


        tiposElementos = new JLabel();
        tiposElementos.setBounds(280,80+subir,450,150);
        tiposElementos.setIcon(new ImageIcon(extra.getImage().getScaledInstance(tiposElementos.getWidth(),tiposElementos.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(tiposElementos);

        for (int x=0;x<imagenes.length;x++)
        {
            imagenes[x] = new ImageIcon("src/Imagenes/H"+x+".png");
        }

        //Botones
        metalesAlcalinos = new JButton[7];

        int y = 0;
        int x =0;
        int prueba=0;
        for (int indice=0;indice<metalesAlcalinos.length;indice++)
        {
            metalesAlcalinos[indice] = new MiBoton();
            metalesAlcalinos[indice].setBounds(104+centrar,57+y+subir,cuadraW,cuadraH);
            metalesAlcalinos[indice].setIcon(new ImageIcon(imagenes[indice].getImage().getScaledInstance(metalesAlcalinos[x].getWidth(),metalesAlcalinos[x].getHeight(), Image.SCALE_SMOOTH)));
            metalesAlcalinos[indice].setContentAreaFilled(false);
            metalesAlcalinos[indice].setBorder(null);
            panel.add(metalesAlcalinos[indice]);
            metalesAlcalinos[indice].addActionListener(this);
            y+=cuadraH;
            prueba++;
        }
        y = 0;
        metalesAlcalinoterreos = new JButton[6];
        for (int indie=0;indie<metalesAlcalinoterreos.length;indie++)
        {
            metalesAlcalinoterreos[indie] = new MiBoton();
            metalesAlcalinoterreos[indie].setBounds(161+centrar,125+y+subir,cuadraW,cuadraH);
            metalesAlcalinoterreos[indie].setIcon(new ImageIcon(imagenes[prueba].getImage().getScaledInstance(metalesAlcalinos[indie].getWidth(),metalesAlcalinos[indie].getHeight(), Image.SCALE_SMOOTH)));
            metalesAlcalinoterreos[indie].setContentAreaFilled(false);
            metalesAlcalinoterreos[indie].setBorder(null);
            panel.add(metalesAlcalinoterreos[indie]);
            metalesAlcalinoterreos[indie].addActionListener(this);
            y+=cuadraH;
            prueba++;
        }
        y=0;
        metalesPesados = new JButton[10][4];
        for (int indo=0;indo<10;indo++)
        {
            for (int indo2=0;indo2<4;indo2++)
            {
                metalesPesados[indo][indo2] = new MiBoton();
                metalesPesados[indo][indo2].setBounds(216+x+centrar,261+y+subir,cuadraW,cuadraH);
                metalesPesados[indo][indo2].setIcon(new ImageIcon(imagenes[prueba].getImage().getScaledInstance(metalesPesados[indo][indo2].getWidth(),metalesPesados[indo][indo2].getHeight(), Image.SCALE_SMOOTH)));
                metalesPesados[indo][indo2].setContentAreaFilled(false);
                metalesPesados[indo][indo2].setBorder(null);
                panel.add(metalesPesados[indo][indo2]);
                metalesPesados[indo][indo2].addActionListener(this);
                y+=cuadraH;
                prueba++;
            }
            x += cuadraW;
            y=0;
        }
        y=0;
        x=0;
        metalesYGases = new JButton[5][6];
        for (int indo=0;indo<5;indo++)
        {
            for (int indo2=0;indo2<6;indo2++)
            {
                metalesYGases[indo][indo2] = new MiBoton();
                metalesYGases[indo][indo2].setBounds(816+x+centrar,125+y+subir,cuadraW,cuadraH);
                metalesYGases[indo][indo2].setIcon(new ImageIcon(imagenes[prueba].getImage().getScaledInstance(metalesYGases[indo][indo2].getWidth(),metalesYGases[indo][indo2].getHeight(), Image.SCALE_SMOOTH)));
                metalesYGases[indo][indo2].setContentAreaFilled(false);
                metalesYGases[indo][indo2].setBorder(null);
                panel.add(metalesYGases[indo][indo2]);
                metalesYGases[indo][indo2].addActionListener(this);
                y+=cuadraH;
                prueba++;
            }
            x += cuadraW;                       //1111*11 = 12221
            y=0;                                //5803*11 = 63833
        }
        gasesNobles = new JButton[7];
        y=0;
        for (int i=0;i<gasesNobles.length;i++)
        {
            gasesNobles[i] = new MiBoton();
            gasesNobles[i].setBounds(1116+centrar,57+y+subir,cuadraW,cuadraH);
            gasesNobles[i].setIcon(new ImageIcon(imagenes[prueba].getImage().getScaledInstance(gasesNobles[i].getWidth(),gasesNobles[i].getHeight(), Image.SCALE_SMOOTH)));
            gasesNobles[i].setContentAreaFilled(false);
            gasesNobles[i].setBorder(null);
            panel.add(gasesNobles[i]);
            gasesNobles[i].addActionListener(this);
            y+=cuadraH;
            prueba++;
        }
        lactanidosYactinidos = new JButton[30];
        x = 0;
        y = 0;
        for (int c=0;c<lactanidosYactinidos.length;c++) {
            lactanidosYactinidos[c] = new MiBoton();
            lactanidosYactinidos[c].setBounds(276 + x + centrar, 553 + y+subir, cuadraW, cuadraH);
            lactanidosYactinidos[c].setIcon(new ImageIcon(imagenes[prueba].getImage().getScaledInstance(lactanidosYactinidos[c].getWidth(), lactanidosYactinidos[c].getHeight(), Image.SCALE_SMOOTH)));
            lactanidosYactinidos[c].setContentAreaFilled(false);
            lactanidosYactinidos[c].setBorder(null);
            panel.add(lactanidosYactinidos[c]);
            lactanidosYactinidos[c].addActionListener(this);
            x += cuadraW;
            if (c == 14) {
                y += cuadraH;
                x = 0;
            }
            prueba++;
        }





        panel.add(fondo);
        panel.setSize(width,heigth);
        panel.setResizable(false);
        panel.setLocationRelativeTo(null);
        panel.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panel.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if (e.getSource() == metalesAlcalinos[0])
       {
           elementos[0] = new Elementos("Hidrogeno",imagenes[0]);
       }
        if (e.getSource() == metalesAlcalinos[1])
        {
            elementos[1] = new Elementos("Litio",imagenes[1]);
        }
        if (e.getSource() == metalesAlcalinos[2])
        {
            elementos[2] = new Elementos("Sodio",imagenes[2]);
        }
        if (e.getSource() == metalesAlcalinos[3])
        {
            elementos[3] = new Elementos("Potasio",imagenes[3]);
        }
        if (e.getSource() == metalesAlcalinos[4])
        {
            elementos[4] = new Elementos("Rubidio",imagenes[4]);
        }
        if (e.getSource() == metalesAlcalinos[5])
        {
            elementos[5] = new Elementos("Cesio",imagenes[5]);
        }
        if (e.getSource() == metalesAlcalinos[6])
        {
            elementos[6] = new Elementos("Francio",imagenes[6]);
        }
        if (e.getSource() == metalesAlcalinoterreos[0])
        {
            elementos[7] = new Elementos("Be",imagenes[7]);
        }
        if (e.getSource() == metalesAlcalinoterreos[1])
        {
            elementos[8] = new Elementos("Francio",imagenes[8]);
        }
    }
    
}
//Alcalinos 7
//Alcalinoterreos 6
//metales Pesados 40
//metales Y Gases 30
//