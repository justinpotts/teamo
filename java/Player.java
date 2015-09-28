//
//
// player object
//coded by ALEX MEZA!!!!!!!!
//

public class Player{
  private String nm; private int ballctrl; private double speed;
  public Player(){//empty constructor
    nm = "";
    ballctrl = 0;
    speed = 0.0;
  }
  public Player(String name){//sets a name
    nm = name;
    ballctrl = 0;
    speed = 0.0;
  }
  public Player(int c){//sets a name
    nm = "";
    ballctrl = c;
    speed = 0.0;
  }
  public Player(double s){//sets a name
    nm = "";
    ballctrl = 0;
    speed = s;
  }
  public Player(String name, int ctrl, double mile){//sets all fields
    nm = name;
    ballctrl = ctrl;
    speed = mile;
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
  public String stringify(){
    String output = "Name :: " + getName() + ", Ball Control :: " + getCtrl() + ", Mile Time :: " + getSpeed();
    return output;
  }

}
