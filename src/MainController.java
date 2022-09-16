import java.util.ArrayList;
import java.util.logging.FileHandler;

public class MainController {

  UI ui = new UI();
  FileLoader fileLoader = new FileLoader();

  public void run() {

    int postnummer = ui.indtastPostnummer();
    ArrayList<By> allByerne = fileLoader.loadByer();
    String fundetBy = "";

    for (By by : allByerne) {
      if (by.getPostnummer() == postnummer) {
        fundetBy = by.getByNavn();
      }
    }

    if (fundetBy.isEmpty()) {
      ui.ikkeFundet();
    } else {
      ui.result(fundetBy);
    }
  }

}
