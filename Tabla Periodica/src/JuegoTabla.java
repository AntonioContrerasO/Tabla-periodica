import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class JuegoTabla extends JFrame implements ActionListener {
    private int WIDTH = 600;
    private int HEIGHT = 800;

    private JButton[] botones = new JButton[4];
    int[] correcto = new int[4];
    private JLabel texto;
    private int textoLabel;


    public JuegoTabla() {

        texto = new JLabel("");
        texto.setBounds(150,150,400,50);
        texto.setFont(new Font("SansSerif",Font.ITALIC,49));
        texto.setForeground(Color.BLACK);


        int x = 0;
        int y = 0;
        for (int i=0;i<botones.length;i++)
        {
            botones[i] = new JButton();
            botones[i].setBounds((WIDTH/6)+x,300+y,200,200);
            this.add(botones[i]);
            botones[i].addActionListener(this);
            x+=200;
            if (i==1)
            {
                y+=200;
                x=0;
            }
        }
        elements();
        elementsRandom();
        System.out.println(Arrays.toString(correcto));

        this.add(texto);
        this.setSize(WIDTH,HEIGHT);
        this.setTitle("QUIZ");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botones[0])
        {
            if (correcto[0]==0)
            {
                System.out.println("eres Puto");
            }
            if (correcto[0]==1)
            {
                elementsRandom();
            }
        }
        if (e.getSource() == botones[1])
        {
            if (correcto[1]==0)
            {
                System.out.println("eres Puto");
            }
            if (correcto[1]==1)
            {
                elementsRandom();
            }
        }
        if (e.getSource() == botones[2])
        {
            if (correcto[2]==0)
            {
                System.out.println("eres Puto");
            }
            if (correcto[2]==1)
            {
                elementsRandom();
            }
        }
        if (e.getSource() == botones[3])
        {
            if (correcto[3]==0)
            {
                System.out.println("eres Puto");
            }
            if (correcto[3]==1)
            {
                elementsRandom();
            }
        }
    }


    public void elementsRandom()
    {
        Random random = new Random();
        int[] a = new int[4];
        for (int x = 0;x<a.length;x++){
           a[x] = random.nextInt(117);
           if (a[0]==a[1]||a[0]==a[2]||a[0]==a[3]||a[1]==a[2]||a[1]==a[3]||a[2]==a[3]);
            {
                a[x] = random.nextInt(117);
            }
            if (a[x]==56)
            {
                a[x] = random.nextInt(117);
            }
            if (a[x]==88)
            {
                a[x] = random.nextInt(117);
            }
        }
        int[] arrayCorrecto = correctoS(a);
        correcto[0] = arrayCorrecto[0];
        correcto[1] = arrayCorrecto[1];
        correcto[2] = arrayCorrecto[2];
        correcto[3] = arrayCorrecto[3];

        ImageIcon[] imageIcons = new ImageIcon[4];
        for (int i = 0;i<imageIcons.length;i++ )
        {
            imageIcons[i] = new ImageIcon("src/Imagenes/Atos/"+(a[i]+1)+".png");
        }
        botones[0].setIcon(new ImageIcon(imageIcons[0].getImage().getScaledInstance(botones[0].getWidth(),botones[0].getHeight(), Image.SCALE_SMOOTH)));
        botones[1].setIcon(new ImageIcon(imageIcons[1].getImage().getScaledInstance(botones[1].getWidth(),botones[1].getHeight(), Image.SCALE_SMOOTH)));
        botones[2].setIcon(new ImageIcon(imageIcons[2].getImage().getScaledInstance(botones[2].getWidth(),botones[2].getHeight(), Image.SCALE_SMOOTH)));
        botones[3].setIcon(new ImageIcon(imageIcons[3].getImage().getScaledInstance(botones[3].getWidth(),botones[3].getHeight(), Image.SCALE_SMOOTH)));
        revalidate();
    }
    public int[] correctoS(int[] numRandom)
    {
        Random random = new Random();
        int chequeo = random.nextInt(4)+1;
        if (chequeo==1)
        {
            texto.setText(elementos[numRandom[0]].getNombre());
            return new int[]{1, 0, 0, 0};
        }
        if (chequeo==2)
        {
            texto.setText(elementos[numRandom[1]].getNombre());
            return new int[]{0, 1, 0, 0};
        }
        if (chequeo==3)
        {
            texto.setText(elementos[numRandom[2]].getNombre());
            return new int[]{0, 0, 1, 0};
        }
        texto.setText(elementos[numRandom[3]].getNombre());
        return new int[]{0, 0, 0, 1};
    }
    ElementosDatos[] elementos = new ElementosDatos[118];
    public void elements() {




        elementos[0] = new ElementosDatos("H"  , "1"  , "HIDRÓGENO");
        elementos[1] = new ElementosDatos("He" , "2"  , "HELIO");
        elementos[2] = new ElementosDatos("Li" , "3"  , "LITIO");
        elementos[3] = new ElementosDatos("Be" , "4"  , "BERILIO");
        elementos[4] = new ElementosDatos("B"  , "5"  , "BORO");
        elementos[5] = new ElementosDatos("C"  , "6"  , "CARBONO");
        elementos[6] = new ElementosDatos("N"  , "7"  , "NITRÓGENO");
        elementos[7] = new ElementosDatos("O"  , "8"  , "OXÍGENO");
        elementos[8] = new ElementosDatos("F"  , "9"  , "FLÚOR");
        elementos[9] = new ElementosDatos("Ne" , "10" , "NEÓN");
        elementos[10] = new ElementosDatos("Na", "11" , "SODIO");
        elementos[11] = new ElementosDatos("Mg", "12" , "MAGNESIO");
        elementos[12] = new ElementosDatos("Al", "13" , "ALUMINIO");
        elementos[13] = new ElementosDatos("Si", "14" , "SILICIO");
        elementos[14] = new ElementosDatos("P" , "15" , "FÓSFORO");
        elementos[15] = new ElementosDatos("S" , "16" , "AZUGRE");
        elementos[16] = new ElementosDatos("Cl", "17" , "CLORO");
        elementos[17] = new ElementosDatos("Ar", "18" , "ARGÓN");
        elementos[18] = new ElementosDatos("K" , "19" , "POTASIO");
        elementos[19] = new ElementosDatos("Ca", "20" , "CALCIO");
        elementos[20] = new ElementosDatos("Sc", "21" , "ESCANDIO");
        elementos[21] = new ElementosDatos("Ti", "22" , "TITANIO");
        elementos[22] = new ElementosDatos("V" , "23" , "VANADIO");
        elementos[23] = new ElementosDatos("Cr", "24" , "CROMO");
        elementos[24] = new ElementosDatos("Mn", "25" , "MANGANESO");
        elementos[25] = new ElementosDatos("Fe", "26" , "HIERRO");
        elementos[26] = new ElementosDatos("Co", "27" , "COBALTO");
        elementos[27] = new ElementosDatos("Ni", "28" , "NÍQUEL");
        elementos[28] = new ElementosDatos("Cu", "29" , "COBRE");
        elementos[29] = new ElementosDatos("Zn", "30" , "ZINC");
        elementos[30] = new ElementosDatos("Ga", "31" , "GALIO");
        elementos[31] = new ElementosDatos("Ge", "32" , "GERMANIO");
        elementos[32] = new ElementosDatos("As", "33" , "ARSÉNICO");
        elementos[33] = new ElementosDatos("Se", "34" , "SELENIO");
        elementos[34] = new ElementosDatos("Br", "35" , "BROMO");
        elementos[35] = new ElementosDatos("Kr", "36" , "KRIPTÓN");
        elementos[36] = new ElementosDatos("Rb", "37" , "RUBIDIO");
        elementos[37] = new ElementosDatos("Sr", "38" , "ESTRONCIO");
        elementos[38] = new ElementosDatos("Y" , "39" , "ITRIO");
        elementos[39] = new ElementosDatos("Zr", "40" , "CIRCONIO");
        elementos[40] = new ElementosDatos("Nb", "41" , "NIOBIO");
        elementos[41] = new ElementosDatos("Mo", "42" , "MOLIBDENO");
        elementos[42] = new ElementosDatos("Tc", "43" , "TECNECIO");
        elementos[43] = new ElementosDatos("Ru", "44" , "RUTENIO");
        elementos[44] = new ElementosDatos("Rh", "45" , "RODIO");
        elementos[45] = new ElementosDatos("Pd", "46" , "PALADIO");
        elementos[46] = new ElementosDatos("Ag", "47" , "PLATA");
        elementos[47] = new ElementosDatos("Cd", "48" , "CADMIO");
        elementos[48] = new ElementosDatos("In", "49" , "INDIO");
        elementos[49] = new ElementosDatos("Sn", "50" , "ESTAÑO");
        elementos[50] = new ElementosDatos("Sb", "51" , "ANTIMONIO");
        elementos[51] = new ElementosDatos("Te", "52" , "TELURIO");
        elementos[52] = new ElementosDatos("I" , "53" , "YODO");
        elementos[53] = new ElementosDatos("Xe", "54" , "XENÓN");
        elementos[54] = new ElementosDatos("Cs", "55" , "CESIO");
        elementos[55] = new ElementosDatos("Ba", "56" , "BARIO");
        elementos[56] = new ElementosDatos("La", "57" , "LANTANO");
        elementos[57] = new ElementosDatos("Ce", "58" , "CERIO");
        elementos[58] = new ElementosDatos("Pr", "59" , "PRASEODIMIO");
        elementos[59] = new ElementosDatos("Nd", "60" , "NEODIMIO");
        elementos[60] = new ElementosDatos("Pm", "61" , "PROMETIO");
        elementos[61] = new ElementosDatos("Sm", "62" , "SAMARIO");
        elementos[62] = new ElementosDatos("Eu", "63" , "EUROPIO");
        elementos[63] = new ElementosDatos("Gd", "64" , "GADOLINIO");
        elementos[64] = new ElementosDatos("Tb", "65" , "TERBIO");
        elementos[65] = new ElementosDatos("Dy", "66" , "DISPROSIO");
        elementos[66] = new ElementosDatos("Ho", "67" , "HOLMIO");
        elementos[67] = new ElementosDatos("Er", "68" , "ERBIO");
        elementos[68] = new ElementosDatos("Tm", "69" , "TULIO");
        elementos[69] = new ElementosDatos("Yb", "70" , "ITERBIO");
        elementos[70] = new ElementosDatos("Lu", "71" , "LUTECIO");
        elementos[71] = new ElementosDatos("Hf", "72" , "HAFNIO");
        elementos[72] = new ElementosDatos("Ta", "73" , "TÁNTALO");
        elementos[73] = new ElementosDatos("W" , "74" , "WOLFRAMIO");
        elementos[74] = new ElementosDatos("Re", "75" , "RENIO");
        elementos[75] = new ElementosDatos("Os", "76" , "OSMIO");
        elementos[76] = new ElementosDatos("Ir", "77" , "IRIDIO");
        elementos[77] = new ElementosDatos("Pt", "78" , "PLATINO");
        elementos[78] = new ElementosDatos("Au", "79" , "ORO");
        elementos[79] = new ElementosDatos("Hg", "80" , "MERCURIO");
        elementos[80] = new ElementosDatos("Tl", "81" , "TALIO");
        elementos[81] = new ElementosDatos("Pb", "82" , "PLOMO");
        elementos[82] = new ElementosDatos("Bi", "83" , "BISMUTO");
        elementos[83] = new ElementosDatos("Po", "84" , "POLONIO");
        elementos[84] = new ElementosDatos("At", "85" , "ASTATO");
        elementos[85] = new ElementosDatos("Rn", "86" , "RADÓN");
        elementos[86] = new ElementosDatos("Fr", "87" , "FRANCIO");
        elementos[87] = new ElementosDatos("Ra", "88" , "RADIO");
        elementos[88] = new ElementosDatos("Ac", "89" , "ACTINIO");
        elementos[89] = new ElementosDatos("Th", "90" , "TORIO");
        elementos[90] = new ElementosDatos("Pa", "91" , "PROTACTINIO");
        elementos[91] = new ElementosDatos("U" , "92" , "URANIO");
        elementos[92] = new ElementosDatos("Np", "93" , "NEPTUNIO");
        elementos[93] = new ElementosDatos("Pu", "94" , "PLUTONIO");
        elementos[94] = new ElementosDatos("Am", "95" , "AMERICIO");
        elementos[95] = new ElementosDatos("Cm", "96" , "CURIO");
        elementos[96] = new ElementosDatos("Bk", "97" , "BERKELIO");
        elementos[97] = new ElementosDatos("Cf", "98" , "CALIFORNIO");
        elementos[98] = new ElementosDatos("Es", "99" , "EINSTENIO");
        elementos[99] = new ElementosDatos("Fm", "100", "FERMIO");
        elementos[100] = new ElementosDatos("Md","101", "MENDELEVIO");
        elementos[101] = new ElementosDatos("No","102", "NOBELIO");
        elementos[102] = new ElementosDatos("Lr","103", "LAWRENCIO");
        elementos[103] = new ElementosDatos("Rf","104", "RUTHERFORDIO");
        elementos[104] = new ElementosDatos("Db","105", "DUBNIO");
        elementos[105] = new ElementosDatos("Sg","106", "SEABORGIO");
        elementos[106] = new ElementosDatos("Bh","107", "BOHRIO");
        elementos[107] = new ElementosDatos("Hs","108", "HASIO");
        elementos[108] = new ElementosDatos("Mt","109", "MEITNERIO");
        elementos[109] = new ElementosDatos("Ds","110", "DARMSTATIO");
        elementos[110] = new ElementosDatos("Rg","111", "ROENTGENIO");
        elementos[111] = new ElementosDatos("Cn","112", "COPERNICIO");
        elementos[112] = new ElementosDatos("Nh","113", "NIHONIO");
        elementos[113] = new ElementosDatos("Fl","114", "FLEROVIO");
        elementos[114] = new ElementosDatos("Mc","115", "MOSCOVIO");
        elementos[115] = new ElementosDatos("Lv","116", "LIVERMORIO");
        elementos[116] = new ElementosDatos("Ts","117", "TENESO");
        elementos[117] = new ElementosDatos("Og","118", "OGANESÓN");
    }


}
