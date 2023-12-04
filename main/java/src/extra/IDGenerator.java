package extra;

public class IDGenerator {
  public static int ID = 0;

  public static int makeNewID(){
    return IDGenerator.ID++;
  }
}
