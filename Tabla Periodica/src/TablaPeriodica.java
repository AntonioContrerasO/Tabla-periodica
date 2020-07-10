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
    Elementos[] elementos = new Elementos[118];

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
           elementos[0] = new Elementos("Hidrogeno",imagenes[0],"1.-H");
       }
        if (e.getSource() == metalesAlcalinos[1])
        {
            elementos[1] = new Elementos("Litio",imagenes[1],"3.-Li");
        }
        if (e.getSource() == metalesAlcalinos[2])
        {
            elementos[2] = new Elementos("Sodio",imagenes[2],"11.-Na");
        }
        if (e.getSource() == metalesAlcalinos[3])
        {
            elementos[3] = new Elementos("Potasio",imagenes[3],"K");
        }
        if (e.getSource() == metalesAlcalinos[4])
        {
            elementos[4] = new Elementos("Rubidio",imagenes[4],"Rb");
        }
        if (e.getSource() == metalesAlcalinos[5])
        {
            elementos[5] = new Elementos("Cesio",imagenes[5],"Cs");
        }
        if (e.getSource() == metalesAlcalinos[6])
        {
            elementos[6] = new Elementos("Francio",imagenes[6],"Fr");
        }
        if (e.getSource() == metalesAlcalinoterreos[0])
        {
            elementos[7] = new Elementos("Berilio",imagenes[7],"Be");
        }
        if (e.getSource() == metalesAlcalinoterreos[1])
        {
            elementos[8] = new Elementos("magnesio",imagenes[8],"Mg");
        }
         if (e.getSource() == metalesAlcalinoterreos[2])
        {
            elementos[9] = new Elementos("calcio",imagenes[9],"Ca");
        }
         if (e.getSource() == metalesAlcalinoterreos[3])
        {
            elementos[10] = new Elementos("estroncio",imagenes[10],"Sr");
        }
         if (e.getSource() == metalesAlcalinoterreos[4])
        {
            elementos[11] = new Elementos("Bario",imagenes[11],"Ba");
        }
         if (e.getSource() == metalesAlcalinoterreos[5])
        {
            elementos[12] = new Elementos("Radio",imagenes[12],"Ra");
        }                               //10 4
        if(e.getSource()== metalesPesados[0][0])
        {
            elementos[13] = new Elementos("Escandio",imagenes[13],"Sc");
        }
        if(e.getSource()== metalesPesados[0][1])
        {
            elementos[14] = new Elementos("Itrio",imagenes[14],"Y");
        }
        if(e.getSource()== metalesPesados[0][2])
        {
            elementos[15] = new Elementos("Lantano",imagenes[15],"La");
        }
        if(e.getSource()== metalesPesados[0][3])
        {
            elementos[16] = new Elementos("Actinio",imagenes[16],"Ac");
        }
        if(e.getSource()== metalesPesados[1][0])
        {
            elementos[17] = new Elementos("Titanio",imagenes[17],"Ti");
        }
        if(e.getSource()== metalesPesados[1][1])
        {
            elementos[18] = new Elementos("Circonio",imagenes[18],"Zr");
        }
        if(e.getSource()== metalesPesados[1][2])
        {
            elementos[19] = new Elementos("Hafnio",imagenes[19],"Hf");
        }
        if(e.getSource()== metalesPesados[1][3])
        {
            elementos[20] = new Elementos("Rutherfordio",imagenes[20],"Rf");
        }
         if(e.getSource()== metalesPesados[2][0])
        {
            elementos[21] = new Elementos("Vanadio",imagenes[21],"V");
        }
         if(e.getSource()== metalesPesados[2][1])
        {
            elementos[22] = new Elementos("Niobio",imagenes[22],"Nb");
        }
        if(e.getSource()== metalesPesados[2][2])
        {
            elementos[23] = new Elementos("Tantalo",imagenes[23],"Ta");
        }
        if(e.getSource()== metalesPesados[2][3])
        {
            elementos[24] = new Elementos("Dubnio",imagenes[24],"Db");
        }
        if(e.getSource()== metalesPesados[3][0])
        {
            elementos[25] = new Elementos("Cromo",imagenes[25],"Cr");
        }
        if(e.getSource()== metalesPesados[3][1])
        {
            elementos[26] = new Elementos("Molibdeno",imagenes[26],"Mo");
        }
        if(e.getSource()== metalesPesados[3][2])
        {
            elementos[27] = new Elementos("Wolframio",imagenes[27],"W");
        }
        if(e.getSource()== metalesPesados[3][3])
        {
            elementos[28] = new Elementos("Seaborgio",imagenes[28],"Sg");
        }
        if(e.getSource()== metalesPesados[4][0])
        {
            elementos[29] = new Elementos("Manganeso",imagenes[29],"Mn");
        }
        if(e.getSource()== metalesPesados[4][1])
        {
            elementos[30] = new Elementos("Tecnecio",imagenes[30],"Tc");
        }
        if(e.getSource()== metalesPesados[4][2])
        {
            elementos[31] = new Elementos("Renio",imagenes[31],"Re");
        }
        if(e.getSource()== metalesPesados[4][3])
        {
            elementos[32] = new Elementos("Bohrio",imagenes[32],"Bh");
        }
        if(e.getSource()== metalesPesados[5][0])
        {
            elementos[33] = new Elementos("Hierro",imagenes[33],"Fe");
        }
         if(e.getSource()== metalesPesados[5][0])
        {
            elementos[33] = new Elementos("Hierro",imagenes[33],"");
        }



















    }
    
}
//Alcalinos 7
//Alcalinoterreos 6
//metales Pesados 40[][]
//metales Y Gases 30
//