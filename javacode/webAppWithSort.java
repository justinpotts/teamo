/*
 * Decompiled with CFR 0_102.
 *
 * Could not load the following classes:
 *  Player
 */
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class webAppWithSort extends Applet implements ActionListener {
    private String out = "";
    private int count = 0;
    private ArrayList<String> saveOut = new ArrayList<String>();
    private String nfName = "";
    private double sfSpeed = 0;
    private double hfHeight = 0;
    private int bfCtrl = 0;


    Checkbox sortName;
    Checkbox sortSpeed;
    Checkbox sortBall;
    Checkbox sortHeight;
    Font myFont = new Font("Palatino Linotype", Font.BOLD, 14);

    public void init() {
        setLayout(new FlowLayout());

        sortName = new Checkbox("Sort by Alpha");
        sortSpeed = new Checkbox("Sort by Speed");
        sortBall = new Checkbox("Sort by Ball Control");
        sortHeight = new Checkbox("Sort by Height");
        add(sortName);
        add(sortSpeed);
        add(sortBall);
        add(sortHeight);

    }


    public void paint(Graphics g) {
      g.setFont(myFont);
      g.setColor(Color.DARK_GRAY);
        if (count == 0) {
            g.drawString("", 20, 100);
        } else if (count != 0) {
            g.drawString(smit+ " " + out, 20, 100);
            int n = 200;
            for (int i = 0; i < saveOut.size(); i++) {
                g.drawString(saveOut.get(i), 20, n);
                n+=20;
            }
        }
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == enter) {
          
            String string = test.nameField.getText();
            double d = Double.parseDouble(test.speedField.getText());
            int n = (int)Double.parseDouble(test.ballField.getText());
            double h = Double.parseDouble(test.heightField.getText());
            Player player = new Player(string, n, d, h);
            out = player.stringify();
            saveOut.add(out);
            count++;
            repaint();
        }
    }



    public void setName(String s){
      nfName = s;
    }
    public void setSpeed(double s){
      sfSpeed = s;
    }
    public void setHeight(double h){
      hfHeight = h;
    }
    public void setCtrl(double c){
      bfCtrl = c;
    }
}
