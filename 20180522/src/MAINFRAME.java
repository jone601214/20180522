import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
import javax.xml.soap.Text;
public class MAINFRAME extends JFrame {
private int dirflag=1,objx=50,objy=50,objw=50,objh=50;
private Container cp;
private JButton jbtn1=new JButton("Run");
private JButton jbtn2=new JButton("↑" );
private JButton jbtn3=new JButton("↓");
private JButton jbtn4=new JButton("←");
private JButton jbtn5=new JButton("→");
private JButton jbtn6=new JButton("Exit");
private JLabel jlb=new JLabel();
private ImageIcon icon=new ImageIcon( "C:\\Users\\USER\\IdeaProjects\\20180522\\src\\12345678.png");
private Timer t1;
public MAINFRAME(){
    init();
}
private void init() {
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setResizable(false);
    this.setLocation(100, 50);
    this.setSize(800, 600);
    cp = this.getContentPane();
    jlb.setIcon(icon);
    jlb.setBounds(objx,objy,134,78);
    jbtn1.setBounds(100, 450, 100, 100);
    jbtn2.setBounds(200, 450, 100, 100);
    jbtn3.setBounds(300, 450, 100, 100);
    jbtn4.setBounds(400, 450, 100, 100);
    jbtn5.setBounds(500, 450, 100, 100);
    jbtn6.setBounds(600, 450, 100, 100);
    this.add(jlb);
    this.add(jbtn1);
    this.add(jbtn2);
    this.add(jbtn3);
    this.add(jbtn4);
    this.add(jbtn5);
    this.add(jbtn6);
    jbtn1.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            t1.start();
        }
    });
    jbtn2.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            dirflag=1;
        }
    });
    jbtn3.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            dirflag=2;
        }
    });
    jbtn4.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            dirflag=3;
        }
    });
    jbtn5.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            dirflag=4;
        }
    });
    t1 = new Timer(10, new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (dirflag) {
                case 1:
                    if (objy - 2 > 0) {
                        objy -= 2;
                    }
                    break;
                case 2:
                    if (objy < 420 - objh) {
                        objy += 2;
                    }
                    break;
                case 3:
                    if (objx-2>0){
                        objx-=2;
                    }
                    break;
                case 4:
                   if (objx<710-objh){
                       objx+=2;
                       break;
                   }
            }

            jlb.setLocation(objx, objy);
        }
    });
    jbtn6.addActionListener(new AbstractAction() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.exit(0);
        }
    });
}

}
