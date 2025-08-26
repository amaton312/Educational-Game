import greenfoot.*;

public class Ball extends Actor
{
    double angleDegrees;
    double angleRad;
    double launchSpeed;
    private double velocityX;
    private double velocityY;
    boolean isLaunched = false;
    private double g;
    
    double dt = 1.0 / 50.0;
    
    double xPos;
    double yPos;

    public Ball() {
        angleDegrees = Double.parseDouble(Greenfoot.ask("Set launch angle (0-90)"));
        angleRad = Math.toRadians(angleDegrees);
        launchSpeed = Double.parseDouble(Greenfoot.ask("Set launch speed (m/s)")) * 29;
        
        velocityX = Math.cos(angleRad) * launchSpeed;
        velocityY = -Math.sin(angleRad) * launchSpeed;
        
    }

    public void addedToWorld(World world) {
        gravityWorld gWorld = (gravityWorld) world;
        xPos = getX();
        yPos = getY();
        g = gWorld.getGravity();
    }

    public void act()
    {
        if (!isLaunched && Greenfoot.isKeyDown("l")) {
            isLaunched = true;
        }

        if (isLaunched) {
            launch();
        }
        
        checkWall();
    }

    public void launch() {
        xPos += velocityX * dt;
        yPos += velocityY * dt + 0.5 * g * dt * dt;
        velocityY += g * dt;
        setLocation((int)xPos, (int)yPos);
        if (yPos >= 290) {
            isLaunched = false;
        }
    }
    
    public void setVelocity(double velocityX, double velocityY){
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }
    
    public void checkWall(){
        if (this.getX()>= 590){
            getWorld().removeObject(this);
        }
    }
    
}
