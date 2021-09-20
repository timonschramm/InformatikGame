public class Quiz {
  
  
  public Quiz(){
    
    }
  public static void main(String[] args){
    Frage frage1 = new Frage("Was ist größer?", true, 12);
    System.out.println("spielen");
    System.out.println(frage1.getFrage());
    }
}
