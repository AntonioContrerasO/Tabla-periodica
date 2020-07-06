import javax.swing.*;

public class Elementos extends JFrame {

    JFrame elemento;
    String titulo;

    public Elementos(String titulo) {
        this.titulo = titulo;


        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);



    }
}
