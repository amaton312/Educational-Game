import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gravityWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gravityWorld extends World
{
    private double gravity;
    private static int score = 0;
    public gravityWorld(int width, int height, int cellSize, double gravity){
        super(width, height, cellSize);
        showText("Press e, m, or s to go to Earth, Moon, or Sun", 250, 20);
        this.gravity = gravity;
    }

    public double getGravity(){
        return gravity;
    }
    
    public void setGravity(double gravity){
        this.gravity = gravity;
    }
    
    public void prepareObjects(){
        Man man = new Man();
        addObject(man, 80,270);
        Ball ball = new Ball();
        addObject(ball, 95, 270);
        Target target = new Target();
        addObject(target, 300, 150);
    }
    
    public static int getScore(){
        return score;
    
    }
    
    public static void addScore(int points) {
        score += points;
    }
    
    public void showScore(){
        showText("Score: " + gravityWorld.getScore(), 55,50);
    }
    
}
