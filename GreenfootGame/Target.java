import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target extends Actor
{

    public void act()
    {
        checkContact();
    }
    
    private void checkContact(){
        Ball ball = (Ball)getOneIntersectingObject(Ball.class);
        
        if(ball != null) {
            getWorld().showText("You hit the target!", 300, 100);
            getWorld().removeObject(this);
            gravityWorld.addScore(1);
        }
    }
}
