//
//
//
//
//

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class outApplet extends Applet{
  Font myFont = new Font("Palatino Linotype", Font.BOLD, 14); //Creates Font
  public String drawPlayer = "";
  ArrayList<String> ayy = new ArrayList<String>();
  ListIterator<String> bayy;
  int intValue = Integer.parseInt( "F5F5F5",16); Color bgColor = new Color( intValue ); //Sets applet background color


  public void init(){
    setLayout(new FlowLayout());
    setBackground(bgColor);
    setForeground(Color.BLACK);
  }
  public void addString(String s){
   drawPlayer = s;
   bayy = ayy.listIterator();
   bayy.add(s); //listiterator.add!
   repaint();
  }
  public void paint(Graphics g){
    g.setFont(myFont);
    g.setColor(Color.DARK_GRAY);

    g.drawString("This only shows that the applet exists!",20, 100);

    List<String> dat = new ArrayList<String>();
    ListIterator<String> z = dat.listIterator();



    int count = 200;
    g.drawString(drawPlayer,20,count);
    bayy.previous();
    bayy.remove();
    count+=20;
    int n = 200;
    while(z.hasNext()){
      g.drawString(z.next(), 20, n);
      n+=20;
    }

  }
}
