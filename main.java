/*
 * Decompiled with CFR 0.137.
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("OpnLnkXTms");
        JPanel f_pane = new JPanel();
        JTextField url = new JTextField();
        JTextField times = new JTextField();
        JLabel X = new JLabel("X");
        JLabel auth = new JLabel("Mil\u00d840#V1.0");
        JButton but = new JButton("Opn");
        JTextArea xplain = new JTextArea("\nSo... That's Just A Program That Open A Link On X Number Of Tabs. \nAll You Have To Do"
        		+ " Is To Enter/Paste The Link On The Field Provided, And Enter The Number Of Tabs You Want To Open.\n\n"
        		+ " [NOTE] -> Always Enter The Link In This Format: [http://www.0000.000] And Always Provide A Number"
        		+ "Of Tab;\n \t Otherwise, The Program Will Crash [!]");
        f_pane.setSize(700, 350);
        f_pane.setLayout(null);
        f_pane.add(url);
        f_pane.add(times);
        f_pane.add(X);
        f_pane.add(but);
        f_pane.add(xplain);
        f_pane.add(auth);
        frame.setSize(700, 350);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(f_pane);
        auth.setBounds(600, 205, 400, 200);
        url.setBounds(20, 150, 500, 50);
        xplain.setBounds(20, 10, 660, 120);
        xplain.setBackground(Color.DARK_GRAY);
        xplain.setForeground(Color.white);
        xplain.setEditable(false);
        times.setBounds(580, 150, 100, 50);
        X.setBounds(550, 150, 100, 50);
        but.setBounds(300, 220, 100, 50);
        but.setBackground(Color.green);
        but.setForeground(Color.darkGray);
        but.addActionListener(x -> {
            String txt = new String(url.getText());
            int nber = Integer.parseInt(times.getText());
            for (int y = 1; y <= nber; ++y) {
                try {
                    URI Link = new URI(txt);
                    Desktop.getDesktop().browse(Link);
                    continue;
                }
                catch (IOException | URISyntaxException w) {
                    w.printStackTrace();
                }
            }
        });
    }
}

