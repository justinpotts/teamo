//
//
// player object
//coded by ALEX MEZA!!!!!!!!
//
import java.util.ArrayList;
import java.util.List;

public class Team{
  public static List<String> teamplayers;

  public Team(){//empty constructor
    teamplayers = new ArrayList<String>();
  }
  public void addPlayer(String playerlol){//sets all fields
    teamplayers.add(playerlol);
  }
  public List<String> getData(){
    return teamplayers;
  }

}
