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

public class webApp extends Applet implements ActionListener{
    private String out = "";
    private int count = 0;
    private ArrayList<String> saveOut = new ArrayList<String>();

    TextField nameField;

    TextField speedField;

    TextField ballField;

    Button enter;

    Button genFile;

    public void init() {
        setLayout(new FlowLayout());
        nameField = new TextField("Enter Player's name.");
        speedField = new TextField("Enter Player's mile time.");
        ballField = new TextField("Rate Player's ball control out of 10.");
        enter = new Button("Submit");
        genFile = new Button("Generate Text File");
        add(nameField);
        add(speedField);
        add(ballField);
        add(enter);
        add(genFile);
        enter.addActionListener(this);
        genFile.addActionListener(this);
    }


    public void paint(Graphics g) {
        if (count == 0) {
            g.drawString("", 20, 100);
        } else if (count != 0) {
            g.drawString("Submitted! " + out, 20, 100);
            int n = 200;
            for (int i = 0; i < saveOut.size(); i++) {
                g.drawString(saveOut.get(i), 20, n);
                n+=20;
            }

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
        else if(actionEvent.getSource()==genFile){
          PrintTextFile p = new PrintTextFile();
          p.textFileMaker(saveOut);
        }
    }
}
