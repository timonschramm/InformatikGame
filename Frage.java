
public class Frage{  
  String frage;
  boolean isHigher;
  int anzahlSuchanfragen;
  Wert ersterWert = new Wert("Hund", 200);
  Wert zweiterWert = new Wert("Katze", 40);
  
  ComparebleContent content = new ComparebleContent();
  BSTNode alleWerte = BSTNode(content);
   
  public Frage(String pFrage, boolean pIsHigher, int pAnzahlSuchAnfragen){
    frage = pFrage;
    isHigher = pIsHigher;
    anzahlSuchanfragen = pAnzahlSuchAnfragen;

  }       
  public String getFrage(){
         return frage;
    }
  
  
  
}
