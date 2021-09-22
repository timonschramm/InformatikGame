public class WerteVergleicher implements ComparebleContent<Wert> {
  public boolean isGreater(Wert wert1, Wert wert2){
         if (wert1.getHoehe() > wert2.getHoehe()) {
            System.out.println("Wert 1 ist größer!");
         } // end of if     
    }
}
