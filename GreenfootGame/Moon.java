import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.Math;
/**
 * Write a description of class Earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moon extends gravityWorld
{
       
    public Moon()
    {    
        super(600, 340, 1, 46.0);
        prepareObjects(); 

    }
    
    public void prepareObjects(){
        Man man = new Man();
        addObject(man, 80,270);
        Ball ball = new Ball();
        addObject(ball, 95, 270);
        Target target = new Target();
        addObject(target, 300 + Greenfoot.getRandomNumber(101) - 50, 150 + Greenfoot.getRandomNumber(101) - 50);
    }
    
    public void act(){
        showScore();
    }
}
