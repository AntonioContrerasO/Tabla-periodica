import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

public class JuegoTabla extends JFrame implements ActionListener {
    private int WIDTH = 600;
    private int HEIGHT = 800;

    private JButton[] botones = new JButton[4];
    int[] correcto = new int[4];


    public JuegoTabla() {

        int x = 0;
        int y = 0;
        for (int i=0;i<botones.length;i++)
        {
            botones[i] = new JButton(String.valueOf(i));
            botones[i].setBounds(50+x,60+y,100,30);
            this.add(botones[i]);
            botones[i].addActionListener(this);
            x+=100;
            if (i==1)
            {
                y+=30;
                x=0;
            }
        }
        elementsRandom();
        System.out.println(Arrays.toString(correcto));

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
        for (int x = 0;x<a.length;x++ ){
           a[x] = random.nextInt(119);
           if (a[0]==a[1]||a[0]==a[2]||a[0]==a[3]||a[1]==a[2]||a[1]==a[3]||a[2]==a[3]);
            {
                a[x] = random.nextInt(118);
                System.out.println(a[x]);
            }
        }
        int[] arrayCorrecto = correctoS();
        correcto[0] = arrayCorrecto[0];
        correcto[1] = arrayCorrecto[1];
        correcto[2] = arrayCorrecto[2];
        correcto[3] = arrayCorrecto[3];

    }
    public int[] correctoS()
    {
        Random random = new Random();
        int chequeo = random.nextInt(4)+1;
        if (chequeo==1)
        {
            return new int[]{1, 0, 0, 0};
        }
        if (chequeo==2)
        {
            return new int[]{0, 1, 0, 0};
        }
        if (chequeo==3)
        {
            return new int[]{0, 0, 1, 0};
        }

        return new int[]{0, 0, 0, 1};
    }
    public void elements()
    {
        String[] elementos = new String[120];
        elementos[0] = "H";
    }


}
