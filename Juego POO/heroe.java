import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class heroe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class heroe extends Actor
{
    parque thisGame;
 
    /**
     * Act - do whatever the heroe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      moveAndTurn();
      eat();
      //contacto con bomba
        
        if(isTouching(bomba.class))
        {
            removeTouching(bomba.class);
            thisGame.lives--;
        }
        
        if (thisGame.lives == 0){
        Greenfoot.setWorld(new GameOver());
        }
     
      
    }
    public void moveAndTurn()  
    {
     
    // Movimiento del basurero
      if (Greenfoot.isKeyDown("left"))
      {
       setLocation(getX()-3,getY());
      }
      if (Greenfoot.isKeyDown("right"))
      {
          setLocation(getX()+3,getY());
      }  
       if (Greenfoot.isKeyDown("up"))
      {
            setLocation(getX(),getY()-3);
      }
      if (Greenfoot.isKeyDown("down"))
      {
         setLocation(getX(),getY()+3);
      }  
    }
    public void eat()
    //Aqui el basurero comera la banana
    {
      Actor banano;
      banano = getOneObjectAtOffset(0, 0, banano.class);
      if (banano != null)
      {
          World world;
          world = getWorld();
          world.removeObject(banano);
          thisGame.score += 5;  
          
      }
      
    }
}