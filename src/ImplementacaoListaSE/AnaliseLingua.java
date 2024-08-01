package ImplementacaoListaSE;

public class AnaliseLingua {
  long numeroDeNegativos;
  long numeroDePositivos;
  long numeroDeNeutros;
  String lingua;

  public AnaliseLingua(long numeroNegativos, long numeroPositivos, long numeroNeutros, String lingua) {
    this.numeroDeNegativos = numeroNegativos;
    this.numeroDePositivos = numeroPositivos;
    this.numeroDeNeutros = numeroNeutros;
    this.lingua = lingua;
  }

  public void setNumeroDeNegativos(long numeroDeNegativos) {
    this.numeroDeNegativos = numeroDeNegativos;
  }

  public void setNumeroDePositivos(long numeroDePositivos) {
    this.numeroDePositivos = numeroDePositivos;
  }

  public void setNumeroDeNeutros(long numeroDeNeutros) {
    this.numeroDeNeutros = numeroDeNeutros;
  }

  public void setLingua(String lingua) {
    this.lingua = lingua;
  }

  public long getNumeroDeNegativos() {
    return numeroDeNegativos;
  }

  public long getNumeroDePositivos() {
    return numeroDePositivos;
  }

  public long getNumeroDeNeutros() {
    return numeroDeNeutros;
  }

  public String getLingua() {
    return lingua;
  }

}
