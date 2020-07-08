import javax.swing.*;
import java.awt.*;

public class Elementos extends JFrame {


    private int width = 500;
    private int height = 500;
    JLabel Encabezado;
    JLabel Element;
    JLabel numeroAtomico;
    String titulo;
    String element;
    Fondo fondo;
    int AtomicNumber;


    public Elementos(String titulo,String element,int AtomicNumber,int ele) {
        this.titulo = titulo;
        this.element = element;
        this.AtomicNumber = AtomicNumber;

        fondo = new Fondo("FondoGases");
        fondo.setBounds(0,0,width,height);

        Encabezado = new JLabel(titulo);
        Encabezado.setBounds(100,0,400,50);
        Encabezado.setFont(new Font("SansSerif",Font.ITALIC,49));
        Encabezado.setForeground(Color.WHITE);

        ImageIcon i = new ImageIcon("src/Imagenes/H"+ele+".png");


        Element = new JLabel();
        Element.setBounds(5,10,200,200);
        Element.setIcon(new ImageIcon(i.getImage().getScaledInstance(Element.getWidth(),Element.getHeight(), Image.SCALE_SMOOTH)));
        Element.setBorder(null);

        numeroAtomico = new JLabel(String.valueOf(AtomicNumber));
        numeroAtomico.setBounds(5,70,30,20);
        numeroAtomico.setFont(new Font("SansSerif",Font.ROMAN_BASELINE,20));
        numeroAtomico.setForeground(Color.WHITE);


        this.add(Element);
        this.add(Encabezado);
        this.add(numeroAtomico);

        this.add(fondo);
        this.setLayout(null);
        this.setTitle(titulo);
        this.setSize(width,height);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.repaint();
    }

}
