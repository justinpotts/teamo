//
//
// player object
//coded by ALEX MEZA!!!!!!!!
//
import java.util.ArrayList;
import java.util.List;

public class Player{

  private String nm; private int ballctrl; private double speed; private double height;

  public static List<String> players = new ArrayList<String>();

  public Player(){//empty constructor
    nm = "";
    height = 0;
    ballctrl = 0;
    speed = 0.0;
  }
  public Player(String name){//sets a name
    nm = name;
    height = 0;
    ballctrl = 0;
    speed = 0.0;
  }
  public Player(int c){//sets a name
    nm = "";
    height = 0;
    ballctrl = c;
    speed = 0.0;
  }
  public Player(double s){//sets a name
    nm = "";
    ballctrl = 0;
    height = 0;
    speed = s;
  }
  public Player(double h, String random){//sets a height
    nm = "";
    ballctrl=0;
    height = h;
    speed = 0;
  }
  public Player(String name, double h, int ctrl, double mile){//sets all fields
    nm = name;
    ballctrl = ctrl;
    speed = mile;
    height = h;
  }
  public String getName(){//returns name
    return nm;
  }
  public void setName(String s){//sets name
    nm = s;
  }
  public String getCtrl(){//returns ball control
    return ballctrl + "/10";
  }
  public void setCtrl(int ctrl){//sets ball control
    ballctrl = ctrl;
  }
  public String getSpeed(){//returns mile speed
    return "" + speed;
  }
  public void setSpeed(double s){//sets mile speed
    speed = s;
  }
  public void setHeight(double h){
    height = h;
  }
  public String getHeight(){
    return ""+ height;
  }
  public List<String> getData(){
    return players;
  }
  public String stringify(){
    String output = "Name :: " + getName() +  ", Height :: "+ getHeight() + ", Ball Control :: " + getCtrl() + ", Mile Time :: " + getSpeed();

    players.add(output);

    return output;
  }

}
