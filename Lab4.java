public class Lab4
{
  //precondition: Robot is facing any direction
  //postcondition: Robot is facing 90 degrees to the right
    public static void turnRight()
  {
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.turnLeft();
  }
 //precondition: Robot is facing any direction.
  //postcondition: Robot is facing in the opposite direction.
 
  public static void turnAround()
  {
    Robot.turnLeft();
    Robot.turnLeft();
  }
//precondition: Robot is facing any direction.
  //postcondition: Robot moved back one space facing the same direction.

  public static void backUp()
  {
    turnAround();
    Robot.move();
    turnAround();
  }
//precondition:Robot is facing right on the bottom left corner behind a row of dark spaces in random places.
  //postcondition:Robot if facing right in front of a complete row of columns
  
  public static void completeBars()
  {
    while (Robot.frontIsClear())
    {
    makeColumn();
    goDown();
    Robot.move();
}
makeColumn();
    
}
//precondition: Robot is facing any direction on a light square.
  //postcondition: Robot is one space in front of a dark square.
    
    public static void moveDark()
    {
        
        Robot.makeDark();
        Robot.move();
    }
//precondition: Robot is facing right on a light column.
  //postcondition:Robot if facing up in front of a darkened column.
  
  
  public static void makeColumn()
  {
      Robot.turnLeft();
      while (!Robot.onDark())
      {
          moveDark();
        }
    }
 //precondition: Robot is facing up in a column.
  //postcondition: Robot is facing right under a darkened column.

    public static void goDown()
  {
      turnAround();
      while (Robot.frontIsClear())
      {
          Robot.move();
        }
      Robot.turnLeft();
    }
  
  public static void testCompleteBars1()
  {
    Robot.load("bars1.txt");
    Robot.setDelay(0.025);
    completeBars();
  }
  
  public static void testCompleteBars2()
  {
    Robot.load("bars2.txt");
    Robot.setDelay(0.025);
    completeBars();
  }
 //precondition: Robot is facing up towards a darkened column.

  //postcondition: Robot is facing any direction anywhere with a combined box stack on the right side.
 
  public static void combinePiles()
  {
while (Robot.frontIsClear())
{
    
    while (Robot.onDark())
    {
        //here the first two conditions for this method to trigger
        //is that the robot has its front clear and is on a dark space
        //the robot will make the first check to determine if the second check is needed.
    if (Robot.onDark())
    {
     Robot.makeLight();
     fullDown();
     fullRight();
     if (!Robot.onDark())
     {
        Robot.makeDark();
        fullDown();
        fullLeft();
        }
        else
        {
            //The robot then proceeded to, if the space is dark, to execute the methods listed
            //under. Then it will check whether the space its on is not dark, and if so will
            //make it dark and excecute the methods under
     while (Robot.onDark())
     {
        Robot.move();
        if (!Robot.onDark())
        {
            Robot.makeDark();
            fullDown();
            fullLeft();
        }
        //otherwise, the robot will continue to check for darkness and move forward
        //if it encounters a light space, it will make it dark and move against the collum
        
        }
    }
    
}

    }
    Robot.move();
}

if (Robot.onDark())
{
    Robot.makeLight();
    turnRight();
    Robot.move();
    Robot.makeDark();
  //the robot will make a final check for darkness and end the puzzle with necessary movements
}
  }

 
 
  
 //precondition: Robot is facing.
  //postcondition: Robot is facing down in front of the bottom wall.

 public static void fullDown()
  {
    turnAround();
    while (Robot.frontIsClear())
    {
    Robot.move();
   
    }
   }
   //precondition: Robot is facing down on the right column.
  //postcondition: Robot is facing up on the left column.

  public static void fullLeft()
  {
    turnRight();
    Robot.move();
    turnRight();
    }
//precondition: Robot is facing down on the left column.
  //postcondition: Robot is facing down on the right column.

    public static void fullRight()
   {
       Robot.turnLeft();
       Robot.move();
       Robot.turnLeft();
      
    }
    

  public static void testCombinePiles1()
  {
    Robot.load("piles1.txt");
    Robot.setDelay(0.025);
    combinePiles();
  }
  

  public static void testCombinePiles2()
  {
    Robot.load("piles2.txt");
    Robot.setDelay(0.025);
    combinePiles();
  }
  //precondition: Robot is facing a chain of dark spaces one space apart.
  //postcondition: Robot is facing any direction in front of a connected line of dark spaces.

  public static void connectDots()
  {
    while (Robot.onDark())
    {
        Robot.turnLeft();
        moveTwo();
        if (Robot.onDark())
        {
           backTrack();
           
        }
        else 
        {
            goBack();
            turnRight();
            moveTwo();
            if (Robot.onDark())
        {
           backTrack();
           
        }
        else
        {
            goBack();
            turnRight();
            moveTwo();
            if (Robot.onDark())
        {
           backTrack();
           
        }
        }
        }
       
    }
    

    
    
  }
  //precondition: Robot is facing any direction.
  //postcondition: Robot is facing the same direction two spaces behind its origina; location

  public static void goBack()
  {
      turnAround();
      moveTwo();
      turnAround();
     
    }
  //precondition: Robot is facing any direction.
  //postcondition: Robot is facing the same direction on the same space it started in front of a dark square. of

    public static void backTrack()
  {
    turnAround();
    Robot.move();
    Robot.makeDark();
    turnAround();
    Robot.move();
    }
    //precondition: Robot is facing any direction.
  //postcondition: Robot is facing two spaces forward in the same direction.

  public static void moveTwo()
  {
      Robot.move();
      Robot.move();
    }
  public static void testConnectDots1()
  {
    Robot.load("connect1.txt");
    Robot.setDelay(0.025);
    connectDots();
  }
  
  public static void testConnectDots2()
  {
    Robot.load("connect2.txt");
    Robot.setDelay(0.025);
    connectDots();
  }
}
