import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

    JButton jbtExit = new JButton("Exit");
    JButton jbt = new JButton("=");
    JLabel jlb = new JLabel("攝氏");
    JLabel jlb2 = new JLabel("華氏");
    JTextField jtf = new JTextField("0");

    private Container cp;
    public MainFrame (){

        init();

    }

    private void init() {

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100,100,300,400);
        cp = this.getContentPane();
        cp.setLayout(null);

        jbtExit.setBounds(85,150,150,50);
        jbt.setBounds(175,100,50,50);
        jtf.setBounds(125,100,50,50);
        jlb.setBounds(75,100,50,50);
        jlb2.setBounds(225,100,50,50);

        jbtExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jbt.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float x = Float.parseFloat(jtf.getText());
                x = (x*9/5)+32;
               jlb2.setText(Float.toString(x)+"華氏");
            }
        });




        cp.add(jbtExit);
        cp.add(jbt);
        cp.add(jlb);
        cp.add(jlb2);
        cp.add(jtf);
    }
}
