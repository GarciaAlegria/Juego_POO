import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FondoMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fondoMenu extends World
{
    Flecha flecha = new Flecha();
    private int opcion = 0;
    private GreenfootSound audio;
    public fondoMenu()
    {   
        super(600, 500, 1); 
        prepararMundo();
        //audio = new GreenfootSound("ntro.wav");
    }
    private void prepararMundo(){
    addObject(new Start(),400,250);
    addObject(flecha,275,250);
    }
    public void act(){
        if(Greenfoot.isKeyDown("up") && opcion !=0) {opcion++;}
        if(Greenfoot.isKeyDown("down") && opcion !=1) {opcion--;}
        if(opcion>=2) opcion=0;
        if(opcion<0) opcion =1;
        flecha.setLocation(275,250 +(opcion*100));
        if (Greenfoot.isKeyDown("SPACE")||Greenfoot.isKeyDown("ENTER")){
        switch(opcion){
            case 0:
                Greenfoot.setWorld(new parque());
                break;
            case 1:
            audio.pause();
                Greenfoot.stop();
                
            }
        }
    }
    //public void started() {
     //audio.playLoop();
    }
    
    

