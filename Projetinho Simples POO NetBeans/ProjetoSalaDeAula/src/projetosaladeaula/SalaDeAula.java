package projetosaladeaula;
/**
 * @author Alefe Filipe
 */
public class SalaDeAula implements AcoesSalaAula {
  private Aluno espectador;
  private Professor ministrador;
  private Aula aula;
  private boolean marcada;

  public SalaDeAula(Aluno espectador, Professor ministrador, Aula aula) {
    this.espectador = espectador;
    this.ministrador = ministrador;
    this.aula = aula;
    this.marcada = false;
  }

  @Override
  public void comecarAula() {
    if (marcada) {
      if (this.aula.isAcontecendo()) {
        System.out.println("A aula ja esta ocorrendo!");
      } else {
        this.aula.setAcontecendo(true);
        System.out.println("A aula comecou.");
      }
    } else {
      System.out.println("A aula nao foi marcada ainda.");
    }
  }

  @Override
  public void finalizarAula() {
    if (marcada) {
      if (this.aula.isAcontecendo()) {
        System.out.println("Finalizando aula...");
        this.aula.setAcontecendo(false);
        System.out.println("Aula finalizada!");
      } else {
        System.out.println("Aula ja esta finalizada.");
      }
    } else {
      System.out.println("A aula nao foi marcada ainda.");
    }
  }

  @Override
  public void marcarAula(int dia, Aluno aluno, Professor professor, Aula aula) {
    this.aula.setData(String.valueOf(dia));
    this.espectador = aluno;
    this.ministrador = professor;
    this.aula = aula;
    System.out.println("Aula marcada para o dia: " + dia + ", com o ministriante: " + professor.getNome() +
        "\nDisciplina: " + aula.getDisciplina() + ", Com a presenca do aluno: " + aluno.getNome());
    this.marcada = true;
  }

  public Aluno getEspectador() {
    return espectador;
  }

  public void setEspectador(Aluno espectador) {
    this.espectador = espectador;
  }

  public Professor getMinistrador() {
    return ministrador;
  }

  public void setMinistrador(Professor ministrador) {
    this.ministrador = ministrador;
  }

  public Aula getAula() {
    return aula;
  }

  public void setAula(Aula aula) {
    this.aula = aula;
  }

  @Override
  public String toString() {
    return "SalaDeAula [aula=" + aula + ", espectador=" + espectador + ", ministrador=" + ministrador + "]";
  }

  public boolean isMarcada() {
    return marcada;
  }

  public void setMarcada(boolean marcada) {
    this.marcada = marcada;
  }
}

