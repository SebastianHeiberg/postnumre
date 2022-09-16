import java.util.Scanner;

public class UI {

  Scanner kb = new Scanner(System.in);

  public UI(){}

  public int indtastPostnummer(){
    System.out.print("Indtast postnummer: ");
    return kb.nextInt();
  }

  public void result(String bynavn){
    System.out.println("Postnummeret tilhører byen: " + bynavn);
  }

  public void ikkeFundet(){
    System.out.println("Ingen by blev fundet med tilhørende postnummeret");
  }

}
