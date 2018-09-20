import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame2  extends JFrame{
    private JButton B1[][] = new JButton[3][3] ;
    private JLabel L1 = new JLabel("GAME");
    private Container cp ;
    private JPanel P1 = new JPanel(new GridLayout(1,1,1,1));
    private JPanel P2 = new JPanel(new GridLayout(3,3,3,3));
    private JPanel P3 = new JPanel(new GridLayout(1,1,2,2));
    private  JButton jbtExit = new JButton("Exit");
    public MainFrame2(){
        init();
    }
    private void init(){

        this.setBounds(100,100,425,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.add(P1,BorderLayout.NORTH);
        cp.add(P2,BorderLayout.CENTER);
        cp.add(P3,BorderLayout.SOUTH);
        P1.add(L1);
        P3.add(jbtExit);

        L1.setOpaque(true);
        L1.setBackground(new Color(255,255,0));
        L1.setFont(new Font(null,Font.BOLD,20));



        B1[0][0]=new JButton("");
        B1[0][1]=new JButton("");
        B1[0][2]=new JButton("");
        B1[1][0]=new JButton("");
        B1[1][1]=new JButton("");
        B1[1][2]=new JButton("");
        B1[2][0]=new JButton("");
        B1[2][1]=new JButton("");
        B1[2][2]=new JButton("");
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0 ; j<3 ;j++){
                P2.add(B1[i][j]);
            }
        }

        jbtExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        B1[0][0].addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

    }
}

