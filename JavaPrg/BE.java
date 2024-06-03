import java.awt.*;
public class BE {
    
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");
        Button b = new Button("Click here");

        b.setBounds(50,100,80,30);
        f.add(b);

        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
