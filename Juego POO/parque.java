import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class parque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class parque extends World
{
    public static int lives = 3;
    public static int score = 0;
    private GreenfootSound audio;
    /**
     * Constructor for objects of class space.
     * 
     */
    public parque()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 
        //audio = new GreenfootSound("main.mp3");
        prepare(); //reset game
    }
    private void prepare(){
        lives = 3; // reset counter
        score = 0;
        heroe n1=new heroe();
        addObject(n1,50,410);
        
    
        crearbanano(6); // crear 6 covids iniciales
        crearbomba(2);
    
    }
    public void crearbanano(int numero){
      for(int i=0;i<numero;i++){
          banano c=new banano();
          int x=Greenfoot.getRandomNumber(199);
          int y=Greenfoot.getRandomNumber(199);
      
        addObject(c,x + 300,y + 200);
        }
    }
    public void crearbomba(int numero){
      for(int i=0;i<numero;i++){
          bomba c=new bomba();
          int x=Greenfoot.getRandomNumber(50);
          int y=Greenfoot.getRandomNumber(400);
      
        addObject(c,x + 100,y + 200);
        }
    }  
    long lastAdded = System.currentTimeMillis();
    
    public void act()
    {
        showText("Vidas restantes: " + lives, 100,25 );
        showText("Punteo: " + score, 500,25 );
        if (score >= 100){
           Greenfoot.setWorld(new win());
 
    }  
    long curTime  = System.currentTimeMillis();
    if (curTime >= lastAdded + 6000) //1000ms = 1s //agregar cada 5 segundos más covids
    {
       crearbanano(3);
       crearbomba(1);
       lastAdded  = curTime;
    }
    
    {
    
    //public void started() {
    //audio.playLoop();
    }
}
}
       




   
