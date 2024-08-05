package ImplementacaoListaSE;

public class AnaliseLingua {
  long numeroDeNegativos;
  long numeroDePositivos;
  long numeroDeNeutros;
  String lingua;
  AnaliseLingua prox;

  public AnaliseLingua(AnaliseLingua original) {
    this.numeroDeNegativos = original.numeroDeNegativos;
    this.numeroDePositivos = original.numeroDePositivos;
    this.numeroDeNeutros = original.numeroDeNeutros;
    this.lingua = original.lingua;
    this.prox = (original.prox != null) ? new AnaliseLingua(original.prox) : null;
  }

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
    return this.numeroDeNegativos;
  }

  public long getNumeroDePositivos() {
    return this.numeroDePositivos;
  }

  public long getNumeroDeNeutros() {
    return this.numeroDeNeutros;
  }

  public String getLingua() {
    return lingua;
  }

}
