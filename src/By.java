public class By {

  private final int postnummer;
  private final String byNavn;

  public By(int postnummer, String byNavn) {
    this.postnummer = postnummer;
    this.byNavn = byNavn;
  }

  public int getPostnummer() {
    return postnummer;
  }

  public String getByNavn() {
    return byNavn;
  }
}
