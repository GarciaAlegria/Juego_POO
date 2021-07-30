import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{
    Flecha flecha = new Flecha();
    private int opcion = 0;
    //private GreenfootSound audio;
    public GameOver()
    {   
        super(600, 600, 1); 
        prepararMundo();
        //audio = new GreenfootSound("AudioFinal.mp3");
    }
    private void prepararMundo(){
    addObject(new PlayAgain(),getWidth()/2+175,475);
    addObject(new Salir(),getWidth()/2+175,575);
    addObject(flecha,getWidth()/2+100,475);
    }
    
    public void act()
   
    {
    showText("Game Over", getWidth()/2, 500  );
    /*if (Greenfoot.isKeyDown("ENTER"))
      {
            Greenfoot.setWorld(new space());
      }
     if (Greenfoot.isKeyDown("escape"))
      {
            Greenfoot.setWorld(new fondoMenu());
      }*/
        if(Greenfoot.isKeyDown("up") && opcion !=0) {opcion++;}
        if(Greenfoot.isKeyDown("down") && opcion !=1) {opcion--;}
        if(opcion>=2) opcion=0;
        if(opcion<0) opcion =1;
        flecha.setLocation(getWidth()/2+100,475 +(opcion*100));
        if (Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
        switch(opcion){
            case 0:
                Greenfoot.setWorld(new parque());
                break;
            case 1:
                Greenfoot.stop();}}

    //public void started() {
        //audio.playLoop();
    }    
}