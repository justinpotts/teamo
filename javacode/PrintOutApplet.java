//
//
//
//
//
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.image.*;
import javax.imageio.ImageIO;
import java.awt.Font;


public class PrintOutApplet extends Applet{
  private ArrayList<String> ret = new ArrayList<String>();
  Font myFont = new Font("Palatino Linotype", Font.BOLD, 14);
  Checkbox sortA;
  Checkbox sortB;
  Checkbox sortH;
  Checkbox sortS;
  int intValue = Integer.parseInt( "F5F5F5",16);
  Color aColor = new Color( intValue );
  public void init(){
    setLayout(new FlowLayout());
    setBackground(aColor);
    setForeground(Color.DARK_GRAY);
    sortA = new Checkbox("Sort Alphabetically");
    sortB = new Checkbox("Sort by Ball Control");
    sortH = new Checkbox("Sort by Height");
    sortS = new Checkbox("Sort by Speed");
    add(sortA);
    add(sortB);
    add(sortH);
    add(sortS);
  }
  public void paint(Graphics g){
    g.setFont(myFont);
    g.setColor(Color.DARK_GRAY);
        int n = 200;
        if(sortA.getState()){
          //ret = mainApplet.sendData();
        for (int i = 0; i < ret.size(); i++) {
            g.drawString(ret.get(i), 20, n);
            n+=20;
          }
        }
      }
  }
