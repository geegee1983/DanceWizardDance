import ou.*;

/**
 * Class comment 
 *  
 * @annamaria.galgoczi
 * @version.1
 */
public class StickFigure
{
  /*Instance variables*/   
   private int xPos;//The horizontal position of a StickFigure
   private int yPos;//The vertical position of a StickFigure
   
   //add your declarations here for part (a)(i)
   private Circle head;//The head of a StickFigure
   private Triangle body;//The body of a StickFigure
   private Rectangle leg;//The leg of a StickFigure
   

   /**
    * Constructor for objects of class StickFigure that 
    * provides a default stick figure near the bottom left corner of the graphical display.
    * 
    */
   public StickFigure()
   {
      super(); 
      //part (a)(ii)
      this.head = new Circle(30, OUColour.PINK);
      this.body = new Triangle(50, 50, OUColour.RED);
      this.leg = new Rectangle(6, 50, OUColour.PINK);
      this.setXPos(25);  //sets starting position towards bottom left of Shapes window
      this.setYPos(220);
      
	  //part (b)(iii)
	   this.alignAll();
   }   
   
   /**
    * Sets the xPos of the receiver to the value of the argument.
    */
   public void setXPos(int newPos)
   {
      this.xPos = newPos;
      
      //part (b)(iii)
      this.alignAll();
   }

   /**
    * Returns the xPos of the receiver.
   */
   public int getXPos()
   {
      return this.xPos; 
   }

   /**
   * Sets the yPos of the receiver to the value of the argument.
   */
   public void setYPos(int newPos)
   {
      this.yPos = newPos;
      
      //part (b)(iii)
      this.alignAll();
   }

   /**
   * Returns the yPos of the receiver.
   */
   public int getYPos()
   {
      return this.yPos;
   }  
   
       /**
    * Returns a reference to the head of the receiver.
    */
   public Circle getHead()
   {
      return this.head;   
   }
  
      /**
    * Returns a reference to the body of the receiver.
    */
   public Triangle getBody()
   {
      return this.body;   
   }
     
   /**
    * Returns a reference to the leg of the receiver.
    */
   public Rectangle getLeg()
   {
      return this.leg;   
   }

   /**
    * Aligns the head of the receiver relative to the xPos and yPos of the body.
    */
   public void alignHead()   
   {
      this.head.setXPos(this.body.getXPos() + (this.body.getWidth() - this.head.getDiameter())/2);
      this.head.setYPos(this.body.getYPos() - this.head.getDiameter());
   }  
   
   /**
    * Aligns the body of the receiver relative to the xPos and yPos of the StickFigure.
    */
   public void alignBody()   
   {
      this.body.setXPos(getXPos());
      this.body.setYPos(getYPos());
   } 
   
   /**
    * Aligns the leg of the receiver relative to the xPos and yPos of the body.
    */
   public void alignLeg()   
   {
      this.leg.setXPos(this.body.getXPos() + (this.body.getWidth() - this.leg.getWidth())/2);
      this.leg.setYPos(this.body.getYPos() + this.body.getHeight());
   } 

    /**
    * Aligns all the body parts of the receiver to form the
    * StickFigure-type figure.
    */
 
   public void alignAll()
   {
      this.alignBody();
      this.alignHead();      
      this.alignLeg();
   }
 
   /**
    * Changes the posX of the receiver by byX and posY by byY 
    */
 
   public void move(int byX, int byY)
   {
      this.setXPos(this.getXPos() + byX);
      this.setYPos(this.getYPos() + byY);
      this.delay(20);      
   }
   
   /**
    * Moves the receiver's positiona by given 'increment' to the given 'direction'   
    */
 
   public void moveBy(int increment, char direction)
   {
      int xInc = 0; //the xPos will be changed by xInc
      int yInc = 0; //the yPos will be changed by yInc
      
      if (direction == 'R')
      {
         xInc = 1;
         yInc = 0;
      }
      
      if (direction == 'L')
      {
         xInc = -1;
         yInc = 0;
      }
      
      if (direction == 'U')
      {
         xInc = 0;
         yInc = -1;
      }
      
      if (direction == 'D')
      {
         xInc = 0;
         yInc = 1;
      }
      
      for (int i=1; i<=increment; i++)
      {
      this.setXPos(getXPos() + xInc * 1);
      this.setYPos(getYPos() + yInc * 1);
      this.delay(20); 
   }
   }
   
   /**
    * Moves the receiver's positiona by given 'increment' to the given 'direction' and spins the body  
    */
   
   public void doSquareDance()
   {
      this.setXPos(25);  //sends StickFigure to starting position 
      this.setYPos(220);
      moveBy (150, 'R');
      moveBy (150, 'U');
      spinBody();
      moveBy (150, 'L');
      moveBy (150, 'D');
      spinBody();
   }
    
   /**
    * Shrink body so it appears to spin and change colour from red to yellow.
    * Then it expands again before turning from  yellow to red once more. 
    */   
   public void spinBody()
   {
      int bodyWidth = this.body.getWidth();
      while (this.body.getWidth() > 0)
      {  
         this.body.setWidth(this.body.getWidth() - 2);
         this.body.setXPos(this.body.getXPos() + 1);
         this.delay(20);
      }
      
      if (this.body.getColour() == OUColour.RED)
      {
      this.body.setColour(OUColour.YELLOW);
   }
   else
   {
      this.body.setColour(OUColour.RED);
   }
         
      while (this.body.getWidth() <=50)
      {
         this.body.setWidth(this.body.getWidth() + 2);
         this.body.setXPos(this.body.getXPos() - 1);
         this.delay(20);
      }    
            
   }
 
   
    /*********************end methods that need uncommenting****************/
    
   
   /**
    * method to delay action so effects are shown clearly in Shapes window
    */
   public void delay(int ms)
   {
      try
      {
         Thread.sleep(ms);
      }
      catch(Exception e)
      {
         System.out.println("Problem in delay method");
      }
   }
   
   
}
   
   