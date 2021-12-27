package dev.LiIndex.AwsiClient.modules;

public class Module {
  public Module m;
  public static Category c;
  public boolean toggled;
  
  public void setToggled() {
    toggled = !toggled
    if (m.toggled()) {
      onEnable();
    } else {
      onDisable();
    }
  }
  
  public void onEnable() {}
  
  public void onDisable() {}
  
  public static enum Category {
    MISC,
    COMBAT,
    PLAYER,
    RENDER,
    MOVEMENT,
    EXPLOITS;
  }
}
