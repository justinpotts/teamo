//
//
//
//
//
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.imageio.ImageIO;

public class inApplet extends Applet implements ActionListener{
  //Variables go here

  JTextField nameBox;
  JTextField heightBox;
  JTextField ballBox;
  JTextField mileBox;

  JButton enter;

  Font myFont = new Font("Palatino Linotype", Font.BOLD, 14); //Creates Font

  int intValue = Integer.parseInt( "F5F5F5",16); Color bgColor = new Color( intValue ); //Sets applet background color

  public void init(){
    //Visual Layout stuff
    setBackground(bgColor);
    setForeground(Color.BLACK);
    setLayout(new GridLayout(5,1));
    //Instantiates buttons and fields
    nameBox = new JTextField("Name"); // text field
    heightBox = new JTextField("Height");// text field
    ballBox = new JTextField("Ball Control/10"); // text field
    mileBox = new JTextField("Mile Time");// text field
    enter = new JButton("Enter");
    //adds buttons and fields
    add(nameBox);
    add(heightBox);
    add(ballBox);
    add(mileBox);
    add(enter);
    //adds actionListener, sends to actionPerformed, which works in other classes
    enter.addActionListener(this);
  }

  public void actionPerformed(ActionEvent actionEvent){
    if(actionEvent.getSource() == enter){
      String n = nameBox.getText();
      double h = Double.parseDouble(heightBox.getText());
      int b = Integer.parseInt(ballBox.getText());
      double m = Double.parseDouble(mileBox.getText());
      Player save = new Player(n,h,b,m);
      save.stringify();
    }
  }

}
