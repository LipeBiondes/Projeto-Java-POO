public class Aula {
  private String disciplina, data;
  private float duracao, aula;
  private boolean acontecendo;

  public Aula(String disciplina, String data, float duracao, float aula) {
    this.disciplina = disciplina;
    this.data = data;
    this.duracao = duracao;
    this.aula = aula;
    this.acontecendo = false;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public float getDuracao() {
    return duracao;
  }

  public void setDuracao(float duracao) {
    this.duracao = duracao;
  }

  public float getAula() {
    return aula;
  }

  public void setAula(float aula) {
    this.aula = aula;
  }

  @Override
  public String toString() {
    return "Aula [aula=" + aula + ", data=" + data + ", disciplina=" + disciplina + ", duracao=" + duracao + "]";
  }

  public boolean isAcontecendo() {
    return acontecendo;
  }

  public void setAcontecendo(boolean acontecendo) {
    this.acontecendo = acontecendo;
  }

}
