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

    TextField nameField;
    TextField speedField;
    TextField ballField;
    Button enter;
    Checkbox sortName;
    Checkbox sortSpeed;
    Checkbox sortBall;

    public void init() {
        setLayout(new FlowLayout());
        nameField = new TextField("Enter Player's name.");
        speedField = new TextField("Enter Player's mile time.");
        ballField = new TextField("Rate Player's ball control out of 10.");
        enter = new Button("Submit");
        sortName = new Checkbox("Sort by Alpha");
        sortSpeed = new Checkbox("Sort by Speed");
        sortBall = new Checkbox("Sort by Ball Control");
        add(nameField);
        add(speedField);
        add(ballField);
        add(enter);
        add(sortName);
        add(sortSpeed);
        add(sortBall);
        enter.addActionListener(this);
    }


    public void paint(Graphics g) {
        if(sortName.getState()){
          for(int i = 0; i < saveOut.size();i++)

        }
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == enter) {
            String string = nameField.getText();
            double d = Double.parseDouble(speedField.getText());
            int n = (int)Double.parseDouble(ballField.getText());
            Player player = new Player(string, n, d);
            out = player.stringify();
            saveOut.add(out);
            count++;
            repaint();
        }
    }
}
