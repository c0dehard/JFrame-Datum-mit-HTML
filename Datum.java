
import java.awt.FlowLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Datum {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Datum");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        frame.add(label);
        frame.setVisible(true);
        DateTimeFormatter f = DateTimeFormatter.ofPattern  ("dd.MM.yyyy");
        LocalDate date = LocalDate.now();
        String txt = date.format(f);
        label.setText("<html><h1 style ='color: #000000; background-color: green'>"+txt+"</h1></html>");
    }
}