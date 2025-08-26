import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Actor
{
    /**
     * Act - do whatever the Man wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("e")){
        Greenfoot.setWorld(new Earth());    
        }
        if (Greenfoot.isKeyDown("m")){
        Greenfoot.setWorld(new Moon());    
        }
        if (Greenfoot.isKeyDown("s")){
        Greenfoot.setWorld(new Sun());    
        }
        
        
    }
}
