import java.util.*;
import java.lang.Math;
//import java.Applet.*;
/*public*/class Main/* extends Applet*/{
  //o o o orileys
  public static int money = 1000000;
  public int[] stats={25,25,25};
  public static Object[] townInfo = new Object[10];
  static String name;

  public static void main(String []args){
    options opt = new options();
      String[] townNames={"Monroe,Louisiana","College Station-Bryan, Texas","Visalia-Porterville, California","Albany, Georgia","Farmington, New Mexico","Valdosta, Georgia","Brownsville-Harlingen, Texas","Laredo, Texas","Las Cruces, New Mexico","McAllen-Edinbrug-Mission, Texas"};
      int[] townPop={48000, 249000, 466000, 98000, 45000, 56000, 424000, 260000, 100000, 864000};
      double[] townPoverty={24.3,24.6,24.6,24.7,24.8,26.0,17.9,28.0,28.1,30.0};
      for (int i=0;i<townNames.length;i++){
      townInfo[i] = new TownsC(townNames[i], townPop[i],townPoverty[i]);
      }

        Scanner scan=new Scanner(System.in);
        Scanner scanL=new Scanner(System.in);
        System.out.println("Welcome to Poverty Finance: The Simulation! :)");
        System.out.println("You are a volunteer group going around poverty stricken areas in the US.");
        System.out.println("What is the name of your company?");
        name = scanL.nextLine();
        System.out.println("You have amassed 1000000 dollars to begin your journey.");
        System.out.println("Now travelling to "+townInfo[(int)(Math.random()*10)]);
        System.out.println();
        opt.randomNumbers();

        } 
  }
