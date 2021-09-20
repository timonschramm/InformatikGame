public class Frage{  
  String frage;
  boolean isHigher;
  int anzahlSuchanfragen;
  
    
  public Frage(String pFrage, boolean pIsHigher, int pAnzahlSuchAnfragen){
    frage = pFrage;
    isHigher = pIsHigher;
    anzahlSuchanfragen = pAnzahlSuchAnfragen;
  }       
  
  public String getFrage(){
         return frage;
    }
  
  
}
