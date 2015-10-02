/*
 * Decompiled with CFR 0_102.
 *
 * Could not load the following classes:
 *  Player
 */
/*import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class webAppWithSort extends Applet implements ActionListener {
    private String out = "";
    private int count = 0;
    private ArrayList<String> saveOut = new ArrayList<String>();

    Button enter;
    Checkbox sortName;
    Checkbox sortSpeed;
    Checkbox sortBall;
    Checkbox sortHeight;

    public void init() {
        setLayout(new FlowLayout());
        enter = new Button("Submit");
        sortName = new Checkbox("Sort by Alpha");
        sortSpeed = new Checkbox("Sort by Speed");
        sortBall = new Checkbox("Sort by Ball Control");
        sortHeight = new Checkbox("Sort by Height");
        add(enter);
        add(sortName);
        add(sortSpeed);
        add(sortBall);
        add(sortHeight);
        enter.addActionListener(this);
    }


    public void paint(Graphics g) {
        if(sortName.getState()){
          for(int i = 0; i < saveOut.size();i++)
          i++;
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
}*/
/*
 *
 * THIS APPLET IS FOR THE TEXT FIELDS, ENTER, AND TEXT FILE BUTTON.
 *
 *
 */
 //imports
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.awt.Font;

public class webAppWithSort extends Applet implements ActionListener{
    private String out = "";
    private int count = 0;
    private ArrayList<String> saveOut = new ArrayList<String>();
    Font myFont = new Font("Palatino Linotype", Font.BOLD, 14);
    private static String smit = "Submitted!";
    TextField nameField;
    TextField speedField;
    TextField ballField;
    TextField heightField;
    Button enter;
    Button genFile;

    public void init() {
        setBackground(Color.LIGHT_GRAY);
        setForeground(Color.black);
        setLayout(new FlowLayout());
        nameField = new TextField("Enter Player's name.");
        speedField = new TextField("Enter Player's mile time.");
        ballField = new TextField("Rate Player's ball control out of 10.");
        heightField = new TextField("Enter Player's height in meters");
        enter = new Button("Submit");
        genFile = new Button("Generate Text File");
        add(nameField);
        add(speedField);
        add(ballField);
        add(heightField);
        add(enter);
        add(genFile);
        enter.addActionListener(this);
        genFile.addActionListener(this);
    }


    public void paint(Graphics g){
      //try{
      //BufferedImage bGimage = ImageIO.read(new File("img/Teamo-logo.png"));
        //g.drawImage(bGimage,0,0,this);
      //}catch(IOException e){
        //e.printStackTrace();
      //}
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
            String string = nameField.getText();
            double d = Double.parseDouble(speedField.getText());
            int n = (int)Double.parseDouble(ballField.getText());
            double h = Double.parseDouble(heightField.getText());
            Player player = new Player(string, n, d, h);
            out = player.stringify();
            saveOut.add(out);
            count++;
            repaint();
        }
        else if(actionEvent.getSource()==genFile){

          try{
            PrintTextFile data = new PrintTextFile("/Users/Alex/Desktop/thisisatest.txt", true);
            String content = "";
            for(int i = 0; i < saveOut.size(); i++){
              content = saveOut.get(i);
              data.writeToFile(content + "\n");
            }
          }catch(IOException e){
            e.printStackTrace();
          }

        }
    }
}
