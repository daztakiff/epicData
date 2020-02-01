class TownsC{
  public String townName;
  public int population;
  public double povrt;
  
  public TownsC(String name, int pop, double povRt){
    townName = name;
    population = pop;
    povrt = povRt;
     
  }

  public String getName(){
    return townName;
  }

  public int getPop(){
    return population;
  }

  public double getPovRt(){
    return povrt;
  }
  public String toString(){
    String phrase="";
      phrase+=townName+"\nPopulation: "+population+"\nPoverty Rate: "+povrt;
    return phrase;
  }



}