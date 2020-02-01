import java.lang.Math;
public class options{
  public int cost;
  public int reward; 
  public int change; 
  static int w,x,y,z;
  public int randomOption(int x){
    switch (x){
  case 1:System.out.println( w + ") " + "Building a library: Education++ Jobs + Money--");
  x=1;
  break;
  case 2: System.out.println( w + ") " + "Building a hospital: Health ++ Jobs++ Money---");
  x=2;
  break;
  case 3: System.out.println( w + ") " + "Building a food bank: Jobs+  Health+ Money-");
  x=3;
  break;
  case 4: System.out.println( w + ") " + "Asking for more donations to continue charity work: Money++ Jobs- Health-");
  x=4;
  break;
  case 5:System.out.println( w + ") " + "Building a well: Health++ Money-");
  x=5;
  break;
  case 6:System.out.println( w + ") " + "Building shelters:");
  x=6;
  break;
  case 7:System.out.println( w + ") " + "Better infrustructure: Jobs++ Money--");
  x=7;
  break;
  case 8:System.out.println( w + ") " + "Building a factory: Jobs++ Health-");
  x=8;
  break;
  }
  w++;
  return x;
  }
public void randomNumbers(){
  x=(int)(Math.random()*8)+1;
  y=(int)(Math.random()*8)+1;
  while (x==y){
    y=(int)(Math.random()*8)+1;
  }
  z=(int)(Math.random()*8)+1;
  while ((x==z)||(y==z)){
    z=(int)(Math.random()*8)+1;
  }
  w=1;
  x=randomOption(x);
  y=randomOption(y);
  z=randomOption(z);

}
public void action(int q){

} 
}

//public buildLibrary(int ){
 // if(cost > )
//}
