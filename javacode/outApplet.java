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

  int intValue = Integer.parseInt( "F5F5F5",16); Color bgColor = new Color( intValue ); //Sets applet background color


  public void init(){
    setLayout(new FlowLayout());
    setBackground(bgColor);
    setForeground(Color.BLACK);
  }

  public void paint(Graphics g){
    g.setFont(myFont);
    g.setColor(Color.DARK_GRAY);

    g.drawString("This only shows that the applet exists!",20, 100);

    Player ret = new Player();
    List<String> dat = new ArrayList<String>();
    for(int i = 0; i < ret.getData().size(); i++){
      dat.add(ret.getData().get(i));
    }
    int n = 200;
    for(int i = 0; i < dat.size(); i++){
      g.drawString(dat.get(i), 20, n);
      n+=20;
    }

  }
}
