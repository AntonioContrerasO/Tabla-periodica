import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Elementos extends JFrame {


    private int width = 500;
    private int height = 500;
    JLabel Encabezado;
    JLabel Element;
    JTextArea texto1;
    String titulo;
    String element;
    Fondo fondo;
    int AtomicNumber;
    ArrayList<String> contenido;

    public Elementos(String titulo,String element,int AtomicNumber,int ele) {
        this.titulo = titulo;
        this.element = element;
        this.AtomicNumber = AtomicNumber;

        fondo = new Fondo("FondoGases");
        fondo.setBounds(0,0,width,height);

        Encabezado = new JLabel(titulo);
        Encabezado.setBounds(240,20,300,35);
        Encabezado.setFont(new Font("SansSerif",Font.ITALIC,35));
        Encabezado.setForeground(Color.BLACK);

        ImageIcon i = new ImageIcon("src/Imagenes/H"+ele+".png");

        Element = new JLabel();
        Element.setBounds(5,10,200,200);
        Element.setIcon(new ImageIcon(i.getImage().getScaledInstance(Element.getWidth(),Element.getHeight(), Image.SCALE_SMOOTH)));
        Element.setBorder(null);
        
       texto1 = new JTextArea();
       texto1.setBounds(240,70,200,300);
       texto1.setFont(new Font("SansSerif",Font.ITALIC,15));
        texto1.setForeground(Color.BLACK);

        String cadena = "";
        contenido = Archivo.leerTodo("H.txt");
        for (String s : contenido) {

            cadena = cadena+s+"\n";
            texto1.setText(cadena);

        }





        this.add(Element);
        this.add(Encabezado);
       this.add(texto1);

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
