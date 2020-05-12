import ou.*;
/**
 * The class Rectangle defines a shape with the characteristics of a rectangle.
 *
 * @author M250 Module Team
 * @version 2.0
 */

public class Rectangle extends OUAnimatedObject
{
   /* Instance variables */

   private OUColour colour;
   private int xPos;
   private int yPos;
   private int width;
   private int height;

   /**
    * Zero argument constructor for objects of class Rectangle 
    * that sets colour to OUColour.PURPLE,
    * xPos and yPos to 0, width to 40, and height to 20.
    */
   public Rectangle()
   {
      super();
      this.colour = OUColour.PURPLE;
      this.xPos = 0;
      this.yPos = 0;
      this.width = 40;
      this.height = 20;
   }

   /**
    * Constructor for objects of class Rectangle with arguments for width,
    * height and colour, and which sets xPos and yPos to 0.
    */
   public Rectangle(int aWidth, int aHeight, OUColour aColour)
   {
      super();
      this.width = aWidth;
      this.height = aHeight;
      this.colour = aColour;
      this.xPos = 0;
      this.yPos = 0;
   }
   /* Instance methods */    

   /**
    * Sets the width of the receiver to the value of the argument aWidth.
    */
   public void setWidth(int aWidth)
   {
      this.width = aWidth;
      this.update();
   }
   
    /**
    * Sets the height of the receiver to the value of the argument aHeight.
    */
   public void setHeight(int aHeight)
   {
      this.height = aHeight;
      this.update();
   }

   /**
    * Returns the width of the receiver.
    */
   public int getWidth()
   {
      return this.width;
   }
   
   /**
    * Returns the height of the receiver.
    */
   public int getHeight()
   {
      return this.height;
   }

   /**
    * Sets the colour of the receiver to the value of the argument aColour.
    */
   public void setColour (OUColour aColour)
   {
      this.colour = aColour;
      this.update();
   }

   /**
    * Returns the colour of the receiver.
    */
   public OUColour getColour ()
   {
      return this.colour;
   }

   /**
    * Sets the horizontal position of the receiver to the value of the argument x.
    */
   public void setXPos(int x)
   {
      this.xPos = x;
      this.update();
   }

   /**
    * Returns the horizontal position of the receiver.
    */
   public int getXPos()
   {
      return this.xPos;
   }

   /**
    * Sets the vertical position of the receiver to the value of the argument y.
    */
   public void setYPos(int y)
   {
      this.yPos = y;
      this.update();
   }

   /**
    * Returns the vertical position of the receiver.
    */
   public int getYPos()
   {
      return this.yPos;
   }

   /**
    * Returns a string representation of the receiver.
    */
   public String toString()
   {
      return "An instance of class " + this.getClass().getName() 
      + ": position (" + this.getXPos() + ", " + this.getYPos() 
      + "), width " + this.getWidth() + ", height " + this.getHeight() 
      + ", colour " + this.getColour();
   }

}
